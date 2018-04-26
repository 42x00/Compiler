package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;

public class ReturnStmtNode extends StmtNode{
    public ExprNode returnexpr;

    public ReturnStmtNode(ExprNode returnexpr) {
        this.returnexpr = returnexpr;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
