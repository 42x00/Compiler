package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class FuncCallExprNode extends ExprNode{
    private ExprNode function;
    private List<ExprNode> parameters;

    public FuncCallExprNode() {
        this.parameters = new ArrayList<>();
    }

    public FuncCallExprNode(ExprNode function) {
        this.function = function;
        this.parameters = new ArrayList<>();
    }

    public void setFunction(ExprNode function) {
        this.function = function;
    }

    public void addExpr(ExprNode exprNode){
        parameters.add(exprNode);
    }

    public ExprNode getFunction() {
        return function;
    }

    public List<ExprNode> getParameters() {
        return parameters;
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
