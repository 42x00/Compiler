package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;
import Tools.Scope.Scope;

public class WhileStmtNode extends StmtNode{
    public ExprNode whileexpr;
    public StmtNode whilestmt;
    public Scope astscope;

    public void setAstscope(Scope astscope) {
        this.astscope = astscope;
    }

    public WhileStmtNode(ExprNode whileexpr, StmtNode whilestmt) {
        this.whileexpr = whileexpr;
        this.whilestmt = whilestmt;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
