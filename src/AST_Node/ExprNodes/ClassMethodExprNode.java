package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;

public class ClassMethodExprNode extends ExprNode{
    public ExprNode classexpr;
    public String methodname;

    public ClassMethodExprNode(ExprNode classexpr, String methodname) {
        this.classexpr = classexpr;
        this.methodname = methodname;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}