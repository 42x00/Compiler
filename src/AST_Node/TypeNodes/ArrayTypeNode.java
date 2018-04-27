package AST_Node.TypeNodes;

import AST_Node.ASTVisitor;
import AST_Node.ExprNodes.ExprNode;

public class ArrayTypeNode extends TypeNode {
    private int arraysize;
    private TypeNode arraybasetype;
    private ExprNode arraysizeexpr;

    public ExprNode getArraysizeexpr() {
        return arraysizeexpr;
    }

    public ArrayTypeNode(TypeNode obj) {
        this.basetype = obj.basetype;
        this.dim = obj.dim + 1;
        this.arraybasetype = obj;
    }

    public ArrayTypeNode(TypeNode obj, ExprNode expr) {
        this.basetype = obj.basetype;
        this.dim = obj.dim + 1;
        this.arraybasetype = obj;
        this.arraysizeexpr = expr;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    public void setArraysize(int arraysize) {
        this.arraysize = arraysize;
    }
}
