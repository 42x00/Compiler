package AST_Node;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclNode extends ASTNode{
    public String classname;
    public List<DeclNode> classdecllist;

    public ClassDeclNode() {
        this.classdecllist = new ArrayList<>();
    }

    public ClassDeclNode(String classname) {
        this.classname = classname;
        this.classdecllist = new ArrayList<>();
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
