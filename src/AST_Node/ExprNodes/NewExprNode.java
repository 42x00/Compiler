package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import AST_Node.TypeNodes.TypeNode;
import Type.Type;
import org.antlr.v4.runtime.ParserRuleContext;

import static java.lang.System.err;

public class NewExprNode extends ExprNode{

    public NewExprNode(TypeNode exprtype) {
        if (exprtype.isEqual(Type.Types.VOID)){
            throw new Error("New Void!");
        }
        this.exprtype = exprtype;
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
