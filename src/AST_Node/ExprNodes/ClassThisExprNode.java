package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import Type.*;
import org.antlr.v4.runtime.ParserRuleContext;

public class ClassThisExprNode extends ExprNode{
    public ClassThisExprNode() {
        this.exprtype.setBasetype(Type.Types.CLASS);
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
