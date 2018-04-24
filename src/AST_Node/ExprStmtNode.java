package AST_Node;

public class ExprStmtNode extends StmtNode{
    ExprNode exprnode;

    public ExprStmtNode(ExprNode exprnode) {
        this.exprnode = exprnode;
    }
}
