package AST_Node.ExprNodes;

import AST_Node.ASTNode;
import AST_Node.TypeNodes.TypeNode;
import Type.*;

abstract public class ExprNode extends ASTNode {
    protected TypeNode exprtype;
    protected boolean isLvalue;

    public TypeNode getExprtype() {
        return exprtype;
    }

    public boolean isLvalue() {
        return isLvalue;
    }

    public void setExprtype(TypeNode exprtype) {
        this.exprtype = exprtype;
    }

    public void setLvalue(boolean lvalue) {
        isLvalue = lvalue;
    }

    public ExprNode() {
        exprtype = new TypeNode();
        isLvalue = false;
    }

    public boolean isEqual(Type.Types types){
        return exprtype.isEqual(new TypeNode(types));
    }

    public void setBasetype(Type.Types types){
        this.exprtype.setBasetype(types);
    }

}
