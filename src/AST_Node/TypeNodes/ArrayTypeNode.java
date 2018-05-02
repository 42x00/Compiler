package AST_Node.TypeNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;
import Type.*;
import org.antlr.v4.runtime.ParserRuleContext;

import static java.lang.System.err;

public class ArrayTypeNode extends TypeNode {
    private TypeNode arrayelement;
    private ExprNode arraysizeexpr;

    public ArrayTypeNode() {
        this.basetype = Type.Types.NULL;
        this.dim = 0;
        this.arrayelement = new TypeNode();
    }

    public TypeNode getArrayelement() {
        return arrayelement;
    }

    public ExprNode getArraysizeexpr() {
        return arraysizeexpr;
    }

    public ArrayTypeNode(TypeNode obj) {
        if (obj.isEqual(Type.Types.VOID)) {
            throw new Error("Void Array!");
        }
        this.basetype = obj.basetype;
        this.dim = obj.dim + 1;
        this.arrayelement = obj;
    }

    public ArrayTypeNode(TypeNode obj, ExprNode expr) {
        if (obj.isEqual(Type.Types.VOID)) {
            throw new Error("Void Array!");
        }
        this.basetype = obj.basetype;
        this.dim = obj.dim + 1;
        this.arrayelement = obj;
        this.arraysizeexpr = expr;
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
