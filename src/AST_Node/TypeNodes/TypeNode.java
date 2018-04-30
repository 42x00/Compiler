package AST_Node.TypeNodes;

import AST_Node.ASTNode;
import AST_Node.ASTVisitor;
import Type.*;

public class TypeNode extends ASTNode {
    public Type.Types basetype;
    public int dim;

    public TypeNode(){
        basetype = Type.Types.NULL;
        dim = 0;
    }

    public TypeNode(Type.Types basetype) {
        this.dim = 0;
        this.basetype = basetype;
    }

    public boolean isEqual(TypeNode obj) {
        return  (basetype == obj.basetype && dim == obj.dim);
    }

    public void setBasetype(Type.Types basetype) {
        this.basetype = basetype;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
