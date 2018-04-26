package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;

public class ContinueStmtNode extends StmtNode{
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
