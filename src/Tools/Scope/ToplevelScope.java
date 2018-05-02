package Tools.Scope;

import AST_Node.DeclNodes.DeclNode;
import AST_Node.DeclNodes.VarDeclNode;
import org.antlr.v4.codegen.model.decl.Decl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ToplevelScope extends Scope{
    protected Map<String, DeclNode> declarations;

    public ToplevelScope() {
        declarations = new HashMap<>();
    }

    public ToplevelScope(List<? extends DeclNode> declNodes){
        declarations = new HashMap<>();
        for (DeclNode declNode : declNodes){
            DeclNode d = declarations.get(declNode.getDeclname());
            if (d != null){
                throw new Error();
            }
            declarations.put(declNode.getDeclname(),declNode);
        }
    }

    @Override
    public DeclNode get(String string) {
        DeclNode d = declarations.get(string);
        if (d == null)
            throw new Error("Wrong Identifier!");
        return d;
    }

    @Override
    public void addDecl(String declname, DeclNode declNode) {
        DeclNode d = declarations.get(declname);
        if (d != null)
            throw new Error("Decl exists!");
        declarations.put(declname,declNode);
    }
}
