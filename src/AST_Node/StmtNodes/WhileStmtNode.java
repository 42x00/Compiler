package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;

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
