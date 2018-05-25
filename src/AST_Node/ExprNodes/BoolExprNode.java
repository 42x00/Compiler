package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import Type.Type;
import org.antlr.v4.runtime.ParserRuleContext;

public class BoolExprNode extends ExprNode{
    private boolean bool;

    public BoolExprNode() {
        this.exprtype.setBasetype(Type.Types.BOOL);
    }

    public BoolExprNode(boolean bool) {
        this.bool = bool;
        this.exprtype.setBasetype(Type.Types.BOOL);
    }

    public boolean isBool() {
        return bool;
    }

    public boolean isTrue(){
        return bool;
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
