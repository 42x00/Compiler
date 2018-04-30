package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import Type.Type;

public class IntExprNode extends ExprNode{
    public int intvalue;

    public IntExprNode() {
        this.exprtype.setBasetype(Type.Types.INT);
    }

    public IntExprNode(int intvalue) {
        this.exprtype.setBasetype(Type.Types.INT);
        this.intvalue = intvalue;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
