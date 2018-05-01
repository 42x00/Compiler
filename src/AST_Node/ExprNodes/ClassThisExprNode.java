package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import Type.*;

public class ClassThisExprNode extends ExprNode{
    public ClassThisExprNode() {
        this.exprtype.setBasetype(Type.Types.CLASS);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
