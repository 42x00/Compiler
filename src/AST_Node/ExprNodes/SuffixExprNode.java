package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class SuffixExprNode extends ExprNode {
    public static enum SuffixOP{
        SELF_INC, SELF_DEC
    }

    private SuffixOP exprop;
    private ExprNode suffixexpr;

    public SuffixExprNode(SuffixOP exprop, ExprNode suffixexpr) {
        this.exprop = exprop;
        this.suffixexpr = suffixexpr;
    }

    public SuffixOP getExprop() {
        return exprop;
    }

    public ExprNode getSuffixexpr() {
        return suffixexpr;
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
