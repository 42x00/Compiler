package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import Type.*;
import org.antlr.v4.runtime.ParserRuleContext;

public class StringExprNode extends ExprNode{
    private String stringexpr;

    public StringExprNode() {
        this.exprtype.setBasetype(Type.Types.STRING);
    }

    public StringExprNode(String stringexpr) {
        this.stringexpr = stringexpr;
        this.exprtype.setBasetype(Type.Types.STRING);
    }

    public String getStringexpr() {
        return stringexpr;
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
