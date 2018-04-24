package AST_Node;

public class SuffixExprNode extends ExprNode{
    public static enum SuffixOP{
        SELF_INC, SELF_DEC
    }

    public SuffixOP exprop;
    public ExprNode suffixexpr;

    public SuffixExprNode(SuffixOP exprop, ExprNode suffixexpr) {
        this.exprop = exprop;
        this.suffixexpr = suffixexpr;
    }
}
