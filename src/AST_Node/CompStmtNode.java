package AST_Node;

import java.util.List;

public class CompStmtNode extends StmtNode{
    private List<StmtNode> stmtNodeList;

    @Override
    public Location location() {
        return stmtNodeList.get(0).location();
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
