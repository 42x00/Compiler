package AST_Node;

abstract public class ExprNode extends StmtNode{
    private TypeNode typeNode;
    private boolean isLValue;

    public ExprNode(TypeNode typeNode, boolean isLValue) {
        this.typeNode = typeNode;
        this.isLValue = isLValue;
    }

    public TypeNode getTypeNode() {
        return typeNode;
    }

    public boolean isLValue() {
        return isLValue;
    }
}
