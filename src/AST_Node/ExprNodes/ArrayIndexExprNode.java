package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;

public class ArrayIndexExprNode extends ExprNode {
    public ExprNode array, index;

    public ArrayIndexExprNode(ExprNode array, ExprNode index) {
        this.array = array;
        this.index = index;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
