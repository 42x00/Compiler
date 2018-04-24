package AST_Node;

public class NewExprNode extends ExprNode{
    public NewExprNode(TypeNode exprtype) {
        this.exprtype = exprtype;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
