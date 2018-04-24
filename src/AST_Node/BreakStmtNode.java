package AST_Node;

public class BreakStmtNode extends StmtNode{
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
