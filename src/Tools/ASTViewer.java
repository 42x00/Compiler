package Tools;

import AST_Node.*;
import static java.lang.System.out;


public class ASTViewer implements ASTVisitor {
    private int indent;

    public ASTViewer() {
        indent = 0;
    }

    public void indentPrinter(){
        for(int i=0;i<indent;++i){
            out.print("\t");
        }
    }

    @Override
    public void visit(ArrayIndexExprNode arrayIndexExprNode) {
        out.println("ArrayIndexExprNode");
    }

    @Override
    public void visit(ArrayTypeNode arrayTypeNode) {
        out.println("ArrayTypeNode");
    }

    @Override
    public void visit(BinaryExprNode binaryExprNode) {
        out.println("BinaryExprNode");
    }

    @Override
    public void visit(BoolExprNode boolExprNode) {
        out.println("BoolExprNode");
    }

    @Override
    public void visit(BreakStmtNode breakStmtNode) {
        out.println("BreakStmtNode");
    }

    @Override
    public void visit(ClassDeclNode classDeclNode) {
        out.println("ClassDeclNode");
        for (DeclNode vardeclnode : classDeclNode.classdecllist)
            vardeclnode.accept(this);
    }

    @Override
    public void visit(ClassMethodExprNode classMethodExprNode) {
        out.println("ClassMethodExprNode");
    }

    @Override
    public void visit(ClassTypeNode classTypeNode) {
        out.println("ClassTypeNode");
    }

    @Override
    public void visit(CompStmtNode compStmtNode) {
        out.println("CompStmtNode");
        for (StmtNode stmtnode : compStmtNode.stmtNodeList)
            stmtnode.accept(this);
    }

    @Override
    public void visit(ContinueStmtNode continueStmtNode) {
        out.println("ContinueStmtNode");
    }

    @Override
    public void visit(DeclNode declNode) {
        out.println("DeclNode");
    }

    @Override
    public void visit(ExprNode exprNode) {
        out.println("ExprNode");
    }

    @Override
    public void visit(ExprStmtNode exprStmtNode) {
        out.println("ExprStmtNode");
    }

    @Override
    public void visit(ForStmtNode forStmtNode) {
        out.println("ForStmtNode");
    }

    @Override
    public void visit(FuncCallExprNode funcCallExprNode) {
        out.println("FuncCallExprNode");
    }

    @Override
    public void visit(FuncDeclNode funcDeclNode) {
        out.println("FuncDeclNode");
        funcDeclNode.getFunctionStatements().accept(this);
    }

    @Override
    public void visit(IDExprNode idExprNode) {
        out.println("IDExprNode");
    }

    @Override
    public void visit(IfStmtNode ifStmtNode) {
        out.println("IfStmtNode");
    }

    @Override
    public void visit(IntExprNode intExprNode) {
        out.println("IntExprNode");
    }

    @Override
    public void visit(NewExprNode newExprNode) {
        out.println("NewExprNode");
    }

    @Override
    public void visit(ProgNode progNode) {
        out.println("ProgNode");
        for (DeclNode declnode : progNode.declarations){
            declnode.accept(this);
        }
    }

    @Override
    public void visit(ReturnStmtNode returnStmtNode) {
        out.println("ReturnStmtNode");
    }

    @Override
    public void visit(StmtNode stmtNode) {
        out.println("StmtNode");
    }

    @Override
    public void visit(StringExprNode stringExprNode) {
        out.println("StringExprNode");
    }

    @Override
    public void visit(SuffixExprNode suffixExprNode) {
        out.println("SuffixExprNode");
    }

    @Override
    public void visit(TypeNode typeNode) {
        out.println("TypeNode");
    }

    @Override
    public void visit(UnaryExprNode unaryExprNode) {
        out.println("UnaryExprNode");
    }

    @Override
    public void visit(VarDeclListNode varDeclListNode) {
        out.println("VarDeclListNode");
    }

    @Override
    public void visit(VarDeclNode varDeclNode) {
        out.println("VarDeclNode");
    }

    @Override
    public void visit(VarDeclStmtNode varDeclStmtNode) {
        out.println("VarDeclStmtNode");
    }

    @Override
    public void visit(WhileStmtNode whileStmtNode) {
        out.println("WhileStmtNode");
    }


}
