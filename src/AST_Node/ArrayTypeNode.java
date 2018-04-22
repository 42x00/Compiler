package AST_Node;

public class ArrayTypeNode extends TypeNode {
    private int arraysize;

    public ArrayTypeNode(TypeNode obj) {
        this.basetype = obj.basetype;
        this.dim = obj.dim + 1;
    }

    public void setArraysize(int arraysize) {
        this.arraysize = arraysize;
    }
}
