package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

public class BinaryExprNode extends ExprNode{
    public static enum BinaryOP{
        MUL, DIV, MOD,
        ADD, SUB,
        SHL, SHR,
        LESS, LESS_EQUAL, GREATER, GREATER_EQUAL, EQUAL, INEQUAL,
        BIT_AND, BIT_XOR, BIR_OR, LOGICAL_AND, LOGICAL_OR, ASSIGN
    }

    private BinaryOP exprop;
    private ExprNode lhs, rhs;

    public BinaryExprNode(BinaryOP exprop, ExprNode lhs, ExprNode rhs) {
        this.exprop = exprop;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public BinaryOP getExprop() {
        return exprop;
    }

    public ExprNode getLhs() {
        return lhs;
    }

    public ExprNode getRhs() {
        return rhs;
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
