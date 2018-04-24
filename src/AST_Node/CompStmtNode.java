package AST_Node;

import java.util.List;

public class CompStmtNode extends StmtNode{
    private List<StmtNode> stmtNodeList;

    public CompStmtNode() {
    }

    public CompStmtNode(List<StmtNode> stmtNodeList) {
        this.stmtNodeList = stmtNodeList;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
