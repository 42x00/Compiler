package AST_Node.StmtNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;
import org.antlr.v4.runtime.ParserRuleContext;

public class ReturnStmtNode extends StmtNode{
    private ExprNode returnexpr;

    public ReturnStmtNode() {
    }

    public ReturnStmtNode(ExprNode returnexpr) {
        this.returnexpr = returnexpr;
    }

    public ExprNode getReturnexpr() {
        return returnexpr;
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
