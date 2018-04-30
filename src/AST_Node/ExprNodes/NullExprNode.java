package AST_Node.ExprNodes;

import Type.Type;

public class NullExprNode extends ExprNode{
    public NullExprNode() {
        this.exprtype.setBasetype(Type.Types.NULL);
    }
}
