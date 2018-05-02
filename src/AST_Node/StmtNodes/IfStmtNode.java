package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;
import AST_Node.StmtNodes.StmtNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class IfStmtNode extends StmtNode {
    private ExprNode ifexpr;
    private StmtNode ifstmt,elsestmt;

    public IfStmtNode(ExprNode ifexpr, StmtNode ifstmt) {
        this.ifexpr = ifexpr;
        this.ifstmt = ifstmt;
    }

    public void setIfexpr(ExprNode ifexpr) {
        this.ifexpr = ifexpr;
    }

    public void setIfstmt(StmtNode ifstmt) {
        this.ifstmt = ifstmt;
    }

    public void setElsestmt(StmtNode elsestmt) {
        this.elsestmt = elsestmt;
    }

    public ExprNode getIfexpr() {
        return ifexpr;
    }

    public StmtNode getIfstmt() {
        return ifstmt;
    }

    public StmtNode getElsestmt() {
        return elsestmt;
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
