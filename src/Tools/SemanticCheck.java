package Tools;

import AST_Node.ASTNode;
import AST_Node.ASTVisitor;
import AST_Node.DeclNodes.*;
import AST_Node.ExprNodes.*;
import AST_Node.ProgNode;
import AST_Node.StmtNodes.*;
import AST_Node.TypeNodes.ArrayTypeNode;
import AST_Node.TypeNodes.ClassTypeNode;
import AST_Node.TypeNodes.FuncTypeNode;
import AST_Node.TypeNodes.TypeNode;
import Tools.Scope.*;
import Type.*;
import org.antlr.v4.codegen.model.decl.Decl;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.LinkedList;

public class SemanticCheck implements ASTVisitor{
    private final LinkedList<Scope> scopeStack = new LinkedList<>();
    private int isInLoop = 0;
    private ClassTypeNode currentClass;
    private FuncTypeNode currentFunc;
    static private ToplevelScope toplevelScope;

    private Scope currentScope(){
        return scopeStack.getLast();
    }

    private boolean isClassorArray(TypeNode typeNode){
        return typeNode instanceof ClassTypeNode || typeNode instanceof ArrayTypeNode;
    }

    public ToplevelScope getToplevelScope() {
        return toplevelScope;
    }

    private void varTypeExprCheck(VarDeclNode varDeclNode){
        if (varDeclNode.getVartype() instanceof ClassTypeNode)
            varDeclNode.getVartype().accept(this);
        if (varDeclNode.getVarinit() != null){
            varDeclNode.getVarinit().accept(this);
            if (varDeclNode.getVarinit().isEqual(Type.Types.NULL))
                if (!isClassorArray(varDeclNode.getVartype()))
                    throw new Error("Wrong type initialized null!");
        }
    }

    private void setBuiltInFunction(){
        //#Array.size: int size()
        currentScope().addDecl("#Array.size", new FuncDeclNode(new TypeNode(Type.Types.INT), "#Array.size",
                null, null));
        //void print(string str);
        currentScope().addDecl("print", new FuncDeclNode(new TypeNode(Type.Types.VOID), "print",
                new VarDeclListNode(new VarDeclNode(new TypeNode(Type.Types.STRING), "str")), null));
        //void println(string str);
        currentScope().addDecl("println", new FuncDeclNode(new TypeNode(Type.Types.VOID), "println",
                new VarDeclListNode(new VarDeclNode(new TypeNode(Type.Types.STRING), "str")), null));
        //string getString();
        currentScope().addDecl("getString", new FuncDeclNode(new TypeNode(Type.Types.STRING), "getString",
                null, null));
        //int getInt();
        currentScope().addDecl("getInt", new FuncDeclNode(new TypeNode(Type.Types.INT), "getInt",
                null, null));
        //string toString(int i);
        currentScope().addDecl("toString", new FuncDeclNode(new TypeNode(Type.Types.STRING), "toString",
                new VarDeclListNode(new VarDeclNode(new TypeNode(Type.Types.INT), "i")), null));
        //#String.length: int length()
        currentScope().addDecl("#String.length", new FuncDeclNode(new TypeNode(Type.Types.INT), "#String.length",
                null, null));
        //#String.substring: string substring(int left, int right)
        VarDeclListNode varDeclListNode = new VarDeclListNode();
        varDeclListNode.addDecl(new VarDeclNode(new TypeNode(Type.Types.INT), "left"));
        varDeclListNode.addDecl(new VarDeclNode(new TypeNode(Type.Types.INT), "right"));
        currentScope().addDecl("#String.substring", new FuncDeclNode(new TypeNode(Type.Types.STRING), "#String.substring",
                varDeclListNode, null));
        //#String.parseInt: int parseInt();
        currentScope().addDecl("#String.parseInt", new FuncDeclNode(new TypeNode(Type.Types.INT), "#String.parseInt",
                null, null));
        //#String.ord: int ord(int pos);
        currentScope().addDecl("#String.ord", new FuncDeclNode(new TypeNode(Type.Types.INT), "#String.ord",
                new VarDeclListNode(new VarDeclNode(new TypeNode(Type.Types.INT), "pos")), null));
    }

