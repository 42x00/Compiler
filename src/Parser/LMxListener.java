package Parser;// Generated from LMx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LMxParser}.
 */
public interface LMxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LMxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(LMxParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(LMxParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationSpecifier_array}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier_array(LMxParser.DeclarationSpecifier_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationSpecifier_array}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier_array(LMxParser.DeclarationSpecifier_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationSpecifier_type}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier_type(LMxParser.DeclarationSpecifier_typeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationSpecifier_type}
	 * labeled alternative in {@link LMxParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier_type(LMxParser.DeclarationSpecifier_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(LMxParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(LMxParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(LMxParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(LMxParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(LMxParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(LMxParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(LMxParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(LMxParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(LMxParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(LMxParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(LMxParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(LMxParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(LMxParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(LMxParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(LMxParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(LMxParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(LMxParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(LMxParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(LMxParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(LMxParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(LMxParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(LMxParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(LMxParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(LMxParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(LMxParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(LMxParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(LMxParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(LMxParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(LMxParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(LMxParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LMxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LMxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LMxParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LMxParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(LMxParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(LMxParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(LMxParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(LMxParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(LMxParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(LMxParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewDeclarator(LMxParser.NewDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#newDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewDeclarator(LMxParser.NewDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directDeclarator_Identifier}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator_Identifier(LMxParser.DirectDeclarator_IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directDeclarator_Identifier}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator_Identifier(LMxParser.DirectDeclarator_IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directDeclarator_with_parameterList}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator_with_parameterList(LMxParser.DirectDeclarator_with_parameterListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directDeclarator_with_parameterList}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator_with_parameterList(LMxParser.DirectDeclarator_with_parameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directDeclarator_recycle}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator_recycle(LMxParser.DirectDeclarator_recycleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directDeclarator_recycle}
	 * labeled alternative in {@link LMxParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator_recycle(LMxParser.DirectDeclarator_recycleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterDeclaration_multi}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration_multi(LMxParser.ParameterDeclaration_multiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterDeclaration_multi}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration_multi(LMxParser.ParameterDeclaration_multiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parameterDeclaration_single}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration_single(LMxParser.ParameterDeclaration_singleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parameterDeclaration_single}
	 * labeled alternative in {@link LMxParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration_single(LMxParser.ParameterDeclaration_singleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(LMxParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(LMxParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(LMxParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(LMxParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LMxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LMxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(LMxParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(LMxParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(LMxParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(LMxParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(LMxParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(LMxParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(LMxParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(LMxParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(LMxParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(LMxParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(LMxParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(LMxParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(LMxParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(LMxParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(LMxParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(LMxParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(LMxParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(LMxParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LMxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LMxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#programDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProgramDeclaration(LMxParser.ProgramDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#programDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProgramDeclaration(LMxParser.ProgramDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(LMxParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(LMxParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(LMxParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(LMxParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationList(LMxParser.ClassDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationList(LMxParser.ClassDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LMxParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(LMxParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LMxParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(LMxParser.ClassDeclarationContext ctx);
}