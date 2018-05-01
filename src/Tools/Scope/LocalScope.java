package Tools.Scope;

import AST_Node.DeclNodes.*;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class LocalScope extends Scope{
    protected Scope parent;
    private Map<String, DeclNode> declarations;

    public LocalScope(Scope parent) {
        this.parent = parent;
        declarations = new HashMap<>();
    }

    public LocalScope(Scope parent, List<? extends DeclNode> declNodes){
        this.parent = parent;
        declarations = new HashMap<>();
        for (DeclNode declNode : declNodes){
            DeclNode d = declarations.get(declNode.declname);
            if (d != null)
                throw new Error();
            declarations.put(declNode.declname,declNode);
        }
    }

    public LocalScope(Scope parent, VarDeclNode varDeclNode){
        this.parent = parent;
        declarations = new HashMap<>();
        declarations.put(varDeclNode.declname,varDeclNode);
    }

    @Override
    public DeclNode get(String string) {
        DeclNode d = declarations.get(string);
        if (d == null)
            return this.parent.get(string);
        return d;
    }

    public void addDecls(List<VarDeclNode> varDeclNodes){
        for (VarDeclNode varDeclNode : varDeclNodes){
            DeclNode d = declarations.get(varDeclNode.declname);
            if (d != null)
                throw new Error();
            declarations.put(varDeclNode.declname,varDeclNode);
        }
    }

    @Override
    public void addDecl(String declname, DeclNode declNode) {
        DeclNode d = declarations.get(declname);
        if (d != null)
            throw new Error("Decl exists!");
        declarations.put(declname,declNode);
    }
}