    public void checkMain(){
        DeclNode main = currentScope().get("main");
        if (main == null) throw new Error("Without main func!");
        FuncDeclNode funcDeclNode = (FuncDeclNode) main;
        if (funcDeclNode.getFunctionReturnType() == null)
            throw new Error("Main func without return!");
        else {
            if (!funcDeclNode.getFunctionReturnType().isEqual(Type.Types.INT)){
                throw new Error("Main with wrong return type!");
            }
        }
        if (funcDeclNode.getFunctionParameterList().getParamSize() != 0)
            throw new Error("Main with parameters!");
    }

    public String ctxLocation(ASTNode obj){
        return  "Line: " + obj.ctx.getStart().getLine() + ", Row: " + obj.ctx.getStart().getCharPositionInLine();
    }

    @Override
    public void visit(ProgNode progNode) {
        toplevelScope = new ToplevelScope();
        scopeStack.addLast(toplevelScope);
        setBuiltInFunction();

        for (DeclNode declNode : progNode.getDeclarations())
            if (declNode instanceof ClassDeclNode) {
                ClassDeclNode classDeclNode = (ClassDeclNode) declNode;
                toplevelScope.addDecl(classDeclNode.getDeclname(), classDeclNode);
                for (DeclNode declNode1 : classDeclNode.getClassdecllist())
                    toplevelScope.addDecl(classDeclNode.getDeclname() + "." + declNode1.getDeclname(), declNode1);
            }
            else if (declNode instanceof FuncDeclNode)
                toplevelScope.addDecl(declNode.getDeclname(), declNode);

        checkMain();

        for (DeclNode declNode : progNode.getDeclarations())
            declNode.accept(this);

        scopeStack.removeLast();
    }

    @Override
    public void visit(ClassDeclNode classDeclNode) {
        currentClass = new ClassTypeNode(classDeclNode.getDeclname());
        LocalScope localScope = new LocalScope(currentScope(),classDeclNode.getClassdecllist());
        scopeStack.addLast(localScope);

        for (DeclNode declNode : classDeclNode.getClassdecllist())
            if (declNode instanceof VarDeclNode) varTypeExprCheck((VarDeclNode) declNode);
            else declNode.accept(this);

        scopeStack.removeLast();
        currentClass = null;
    }

    @Override
    public void visit(FuncDeclNode funcDeclNode) {
        currentFunc = new FuncTypeNode(funcDeclNode);
        LocalScope localScope = new LocalScope(currentScope());

        //ReturnType
        if (funcDeclNode.isConstructFunction() == false) funcDeclNode.getFunctionReturnType().accept(this);
        else {
            if (currentClass == null) throw new Error(ctxLocation(funcDeclNode) + " Constract func in nonClass!");
            if (!currentClass.getClassname().equals(funcDeclNode.getFunctionName()))
                throw new Error(ctxLocation(funcDeclNode) + " Constract func with wrong name!");
        }
        //Parameters
        if (funcDeclNode.getFunctionParameterList().getParamSize() != 0) {
            for (VarDeclNode varDeclNode : funcDeclNode.getFunctionParameterList().getVardeclnodeList())
                varTypeExprCheck(varDeclNode);
            for (VarDeclNode varDeclNode : funcDeclNode.getFunctionParameterList().getVardeclnodeList())
                localScope.addDecl(varDeclNode.getDeclname() ,varDeclNode);
        }

        scopeStack.addLast(localScope);

        if (funcDeclNode.getFunctionStatements() != null)
            funcDeclNode.getFunctionStatements().accept(this);

        scopeStack.removeLast();
        currentFunc = null;
    }

    @Override
    public void visit(ArrayTypeNode arrayTypeNode) {
        arrayTypeNode.getArrayelement().accept(this);
    }

    @Override
    public void visit(CompStmtNode compStmtNode) {
        LocalScope localScope = new LocalScope(currentScope());
        scopeStack.addLast(localScope);

        for (StmtNode stmtNode : compStmtNode.getStmtNodeList())
            stmtNode.accept(this);

        scopeStack.removeLast();
    }

