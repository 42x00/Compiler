package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;

public class UnaryExprNode extends ExprNode {
    public static enum UnaryOP{
        SELF_INC, SELF_DEC, POSI, NEGE, LOGIC_NOT, BIT_NOT
    }

    public UnaryOP exprop;
    public ExprNode unaryexpr;

    public UnaryExprNode() {
    }

    public UnaryExprNode(UnaryOP exprop, ExprNode unaryexpr) {
        this.exprop = exprop;
        this.unaryexpr = unaryexpr;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}