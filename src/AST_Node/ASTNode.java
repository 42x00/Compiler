package AST_Node;

import Tools.Scope.Scope;
import org.antlr.v4.runtime.ParserRuleContext;

abstract public class ASTNode {
    public ParserRuleContext ctx;

    public void accept(ASTVisitor visitor){};
    abstract public void setCtx(ParserRuleContext ctx);
}