    @Override
    public void visit(ForStmtNode forStmtNode) {
        LocalScope localScope = new LocalScope(currentScope());

        //ForExpr
        if (forStmtNode.getForexprend() != null) {
            forStmtNode.getForexprend().accept(this);
            if (!forStmtNode.getForexprend().isEqual(Type.Types.BOOL))
                throw new Error(ctxLocation(forStmtNode) + " ForEndExpr with nonBool!");
        }
        if (forStmtNode.getForexprupdate() != null) forStmtNode.getForexprupdate().accept(this);
        if (forStmtNode.getForexprinit() != null) forStmtNode.getForexprinit().accept(this);
        else {
            if (forStmtNode.getForinit() != null)
                for (VarDeclNode varDeclNode : forStmtNode.getForinit())
                    varTypeExprCheck(varDeclNode);
            localScope = new LocalScope(currentScope(),forStmtNode.getForinit());
        }


        scopeStack.addLast(localScope);
        ++isInLoop;

        forStmtNode.getForstmt().accept(this);

        --isInLoop;
        scopeStack.removeLast();
    }

    @Override
    public void visit(WhileStmtNode whileStmtNode) {
        whileStmtNode.getWhileexpr().accept(this);
        if (!whileStmtNode.getWhileexpr().isEqual(Type.Types.BOOL))
            throw new Error(ctxLocation(whileStmtNode) + " WhileExpr with nonBool!");

        LocalScope localScope = new LocalScope(currentScope());
        scopeStack.addLast(localScope);
        ++isInLoop;

        whileStmtNode.getWhilestmt().accept(this);

        --isInLoop;
        scopeStack.removeLast();
    }

    @Override
    public void visit(VarDeclNode varDeclNode) {
        varTypeExprCheck(varDeclNode);
        currentScope().addDecl(varDeclNode.getDeclname(),varDeclNode);
    }

    @Override
    public void visit(VarDeclStmtNode varDeclStmtNode) {
        varDeclStmtNode.getVardeclnode().accept(this);
    }

    @Override
    public void visit(ArrayIndexExprNode arrayIndexExprNode) {
        arrayIndexExprNode.getArray().accept(this);
        if (!(arrayIndexExprNode.getArray().getExprtype() instanceof ArrayTypeNode))
            throw new Error(ctxLocation(arrayIndexExprNode) + " ArrayIndex not array");

        arrayIndexExprNode.getIndex().accept(this);
        if (!arrayIndexExprNode.getIndex().isEqual(Type.Types.INT))
            throw new Error(ctxLocation(arrayIndexExprNode) + " ArrayIndex not by INT index!");

        arrayIndexExprNode.setExprtype(((ArrayTypeNode) arrayIndexExprNode.getArray().getExprtype()).getArrayelement());
        arrayIndexExprNode.setLvalue(true);
    }


