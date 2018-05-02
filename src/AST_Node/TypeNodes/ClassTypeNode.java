package AST_Node.TypeNodes;

import AST_Node.ASTVisitor;
import Type.*;
import org.antlr.v4.runtime.ParserRuleContext;

public class ClassTypeNode extends TypeNode {
    private String classname;

    public ClassTypeNode(String classname) {
        this.basetype = Type.Types.CLASS;
        this.dim = 0;
        this.classname = classname;
    }

    public ClassTypeNode(String classname, ParserRuleContext ctx) {
        this.basetype = Type.Types.CLASS;
        this.dim = 0;
        this.classname = classname;
        this.ctx = ctx;
    }

    public String getClassname() {
        return classname;
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
