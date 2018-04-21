package Frontend;

import AST_Node.*;

import org.antlr.v4.runtime.ParserRuleContext;
import Parser.LMxBaseVisitor;
import Parser.LMxParser;

import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends LMxBaseVisitor<ASTNode> {
    @Override
    public ASTNode visitProgram(LMxParser.ProgramContext ctx) {
        List<DeclNode> declarations = new ArrayList<>();
        for (ParserRuleContext programDeclaration : ctx.programDeclaration()){
            ASTNode declaration = visit(programDeclaration);
            declarations.add((DeclNode) declaration);
        }
        return new ProgramNode(declarations,Location.ctx(ctx));
    }

    @Override
    public ASTNode visitProgramDeclaration(LMxParser.ProgramDeclarationContext ctx) {
        if (ctx.functionDefinition() != null) return (FuncDeclNode) visit(ctx.functionDefinition());
//        else if (ctx.classDefinition() != null) return visit(ctx.classDefinition());
//        else return visit(ctx.declaration());
    }

    @Override
    public ASTNode visitFunctionDefinition(LMxParser.FunctionDefinitionContext ctx) {
        TypeNode functionReturnType;
        if (ctx.declarationSpecifier() == null) functionReturnType = null;
        else functionReturnType = (TypeNode) visit(ctx.declarationSpecifier());
        FuncDeclNode tmpfuncdeclnode = (FuncDeclNode) visit(ctx.directDeclarator());
        tmpfuncdeclnode.setFunctionReturnType(functionReturnType);
        tmpfuncdeclnode.setFunctionStatements((CompStmtNode) visit(ctx.compoundStatement()));
        return tmpfuncdeclnode;
    }

    @Override
    public ASTNode visitDeclarationSpecifier_type(LMxParser.DeclarationSpecifier_typeContext ctx) {
        return TypeNode()
    }
}