    @Override
    public void visit(BinaryExprNode binaryExprNode) {
        binaryExprNode.getLhs().accept(this);
        binaryExprNode.getRhs().accept(this);

        if (binaryExprNode.getRhs().isEqual(Type.Types.NULL)){
            if (isClassorArray(binaryExprNode.getLhs().getExprtype())){
                if (binaryExprNode.getExprop().equals(BinaryExprNode.BinaryOP.ASSIGN)){
                    if (!binaryExprNode.getLhs().isLvalue()) throw new Error("Assign with NonLvalue!");
                    binaryExprNode.setBasetype(Type.Types.NULL);
                }
                else if (binaryExprNode.getExprop().equals(BinaryExprNode.BinaryOP.EQUAL)
                        || binaryExprNode.getExprop().equals(BinaryExprNode.BinaryOP.INEQUAL))
                    binaryExprNode.setBasetype(Type.Types.BOOL);
                else throw new Error(ctxLocation(binaryExprNode) + " BinaryExpr wrong operator with null!");
            }
            else throw new Error(ctxLocation(binaryExprNode) + " BinaryExpr wrong type with null!");
        }
        else {
            if (!binaryExprNode.getLhs().getExprtype().isEqual(binaryExprNode.getRhs().getExprtype()))
                throw new Error(ctxLocation(binaryExprNode) + " BinaryExpr with different type!");
            switch (binaryExprNode.getExprop()) {
                case ADD:
                    if (binaryExprNode.getLhs().isEqual(Type.Types.INT) ||
                            binaryExprNode.getLhs().isEqual(Type.Types.STRING))
                        binaryExprNode.setExprtype(binaryExprNode.getLhs().getExprtype());
                    else throw new Error(ctxLocation(binaryExprNode) + " " + binaryExprNode.getExprop() + " with wrong type!");
                    break;
                case DIV:
                case MOD:
                case MUL:
                case SHL:
                case SHR:
                case SUB:
                case BIR_OR:
                case BIT_AND:
                case BIT_XOR:
                    if (binaryExprNode.getLhs().isEqual(Type.Types.INT))
                        binaryExprNode.setExprtype(binaryExprNode.getLhs().getExprtype());
                    else throw new Error(ctxLocation(binaryExprNode) + " " + binaryExprNode.getExprop() + " with wrong type!");
                    break;
                case EQUAL:
                case INEQUAL:
                    if (isClassorArray(binaryExprNode.getLhs().getExprtype()))
                        throw new Error(ctxLocation(binaryExprNode) + " " + binaryExprNode.getExprop() + " with wrong type!");
                    binaryExprNode.setBasetype(Type.Types.BOOL);
                    break;
                case LESS:
                case GREATER:
                case LESS_EQUAL:
                case GREATER_EQUAL:
                    if (binaryExprNode.getLhs().isEqual(Type.Types.INT) ||
                            binaryExprNode.getLhs().isEqual(Type.Types.STRING))
                        binaryExprNode.setBasetype(Type.Types.BOOL);
                    else throw new Error(ctxLocation(binaryExprNode) + " " + binaryExprNode.getExprop() + " with wrong type!");
                    break;
                case LOGICAL_OR:
                case LOGICAL_AND:
                    if (binaryExprNode.getLhs().isEqual(Type.Types.BOOL))
                        binaryExprNode.setBasetype(Type.Types.BOOL);
                    else throw new Error(ctxLocation(binaryExprNode) + " " + binaryExprNode.getExprop() + " with wrong type!");
                    break;
                case ASSIGN:
                    if (!binaryExprNode.getLhs().isLvalue()) throw new Error(ctxLocation(binaryExprNode) + " Assign with nonLvalue!");
                    binaryExprNode.setExprtype(binaryExprNode.getLhs().getExprtype());
                    break;
            }
        }
        binaryExprNode.setLvalue(false);
    }

    @Override
    public void visit(BoolExprNode boolExprNode) {
        if (!boolExprNode.isEqual(Type.Types.BOOL))
            throw new Error(ctxLocation(boolExprNode) + " Bool with nonBool type!");
        boolExprNode.setLvalue(false);
    }

    @Override
    public void visit(ClassThisExprNode classThisExprNode) {
        if (currentClass == null) throw new Error(ctxLocation(classThisExprNode) + " ThisExpr not in Class");
        classThisExprNode.setExprtype(currentClass);
        classThisExprNode.setLvalue(false);
    }

    @Override
    public void visit(BreakStmtNode breakStmtNode) {
        if (isInLoop == 0) throw new Error(ctxLocation(breakStmtNode) + " Break not in Loop!");
    }

    @Override
    public void visit(ClassMethodExprNode classMethodExprNode) {
        classMethodExprNode.getClassexpr().accept(this);

        DeclNode declNode = null;
        if (classMethodExprNode.getClassexpr().getExprtype() instanceof ClassTypeNode)
            declNode = currentScope().get(((ClassTypeNode) classMethodExprNode.getClassexpr().getExprtype()).getClassname() + "." + classMethodExprNode.getMethodname());
        else if (classMethodExprNode.getClassexpr().getExprtype() instanceof ArrayTypeNode)
            declNode = currentScope().get("#Array." + classMethodExprNode.getMethodname());
        else if (classMethodExprNode.getClassexpr().isEqual(Type.Types.STRING))
            declNode = currentScope().get("#String." + classMethodExprNode.getMethodname());
        else throw new Error(ctxLocation(classMethodExprNode) + " ClassMethod with wrong type!");

        if (declNode instanceof VarDeclNode) {
            classMethodExprNode.setExprtype(((VarDeclNode) declNode).getVartype());
            classMethodExprNode.setLvalue(true);
        }
        else {
            classMethodExprNode.setExprtype(new FuncTypeNode((FuncDeclNode) declNode));
            classMethodExprNode.setLvalue(false);
        }

    }

