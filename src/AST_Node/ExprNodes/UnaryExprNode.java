package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;
import org.antlr.v4.runtime.ParserRuleContext;

import javax.lang.model.type.NullType;

public class UnaryExprNode extends ExprNode {
    public static enum UnaryOP{
        SELF_INC, SELF_DEC, POSI, NEGE, LOGIC_NOT, BIT_NOT
    }

    private UnaryOP exprop;
    private ExprNode unaryexpr;

    public UnaryExprNode() {
    }

    public UnaryExprNode(UnaryOP exprop, ExprNode unaryexpr) {
        this.exprop = exprop;
        this.unaryexpr = unaryexpr;
    }

    public UnaryOP getExprop() {
        return exprop;
    }

    public ExprNode getUnaryexpr() {
        return unaryexpr;
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
