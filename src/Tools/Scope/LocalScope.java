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

    public LocalScope(Scope parent, List<VarDeclNode> varDeclNodes) {
        this.parent = parent;
        declarations = new HashMap<>();
        for (VarDeclNode varDeclNode : varDeclNodes){
            DeclNode d = declarations.get(varDeclNode.declname);
            if (d != null)
                throw new Error();
            declarations.put(varDeclNode.declname,varDeclNode);
        }
    }

    public LocalScope(Scope parent, VarDeclNode varDeclNode){
        this.parent = parent;
        declarations = new HashMap<>();
        declarations.put(varDeclNode.declname,varDeclNode);
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
    public void addDecl(VarDeclNode varDeclNode) {
        DeclNode d = declarations.get(varDeclNode.declname);
        if (d != null)
            throw new Error();
        declarations.put(varDeclNode.declname,varDeclNode);
    }
}