package Tools;

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
import com.sun.nio.file.ExtendedWatchEventModifier;

import javax.swing.text.DefaultEditorKit;
import java.util.LinkedList;

public class SemanticCheck implements ASTVisitor{
    private final LinkedList<Scope> scopeStack = new LinkedList<>();
    private int isInLoop = 0;
    private ClassTypeNode currentClass;
    private FuncTypeNode currentFunc;

    private Scope currentScope(){
        return scopeStack.getLast();
    }

    private void varTypeExprCheck(VarDeclNode varDeclNode){
        if (varDeclNode.getVartype() instanceof ClassTypeNode)
            varDeclNode.getVartype().accept(this);
        if (varDeclNode.getVarinit() != null){
            varDeclNode.getVarinit().accept(this);
            if (varDeclNode.getVarinit().exprtype.basetype == Type.Types.NULL)
                if (!(varDeclNode.getVartype() instanceof ArrayTypeNode)
                        && !(varDeclNode.getVartype() instanceof ClassTypeNode))
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
        varDeclListNode.vardeclnodeList.add(new VarDeclNode(new TypeNode(Type.Types.INT), "left"));
        varDeclListNode.vardeclnodeList.add(new VarDeclNode(new TypeNode(Type.Types.INT), "right"));
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
            if (!funcDeclNode.getFunctionReturnType().isEqual(new TypeNode(Type.Types.INT))){
                throw new Error("Main with wrong return type!");
            }
        }
        if (funcDeclNode.getFunctionParameterList() != null)
            throw new Error("Main with parameters!");
    }

    @Override
    public void visit(ProgNode progNode) {
        ToplevelScope toplevelScope = new ToplevelScope(progNode.declarations);
        progNode.setAstscope(toplevelScope);
        scopeStack.addLast(toplevelScope);
        setBuiltInFunction();
        checkMain();
        for (DeclNode declNode : progNode.declarations)
            if (declNode instanceof ClassDeclNode) {
                ClassDeclNode classDeclNode = (ClassDeclNode) declNode;
                for (DeclNode declNode1 : classDeclNode.classdecllist)
                    toplevelScope.addDecl(classDeclNode.declname + "." + declNode1.declname, declNode1);
            }
        for (DeclNode declNode : progNode.declarations)
            if (declNode instanceof VarDeclNode) varTypeExprCheck((VarDeclNode) declNode);
            else declNode.accept(this);
        scopeStack.removeLast();
    }

    @Override
    public void visit(ClassDeclNode classDeclNode) {
        currentClass = new ClassTypeNode(classDeclNode.declname);
        LocalScope localScope = new LocalScope(currentScope(),classDeclNode.classdecllist);
        classDeclNode.setAstscope(localScope);
        scopeStack.addLast(localScope);
        for (DeclNode declNode : classDeclNode.classdecllist)
            if (declNode instanceof VarDeclNode) varTypeExprCheck((VarDeclNode) declNode);
            else declNode.accept(this);
        scopeStack.removeLast();
        currentClass = null;
    }

