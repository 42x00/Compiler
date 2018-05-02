package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

public class ClassMethodExprNode extends ExprNode{
    private ExprNode classexpr;
    private String methodname;

    public ClassMethodExprNode() {
    }

    public ClassMethodExprNode(ExprNode classexpr, String methodname) {
        this.classexpr = classexpr;
        this.methodname = methodname;
    }

    public ExprNode getClassexpr() {
        return classexpr;
    }

    public String getMethodname() {
        return methodname;
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
