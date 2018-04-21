package AST_Node;

public interface ASTVisitor {
    void visit(ProgramNode programNode);
    void visit(FuncDeclNode funcDeclNode);
    void visit(VarDeclNode varDeclNode);
    void visit(CompStmtNode compStmtNode);
    void visit(ArrayTypeNode arrayTypeNode);
}
