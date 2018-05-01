package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import Type.Type;

public class NullExprNode extends ExprNode{
    public NullExprNode() {
        this.exprtype.setBasetype(Type.Types.NULL);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
