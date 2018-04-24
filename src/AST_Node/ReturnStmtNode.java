package AST_Node;

public class ReturnStmtNode extends StmtNode{
    public ExprNode returnexpr;

    public ReturnStmtNode(ExprNode returnexpr) {
        this.returnexpr = returnexpr;
    }
}
