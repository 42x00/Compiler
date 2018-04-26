package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;

public class BreakStmtNode extends StmtNode{
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
