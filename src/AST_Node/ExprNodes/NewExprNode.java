package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import AST_Node.TypeNodes.TypeNode;

public class NewExprNode extends ExprNode{

    public NewExprNode(TypeNode exprtype) {
        this.exprtype = exprtype;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
