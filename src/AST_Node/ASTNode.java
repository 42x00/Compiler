package AST_Node;

import Tools.Scope.Scope;

abstract public class ASTNode {
    public void accept(ASTVisitor visitor){};
}

