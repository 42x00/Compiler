package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;
import Tools.Scope.Scope;
import org.antlr.v4.runtime.ParserRuleContext;

public class WhileStmtNode extends StmtNode{
    private ExprNode whileexpr;
    private StmtNode whilestmt;

    public ExprNode getWhileexpr() {
        return whileexpr;
    }

    public StmtNode getWhilestmt() {
        return whilestmt;
    }

    public WhileStmtNode(ExprNode whileexpr, StmtNode whilestmt) {
        this.whileexpr = whileexpr;
        this.whilestmt = whilestmt;
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
