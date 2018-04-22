package AST_Node;

import Type.*;

public class ClassTypeNode extends TypeNode {
    String classname;

    public ClassTypeNode(String classname) {
        this.basetype = Type.Types.CLASS;
        this.dim = 0;
        this.classname = classname;
    }
}
