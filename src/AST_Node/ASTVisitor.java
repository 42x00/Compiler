package AST_Node;

public interface ASTVisitor {
    void visit(ArrayIndexExprNode arrayIndexExprNode);
    void visit(ArrayTypeNode arrayTypeNode);
    void visit(BinaryExprNode binaryExprNode);
    void visit(BoolExprNode boolExprNode);
    void visit(BreakStmtNode breakStmtNode);
    void visit(ClassDeclNode classDeclNode);
    void visit(ClassMethodExprNode classMethodExprNode);
    void visit(ClassTypeNode classTypeNode);
    void visit(CompStmtNode compStmtNode);
    void visit(ContinueStmtNode continueStmtNode);
    void visit(DeclNode declNode);
    void visit(ExprNode exprNode);
    void visit(ExprStmtNode exprStmtNode);
    void visit(ForStmtNode forStmtNode);
    void visit(FuncCallExprNode funcCallExprNode);
    void visit(FuncDeclNode funcDeclNode);
    void visit(IDExprNode idExprNode);
    void visit(IfStmtNode ifStmtNode);
    void visit(IntExprNode intExprNode);
    void visit(NewExprNode newExprNode);
    void visit(ProgNode progNode);
    void visit(ReturnStmtNode returnStmtNode);
    void visit(StmtNode stmtNode);
    void visit(StringExprNode stringExprNode);
    void visit(SuffixExprNode suffixExprNode);
    void visit(TypeNode typeNode);
    void visit(UnaryExprNode unaryExprNode);
    void visit(VarDeclListNode varDeclListNode);
    void visit(VarDeclNode varDeclNode);
    void visit(VarDeclStmtNode varDeclStmtNode);
    void visit(WhileStmtNode whileStmtNode);
}
