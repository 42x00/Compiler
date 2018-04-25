package AST_Node;

import java.util.ArrayList;
import java.util.List;

public class CompStmtNode extends StmtNode{
    public List<StmtNode> stmtNodeList;

    public CompStmtNode() {
        this.stmtNodeList = new ArrayList<>();
    }

    public CompStmtNode(List<StmtNode> stmtNodeList) {
        this.stmtNodeList = stmtNodeList;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
