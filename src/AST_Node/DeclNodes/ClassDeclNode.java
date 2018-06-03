package AST_Node.DeclNodes;

import AST_Node.ASTVisitor;
import Tools.Scope.LocalScope;
import Tools.Scope.Scope;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclNode extends DeclNode {
    private List<DeclNode> classdecllist;
    private LocalScope localScope;
    private int size;

    public ClassDeclNode() {
        this.classdecllist = new ArrayList<>();
    }

    public ClassDeclNode(String declname) {
        this.declname = declname;
        this.classdecllist = new ArrayList<>();
    }

    public void addDecl(DeclNode declNode){
        classdecllist.add(declNode);
    }

    public List<DeclNode> getClassdecllist() {
        return classdecllist;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LocalScope getLocalScope() {
        return localScope;
    }

    public void setLocalScope(LocalScope localScope) {
        this.localScope = localScope;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void setCtx(ParserRuleContext ctx) {
        this.ctx = ctx;
    }
}
