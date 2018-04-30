package AST_Node.ExprNodes;

import AST_Node.ASTVisitor;
import AST_Node.TypeNodes.TypeNode;
import Type.Type;

import static java.lang.System.err;

public class NewExprNode extends ExprNode{

    public NewExprNode(TypeNode exprtype) {
        if (exprtype.basetype == Type.Types.VOID){
            err.println("New Void!");
            throw new Error();
        }
        this.exprtype = exprtype;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
