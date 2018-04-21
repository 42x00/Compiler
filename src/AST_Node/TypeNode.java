package AST_Node;

import Type.Type;

abstract public class TypeNode extends ASTNode {
    protected Type.Types type;

    public Type.Types getType() {
        return type;
    }
}
