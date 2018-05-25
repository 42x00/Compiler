package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import AST_Node.DeclNodes.DeclNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class IDExprNode extends ExprNode{
    private String id;
    private DeclNode declNode;

    public IDExprNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public DeclNode getDeclNode() {
        return declNode;
    }

    public void setDeclNode(DeclNode declNode) {
        this.declNode = declNode;
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
