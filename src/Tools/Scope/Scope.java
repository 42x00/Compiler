package Tools.Scope;

import AST_Node.DeclNodes.VarDeclNode;

import java.util.ArrayList;
import java.util.List;

abstract public class Scope {
    abstract public void addDecl(VarDeclNode varDeclNode);
//    protected List<LocalScope> children;
//
//    public Scope() {
//        children = new ArrayList<>();
//    }
}
