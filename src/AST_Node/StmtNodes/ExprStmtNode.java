package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;

public class ExprStmtNode extends StmtNode{
    public ExprNode exprnode;

    public ExprStmtNode() {
    }

    public ExprStmtNode(ExprNode exprnode) {
        this.exprnode = exprnode;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
