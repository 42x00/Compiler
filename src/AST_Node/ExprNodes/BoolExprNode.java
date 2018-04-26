package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;

public class BoolExprNode extends ExprNode{
    public boolean bool;

    public BoolExprNode(boolean bool) {
        this.bool = bool;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
