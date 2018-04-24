package AST_Node;

public class ContinueStmtNode extends StmtNode{
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
