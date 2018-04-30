package AST_Node.DeclNodes;

import AST_Node.ASTVisitor;
import Tools.Scope.Scope;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclNode extends DeclNode {
    public List<DeclNode> classdecllist;
    public Scope astscope;

    public void setAstscope(Scope astscope) {
        this.astscope = astscope;
    }

    public ClassDeclNode() {
        this.classdecllist = new ArrayList<>();
    }

    public ClassDeclNode(String declname) {
        this.declname = declname;
        this.classdecllist = new ArrayList<>();
    }

    public ClassDeclNode(String declname, List<DeclNode> classdecllist) {
        this.declname = declname;
        this.classdecllist = classdecllist;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
