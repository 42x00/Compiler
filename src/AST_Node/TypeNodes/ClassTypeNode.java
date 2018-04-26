package AST_Node.TypeNodes;

import AST_Node.ASTVisitor;
import Type.*;

public class ClassTypeNode extends TypeNode {
    public String classname;

    public ClassTypeNode(String classname) {
        this.basetype = Type.Types.CLASS;
        this.dim = 0;
        this.classname = classname;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
