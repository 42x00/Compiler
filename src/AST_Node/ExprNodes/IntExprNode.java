package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import Type.Type;
import org.antlr.v4.runtime.ParserRuleContext;

public class IntExprNode extends ExprNode{
    private int intvalue;

    public IntExprNode() {
        this.exprtype.setBasetype(Type.Types.INT);
    }

    public IntExprNode(int intvalue) {
        this.exprtype.setBasetype(Type.Types.INT);
        this.intvalue = intvalue;
    }

    public int getIntvalue() {
        return intvalue;
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