    @Override
    public void visit(FuncDeclNode funcDeclNode) {
        currentFunc = new FuncTypeNode(funcDeclNode);
        if (funcDeclNode.isConstructFunction() == false) funcDeclNode.getFunctionReturnType().accept(this);
        else {
            if (currentClass == null) throw new Error("Constract func in nonClass!");
            if (!currentClass.classname.equals(funcDeclNode.declname))
                throw new Error("Constract func with wrong name!");
        }
        LocalScope localScope = new LocalScope(currentScope());
        funcDeclNode.setAstscope(localScope);
        if (funcDeclNode.getFunctionParameterList() != null) {
            for (VarDeclNode varDeclNode : funcDeclNode.getFunctionParameterList().vardeclnodeList)
                varTypeExprCheck(varDeclNode);
            localScope.addDecls(funcDeclNode.getFunctionParameterList().vardeclnodeList);
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
        compStmtNode.setAstscope(localScope);
        scopeStack.addLast(localScope);
        for (StmtNode stmtNode : compStmtNode.stmtNodeList)
            stmtNode.accept(this);
        scopeStack.removeLast();
    }

    @Override
    public void visit(ForStmtNode forStmtNode) {
        LocalScope localScope = new LocalScope(currentScope());
        if (forStmtNode.forexprend != null) {
            forStmtNode.forexprend.accept(this);
            if (forStmtNode.forexprend.exprtype.basetype != Type.Types.BOOL)
                throw new Error("ForEndExpr with nonBool!");
        }
        if (forStmtNode.forexprupdate != null) forStmtNode.forexprupdate.accept(this);
        if (forStmtNode.forexprinit != null) forStmtNode.forexprinit.accept(this);
        else {
            if (forStmtNode.forinit != null)
                for (VarDeclNode varDeclNode : forStmtNode.forinit)
                    varTypeExprCheck(varDeclNode);
            localScope = new LocalScope(currentScope(),forStmtNode.forinit);
        }
        forStmtNode.setAstscope(localScope);
        scopeStack.addLast(localScope);
        ++isInLoop;
        forStmtNode.forstmt.accept(this);
        --isInLoop;
        scopeStack.removeLast();
    }

    @Override
    public void visit(WhileStmtNode whileStmtNode) {
        whileStmtNode.whileexpr.accept(this);
        if (whileStmtNode.whileexpr.exprtype.basetype != Type.Types.BOOL)
            throw new Error("WhileExpr with nonBool!");
        LocalScope localScope = new LocalScope(currentScope());
        whileStmtNode.setAstscope(localScope);
        scopeStack.addLast(localScope);
        ++isInLoop;
        whileStmtNode.whilestmt.accept(this);
        --isInLoop;
        scopeStack.removeLast();
    }

    @Override
    public void visit(VarDeclNode varDeclNode) {
        varTypeExprCheck(varDeclNode);
        Scope scope = currentScope();
        scope.addDecl(varDeclNode.declname,varDeclNode);
    }

    @Override
    public void visit(VarDeclStmtNode varDeclStmtNode) {
        varDeclStmtNode.vardeclnode.accept(this);
    }

    @Override
    public void visit(ArrayIndexExprNode arrayIndexExprNode) {
        arrayIndexExprNode.array.accept(this);
        arrayIndexExprNode.index.accept(this);
        if (!(arrayIndexExprNode.array.exprtype instanceof ArrayTypeNode))
            throw new Error("ArrayIndex not array");
        if (arrayIndexExprNode.index.exprtype.basetype != Type.Types.INT)
            throw new Error("ArrayIndex not by INT index!");
        arrayIndexExprNode.exprtype = ((ArrayTypeNode) arrayIndexExprNode.array.exprtype).getArrayelement();
        arrayIndexExprNode.isLvalue = true;
    }

    @Override
    public void visit(BinaryExprNode binaryExprNode) {
        binaryExprNode.lhs.accept(this);
        binaryExprNode.rhs.accept(this);
        if (binaryExprNode.rhs.exprtype.basetype == Type.Types.NULL){
            if (binaryExprNode.lhs.exprtype instanceof ArrayTypeNode || binaryExprNode.lhs.exprtype instanceof ClassTypeNode){
                if (binaryExprNode.exprop == BinaryExprNode.BinaryOP.ASSIGN)
                    binaryExprNode.exprtype.basetype = Type.Types.NULL;
                else if (binaryExprNode.exprop == BinaryExprNode.BinaryOP.EQUAL
                        || binaryExprNode.exprop == BinaryExprNode.BinaryOP.INEQUAL)
                    binaryExprNode.exprtype.basetype = Type.Types.BOOL;
                else throw new Error("BinaryExpr wrong operator with null!");
            }
            else throw new Error("BinaryExpr wrong type with null!");
        }
        else {
            if (!binaryExprNode.lhs.exprtype.isEqual(binaryExprNode.rhs.exprtype))
                throw new Error("BinaryExpr with different type!");
            switch (binaryExprNode.exprop) {
                case ADD:
                    if (binaryExprNode.lhs.exprtype.basetype == Type.Types.INT ||
                            binaryExprNode.lhs.exprtype.basetype == Type.Types.STRING)
                        binaryExprNode.exprtype = binaryExprNode.lhs.exprtype;
                    else throw new Error(binaryExprNode.exprop + " with wrong type!");
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
                    if (binaryExprNode.lhs.exprtype.basetype == Type.Types.INT)
                        binaryExprNode.exprtype = binaryExprNode.lhs.exprtype;
                    else throw new Error(binaryExprNode.exprop + " with wrong type!");
                    break;
                case EQUAL:
                case INEQUAL:
                    if (binaryExprNode.lhs.exprtype.basetype == Type.Types.NULL)
                        throw new Error(binaryExprNode.exprop + " with wrong type!");
                    binaryExprNode.exprtype.basetype = Type.Types.BOOL;
                    break;
                case LESS:
                case GREATER:
                case LESS_EQUAL:
                case GREATER_EQUAL:
                    if (binaryExprNode.lhs.exprtype.basetype == Type.Types.INT ||
                            binaryExprNode.lhs.exprtype.basetype == Type.Types.STRING)
                        binaryExprNode.exprtype.basetype = Type.Types.BOOL;
                    else throw new Error(binaryExprNode.exprop + " with wrong type!");
                    break;
                case LOGICAL_OR:
                case LOGICAL_AND:
                    if (binaryExprNode.lhs.exprtype.basetype == Type.Types.BOOL)
                        binaryExprNode.exprtype.basetype = Type.Types.BOOL;
                    else throw new Error(binaryExprNode.exprop + " with wrong type!");
                    break;
                case ASSIGN:
                    if (binaryExprNode.lhs.isLvalue == false) throw new Error("Assign with nonLvalue!");
                    binaryExprNode.exprtype = binaryExprNode.lhs.exprtype;
                    break;
            }
        }
        binaryExprNode.isLvalue = false;
    }

    @Override
    public void visit(BoolExprNode boolExprNode) {
        if (boolExprNode.exprtype.basetype != Type.Types.BOOL)
            throw new Error("Bool with nonBool type!");
        boolExprNode.isLvalue = false;
    }

    @Override
    public void visit(ClassThisExprNode classThisExprNode) {
        if (currentClass == null) throw new Error("ThisExpr not in Class");
        classThisExprNode.exprtype = currentClass;
        classThisExprNode.isLvalue = false;
    }

    @Override
    public void visit(BreakStmtNode breakStmtNode) {
        if (isInLoop == 0)
            throw new Error("Break not in Loop!");
    }

    @Override
    public void visit(ClassMethodExprNode classMethodExprNode) {
        classMethodExprNode.classexpr.accept(this);
        DeclNode declNode = null;
        if (classMethodExprNode.classexpr.exprtype instanceof ClassTypeNode)
            declNode = currentScope().get(((ClassTypeNode) classMethodExprNode.classexpr.exprtype).classname + "." + classMethodExprNode.methodname);
        else if (classMethodExprNode.classexpr.exprtype instanceof ArrayTypeNode)
            declNode = currentScope().get("#Array." + classMethodExprNode.methodname);
        else if (classMethodExprNode.classexpr.exprtype.basetype == Type.Types.STRING)
            declNode = currentScope().get("#String." + classMethodExprNode.methodname);
        else throw new Error("ClassMethod with wrong type!");

        if (declNode instanceof VarDeclNode) {
            classMethodExprNode.exprtype = ((VarDeclNode) declNode).getVartype();
            classMethodExprNode.isLvalue = true;
        }
        else {
            classMethodExprNode.exprtype = new FuncTypeNode((FuncDeclNode) declNode);
            classMethodExprNode.isLvalue = false;
        }

    }

    @Override
    public void visit(ClassTypeNode classTypeNode) {
        currentScope().get(classTypeNode.classname);
    }

    @Override
    public void visit(ContinueStmtNode continueStmtNode) {
        if (isInLoop == 0)
            throw new Error("Continue not in Loop!");
    }

    @Override
    public void visit(ExprStmtNode exprStmtNode) {
        if (exprStmtNode.exprnode != null)
        exprStmtNode.exprnode.accept(this);
    }

    @Override
    public void visit(IDExprNode idExprNode) {
        DeclNode declNode = currentScope().get(idExprNode.id);
        if (declNode instanceof ClassDeclNode) {
            idExprNode.exprtype = new ClassTypeNode(declNode.declname);
            idExprNode.isLvalue = false;
        }
        else if (declNode instanceof VarDeclNode) {
            idExprNode.exprtype = ((VarDeclNode) declNode).getVartype();
            idExprNode.isLvalue = true;
        }
        else if (declNode instanceof FuncDeclNode) {
            idExprNode.exprtype = new FuncTypeNode((FuncDeclNode) declNode);
            idExprNode.isLvalue = false;
        }
    }

    @Override
    public void visit(IfStmtNode ifStmtNode) {
        ifStmtNode.ifexpr.accept(this);
        if (ifStmtNode.ifexpr.exprtype.basetype != Type.Types.BOOL)
            throw new Error("Ifexpr with nonBool!");
        ifStmtNode.ifstmt.accept(this);
        if (ifStmtNode.elsestmt != null) ifStmtNode.elsestmt.accept(this);
    }

    @Override
    public void visit(IntExprNode intExprNode) {
        if (intExprNode.exprtype.basetype != Type.Types.INT)
            throw new Error("IntExpr with nonInt type!");
        intExprNode.isLvalue = false;
    }

    @Override
    public void visit(NewExprNode newExprNode) {
        if (newExprNode.exprtype instanceof ClassTypeNode)
            currentScope().get(((ClassTypeNode) newExprNode.exprtype).classname);
        newExprNode.isLvalue = false;
    }

    @Override
    public void visit(StringExprNode stringExprNode) {
        if (stringExprNode.exprtype.basetype != Type.Types.STRING)
            throw new Error("StringExpr with nonString type!");
        stringExprNode.isLvalue = false;
    }

    @Override
    public void visit(SuffixExprNode suffixExprNode) {
        suffixExprNode.suffixexpr.accept(this);
        if (suffixExprNode.suffixexpr.isLvalue == false)
            throw new Error(suffixExprNode.exprop + " with nonLvalue!");
        if (suffixExprNode.suffixexpr.exprtype.basetype == Type.Types.INT)
            suffixExprNode.exprtype = suffixExprNode.suffixexpr.exprtype;
        else throw new Error(suffixExprNode.exprop + " with wrong type!");
        suffixExprNode.isLvalue = false;
    }

    @Override
    public void visit(UnaryExprNode unaryExprNode) {
        unaryExprNode.unaryexpr.accept(this);
        switch (unaryExprNode.exprop){
            case SELF_DEC:
            case SELF_INC:
                if (unaryExprNode.unaryexpr.isLvalue == false)
                    throw new Error(unaryExprNode.exprop + " with nonLvalue");
                if (unaryExprNode.unaryexpr.exprtype.basetype == Type.Types.INT)
                    unaryExprNode.exprtype = unaryExprNode.unaryexpr.exprtype;
                else throw new Error(unaryExprNode.exprop + " with wrong type!");
                unaryExprNode.isLvalue = true;
                break;
            case LOGIC_NOT:
                if (unaryExprNode.unaryexpr.exprtype.basetype == Type.Types.BOOL)
                    unaryExprNode.exprtype.basetype = Type.Types.BOOL;
                else throw new Error(unaryExprNode.exprop + " with wrong type!");
                unaryExprNode.isLvalue = false;
                break;
            case NEGE:
            case BIT_NOT:
            case POSI:
                if (unaryExprNode.unaryexpr.exprtype.basetype == Type.Types.INT)
                    unaryExprNode.exprtype = unaryExprNode.unaryexpr.exprtype;
                else throw new Error(unaryExprNode.exprop + " with wrong type!");
                unaryExprNode.isLvalue = false;
                break;
        }
    }

    @Override
    public void visit(TypeNode typeNode) {}

    @Override
    public void visit(NullExprNode nullExprNode) {
        if (nullExprNode.exprtype.basetype != Type.Types.NULL)
            throw new Error("NullExpr with nonNull type!");
        nullExprNode.isLvalue = false;
    }

    @Override
    public void visit(FuncCallExprNode funcCallExprNode) {
        funcCallExprNode.function.accept(this);
        if (funcCallExprNode.function.exprtype instanceof FuncTypeNode){
            FuncTypeNode funcTypeNode = (FuncTypeNode) funcCallExprNode.function.exprtype;
            if (funcCallExprNode.parameters.size() != funcTypeNode.getparamsize())
                throw new Error("FuncCall with wrong number of params!");
            int cntparams = funcCallExprNode.parameters.size();
            for (int i = 0; i < cntparams; ++i){
                funcCallExprNode.parameters.get(i).accept(this);
                if (funcCallExprNode.parameters.get(i).exprtype.basetype == Type.Types.NULL){
                    if (!(funcTypeNode.getFunctionParameterList().vardeclnodeList.get(i).getVartype() instanceof ArrayTypeNode)
                            && !(funcTypeNode.getFunctionParameterList().vardeclnodeList.get(i).getVartype() instanceof  ClassTypeNode))
                        throw new Error("FuncCall with wrong type!");
                }
                else if (!funcCallExprNode.parameters.get(i).exprtype.isEqual(funcTypeNode.getFunctionParameterList().vardeclnodeList.get(i).getVartype()))
                    throw new Error("FuncCall with wrong type!");
            }
            funcCallExprNode.exprtype = funcTypeNode.getFunctionReturnType();
        }
        else throw new Error("FuncCall with nonFunc!");
        funcCallExprNode.isLvalue =false;
    }

    @Override
    public void visit(ReturnStmtNode returnStmtNode) {
        if (currentFunc == null) throw new Error("ReturnExpr not in Function");
        if (currentFunc.isConstructFunction() == true){
            throw new Error("Return in construct func!");
        }
        else {
            if (returnStmtNode.returnexpr == null){
                if (currentFunc.getFunctionReturnType().basetype != Type.Types.VOID)
                    throw new Error("NonVoid return null!");
            }
            else {
                returnStmtNode.returnexpr.accept(this);
                if (returnStmtNode.returnexpr.exprtype.basetype == Type.Types.NULL){
                    if (!(currentFunc.getFunctionReturnType() instanceof ArrayTypeNode)
                            && !(currentFunc.getFunctionReturnType() instanceof ClassTypeNode))
                        throw new Error("Null return with wrong type!");
                }
                else if (!returnStmtNode.returnexpr.exprtype.isEqual(currentFunc.getFunctionReturnType()))
                    throw new Error("Return wrong type!");
            }
        }
    }
}