    @Override
    public void visit(ClassTypeNode classTypeNode) {
        DeclNode declNode = currentScope().get(classTypeNode.getClassname());
        if (!(declNode instanceof ClassDeclNode)){
            if (declNode instanceof FuncDeclNode) {
                if (!((FuncDeclNode) declNode).isConstructFunction())
                    throw new Error("Not Class");
            }
            else throw new Error("Not Class");
        }
    }

    @Override
    public void visit(ContinueStmtNode continueStmtNode) {
        if (isInLoop == 0) throw new Error(ctxLocation(continueStmtNode) + " Continue not in Loop!");
    }

    @Override
    public void visit(ExprStmtNode exprStmtNode) {
        if (exprStmtNode.getExprnode() != null) exprStmtNode.getExprnode().accept(this);
    }

    @Override
    public void visit(IDExprNode idExprNode) {
        DeclNode declNode = currentScope().get(idExprNode.getId());
        idExprNode.setDeclNode(declNode);

        if (declNode instanceof ClassDeclNode) {
            idExprNode.setExprtype(new ClassTypeNode(declNode.getDeclname()));
            idExprNode.setLvalue(false);
        }
        else if (declNode instanceof VarDeclNode) {
            idExprNode.setExprtype(((VarDeclNode) declNode).getVartype());
            idExprNode.setLvalue(true);
        }
        else if (declNode instanceof FuncDeclNode) {
            idExprNode.setExprtype(new FuncTypeNode((FuncDeclNode) declNode));
            idExprNode.setLvalue(false);
        }
    }

    @Override
    public void visit(IfStmtNode ifStmtNode) {
        ifStmtNode.getIfexpr().accept(this);
        if (!ifStmtNode.getIfexpr().isEqual(Type.Types.BOOL)) throw new Error(ctxLocation(ifStmtNode) + " Ifexpr with nonBool!");

        ifStmtNode.getIfstmt().accept(this);
        if (ifStmtNode.getElsestmt() != null) ifStmtNode.getElsestmt().accept(this);
    }

    @Override
    public void visit(IntExprNode intExprNode) {
        if (!intExprNode.isEqual(Type.Types.INT))
            throw new Error(ctxLocation(intExprNode) + " IntExpr with nonInt type!");
        intExprNode.setLvalue(false);
    }

    @Override
    public void visit(NewExprNode newExprNode) {
        if (newExprNode.getExprtype() instanceof ClassTypeNode)
            newExprNode.getExprtype().accept(this);
        if (newExprNode.isClassConstruct() && !(newExprNode.getExprtype() instanceof  ClassTypeNode))
            throw new Error("New ClassConstruct with nonClass");
        newExprNode.setLvalue(false);
    }

    @Override
    public void visit(StringExprNode stringExprNode) {
        if (!stringExprNode.isEqual(Type.Types.STRING)) throw new Error(ctxLocation(stringExprNode) + " StringExpr with nonString type!");
        stringExprNode.setLvalue(false);
    }

    @Override
    public void visit(SuffixExprNode suffixExprNode) {
        suffixExprNode.getSuffixexpr().accept(this);

        if (!suffixExprNode.getSuffixexpr().isLvalue()) throw new Error(ctxLocation(suffixExprNode) + " " + suffixExprNode.getExprop() + " with nonLvalue!");

        if (suffixExprNode.getSuffixexpr().isEqual(Type.Types.INT))
            suffixExprNode.setBasetype(Type.Types.INT);
        else throw new Error(ctxLocation(suffixExprNode) + " " + suffixExprNode.getExprop() + " with wrong type!");

        suffixExprNode.setLvalue(false);
    }

