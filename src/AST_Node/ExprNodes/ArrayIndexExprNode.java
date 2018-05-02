package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

public class ArrayIndexExprNode extends ExprNode {
    private ExprNode array, index;

    public ArrayIndexExprNode() {
    }

    public ArrayIndexExprNode(ExprNode array, ExprNode index) {
        this.array = array;
        this.index = index;
    }

    public ExprNode getArray() {
        return array;
    }

    public ExprNode getIndex() {
        return index;
    }

    public void setArray(ExprNode array) {
        this.array = array;
    }

    public void setIndex(ExprNode index) {
        this.index = index;
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
