package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import Tools.Scope.Scope;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class CompStmtNode extends StmtNode{
    private List<StmtNode> stmtNodeList;

    public CompStmtNode() {
        this.stmtNodeList = new ArrayList<>();
    }

    public void addStmt(StmtNode stmtNode){
        stmtNodeList.add(stmtNode);
    }

    public List<StmtNode> getStmtNodeList() {
        return stmtNodeList;
    }

    public void setStmtNodeList(List<StmtNode> stmtNodeList) {
        this.stmtNodeList = stmtNodeList;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void setCtx(ParserRuleContext ctx) {
        this.ctx = ctx;
    }

}
