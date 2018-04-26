package AST_Node.ExprNodes;

import AST_Node.ASTNode;
import AST_Node.TypeNodes.TypeNode;

abstract public class ExprNode extends ASTNode {
    public TypeNode exprtype;

    public ExprNode() {
        exprtype = new TypeNode();
    }
}
