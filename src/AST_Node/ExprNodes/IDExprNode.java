package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;

public class IDExprNode extends ExprNode{
    public String id;

    public IDExprNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
