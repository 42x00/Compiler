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

import java.util.*;

public class IRGenerator implements ASTVisitor {
    static private int cntString = 0;
    static private boolean hasReturn;
    static private boolean isReturnAddr;

    static private Register registerRAX = new Register(Register.RegisterName.RAX);
    static private Register registerRDI = new Register(Register.RegisterName.RDI);
    static private Register registerRSI = new Register(Register.RegisterName.RSI);
    static private Register registerRCX = new Register(Register.RegisterName.RCX);

    static private LinkedList<IntValue> exprLinkedList = new LinkedList<>();

    static private LinkedList<BasicBlock> breakLinkedList = new LinkedList<>();
    static private LinkedList<BasicBlock> continueLinkedList = new LinkedList<>();

    static private Map<String, Integer> registerCntMap = new HashMap<>();
    static private Map<String, BasicBlock> funcBlockMap = new HashMap<>();
    static private Map<String, String> stringMap = new HashMap<>();

    private BasicBlock currentBlock;
    private BasicBlock startBlock;
    private BasicBlock shortcut2Block;
    private BasicBlock funcReturnBlock;

    public Map<String, Integer> getRegisterCntMap() {
        return registerCntMap;
    }

    public Map<String, BasicBlock> getFuncBlockMap() {
        return funcBlockMap;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    private String newStringName() {
        return "_string_" + Integer.toString(cntString++);
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
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof VarDeclNode) {
                VarDeclNode varDeclNode = (VarDeclNode) declNode;
                varDeclNode.setIntValue(new GloalVar(varDeclNode.getVarname()));
            }
        }
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof FuncDeclNode) {
                startBlock = new BasicBlock();
                funcBlockMap.put(declNode.getDeclname(), startBlock);
                currentBlock = startBlock;
                if (((FuncDeclNode) declNode).getFunctionName().equals("main"))
                    initGlobalVar(progNode);
                declNode.accept(this);
            }
        }
    }

    @Override
    public void visit(FuncDeclNode funcDeclNode) {
        if (funcDeclNode.getFunctionStatements() != null) {
            hasReturn = false;
            funcReturnBlock = new BasicBlock();
            funcReturnBlock.append(new ReturnInst());
            Register.resetCnt();
            for (VarDeclNode varDeclNode : funcDeclNode.getFunctionParameterList().getVardeclnodeList()) {
                varDeclNode.setIntValue(new Register());
            }
            funcDeclNode.getFunctionStatements().accept(this);
            if (!hasReturn) {
                currentBlock.append(new Assign(registerRAX, new ConstValue(0)));
                currentBlock.append(new Jump(funcReturnBlock));
            }
            registerCntMap.put(funcDeclNode.getFunctionName(), Register.getCntRegister() - 15);
        }
    }

    @Override
    public void visit(CompStmtNode compStmtNode) {
        for (StmtNode stmtNode : compStmtNode.getStmtNodeList()) {
            stmtNode.accept(this);
        }
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

            shortcut2Block = endBlock;
            ifStmtNode.getIfexpr().accept(this);

            currentBlock.append(new Cjump(exprLinkedList.pop(), thenBlock, endBlock));

            currentBlock = thenBlock;
            ifStmtNode.getIfstmt().accept(this);
            currentBlock.append(new Jump(endBlock));

            currentBlock = endBlock;
        } else {
            BasicBlock thenBlock = new BasicBlock();
            BasicBlock elseBlock = new BasicBlock();
            BasicBlock endBlock = new BasicBlock();

            shortcut2Block = elseBlock;
            ifStmtNode.getIfexpr().accept(this);

            currentBlock.append(new Cjump(exprLinkedList.pop(), thenBlock, elseBlock));

            currentBlock = thenBlock;
            ifStmtNode.getIfstmt().accept(this);
            currentBlock.append(new Jump(endBlock));

            currentBlock = elseBlock;
            ifStmtNode.getElsestmt().accept(this);
            currentBlock.append(new Jump(endBlock));

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

        shortcut2Block = endBlock;
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


        if (forStmtNode.getForexprend() != null) {
            shortcut2Block = endBlock;
            forStmtNode.getForexprend().accept(this);
            currentBlock.append(new Cjump(exprLinkedList.pop(), forBlock, endBlock));
        } else currentBlock.append(new Jump(forBlock));

        continueLinkedList.push(condBlock);
        breakLinkedList.push(endBlock);

        currentBlock = forBlock;
        forStmtNode.getForstmt().accept(this);
        if (forStmtNode.getForexprupdate() != null)
            forStmtNode.getForexprupdate().accept(this);
        currentBlock.append(new Jump(condBlock));

        continueLinkedList.pop();
        breakLinkedList.pop();

        currentBlock = endBlock;
    }

    @Override
    public void visit(BreakStmtNode breakStmtNode) {
        currentBlock.append(new Jump(breakLinkedList.getFirst()));
    }

    @Override
    public void visit(ContinueStmtNode continueStmtNode) {
        currentBlock.append(new Jump(continueLinkedList.getFirst()));
    }

    @Override
    public void visit(ReturnStmtNode returnStmtNode) {
        hasReturn = true;
        returnStmtNode.getReturnexpr().accept(this);
        currentBlock.append(new Assign(registerRAX, exprLinkedList.pop()));
        currentBlock.append(new Jump(funcReturnBlock));
    }

    //  ***************************** Stmt Over ***************************** //

    @Override
    public void visit(VarDeclNode varDeclNode) {
        varDeclNode.setIntValue(new Register());

        if (varDeclNode.getVarinit() != null) {
            if (varDeclNode.getVarinit() instanceof BinaryExprNode) {
                BinaryExprNode.BinaryOP binaryOP = ((BinaryExprNode) varDeclNode.getVarinit()).getExprop();
                if (binaryOP == BinaryExprNode.BinaryOP.LOGICAL_AND || binaryOP == BinaryExprNode.BinaryOP.LOGICAL_OR) {
                    BasicBlock nxtBlock = new BasicBlock();
                    shortcut2Block = nxtBlock;
                    varDeclNode.getVarinit().accept(this);
                    currentBlock.append(new Jump(nxtBlock));
                    currentBlock = nxtBlock;
                    currentBlock.append(new Assign(varDeclNode.getIntValue(), exprLinkedList.pop()));
                    return;
                }
            }
            varDeclNode.getVarinit().accept(this);
            currentBlock.append(new Assign(varDeclNode.getIntValue(), exprLinkedList.pop()));
        }
    }

    @Override
    public void visit(BinaryExprNode binaryExprNode) {
        if (binaryExprNode.getLhs().getExprtype().isEqual(Type.Types.STRING)) {
            List<IntValue> intValueList = new ArrayList<>();
            binaryExprNode.getLhs().accept(this);
            intValueList.add(exprLinkedList.pop());
            binaryExprNode.getRhs().accept(this);
            intValueList.add(exprLinkedList.pop());

            Register register = new Register();

            switch (binaryExprNode.getExprop()) {
                case ASSIGN:
                    currentBlock.append(new Assign(intValueList.get(0), intValueList.get(1)));
                    exprLinkedList.push(new ConstValue(0));
                    return;

                case ADD:
                    currentBlock.append(new Call("string.add", intValueList));
                    break;
                case EQUAL:
                    currentBlock.append(new Call("string.eq", intValueList));
                    break;
                case GREATER:
                    currentBlock.append(new Call("string.g", intValueList));
                    break;
                case LESS:
                    currentBlock.append(new Call("string.s", intValueList));
                    break;
                case GREATER_EQUAL:
                    currentBlock.append(new Call("string.ge", intValueList));
                    break;
                case LESS_EQUAL:
                    currentBlock.append(new Call("string.le", intValueList));
                    break;
                default:
                    throw new Error("String with ub OP!");
            }
            currentBlock.append(new Assign(register, registerRAX));
            exprLinkedList.push(register);
            return;
        }
        switch (binaryExprNode.getExprop()) {
            case LOGICAL_AND: {
                Register register = new Register();
                BasicBlock shortCutBlock = new BasicBlock();
                shortCutBlock.append(new Assign(register, new ConstValue(0)));
                shortCutBlock.append(new Jump(shortcut2Block));

                BasicBlock jumpBlock = new BasicBlock();
                BasicBlock nxtBlock = new BasicBlock();
                shortcut2Block = jumpBlock;
                binaryExprNode.getLhs().accept(this);
                currentBlock.append(new Jump(jumpBlock));
                jumpBlock.append(new Cjump(exprLinkedList.pop(), nxtBlock, shortCutBlock));
                currentBlock = nxtBlock;

                jumpBlock = new BasicBlock();
                nxtBlock = new BasicBlock();
                shortcut2Block = jumpBlock;
                binaryExprNode.getRhs().accept(this);
                currentBlock.append(new Jump(jumpBlock));
                jumpBlock.append(new Cjump(exprLinkedList.pop(), nxtBlock, shortCutBlock));
                currentBlock = nxtBlock;

                currentBlock.append(new Assign(register, new ConstValue(1)));
                exprLinkedList.push(register);
                break;
            }
            case LOGICAL_OR: {
                Register register = new Register();
                BasicBlock shortCutBlock = new BasicBlock();
                shortCutBlock.append(new Assign(register, new ConstValue(1)));
                shortCutBlock.append(new Jump(shortcut2Block));

                BasicBlock jumpBlock = new BasicBlock();
                BasicBlock nxtBlock = new BasicBlock();
                shortcut2Block = jumpBlock;
                binaryExprNode.getLhs().accept(this);
                currentBlock.append(new Jump(jumpBlock));
                jumpBlock.append(new Cjump(exprLinkedList.pop(), shortCutBlock, nxtBlock));
                currentBlock = nxtBlock;

                jumpBlock = new BasicBlock();
                nxtBlock = new BasicBlock();
                shortcut2Block = jumpBlock;
                binaryExprNode.getRhs().accept(this);
                currentBlock.append(new Jump(jumpBlock));
                jumpBlock.append(new Cjump(exprLinkedList.pop(), shortCutBlock, nxtBlock));
                currentBlock = nxtBlock;

                currentBlock.append(new Assign(register, new ConstValue(0)));
                exprLinkedList.push(register);
                break;
            }
            case ASSIGN: {
//                if (binaryExprNode.getLhs() instanceof ArrayIndexExprNode && binaryExprNode.getRhs() instanceof ArrayIndexExprNode) {
//                    binaryExprNode.getRhs().accept(this);
//                    IntValue rhs = exprLinkedList.pop();
//                    currentBlock.append(new Assign(registerRCX, rhs));
//                    binaryExprNode.getLhs().accept(this);
//                    IntValue lhs = exprLinkedList.pop();
//                    currentBlock.append(new Assign(lhs, registerRCX));
//                    exprLinkedList.push(new ConstValue(0));
//                    return;
//                }
                isReturnAddr = false;
                binaryExprNode.getRhs().accept(this);
                IntValue rhs = exprLinkedList.pop();
                isReturnAddr = true;
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
                currentBlock.append(new Bin(binaryExprNode.getExprop(), lhs, rhs, register));
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
            currentBlock.append(new Uni(UnaryExprNode.UnaryOP.SELF_INC, intValue, intValue));
        else currentBlock.append(new Uni(UnaryExprNode.UnaryOP.SELF_DEC, intValue, intValue));

        exprLinkedList.push(register);
    }

    @Override
    public void visit(UnaryExprNode unaryExprNode) {
        Register register = new Register();
        if (unaryExprNode.getUnaryexpr() instanceof BinaryExprNode) {
            BinaryExprNode.BinaryOP binaryOP = ((BinaryExprNode) unaryExprNode.getUnaryexpr()).getExprop();
            if (binaryOP == BinaryExprNode.BinaryOP.LOGICAL_AND || binaryOP == BinaryExprNode.BinaryOP.LOGICAL_OR) {
                BasicBlock nxtBlock = new BasicBlock();
                shortcut2Block = nxtBlock;
                unaryExprNode.getUnaryexpr().accept(this);
                currentBlock.append(new Jump(nxtBlock));
                currentBlock = nxtBlock;
                currentBlock.append(new Uni(unaryExprNode.getExprop(), exprLinkedList.pop(), register));
                exprLinkedList.push(register);
                return;
            }
        }
        unaryExprNode.getUnaryexpr().accept(this);
        currentBlock.append(new Uni(unaryExprNode.getExprop(), exprLinkedList.pop(), register));
        exprLinkedList.push(register);
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
    public void visit(FuncCallExprNode funcCallExprNode) {
        String funcName = "NotFuncName";
        List<IntValue> intValueList = new ArrayList<>();

        if (funcCallExprNode.getFunction() instanceof IDExprNode) {
            //f()
            funcName = ((IDExprNode) funcCallExprNode.getFunction()).getId();
            switch (funcName) {
                case "println":
                    funcName = "puts";
                    break;
            }
        } else {
            //s.length()
            ClassMethodExprNode classMethodExprNode = (ClassMethodExprNode) funcCallExprNode.getFunction();
            classMethodExprNode.getClassexpr().accept(this);
            intValueList.add(exprLinkedList.pop());
            TypeNode typeNode = classMethodExprNode.getClassexpr().getExprtype();
            if (typeNode instanceof ClassTypeNode) {
                funcName = ((ClassTypeNode) typeNode).getClassname();
            } else if (typeNode instanceof ArrayTypeNode) {
                funcName = "array";
            } else {
                funcName = "string";
            }
            funcName += "." + classMethodExprNode.getMethodname();
        }


        for (ExprNode exprNode : funcCallExprNode.getParameters()) {
            exprNode.accept(this);
            intValueList.add(exprLinkedList.pop());
        }

        currentBlock.append(new Call(funcName, intValueList));
        Register register = new Register();
        currentBlock.append(new Assign(register, registerRAX));
        exprLinkedList.push(register);
    }

    @Override
    public void visit(NewExprNode newExprNode) {
        if (newExprNode.getExprtype() instanceof ArrayTypeNode) {
            ArrayTypeNode arrayTypeNode = (ArrayTypeNode) newExprNode.getExprtype();

            //Array start addr for return
            Register register = new Register();

            arrayTypeNode.getArraysizeexpr().accept(this);
            //[intValue]
            IntValue intValue = exprLinkedList.pop();

            //r = intValue << 3
            currentBlock.append(new Bin(BinaryExprNode.BinaryOP.SHL, intValue, new ConstValue(3), register));
            //r = r + 8
            currentBlock.append(new Bin(BinaryExprNode.BinaryOP.ADD, register, new ConstValue(8), register));

            //call malloc r bytes
            currentBlock.append(new Call("malloc", register));

            //[rax] = intValue
            currentBlock.append(new Assign(new MemAddr(registerRAX, null), intValue));
            //r = rax + 8
            currentBlock.append(new Bin(BinaryExprNode.BinaryOP.ADD, registerRAX, new ConstValue(8), register));

            if (arrayTypeNode.getArrayelement() instanceof ArrayTypeNode) {
                if (((ArrayTypeNode) arrayTypeNode.getArrayelement()).getArraysizeexpr() != null) {
                    if (intValue instanceof ConstValue) {
                        ConstValue constValue = (ConstValue) intValue;
                        for (int i = 0; i < constValue.getAnInt(); ++i) {
                            (new NewExprNode(arrayTypeNode.getArrayelement())).accept(this);
                            currentBlock.append(new Assign(registerRDI, register));
                            currentBlock.append(new Assign(new MemAddr(registerRDI, new ConstValue(i)), exprLinkedList.pop()));
                        }
                    } else {
                        BasicBlock condBlock = new BasicBlock();
                        BasicBlock forBlock = new BasicBlock();
                        BasicBlock endBlock = new BasicBlock();
                        //int i
                        Register register1 = new Register();

                        currentBlock.append(new Assign(register1, new ConstValue(0)));
                        currentBlock.append(new Jump(condBlock));
                        currentBlock = condBlock;

                        //condBlock
                        Register jumpRegister = new Register();
                        currentBlock.append(new Bin(BinaryExprNode.BinaryOP.LESS, register1, intValue, jumpRegister));
                        currentBlock.append(new Cjump(jumpRegister, forBlock, endBlock));

                        //forBlock
                        currentBlock = forBlock;
                        (new NewExprNode(arrayTypeNode.getArrayelement())).accept(this);
                        currentBlock.append(new Assign(registerRDI, register));
                        currentBlock.append(new Assign(registerRSI, register1));
                        currentBlock.append(new Assign(new MemAddr(registerRDI, registerRSI), exprLinkedList.pop()));
                        currentBlock.append(new Uni(UnaryExprNode.UnaryOP.SELF_INC, register1, register1));
                        currentBlock.append(new Jump(condBlock));

                        //endBlock
                        currentBlock = endBlock;
                    }
                }
            }

            exprLinkedList.push(register);
        }
    }

    @Override
    public void visit(ArrayIndexExprNode arrayIndexExprNode) {
        if (arrayIndexExprNode.getIndex() == null) {
            arrayIndexExprNode.getArray().accept(this);
            return;
        }
        if (isReturnAddr) {
            isReturnAddr = false;
            arrayIndexExprNode.getIndex().accept(this);
            IntValue index = exprLinkedList.pop();
            arrayIndexExprNode.getArray().accept(this);
            IntValue array = exprLinkedList.pop();
            currentBlock.append(new Assign(registerRDI, array));
            currentBlock.append(new Assign(registerRSI, index));
            exprLinkedList.push(new MemAddr(registerRDI, registerRSI));
            return;
        }
        arrayIndexExprNode.getIndex().accept(this);
        IntValue index = exprLinkedList.pop();
        arrayIndexExprNode.getArray().accept(this);
        IntValue array = exprLinkedList.pop();
        currentBlock.append(new Assign(registerRDI, array));
        currentBlock.append(new Assign(registerRSI, index));
        Register register = new Register();
        currentBlock.append(new Assign(register, new MemAddr(registerRDI, registerRSI)));
        exprLinkedList.push(register);
    }


    @Override
    public void visit(StringExprNode stringExprNode) {
        String string = newStringName();
        stringMap.put(string, stringExprNode.getStringexpr());
        exprLinkedList.push(new GloalVar(string, true));
    }

    @Override
    public void visit(ClassMethodExprNode classMethodExprNode) {
    }

    @Override
    public void visit(ClassDeclNode classDeclNode) {

    }

    @Override
    public void visit(ClassTypeNode classTypeNode) {

    }

    @Override
    public void visit(ClassThisExprNode classThisExprNode) {

    }

    @Override
    public void visit(NullExprNode nullExprNode) {

    }

    @Override
    public void visit(ArrayTypeNode arrayTypeNode) {

    }

    @Override
    public void visit(TypeNode typeNode) {

    }
}
