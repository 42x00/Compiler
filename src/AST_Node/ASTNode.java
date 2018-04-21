package AST_Node;

abstract public class ASTNode {
    public ASTNode() {
    }
    abstract public Location location();
    abstract public void accept(ASTVisitor visitor);
}

