package AST_Node;

import Type.*;

public class TypeNode extends ASTNode {
    public Type.Types basetype;
    public int dim;

    public TypeNode(){
        basetype = Type.Types.NULL;
        dim = 0;
    }

    public TypeNode(Type.Types basetypem) {
        this.dim = 0;
        this.basetype = basetype;
    }

    public void setBasetype(Type.Types basetype) {
        this.basetype = basetype;
    }
}
