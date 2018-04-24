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
        out.println("ArrayIndexExprNode " + arrayIndexExprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(ArrayTypeNode arrayTypeNode) {
        out.println("ArrayTypeNode " + arrayTypeNode.getClass().getSimpleName());
    }

    @Override
    public void visit(BinaryExprNode binaryExprNode) {
        out.println("BinaryExprNode " + binaryExprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(BoolExprNode boolExprNode) {
        out.println("BoolExprNode " + boolExprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(BreakStmtNode breakStmtNode) {
        out.println("BreakStmtNode " + breakStmtNode.getClass().getSimpleName());
    }

    @Override
    public void visit(ClassDeclNode classDeclNode) {
        out.println("ClassDeclNode " + classDeclNode.getClass().getSimpleName());
    }

    @Override
    public void visit(ClassMethodExprNode classMethodExprNode) {
        out.println("ClassMethodExprNode " + classMethodExprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(ClassTypeNode classTypeNode) {
        out.println("ClassTypeNode " + classTypeNode.getClass().getSimpleName());
    }

    @Override
    public void visit(CompStmtNode compStmtNode) {
        out.println("CompStmtNode " + compStmtNode.getClass().getSimpleName());
    }

    @Override
    public void visit(ContinueStmtNode continueStmtNode) {
        out.println("ContinueStmtNode " + continueStmtNode.getClass().getSimpleName());
    }

    @Override
    public void visit(DeclNode declNode) {
        out.println("DeclNode " + declNode.getClass().getSimpleName());
    }

    @Override
    public void visit(ExprNode exprNode) {
        out.println("ExprNode " + exprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(ExprStmtNode exprStmtNode) {
        out.println("ExprStmtNode " + exprStmtNode.getClass().getSimpleName());
    }

    @Override
    public void visit(ForStmtNode forStmtNode) {
        out.println("ForStmtNode " + forStmtNode.getClass().getSimpleName());
    }

    @Override
    public void visit(FuncCallExprNode funcCallExprNode) {
        out.println("FuncCallExprNode " + funcCallExprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(FuncDeclNode funcDeclNode) {
        out.println("FuncDeclNode " + funcDeclNode.getClass().getSimpleName());
    }

    @Override
    public void visit(IDExprNode idExprNode) {
        out.println("IDExprNode " + idExprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(IfStmtNode ifStmtNode) {
        out.println("IfStmtNode " + ifStmtNode.getClass().getSimpleName());
    }

    @Override
    public void visit(IntExprNode intExprNode) {
        out.println("IntExprNode " + intExprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(NewExprNode newExprNode) {
        out.println("NewExprNode " + newExprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(ProgNode progNode) {
        out.println("ProgNode " + progNode.getClass().getSimpleName());
    }

    @Override
    public void visit(ReturnStmtNode returnStmtNode) {
        out.println("ReturnStmtNode " + returnStmtNode.getClass().getSimpleName());
    }

    @Override
    public void visit(StmtNode stmtNode) {
        out.println("StmtNode " + stmtNode.getClass().getSimpleName());
    }

    @Override
    public void visit(StringExprNode stringExprNode) {
        out.println("StringExprNode " + stringExprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(SuffixExprNode suffixExprNode) {
        out.println("SuffixExprNode " + suffixExprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(TypeNode typeNode) {
        out.println("TypeNode " + typeNode.getClass().getSimpleName());
    }

    @Override
    public void visit(UnaryExprNode unaryExprNode) {
        out.println("UnaryExprNode " + unaryExprNode.getClass().getSimpleName());
    }

    @Override
    public void visit(VarDeclListNode varDeclListNode) {
        out.println("VarDeclListNode " + varDeclListNode.getClass().getSimpleName());
    }

    @Override
    public void visit(VarDeclNode varDeclNode) {
        out.println("VarDeclNode " + varDeclNode.getClass().getSimpleName());
    }

    @Override
    public void visit(VarDeclStmtNode varDeclStmtNode) {
        out.println("VarDeclStmtNode " + varDeclStmtNode.getClass().getSimpleName());
    }

    @Override
    public void visit(WhileStmtNode whileStmtNode) {
        out.println("WhileStmtNode " + whileStmtNode.getClass().getSimpleName());
    }


}
