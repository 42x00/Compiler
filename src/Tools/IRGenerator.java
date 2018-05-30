package Tools;

import AST_Node.ASTVisitor;
import AST_Node.DeclNodes.ClassDeclNode;
import AST_Node.DeclNodes.DeclNode;
import AST_Node.DeclNodes.FuncDeclNode;
import AST_Node.DeclNodes.VarDeclNode;
import AST_Node.ExprNodes.*;
import AST_Node.ProgNode;
import AST_Node.StmtNodes.*;
import AST_Node.TypeNodes.ArrayTypeNode;
import AST_Node.TypeNodes.ClassTypeNode;
import AST_Node.TypeNodes.TypeNode;
import IR.IRNodes.*;
import Type.Type;

import java.util.LinkedList;

public class IRGenerator implements ASTVisitor {
    static private boolean stopVisit = false;

    static private LinkedList<IntValue> exprLinkedList = new LinkedList<>();

    static private LinkedList<BasicBlock> breakLinkedList = new LinkedList<>();
    static private LinkedList<BasicBlock> continueLinkedList = new LinkedList<>();

    private BasicBlock currentBlock;
    private BasicBlock startBlock = new BasicBlock();

    public BasicBlock getStartBlock() {
        return startBlock;
    }

    private void initGlobalVar(ProgNode progNode) {
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof VarDeclNode) {
                if (((VarDeclNode) declNode).getVarinit() != null) {
                    ((VarDeclNode) declNode).getVarinit().accept(this);
                    currentBlock.append(new Assign(((VarDeclNode) declNode).getIntValue(), exprLinkedList.pop()));
                }
            }
        }
    }

    @Override
    public void visit(ProgNode progNode) {
        currentBlock = startBlock;
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof VarDeclNode) {
                VarDeclNode varDeclNode = (VarDeclNode) declNode;
                varDeclNode.setIntValue(new GloalVar(varDeclNode.getVarname()));
            }
        }
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof FuncDeclNode) {
                if (((FuncDeclNode) declNode).getFunctionName().equals("main")) {
                    initGlobalVar(progNode);
                    declNode.accept(this);
                }
            }
        }
    }

    @Override
    public void visit(FuncDeclNode funcDeclNode) {
        if (funcDeclNode.getFunctionStatements() != null)
            funcDeclNode.getFunctionStatements().accept(this);
    }

    @Override
    public void visit(CompStmtNode compStmtNode) {
        for (StmtNode stmtNode : compStmtNode.getStmtNodeList()) {
            if (stopVisit) break;
            stmtNode.accept(this);
        }
        stopVisit = false;
    }

    @Override
    public void visit(ExprStmtNode exprStmtNode) {
        if (exprStmtNode.getExprnode() != null) {
            exprStmtNode.getExprnode().accept(this);
            exprLinkedList.pop();
        }
    }

    @Override
    public void visit(VarDeclStmtNode varDeclStmtNode) {
        varDeclStmtNode.getVardeclnode().accept(this);
    }

    @Override
    public void visit(IfStmtNode ifStmtNode) {
        if (ifStmtNode.getElsestmt() == null) {
            BasicBlock thenBlock = new BasicBlock();
            BasicBlock endBlock = new BasicBlock();

            ifStmtNode.getIfexpr().accept(this);
            currentBlock.append(new Cjump(exprLinkedList.pop(), thenBlock, endBlock));

            currentBlock = thenBlock;
            ifStmtNode.getIfstmt().accept(this);
            thenBlock.append(new Jump(endBlock));

            currentBlock = endBlock;
        } else {
            BasicBlock thenBlock = new BasicBlock();
            BasicBlock elseBlock = new BasicBlock();
            BasicBlock endBlock = new BasicBlock();

            ifStmtNode.getIfexpr().accept(this);
            currentBlock.append(new Cjump(exprLinkedList.pop(), thenBlock, elseBlock));

            currentBlock = thenBlock;
            ifStmtNode.getIfstmt().accept(this);
            thenBlock.append(new Jump(endBlock));

            currentBlock = elseBlock;
            ifStmtNode.getElsestmt().accept(this);
            elseBlock.append(new Jump(endBlock));

            currentBlock = endBlock;
        }
    }

    @Override
    public void visit(WhileStmtNode whileStmtNode) {
        BasicBlock condBlock = new BasicBlock();
        BasicBlock whileBlock = new BasicBlock();
        BasicBlock endBlock = new BasicBlock();

        currentBlock.append(new Jump(condBlock));
        currentBlock = condBlock;
        whileStmtNode.getWhileexpr().accept(this);
        currentBlock.append(new Cjump(exprLinkedList.pop(), whileBlock, endBlock));

        continueLinkedList.push(condBlock);
        breakLinkedList.push(endBlock);

        currentBlock = whileBlock;
        whileStmtNode.getWhilestmt().accept(this);
        currentBlock.append(new Jump(condBlock));

        continueLinkedList.pop();
        breakLinkedList.pop();

        currentBlock = endBlock;
    }

    @Override
    public void visit(ForStmtNode forStmtNode) {
        BasicBlock condBlock = new BasicBlock();
        BasicBlock forBlock = new BasicBlock();
        BasicBlock endBlock = new BasicBlock();

        if (forStmtNode.getForexprinit() != null) {
            forStmtNode.getForexprinit().accept(this);
        } else {
            for (VarDeclNode varDeclNode : forStmtNode.getForinit()) {
                varDeclNode.accept(this);
            }
        }
        currentBlock.append(new Jump(condBlock));
        currentBlock = condBlock;

        forStmtNode.getForexprend().accept(this);
        currentBlock.append(new Cjump(exprLinkedList.pop(), forBlock, endBlock));

        continueLinkedList.push(condBlock);
        breakLinkedList.push(endBlock);

        currentBlock = forBlock;
        forStmtNode.getForstmt().accept(this);
        forStmtNode.getForexprupdate().accept(this);
        currentBlock.append(new Jump(condBlock));

        continueLinkedList.pop();
        breakLinkedList.pop();

        currentBlock = endBlock;
    }

    @Override
    public void visit(BreakStmtNode breakStmtNode) {
        currentBlock.append(new Jump(breakLinkedList.getLast()));
        stopVisit = true;
    }

    @Override
    public void visit(ContinueStmtNode continueStmtNode) {
        currentBlock.append(new Jump(continueLinkedList.getLast()));
        stopVisit = true;
    }

    @Override
    public void visit(ReturnStmtNode returnStmtNode) {
        returnStmtNode.getReturnexpr().accept(this);
        currentBlock.append(new ReturnInst(exprLinkedList.pop()));
    }

    //  ***************************** Stmt Over ***************************** //

    @Override
    public void visit(VarDeclNode varDeclNode) {
//      Non-Array & Non-Class
        if (varDeclNode.getVartype() instanceof TypeNode) {
//          Int
            if (varDeclNode.getVartype().getBasetype() == Type.Types.INT) {
                varDeclNode.setIntValue(new Register());
                if (varDeclNode.getVarinit() != null) {
                    varDeclNode.getVarinit().accept(this);
                    currentBlock.append(new Assign(varDeclNode.getIntValue(), exprLinkedList.pop()));
                }
            }
        }
    }

    @Override
    public void visit(BinaryExprNode binaryExprNode) {
        switch (binaryExprNode.getExprop()) {
            case LOGICAL_AND: {
                Register register = new Register();
                BasicBlock shortCutBlock = new BasicBlock();
                shortCutBlock.append(new Assign(register, new ConstValue(0)));

                binaryExprNode.getLhs().accept(this);
                BasicBlock nxtBlock = new BasicBlock();
                currentBlock.append(new Cjump(exprLinkedList.pop(), nxtBlock, shortCutBlock));
                currentBlock = nxtBlock;

                binaryExprNode.getRhs().accept(this);
                nxtBlock = new BasicBlock();
                currentBlock.append(new Cjump(exprLinkedList.pop(), nxtBlock, shortCutBlock));
                currentBlock = nxtBlock;

                currentBlock.append(new Assign(register, new ConstValue(1)));
                exprLinkedList.push(register);
                break;
            }
            case LOGICAL_OR: {
                Register register = new Register();
                BasicBlock shortCutBlock = new BasicBlock();
                shortCutBlock.append(new Assign(register, new ConstValue(1)));

                binaryExprNode.getLhs().accept(this);
                BasicBlock nxtBlock = new BasicBlock();
                currentBlock.append(new Cjump(exprLinkedList.pop(), shortCutBlock, nxtBlock));
                currentBlock = nxtBlock;

                binaryExprNode.getRhs().accept(this);
                nxtBlock = new BasicBlock();
                currentBlock.append(new Cjump(exprLinkedList.pop(), shortCutBlock, nxtBlock));
                currentBlock = nxtBlock;

                currentBlock.append(new Assign(register, new ConstValue(0)));
                exprLinkedList.push(register);
                break;
            }
            case ASSIGN: {
                binaryExprNode.getRhs().accept(this);
                IntValue rhs = exprLinkedList.pop();
                binaryExprNode.getLhs().accept(this);
                IntValue lhs = exprLinkedList.pop();
                currentBlock.append(new Assign(lhs, rhs));
                exprLinkedList.push(new ConstValue(0));
                break;
            }
            case GREATER_EQUAL:
            case LESS_EQUAL:
            case EQUAL:
            case INEQUAL:
            case GREATER:
            case LESS:
            case BIT_XOR:
            case BIT_AND:
            case BIR_OR:
            case SHR:
            case SHL:
            case ADD:
            case SUB:
            case MUL:
            case MOD:
            case DIV: {
                binaryExprNode.getRhs().accept(this);
                IntValue rhs = exprLinkedList.pop();
                binaryExprNode.getLhs().accept(this);
                IntValue lhs = exprLinkedList.pop();
                Register register = new Register();
                currentBlock.append(new Bin(binaryExprNode.getExprop(),lhs,rhs,register));
                exprLinkedList.push(register);
                break;
            }
        }
    }

    @Override
    public void visit(SuffixExprNode suffixExprNode) {
        suffixExprNode.getSuffixexpr().accept(this);

        IntValue intValue = exprLinkedList.pop();
        Register register = new Register();

        //copy
        currentBlock.append(new Assign(register, intValue));

        if (suffixExprNode.getExprop() == SuffixExprNode.SuffixOP.SELF_INC)
            currentBlock.append(new Uni(UnaryExprNode.UnaryOP.SELF_INC, intValue, new Register()));
        else currentBlock.append(new Uni(UnaryExprNode.UnaryOP.SELF_DEC, intValue, new Register()));

        exprLinkedList.push(register);
    }

    @Override
    public void visit(UnaryExprNode unaryExprNode) {
        unaryExprNode.getUnaryexpr().accept(this);
        Register register = new Register();
        currentBlock.append(new Uni(unaryExprNode.getExprop(), exprLinkedList.pop(), register));
    }

    @Override
    public void visit(BoolExprNode boolExprNode) {
        if (boolExprNode.isTrue()) exprLinkedList.push(new ConstValue(1));
        else exprLinkedList.push(new ConstValue(0));
    }

    @Override
    public void visit(IntExprNode intExprNode) {
        exprLinkedList.push(new ConstValue(intExprNode.getIntvalue()));
    }

    @Override
    public void visit(IDExprNode idExprNode) {
        exprLinkedList.push(idExprNode.getVarDeclNode().getIntValue());
    }

    @Override
    public void visit(ArrayIndexExprNode arrayIndexExprNode) {

    }

    @Override
    public void visit(ArrayTypeNode arrayTypeNode) {

    }

    @Override
    public void visit(ClassDeclNode classDeclNode) {

    }

    @Override
    public void visit(ClassMethodExprNode classMethodExprNode) {

    }

    @Override
    public void visit(ClassTypeNode classTypeNode) {

    }

    @Override
    public void visit(ClassThisExprNode classThisExprNode) {

    }

    @Override
    public void visit(FuncCallExprNode funcCallExprNode) {

    }

    @Override
    public void visit(NewExprNode newExprNode) {

    }

    @Override
    public void visit(NullExprNode nullExprNode) {

    }

    @Override
    public void visit(StringExprNode stringExprNode) {

    }

    @Override
    public void visit(TypeNode typeNode) {

    }
}
