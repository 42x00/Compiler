package AST_Node;

import Type.Type;

public class IntExprNode extends ExprNode{
    public int intvalue;

    public IntExprNode(int intvalue) {
        this.exprtype.setBasetype(Type.Types.INT);
        this.intvalue = intvalue;
    }
}
