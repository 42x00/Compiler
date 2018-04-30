package AST_Node.ExprNodes;

import Type.*;

public class ClassThisExprNode extends ExprNode{
    public ClassThisExprNode() {
        this.exprtype.setBasetype(Type.Types.CLASS);
    }
}
