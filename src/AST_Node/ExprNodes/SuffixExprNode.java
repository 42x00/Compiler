package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;

public class SuffixExprNode extends ExprNode {
    public static enum SuffixOP{
        SELF_INC, SELF_DEC
    }

    public SuffixOP exprop;
    public ExprNode suffixexpr;

    public SuffixExprNode(SuffixOP exprop, ExprNode suffixexpr) {
        this.exprop = exprop;
        this.suffixexpr = suffixexpr;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
