package AST_Node;

import java.util.List;

public class ClassDeclNode extends ASTNode{
    public String classname;
    public List<DeclNode> classdecllist;

    public ClassDeclNode(String classname) {
        this.classname = classname;
    }

    public ClassDeclNode(String classname, List<DeclNode> classdecllist) {
        this.classname = classname;
        this.classdecllist = classdecllist;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
