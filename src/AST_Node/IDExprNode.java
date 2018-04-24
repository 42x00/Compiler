package AST_Node;

public class IDExprNode extends ExprNode{
    public String id;

    public IDExprNode(String id) {
        this.id = id;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