    @Override
    public void visit(UnaryExprNode unaryExprNode) {
        unaryExprNode.getUnaryexpr().accept(this);

        switch (unaryExprNode.getExprop()){
            case SELF_DEC:
            case SELF_INC:
                if (!unaryExprNode.getUnaryexpr().isLvalue())
                    throw new Error(ctxLocation(unaryExprNode) + " " + unaryExprNode.getExprop() + " with nonLvalue");

                if (unaryExprNode.getUnaryexpr().isEqual(Type.Types.INT))
                    unaryExprNode.setBasetype(Type.Types.INT);
                else throw new Error(ctxLocation(unaryExprNode) + " " + unaryExprNode.getExprop() + " with wrong type!");

                unaryExprNode.setLvalue(true);
                break;
            case LOGIC_NOT:
                if (unaryExprNode.getUnaryexpr().isEqual(Type.Types.BOOL))
                    unaryExprNode.setBasetype(Type.Types.BOOL);
                else throw new Error(ctxLocation(unaryExprNode) + " " + unaryExprNode.getExprop() + " with wrong type!");

                unaryExprNode.setLvalue(false);
                break;
            case NEGE:
            case BIT_NOT:
            case POSI:
                if (unaryExprNode.getUnaryexpr().isEqual(Type.Types.INT))
                    unaryExprNode.setBasetype(Type.Types.INT);
                else throw new Error(ctxLocation(unaryExprNode) + " " + unaryExprNode.getExprop() + " with wrong type!");

                unaryExprNode.setLvalue(false);
                break;
        }
    }

    @Override
    public void visit(TypeNode typeNode) {}

    @Override
    public void visit(NullExprNode nullExprNode) {
        if (!nullExprNode.isEqual(Type.Types.NULL)) throw new Error(ctxLocation(nullExprNode) + " NullExpr with nonNull type!");
        nullExprNode.setLvalue(false);
    }

    @Override
    public void visit(FuncCallExprNode funcCallExprNode) {
        funcCallExprNode.getFunction().accept(this);

        if (funcCallExprNode.getFunction().getExprtype() instanceof FuncTypeNode){
            FuncTypeNode funcTypeNode = (FuncTypeNode) funcCallExprNode.getFunction().getExprtype();

            if (funcCallExprNode.getParameters().size() != funcTypeNode.getParamSize()) throw new Error(ctxLocation(funcCallExprNode) + " FuncCall with wrong number of params!");

            int cntparams = funcCallExprNode.getParameters().size();
            for (int i = 0; i < cntparams; ++i){
                funcCallExprNode.getParameters().get(i).accept(this);

                if (funcCallExprNode.getParameters().get(i).isEqual(Type.Types.NULL)){
                    if (!isClassorArray(funcTypeNode.getFunctionParameterList().getVardeclnodeList().get(i).getVartype()))
                        throw new Error(ctxLocation(funcCallExprNode) + " FuncCall with wrong type!");
                }
                else if (!funcCallExprNode.getParameters().get(i).getExprtype().isEqual(funcTypeNode.getFunctionParameterList().getVardeclnodeList().get(i).getVartype()))
                    throw new Error(ctxLocation(funcCallExprNode) + " FuncCall with wrong type!");
            }

            funcCallExprNode.setExprtype(funcTypeNode.getFunctionReturnType());
        }
        else throw new Error(ctxLocation(funcCallExprNode) + " FuncCall with nonFunc!");

        funcCallExprNode.setLvalue(false);
    }

    @Override
    public void visit(ReturnStmtNode returnStmtNode) {
        if (currentFunc == null) throw new Error(ctxLocation(returnStmtNode) + " ReturnExpr not in Function");

        if (currentFunc.isConstructFunction() == true){
            if (returnStmtNode.getReturnexpr() != null)
                throw new Error(ctxLocation(returnStmtNode) + " ReturnInst nonNull in Constructfunc!");
        }
        else {
            if (returnStmtNode.getReturnexpr() == null){
                if (!currentFunc.getFunctionReturnType().isEqual(Type.Types.VOID))
                    throw new Error(ctxLocation(returnStmtNode) + " NonVoid return null!");
            }
            else {
                returnStmtNode.getReturnexpr().accept(this);

                if (returnStmtNode.getReturnexpr().isEqual(Type.Types.NULL)){
                    if (!isClassorArray(currentFunc.getFunctionReturnType()))
                        throw new Error(ctxLocation(returnStmtNode) + " Null return with wrong type!");
                }
                else if (returnStmtNode.getReturnexpr().isEqual(Type.Types.VOID))
                    throw new Error(ctxLocation(returnStmtNode) + " ReturnInst Void!");
                else if (!returnStmtNode.getReturnexpr().getExprtype().isEqual(currentFunc.getFunctionReturnType()))
                    throw new Error(ctxLocation(returnStmtNode) + " ReturnInst wrong type!");
            }
        }
    }
}
