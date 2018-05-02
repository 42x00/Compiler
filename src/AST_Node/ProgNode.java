package AST_Node;

import AST_Node.DeclNodes.DeclNode;
import Tools.Scope.Scope;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class ProgNode extends ASTNode{
    private List<DeclNode> declarations;

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

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
