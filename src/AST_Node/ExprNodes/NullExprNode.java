package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import Type.Type;
import org.antlr.v4.runtime.ParserRuleContext;

public class NullExprNode extends ExprNode{
    public NullExprNode() {
        this.exprtype.setBasetype(Type.Types.NULL);
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
