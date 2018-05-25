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
import IR.*;
import Type.Type;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

public class IRGenerator implements ASTVisitor {
    static private final int intOffset = 4;

    static private int stackTop = 0;
    static private char[] IRMem = new char[10000];

    static private boolean stopVisit = false;

    static private LinkedList<IntValue> exprLinkedList = new LinkedList<>();

    static private LinkedList<BasicBlock> breakLinkedList = new LinkedList<>();
    static private LinkedList<BasicBlock> continueLinkedList = new LinkedList<>();
    static private LinkedList<BasicBlock> returnLinkedList = new LinkedList<>();

    static private Map<String, BasicBlock> funcBlockMap = new HashMap<>();

    BasicBlock currentBlock;
    BasicBlock endBlock = new BasicBlock();

    @Override
    public void visit(ProgNode progNode) {
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof FuncDeclNode) {
                if (((FuncDeclNode) declNode).getFunctionName() == "main") {
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

        currentBlock = endBlock;
    }

    @Override
    public void visit(ForStmtNode forStmtNode) {
        BasicBlock condBlock = new BasicBlock();
        BasicBlock forBlock = new BasicBlock();
        BasicBlock endBlock = new BasicBlock();

        if (forStmtNode.getForinit() == null) {
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
        currentBlock.append(new Jump(condBlock));

        currentBlock = endBlock;
    }

    @Override
    public void visit(BreakStmtNode breakStmtNode) {
        currentBlock.append(new Jump(breakLinkedList.pop()));
        stopVisit = true;
    }

    @Override
    public void visit(ContinueStmtNode continueStmtNode) {
        currentBlock.append(new Jump(continueLinkedList.pop()));
        stopVisit = true;
    }

    @Override
    public void visit(ReturnStmtNode returnStmtNode) {
        returnStmtNode.getReturnexpr().accept(this);
        currentBlock.append(new Return(exprLinkedList.pop()));
    }

    //  ***************************** Stmt Over ***************************** //

    @Override
    public void visit(VarDeclNode varDeclNode) {
//      Non-Array & Non-Class
        if (varDeclNode.getVartype() instanceof TypeNode) {
//          Int
            if (varDeclNode.getVartype().getBasetype() == Type.Types.INT) {
                varDeclNode.setMemAddr(stackTop);
                if (varDeclNode.getVarinit() != null) {
                    varDeclNode.getVarinit().accept(this);
                    currentBlock.append(new Assign(stackTop, exprLinkedList.pop()));
                }
                stackTop += intOffset;
            }
        }
    }

    @Override
    public void visit(BinaryExprNode binaryExprNode) {
        binaryExprNode.getRhs().accept(this);
        IntValue rhs = exprLinkedList.pop();
        binaryExprNode.getLhs().accept(this);
        IntValue lhs = exprLinkedList.pop();
        currentBlock.append(new Bin(binaryExprNode.getExprop(), lhs, rhs));
        exprLinkedList.push(new Register());
    }

    @Override
    public void visit(SuffixExprNode suffixExprNode) {
        suffixExprNode.getSuffixexpr().accept(this);

        //consider Lvalue, MemAddr actually
        IntValue intValue = exprLinkedList.pop();
        //copy
        currentBlock.append(new Assign(stackTop, intValue));

        if (suffixExprNode.getExprop() == SuffixExprNode.SuffixOP.SELF_INC)
            currentBlock.append(new Uni(UnaryExprNode.UnaryOP.SELF_INC, intValue));
        else currentBlock.append(new Uni(UnaryExprNode.UnaryOP.SELF_DEC, intValue));

        exprLinkedList.push(new MemAddr(stackTop));
        stackTop += intOffset;
    }

    @Override
    public void visit(UnaryExprNode unaryExprNode) {
        unaryExprNode.getUnaryexpr().accept(this);
        currentBlock.append(new Uni(unaryExprNode.getExprop(), exprLinkedList.getLast()));
    }

    @Override
    public void visit(BoolExprNode boolExprNode) {
        if (boolExprNode.isTrue()) exprLinkedList.push(new Const(1));
        else exprLinkedList.push(new Const(0));
    }

    @Override
    public void visit(IntExprNode intExprNode) {
        exprLinkedList.push(new Const(intExprNode.getIntvalue()));
    }

    @Override
    public void visit(IDExprNode idExprNode) {
        exprLinkedList.push(new MemAddr(idExprNode.getDeclNode().getMemAddr()));
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
