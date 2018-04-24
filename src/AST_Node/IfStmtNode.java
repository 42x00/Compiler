package AST_Node;

public class IfStmtNode extends StmtNode{
    public ExprNode ifexpr;
    public StmtNode ifstmt,elsestmt;

    public IfStmtNode(ExprNode ifexpr, StmtNode ifstmt) {
        this.ifexpr = ifexpr;
        this.ifstmt = ifstmt;
    }

    public void setElsestmt(StmtNode elsestmt) {
        this.elsestmt = elsestmt;
    }
}
