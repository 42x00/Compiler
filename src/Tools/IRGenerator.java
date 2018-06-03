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
import Tools.Scope.ToplevelScope;
import Type.Type;

import java.util.*;

public class IRGenerator implements ASTVisitor {
    static private int cntString = 0;
    static private boolean isReturnAddr = false;

    static private ToplevelScope toplevelScope;

    static private ClassDeclNode currentClass;

    static private Register registerRAX = new Register(Register.RegisterName.RAX);
    static private Register registerR10 = new Register(Register.RegisterName.R10);
    static private Register registerR11 = new Register(Register.RegisterName.R11);

    static private LinkedList<IntValue> exprLinkedList = new LinkedList<>();

    static private LinkedList<BasicBlock> breakLinkedList = new LinkedList<>();
    static private LinkedList<BasicBlock> continueLinkedList = new LinkedList<>();

    static private Map<String, Integer> registerCntMap = new HashMap<>();
    static private Map<String, BasicBlock> funcBlockMap = new HashMap<>();
    static private Map<String, String> stringMap = new HashMap<>();
    static private Map<String, Integer> offsetIndexMap = new HashMap<>();

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
        Register.resetCnt();
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof VarDeclNode) {
                if (((VarDeclNode) declNode).getVarinit() != null) {
                    isReturnAddr = false;
                    ((VarDeclNode) declNode).getVarinit().accept(this);
                    currentBlock.append(new Assign(((VarDeclNode) declNode).getIntValue(), exprLinkedList.pop()));
                }
            }
        }
    }

    private void optimConstCond(BasicBlock thenBlock, BasicBlock elseBlock) {
        IntValue mayConst = exprLinkedList.pop();
        if (mayConst instanceof ConstValue) {
            if (((ConstValue) mayConst).getAnInt() == 1) {
                currentBlock.append(new Jump(thenBlock));
            } else currentBlock.append(new Jump(elseBlock));
    } else
            currentBlock.append(new Cjump(mayConst, thenBlock, elseBlock));
    }

    @Override
    public void visit(ProgNode progNode) {
        toplevelScope = progNode.getToplevelScope();
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof VarDeclNode) {
                VarDeclNode varDeclNode = (VarDeclNode) declNode;
                varDeclNode.setIntValue(new GloalVar("_global_" + varDeclNode.getVarname()));
            }
        }
        for (DeclNode declNode : progNode.getDeclarations()) {
            if (declNode instanceof ClassDeclNode) {
                declNode.accept(this);
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
        //Add Return
        List<StmtNode> stmtNodeList = funcDeclNode.getFunctionStatements().getStmtNodeList();
        int lastIndex = stmtNodeList.size() - 1;
        if (!(stmtNodeList.get(lastIndex) instanceof ReturnStmtNode)) {
            stmtNodeList.add(new ReturnStmtNode(new IntExprNode(0)));
        }
        //Set ReturnBlock
        funcReturnBlock = new BasicBlock();
        funcReturnBlock.append(new ReturnInst());
        //Reset Register Ord
        Register.resetCnt();

        if (currentClass != null)
            currentClass.setIntValue(new Register());
        for (VarDeclNode varDeclNode : funcDeclNode.getFunctionParameterList().getVardeclnodeList()) {
            varDeclNode.setIntValue(new Register());
        }
        //visit {}
        funcDeclNode.getFunctionStatements().accept(this);
        if (currentClass != null)
            registerCntMap.put(currentClass.getDeclname() + "." + funcDeclNode.getFunctionName(), Register.getCntRegister() - 15);
            //------------------- Can be set in FuncDeclNode -------------------//
        else registerCntMap.put(funcDeclNode.getFunctionName(), Register.getCntRegister() - 15);
    }

    @Override
    public void visit(ClassDeclNode classDeclNode) {
        int nowOffset = 0;
        for (DeclNode declNode : classDeclNode.getClassdecllist()) {
            if (declNode instanceof VarDeclNode) {
                ((VarDeclNode) declNode).setOffsetIndex(nowOffset);
                offsetIndexMap.put(classDeclNode.getDeclname() + "." + declNode.getDeclname(), nowOffset);
                ++nowOffset;
            } else {
                startBlock = new BasicBlock();
                funcBlockMap.put(classDeclNode.getDeclname() + "." + declNode.getDeclname(), startBlock);
                currentBlock = startBlock;
                currentClass = classDeclNode;
                declNode.accept(this);
                currentClass = null;
            }
        }
        classDeclNode.setSize(nowOffset);
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

            if (ifStmtNode.getIfexpr() instanceof BinaryExprNode) {
                BinaryExprNode binaryExprNode = (BinaryExprNode) ifStmtNode.getIfexpr();
                if (binaryExprNode.getExprop() == BinaryExprNode.BinaryOP.LOGICAL_AND) shortcut2Block = endBlock;
                else if (binaryExprNode.getExprop() == BinaryExprNode.BinaryOP.LOGICAL_OR) shortcut2Block = thenBlock;
            }
            isReturnAddr = false;
            ifStmtNode.getIfexpr().accept(this);

            optimConstCond(thenBlock,endBlock);

            currentBlock = thenBlock;
            ifStmtNode.getIfstmt().accept(this);
            currentBlock.append(new Jump(endBlock));

            currentBlock = endBlock;
        } else {
            BasicBlock thenBlock = new BasicBlock();
            BasicBlock elseBlock = new BasicBlock();
            BasicBlock endBlock = new BasicBlock();

            shortcut2Block = elseBlock;
            isReturnAddr = false;
            ifStmtNode.getIfexpr().accept(this);

            optimConstCond(thenBlock,elseBlock);

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

        if (whileStmtNode.getWhileexpr() instanceof BinaryExprNode) {
            BinaryExprNode binaryExprNode = (BinaryExprNode) whileStmtNode.getWhileexpr();
            if (binaryExprNode.getExprop() == BinaryExprNode.BinaryOP.LOGICAL_AND) shortcut2Block = endBlock;
            else if (binaryExprNode.getExprop() == BinaryExprNode.BinaryOP.LOGICAL_OR) shortcut2Block = whileBlock;
        }
        isReturnAddr = false;
        whileStmtNode.getWhileexpr().accept(this);

        optimConstCond(whileBlock,endBlock);

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
            if (forStmtNode.getForexprend() instanceof BinaryExprNode) {
                BinaryExprNode binaryExprNode = (BinaryExprNode) forStmtNode.getForexprend();
                if (binaryExprNode.getExprop() == BinaryExprNode.BinaryOP.LOGICAL_AND) shortcut2Block = endBlock;
                else if (binaryExprNode.getExprop() == BinaryExprNode.BinaryOP.LOGICAL_OR) shortcut2Block = forBlock;
            }
            isReturnAddr = false;
            forStmtNode.getForexprend().accept(this);
            optimConstCond(forBlock,endBlock);
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
        if (returnStmtNode.getReturnexpr() == null) {
            currentBlock.append(new Jump(funcReturnBlock));
            currentBlock = new BasicBlock();
            return;
        }
        if (returnStmtNode.getReturnexpr() instanceof BinaryExprNode) {
            BinaryExprNode.BinaryOP binaryOP = ((BinaryExprNode) returnStmtNode.getReturnexpr()).getExprop();
            if (binaryOP == BinaryExprNode.BinaryOP.LOGICAL_AND || binaryOP == BinaryExprNode.BinaryOP.LOGICAL_OR) {
                BasicBlock nxtBlock = new BasicBlock();
                shortcut2Block = nxtBlock;
                isReturnAddr = false;
                returnStmtNode.getReturnexpr().accept(this);
                currentBlock.append(new Jump(nxtBlock));
                currentBlock = nxtBlock;
                currentBlock.append(new Assign(registerRAX, exprLinkedList.pop()));
                currentBlock.append(new Jump(funcReturnBlock));
                currentBlock = new BasicBlock();
                return;
            }
        }
        //consider!!!
        //isReturnAddr = true;
        returnStmtNode.getReturnexpr().accept(this);
        currentBlock.append(new Assign(registerRAX, exprLinkedList.pop()));
        currentBlock.append(new Jump(funcReturnBlock));
        currentBlock = new BasicBlock();
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
                    isReturnAddr = false;
                    varDeclNode.getVarinit().accept(this);
                    currentBlock.append(new Jump(nxtBlock));
                    currentBlock = nxtBlock;
                    currentBlock.append(new Assign(varDeclNode.getIntValue(), exprLinkedList.pop()));
                    return;
                }
            }
            isReturnAddr = false;
            varDeclNode.getVarinit().accept(this);
            currentBlock.append(new Assign(varDeclNode.getIntValue(), exprLinkedList.pop()));
        }
    }

    @Override
    public void visit(BinaryExprNode binaryExprNode) {
        if (binaryExprNode.getExprop() == BinaryExprNode.BinaryOP.ASSIGN) {
            isReturnAddr = false;
            binaryExprNode.getRhs().accept(this);
            IntValue rhs = exprLinkedList.pop();
            isReturnAddr = true;
            binaryExprNode.getLhs().accept(this);
            IntValue lhs = exprLinkedList.pop();
            currentBlock.append(new Assign(lhs, rhs));
            exprLinkedList.push(new ConstValue(0));
            return;
        }
        if (binaryExprNode.getLhs().getExprtype().isEqual(Type.Types.STRING)) {
            List<IntValue> intValueList = new ArrayList<>();
            switch (binaryExprNode.getExprop()) {
                case ADD: {
                    isReturnAddr = false;
                    binaryExprNode.getRhs().accept(this);
                    IntValue rhs = exprLinkedList.pop();
                    isReturnAddr = false;
                    binaryExprNode.getLhs().accept(this);
                    IntValue lhs = exprLinkedList.pop();
                    intValueList.add(lhs);
                    intValueList.add(rhs);
                    Register register = new Register();
                    currentBlock.append(new Call("string.add", intValueList));
                    currentBlock.append(new Assign(register, registerRAX));
                    exprLinkedList.push(register);
                    break;
                }
                case EQUAL: {
                    isReturnAddr = false;
                    binaryExprNode.getRhs().accept(this);
                    IntValue rhs = exprLinkedList.pop();
                    isReturnAddr = false;
                    binaryExprNode.getLhs().accept(this);
                    IntValue lhs = exprLinkedList.pop();
                    intValueList.add(lhs);
                    intValueList.add(rhs);
                    Register register = new Register();
                    currentBlock.append(new Call("string.eq", intValueList));
                    currentBlock.append(new Assign(register, registerRAX));
                    exprLinkedList.push(register);
                    break;
                }
                case GREATER: {
                    isReturnAddr = false;
                    binaryExprNode.getRhs().accept(this);
                    IntValue rhs = exprLinkedList.pop();
                    isReturnAddr = false;
                    binaryExprNode.getLhs().accept(this);
                    IntValue lhs = exprLinkedList.pop();
                    intValueList.add(lhs);
                    intValueList.add(rhs);
                    Register register = new Register();
                    currentBlock.append(new Call("string.g", intValueList));
                    currentBlock.append(new Assign(register, registerRAX));
                    exprLinkedList.push(register);
                    break;
                }
                case LESS: {
                    isReturnAddr = false;
                    binaryExprNode.getRhs().accept(this);
                    IntValue rhs = exprLinkedList.pop();
                    isReturnAddr = false;
                    binaryExprNode.getLhs().accept(this);
                    IntValue lhs = exprLinkedList.pop();
                    intValueList.add(lhs);
                    intValueList.add(rhs);
                    Register register = new Register();
                    currentBlock.append(new Call("string.s", intValueList));
                    currentBlock.append(new Assign(register, registerRAX));
                    exprLinkedList.push(register);
                    break;
                }
                case GREATER_EQUAL: {
                    isReturnAddr = false;
                    binaryExprNode.getRhs().accept(this);
                    IntValue rhs = exprLinkedList.pop();
                    isReturnAddr = false;
                    binaryExprNode.getLhs().accept(this);
                    IntValue lhs = exprLinkedList.pop();
                    intValueList.add(lhs);
                    intValueList.add(rhs);
                    Register register = new Register();
                    currentBlock.append(new Call("string.ge", intValueList));
                    currentBlock.append(new Assign(register, registerRAX));
                    exprLinkedList.push(register);
                    break;
                }
                case LESS_EQUAL: {
                    isReturnAddr = false;
                    binaryExprNode.getRhs().accept(this);
                    IntValue rhs = exprLinkedList.pop();
                    isReturnAddr = false;
                    binaryExprNode.getLhs().accept(this);
                    IntValue lhs = exprLinkedList.pop();
                    intValueList.add(lhs);
                    intValueList.add(rhs);
                    Register register = new Register();
                    currentBlock.append(new Call("string.le", intValueList));
                    currentBlock.append(new Assign(register, registerRAX));
                    exprLinkedList.push(register);
                    break;
                }
                default:
                    throw new Error("String with ub OP!");
            }

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
                isReturnAddr = false;
                binaryExprNode.getLhs().accept(this);
                currentBlock.append(new Jump(jumpBlock));
                jumpBlock.append(new Cjump(exprLinkedList.pop(), nxtBlock, shortCutBlock));
                currentBlock = nxtBlock;

                jumpBlock = new BasicBlock();
                nxtBlock = new BasicBlock();
                shortcut2Block = jumpBlock;
                isReturnAddr = false;
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
                isReturnAddr = false;
                binaryExprNode.getLhs().accept(this);
                currentBlock.append(new Jump(jumpBlock));
                jumpBlock.append(new Cjump(exprLinkedList.pop(), shortCutBlock, nxtBlock));
                currentBlock = nxtBlock;

                jumpBlock = new BasicBlock();
                nxtBlock = new BasicBlock();
                shortcut2Block = jumpBlock;
                isReturnAddr = false;
                binaryExprNode.getRhs().accept(this);
                currentBlock.append(new Jump(jumpBlock));
                jumpBlock.append(new Cjump(exprLinkedList.pop(), shortCutBlock, nxtBlock));
                currentBlock = nxtBlock;

                currentBlock.append(new Assign(register, new ConstValue(0)));
                exprLinkedList.push(register);
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
                isReturnAddr = false;
                binaryExprNode.getRhs().accept(this);
                IntValue rhs = exprLinkedList.pop();
                isReturnAddr = false;
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
        isReturnAddr = true;
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
                isReturnAddr = false;
                unaryExprNode.getUnaryexpr().accept(this);
                currentBlock.append(new Jump(nxtBlock));
                currentBlock = nxtBlock;
                currentBlock.append(new Uni(unaryExprNode.getExprop(), exprLinkedList.pop(), register));
                exprLinkedList.push(register);
                return;
            }
        }
        isReturnAddr = true;
        unaryExprNode.getUnaryexpr().accept(this);
        IntValue intValue = exprLinkedList.pop();
