package AST_Node;

import AST_Node.DeclNodes.DeclNode;
import Tools.Scope.Scope;
import Tools.Scope.ToplevelScope;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class ProgNode extends ASTNode{
    private List<DeclNode> declarations;
    private ToplevelScope toplevelScope;

    public ProgNode() {
        this.declarations = new ArrayList<>();
    }

    public void addDecl(DeclNode declNode){
        declarations.add(declNode);
    }

    public void setCtx(ParserRuleContext ctx) {
        this.ctx = ctx;
    }

    public List<DeclNode> getDeclarations() {
        return declarations;
    }

    public ToplevelScope getToplevelScope() {
        return toplevelScope;
    }

    public void setToplevelScope(ToplevelScope toplevelScope) {
        this.toplevelScope = toplevelScope;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
