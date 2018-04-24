package AST_Node;

public class BinaryExprNode extends ExprNode{
    public static enum BinaryOP{
        MUL, DIV, MOD,
        ADD, SUB,
        SHL, SHR,
        LESS, LESS_EQUAL, GREATER, GREATER_EQUAL, EQUAL, INEQUAL,
        BIT_AND, BIT_XOR, BIR_OR, LOGICAL_AND, LOGICAL_OR, ASSIGN
    }

    public BinaryOP exprop;
    public ExprNode lhs, rhs;

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    public BinaryExprNode(BinaryOP exprop, ExprNode lhs, ExprNode rhs) {
        this.exprop = exprop;
        this.lhs = lhs;
        this.rhs = rhs;
    }
}
