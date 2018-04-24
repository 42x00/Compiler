package AST_Node;

public class UnaryExprNode extends ExprNode{
    public static enum UnaryOP{
        SELF_INC, SELF_DEC, POSI, NEGE, LOGIC_NOT, BIT_NOT
    }

    public UnaryOP exprop;
    public ExprNode unaryexpr;

    public UnaryExprNode(UnaryOP exprop, ExprNode unaryexpr) {
        this.exprop = exprop;
        this.unaryexpr = unaryexpr;
    }
}
