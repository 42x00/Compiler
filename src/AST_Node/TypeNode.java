package AST_Node;

import Type.*;

public class TypeNode extends ASTNode {
    Type.Types types;

    public TypeNode(Type.Types types) {
        this.types = types;
    }
}
