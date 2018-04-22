package AST_Node;

public class ArrayNode extends TypeNode{
    TypeNode basetype;

    public ArrayNode(TypeNode basetype) {
        this.basetype = basetype;
    }

    public TypeNode getBasetype() {
        return basetype;
    }
}
