package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import AST_Node.TypeNodes.TypeNode;
import Type.Type;
import org.antlr.v4.runtime.ParserRuleContext;

import static java.lang.System.err;

public class NewExprNode extends ExprNode{
    private boolean isClassConstruct;

    public NewExprNode(TypeNode exprtype) {
        if (exprtype.isEqual(Type.Types.VOID)){
            throw new Error("New Void!");
        }
        this.isClassConstruct = false;
        this.exprtype = exprtype;
    }

    public void setClassConstruct(boolean classConstruct) {
        isClassConstruct = classConstruct;
    }

    public boolean isClassConstruct() {
        return isClassConstruct;
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
