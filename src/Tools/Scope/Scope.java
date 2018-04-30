package Tools.Scope;

import AST_Node.DeclNodes.DeclNode;
import AST_Node.DeclNodes.VarDeclNode;

import java.util.ArrayList;
import java.util.List;

abstract public class Scope {
    abstract public void addDecl(String declname, DeclNode declNode);
    abstract public DeclNode get(String string);
}