//        if (unaryExprNode.getExprop() == UnaryExprNode.UnaryOP.POSI) {
//            exprLinkedList.push(intValue);
//            return;
//        }
        if (intValue instanceof ConstValue) {
            switch (unaryExprNode.getExprop()) {
                case NEGE:
                    exprLinkedList.push(((ConstValue) intValue).toNeg());
                    break;
                case BIT_NOT:
                    exprLinkedList.push(((ConstValue) intValue).toBitNot());
                    throw new Error("Const OP with ^!");
                default:
                    throw new Error("Wrong OP with Const!");
            }
            return;
        }
        currentBlock.append(new Uni(unaryExprNode.getExprop(), intValue, register));
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
        if (currentClass != null) {
            DeclNode d = currentClass.getLocalScope().find(idExprNode.getId());
            if (d != null) {
                if (isReturnAddr) {
                    currentBlock.append(new Assign(registerR10, currentClass.getIntValue()));
                    currentBlock.append(new Assign(registerR11,
                            new ConstValue(offsetIndexMap.get(currentClass.getDeclname() + "." + d.getDeclname()))));
                    exprLinkedList.push(new MemAddr(registerR10, registerR11));
                    return;
                }
                currentBlock.append(new Assign(registerR10, currentClass.getIntValue()));
                currentBlock.append(new Assign(registerR11,
                        new ConstValue(offsetIndexMap.get(currentClass.getDeclname() + "." + d.getDeclname()))));
                Register register = new Register();
                currentBlock.append(new Assign(register, new MemAddr(registerR10, registerR11)));
                exprLinkedList.push(register);
                return;
            }
        }
        exprLinkedList.push(idExprNode.getVarDeclNode().getIntValue());
    }

    @Override
    public void visit(FuncCallExprNode funcCallExprNode) {
        String funcName = "_global_";
        List<IntValue> intValueList = new ArrayList<>();

        if (funcCallExprNode.getFunction() instanceof IDExprNode) {
            //f()
            String rawFuncName = ((IDExprNode) funcCallExprNode.getFunction()).getId();
            if (currentClass != null) {
                DeclNode d = currentClass.getLocalScope().find(rawFuncName);
                if (d != null) {
                    rawFuncName = currentClass.getDeclname() + "." + d.getDeclname();
                    intValueList.add(currentClass.getIntValue());
                }
            }
            switch (rawFuncName) {
                case "print":
                case "println":
                case "getString":
                case "getInt":
                case "toString":
                    funcName = rawFuncName;
                    break;
                default:
                    funcName = "_global_" + rawFuncName;
            }
            switch (funcName) {
                case "println":
                    funcName = "puts";
                    break;
            }
        } else {
            //s.length()
            ClassMethodExprNode classMethodExprNode = (ClassMethodExprNode) funcCallExprNode.getFunction();
            isReturnAddr = true;
            classMethodExprNode.getClassexpr().accept(this);
            intValueList.add(exprLinkedList.pop());
            TypeNode typeNode = classMethodExprNode.getClassexpr().getExprtype();
            if (typeNode instanceof ClassTypeNode) {
                funcName += ((ClassTypeNode) typeNode).getClassname() + "." + classMethodExprNode.getMethodname();
            } else if (typeNode instanceof ArrayTypeNode) {
                funcName = "array." + classMethodExprNode.getMethodname();
            } else {
                funcName = "string." + classMethodExprNode.getMethodname();
            }
        }


        for (ExprNode exprNode : funcCallExprNode.getParameters()) {
            if (exprNode instanceof BinaryExprNode) {
                BinaryExprNode.BinaryOP binaryOP = ((BinaryExprNode) exprNode).getExprop();
                if (binaryOP == BinaryExprNode.BinaryOP.LOGICAL_AND || binaryOP == BinaryExprNode.BinaryOP.LOGICAL_OR) {
                    BasicBlock nxtBlock = new BasicBlock();
                    shortcut2Block = nxtBlock;
                    isReturnAddr = false;
                    exprNode.accept(this);
                    currentBlock.append(new Jump(nxtBlock));
                    currentBlock = nxtBlock;
                } else exprNode.accept(this);
            } else {
                isReturnAddr = false;
                exprNode.accept(this);
            }
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

            isReturnAddr = false;
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
                    if (intValue instanceof ConstValue && ((ConstValue) intValue).getAnInt() < 10) {
                        ConstValue constValue = (ConstValue) intValue;
                        for (int i = 0; i < constValue.getAnInt(); ++i) {
                            (new NewExprNode(arrayTypeNode.getArrayelement())).accept(this);
                            currentBlock.append(new Assign(registerR10, register));
                            currentBlock.append(new Assign(new MemAddr(registerR10, new ConstValue(i)), exprLinkedList.pop()));
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
                        currentBlock.append(new Assign(registerR10, register));
                        currentBlock.append(new Assign(registerR11, register1));
                        currentBlock.append(new Assign(new MemAddr(registerR10, registerR11), exprLinkedList.pop()));
                        currentBlock.append(new Uni(UnaryExprNode.UnaryOP.SELF_INC, register1, register1));
                        currentBlock.append(new Jump(condBlock));

                        //endBlock
                        currentBlock = endBlock;
                    }
                }
            }

            exprLinkedList.push(register);
        } else {
            ClassDeclNode classDeclNode = (ClassDeclNode) toplevelScope.get(((ClassTypeNode) newExprNode.getExprtype()).getClassname());
            currentBlock.append(new Call("malloc", new ConstValue(classDeclNode.getSize() * 8)));
            exprLinkedList.push(registerRAX);
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
            currentBlock.append(new Assign(registerR10, array));
            currentBlock.append(new Assign(registerR11, index));
            exprLinkedList.push(new MemAddr(registerR10, registerR11));
            return;
        }
        arrayIndexExprNode.getIndex().accept(this);
        IntValue index = exprLinkedList.pop();
        arrayIndexExprNode.getArray().accept(this);
        IntValue array = exprLinkedList.pop();
        currentBlock.append(new Assign(registerR10, array));
        currentBlock.append(new Assign(registerR11, index));
        Register register = new Register();
        currentBlock.append(new Assign(register, new MemAddr(registerR10, registerR11)));
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
        if (isReturnAddr) {
            classMethodExprNode.getClassexpr().accept(this);
            currentBlock.append(new Assign(registerR10, exprLinkedList.pop()));
            ClassTypeNode classTypeNode = (ClassTypeNode) classMethodExprNode.getClassexpr().getExprtype();
            String nameForMap = classTypeNode.getClassname() + "." + classMethodExprNode.getMethodname();
            currentBlock.append(new Assign(registerR11, new ConstValue(offsetIndexMap.get(nameForMap))));
            exprLinkedList.push(new MemAddr(registerR10, registerR11));
            return;
        }
        classMethodExprNode.getClassexpr().accept(this);
        currentBlock.append(new Assign(registerR10, exprLinkedList.pop()));
        ClassTypeNode classTypeNode = (ClassTypeNode) classMethodExprNode.getClassexpr().getExprtype();
        String nameForMap = classTypeNode.getClassname() + "." + classMethodExprNode.getMethodname();
        currentBlock.append(new Assign(registerR11, new ConstValue(offsetIndexMap.get(nameForMap))));
        Register register = new Register();
        currentBlock.append(new Assign(register, new MemAddr(registerR10, registerR11)));
        exprLinkedList.push(register);
    }

    @Override
    public void visit(ClassThisExprNode classThisExprNode) {
        exprLinkedList.push(currentClass.getIntValue());
    }

    @Override
    public void visit(NullExprNode nullExprNode) {
        exprLinkedList.push(new ConstValue(0));
    }

    @Override
    public void visit(ClassTypeNode classTypeNode) {

    }

    @Override
    public void visit(ArrayTypeNode arrayTypeNode) {

    }

    @Override
    public void visit(TypeNode typeNode) {

    }
}
