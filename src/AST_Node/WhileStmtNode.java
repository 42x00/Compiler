package AST_Node;

public class WhileStmtNode extends StmtNode{
    public ExprNode whileexpr;
    public StmtNode whilestmt;

    public WhileStmtNode(ExprNode whileexpr, StmtNode whilestmt) {
        this.whileexpr = whileexpr;
        this.whilestmt = whilestmt;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
