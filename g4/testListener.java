// Generated from test.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(testParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(testParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(testParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(testParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(testParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(testParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(testParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(testParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(testParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(testParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(testParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(testParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(testParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(testParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(testParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(testParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(testParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(testParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(testParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(testParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(testParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(testParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(testParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(testParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(testParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(testParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(testParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(testParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(testParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(testParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(testParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(testParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(testParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(testParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(testParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(testParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(testParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(testParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(testParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(testParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(testParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(testParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(testParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(testParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(testParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(testParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(testParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(testParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(testParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(testParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(testParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(testParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(testParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(testParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(testParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(testParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(testParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(testParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(testParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(testParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(testParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(testParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(testParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(testParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(testParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(testParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(testParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(testParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(testParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(testParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(testParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(testParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(testParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(testParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(testParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(testParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(testParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(testParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(testParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(testParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(testParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(testParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(testParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(testParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(testParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(testParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(testParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(testParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(testParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationList(testParser.ClassDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#classDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationList(testParser.ClassDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(testParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(testParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(testParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(testParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(testParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#newExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(testParser.NewExpressionContext ctx);
}