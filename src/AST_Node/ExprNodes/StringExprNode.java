package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import Type.*;

public class StringExprNode extends ExprNode{
    public String stringexpr;

    public StringExprNode() {
        this.exprtype.setBasetype(Type.Types.STRING);
    }

    public StringExprNode(String stringexpr) {
        this.stringexpr = stringexpr;
        this.exprtype.setBasetype(Type.Types.STRING);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
