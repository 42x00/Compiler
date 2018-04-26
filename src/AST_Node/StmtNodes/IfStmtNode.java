package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;
import AST_Node.StmtNodes.StmtNode;

public class IfStmtNode extends StmtNode {
    public ExprNode ifexpr;
    public StmtNode ifstmt,elsestmt;

    public IfStmtNode(ExprNode ifexpr, StmtNode ifstmt) {
        this.ifexpr = ifexpr;
        this.ifstmt = ifstmt;
    }

    public void setElsestmt(StmtNode elsestmt) {
        this.elsestmt = elsestmt;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
