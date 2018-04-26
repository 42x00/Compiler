package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;

public class StringExprNode extends ExprNode{
    public String stringexpr;

    public StringExprNode(String stringexpr) {
        this.stringexpr = stringexpr;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
