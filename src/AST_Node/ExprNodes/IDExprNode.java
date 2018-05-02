package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

public class IDExprNode extends ExprNode{
    private String id;

    public IDExprNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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
