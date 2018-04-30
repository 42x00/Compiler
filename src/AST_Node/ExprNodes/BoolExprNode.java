package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import Type.Type;

public class BoolExprNode extends ExprNode{
    public boolean bool;

    public BoolExprNode() {
        this.exprtype.setBasetype(Type.Types.BOOL);
    }

    public BoolExprNode(boolean bool) {
        this.bool = bool;
        this.exprtype.setBasetype(Type.Types.BOOL);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
