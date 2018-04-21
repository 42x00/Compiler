package AST_Node;

public class ArrayTypeNode extends TypeNode{
    private TypeNode basetype;
    private Location location;

    public ArrayTypeNode(TypeNode basetype, Location location) {
        this.basetype = basetype;
        this.location = location;
    }

    public TypeNode getBasetype() {
        return basetype;
    }

    public Location getLocation() {
        return location;
    }

    @Override

    public Location location() {
        return location;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
