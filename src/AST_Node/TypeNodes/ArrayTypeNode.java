package AST_Node.TypeNodes;

import AST_Node.ASTVisitor;

public class ArrayTypeNode extends TypeNode {
    private int arraysize;

    public ArrayTypeNode(TypeNode obj) {
        this.basetype = obj.basetype;
        this.dim = obj.dim + 1;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    public void setArraysize(int arraysize) {
        this.arraysize = arraysize;
    }
}
