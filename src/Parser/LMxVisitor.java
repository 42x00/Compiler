package Parser;// Generated from LMx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LMxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LMxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LMxParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(LMxParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationSpecifier_array}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier_array(LMxParser.DeclarationSpecifier_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationSpecifier_type}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier_type(LMxParser.DeclarationSpecifier_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(LMxParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(LMxParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(LMxParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(LMxParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(LMxParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(LMxParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(LMxParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(LMxParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(LMxParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(LMxParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(LMxParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(LMxParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(LMxParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(LMxParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(LMxParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LMxParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(LMxParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(LMxParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(LMxParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(LMxParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewDeclarator(LMxParser.NewDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directDeclarator_Identifier}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator_Identifier(LMxParser.DirectDeclarator_IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directDeclarator_with_parameterList}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator_with_parameterList(LMxParser.DirectDeclarator_with_parameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directDeclarator_recycle}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator_recycle(LMxParser.DirectDeclarator_recycleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterDeclaration_multi}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration_multi(LMxParser.ParameterDeclaration_multiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parameterDeclaration_single}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration_single(LMxParser.ParameterDeclaration_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(LMxParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(LMxParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LMxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(LMxParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(LMxParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(LMxParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(LMxParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(LMxParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(LMxParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(LMxParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(LMxParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(LMxParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LMxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#programDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramDeclaration(LMxParser.ProgramDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(LMxParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(LMxParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#classDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationList(LMxParser.ClassDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LMxParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(LMxParser.ClassDeclarationContext ctx);
}