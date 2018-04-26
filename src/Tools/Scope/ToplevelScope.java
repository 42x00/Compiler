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

    public ToplevelScope(List<DeclNode> declNodes){
        declarations = new HashMap<>();
        for (DeclNode declNode : declNodes){
            DeclNode d = declarations.get(declNode.declname);
            if (d != null){
                throw new Error();
            }
            declarations.put(declNode.declname,declNode);
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
