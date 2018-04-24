package AST_Node;

public class ArrayIndexExprNode extends ExprNode{
    public ExprNode array, index;

    public ArrayIndexExprNode(ExprNode array, ExprNode index) {
        this.array = array;
        this.index = index;
    }
}
