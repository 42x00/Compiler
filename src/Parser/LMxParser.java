package Parser;// Generated from LMx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LMxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Break=1, Continue=2, Else=3, For=4, If=5, Int=6, String=7, Return=8, Void=9, 
		While=10, Class=11, New=12, True=13, False=14, LeftParen=15, RightParen=16, 
		LeftBracket=17, RightBracket=18, LeftBrace=19, RightBrace=20, Less=21, 
		LessEqual=22, Greater=23, GreaterEqual=24, LeftShift=25, RightShift=26, 
		Plus=27, PlusPlus=28, Minus=29, MinusMinus=30, Star=31, Div=32, Mod=33, 
		And=34, Or=35, AndAnd=36, OrOr=37, Caret=38, Not=39, Tilde=40, Colon=41, 
		Semi=42, Comma=43, Assign=44, Equal=45, NotEqual=46, Dot=47, Identifier=48, 
		Constant=49, DigitSequence=50, BooleanConstant=51, StringLiteral=52, Whitespace=53, 
		Newline=54, BlockComment=55, LineComment=56;
	public static final int
		RULE_primaryExpression = 0, RULE_declarationSpecifier = 1, RULE_postfixExpression = 2, 
		RULE_argumentExpressionList = 3, RULE_unaryExpression = 4, RULE_unaryOperator = 5, 
		RULE_castExpression = 6, RULE_multiplicativeExpression = 7, RULE_additiveExpression = 8, 
		RULE_shiftExpression = 9, RULE_relationalExpression = 10, RULE_equalityExpression = 11, 
		RULE_andExpression = 12, RULE_exclusiveOrExpression = 13, RULE_inclusiveOrExpression = 14, 
		RULE_logicalAndExpression = 15, RULE_logicalOrExpression = 16, RULE_expression = 17, 
		RULE_declaration = 18, RULE_initDeclaratorList = 19, RULE_initDeclarator = 20, 
		RULE_typeSpecifier = 21, RULE_newDeclarator = 22, RULE_directDeclarator = 23, 
		RULE_parameterList = 24, RULE_parameterDeclaration = 25, RULE_typedefName = 26, 
		RULE_statement = 27, RULE_compoundStatement = 28, RULE_blockItem = 29, 
		RULE_expressionStatement = 30, RULE_selectionStatement = 31, RULE_iterationStatement = 32, 
		RULE_forCondition = 33, RULE_forDeclaration = 34, RULE_forExpression = 35, 
		RULE_jumpStatement = 36, RULE_program = 37, RULE_programDeclaration = 38, 
		RULE_functionDefinition = 39, RULE_classDefinition = 40, RULE_classDeclaration = 41;
	public static final String[] ruleNames = {
		"primaryExpression", "declarationSpecifier", "postfixExpression", "argumentExpressionList", 
		"unaryExpression", "unaryOperator", "castExpression", "multiplicativeExpression", 
		"additiveExpression", "shiftExpression", "relationalExpression", "equalityExpression", 
		"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
		"logicalOrExpression", "expression", "declaration", "initDeclaratorList", 
		"initDeclarator", "typeSpecifier", "newDeclarator", "directDeclarator", 
		"parameterList", "parameterDeclaration", "typedefName", "statement", "compoundStatement", 
		"blockItem", "expressionStatement", "selectionStatement", "iterationStatement", 
		"forCondition", "forDeclaration", "forExpression", "jumpStatement", "program", 
		"programDeclaration", "functionDefinition", "classDefinition", "classDeclaration"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'break'", "'continue'", "'else'", "'for'", "'if'", "'int'", "'string'", 
		"'return'", "'void'", "'while'", "'class'", "'new'", "'true'", "'false'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", 
		"'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", 
		"'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "':'", "';'", "','", "'='", 
		"'=='", "'!='", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Break", "Continue", "Else", "For", "If", "Int", "String", "Return", 
		"Void", "While", "Class", "New", "True", "False", "LeftParen", "RightParen", 
		"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
		"Greater", "GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", 
		"Minus", "MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", 
		"Caret", "Not", "Tilde", "Colon", "Semi", "Comma", "Assign", "Equal", 
		"NotEqual", "Dot", "Identifier", "Constant", "DigitSequence", "BooleanConstant", 
		"StringLiteral", "Whitespace", "Newline", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LMx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LMxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LMxParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(LMxParser.Constant, 0); }
		public TerminalNode StringLiteral() { return getToken(LMxParser.StringLiteral, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(Identifier);
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(Constant);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(StringLiteral);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				match(LeftParen);
				setState(88);
				expression();
				setState(89);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
	 
		public DeclarationSpecifierContext() { }
		public void copyFrom(DeclarationSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationSpecifier_arrayContext extends DeclarationSpecifierContext {
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public DeclarationSpecifier_arrayContext(DeclarationSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterDeclarationSpecifier_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitDeclarationSpecifier_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitDeclarationSpecifier_array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationSpecifier_typeContext extends DeclarationSpecifierContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public DeclarationSpecifier_typeContext(DeclarationSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterDeclarationSpecifier_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitDeclarationSpecifier_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitDeclarationSpecifier_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		return declarationSpecifier(0);
	}

	private DeclarationSpecifierContext declarationSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, _parentState);
		DeclarationSpecifierContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_declarationSpecifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DeclarationSpecifier_typeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(94);
			typeSpecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationSpecifier_arrayContext(new DeclarationSpecifierContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_declarationSpecifier);
					setState(96);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(97);
					match(LeftBracket);
					setState(98);
					match(RightBracket);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostfixExpression_incContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixExpression_incContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterPostfixExpression_inc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitPostfixExpression_inc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitPostfixExpression_inc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixExpression_funcContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public PostfixExpression_funcContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterPostfixExpression_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitPostfixExpression_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitPostfixExpression_func(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixExpression_classContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(LMxParser.Identifier, 0); }
		public PostfixExpression_classContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterPostfixExpression_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitPostfixExpression_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitPostfixExpression_class(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixExpression_primaryContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpression_primaryContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterPostfixExpression_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitPostfixExpression_primary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitPostfixExpression_primary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixExpression_decContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixExpression_decContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterPostfixExpression_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitPostfixExpression_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitPostfixExpression_dec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostfixExpression_arrayContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostfixExpression_arrayContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterPostfixExpression_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitPostfixExpression_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitPostfixExpression_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PostfixExpression_primaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(105);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpression_arrayContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(107);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(108);
						match(LeftBracket);
						setState(109);
						expression();
						setState(110);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpression_funcContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(112);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(113);
						match(LeftParen);
						setState(115);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
							{
							setState(114);
							argumentExpressionList(0);
							}
						}

						setState(117);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpression_classContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(118);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(119);
						match(Dot);
						setState(120);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpression_incContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(121);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(122);
						match(PlusPlus);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpression_decContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(123);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(124);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
	 
		public ArgumentExpressionListContext() { }
		public void copyFrom(ArgumentExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentExpressionList_singleContext extends ArgumentExpressionListContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentExpressionList_singleContext(ArgumentExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterArgumentExpressionList_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitArgumentExpressionList_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitArgumentExpressionList_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgumentExpressionList_multiContext extends ArgumentExpressionListContext {
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentExpressionList_multiContext(ArgumentExpressionListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterArgumentExpressionList_multi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitArgumentExpressionList_multi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitArgumentExpressionList_multi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ArgumentExpressionList_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(131);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionList_multiContext(new ArgumentExpressionListContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(133);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(134);
					match(Comma);
					setState(135);
					expression();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExpression_postfixContext extends UnaryExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpression_postfixContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterUnaryExpression_postfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitUnaryExpression_postfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitUnaryExpression_postfix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpression_prefix_decContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpression_prefix_decContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterUnaryExpression_prefix_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitUnaryExpression_prefix_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitUnaryExpression_prefix_dec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpression_prefix_incContext extends UnaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpression_prefix_incContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterUnaryExpression_prefix_inc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitUnaryExpression_prefix_inc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitUnaryExpression_prefix_inc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpression_prefixContext extends UnaryExpressionContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpression_prefixContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterUnaryExpression_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitUnaryExpression_prefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitUnaryExpression_prefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryExpression);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Identifier:
			case Constant:
			case StringLiteral:
				_localctx = new UnaryExpression_postfixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				postfixExpression(0);
				}
				break;
			case PlusPlus:
				_localctx = new UnaryExpression_prefix_incContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(PlusPlus);
				setState(143);
				unaryExpression();
				}
				break;
			case MinusMinus:
				_localctx = new UnaryExpression_prefix_decContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(MinusMinus);
				setState(145);
				unaryExpression();
				}
				break;
			case Plus:
			case Minus:
			case Not:
			case Tilde:
				_localctx = new UnaryExpression_prefixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				unaryOperator();
				setState(147);
				castExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Not) | (1L << Tilde))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(LMxParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_castExpression);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				unaryExpression();
				}
				break;
			case DigitSequence:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(DigitSequence);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicativeExpression_unaryContext extends MultiplicativeExpressionContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpression_unaryContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterMultiplicativeExpression_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitMultiplicativeExpression_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitMultiplicativeExpression_unary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpression_modContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpression_modContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterMultiplicativeExpression_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitMultiplicativeExpression_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitMultiplicativeExpression_mod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpression_divContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpression_divContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterMultiplicativeExpression_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitMultiplicativeExpression_div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitMultiplicativeExpression_div(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExpression_mulContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpression_mulContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterMultiplicativeExpression_mul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitMultiplicativeExpression_mul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitMultiplicativeExpression_mul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultiplicativeExpression_unaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(158);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpression_mulContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(160);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(161);
						match(Star);
						setState(162);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpression_divContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(163);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(164);
						match(Div);
						setState(165);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpression_modContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(166);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(167);
						match(Mod);
						setState(168);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditiveExpression_subContext extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpression_subContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterAdditiveExpression_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitAdditiveExpression_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitAdditiveExpression_sub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpression_addContext extends AdditiveExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpression_addContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterAdditiveExpression_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitAdditiveExpression_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitAdditiveExpression_add(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExpression_unaryContext extends AdditiveExpressionContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpression_unaryContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterAdditiveExpression_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitAdditiveExpression_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitAdditiveExpression_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveExpression_unaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(175);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpression_addContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(177);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(178);
						match(Plus);
						setState(179);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpression_subContext(new AdditiveExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(180);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(181);
						match(Minus);
						setState(182);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	 
		public ShiftExpressionContext() { }
		public void copyFrom(ShiftExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftExpression_shrContext extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpression_shrContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterShiftExpression_shr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitShiftExpression_shr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitShiftExpression_shr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftExpression_unaryContext extends ShiftExpressionContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpression_unaryContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterShiftExpression_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitShiftExpression_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitShiftExpression_unary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftExpression_shlContext extends ShiftExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpression_shlContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterShiftExpression_shl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitShiftExpression_shl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitShiftExpression_shl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ShiftExpression_unaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(189);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpression_shlContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(191);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(192);
						match(LeftShift);
						setState(193);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpression_shrContext(new ShiftExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(194);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(195);
						match(RightShift);
						setState(196);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalExpression_geContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpression_geContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterRelationalExpression_ge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitRelationalExpression_ge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitRelationalExpression_ge(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpression_unaryContext extends RelationalExpressionContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpression_unaryContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterRelationalExpression_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitRelationalExpression_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitRelationalExpression_unary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpression_geqContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpression_geqContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterRelationalExpression_geq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitRelationalExpression_geq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitRelationalExpression_geq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpression_leContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpression_leContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterRelationalExpression_le(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitRelationalExpression_le(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitRelationalExpression_le(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpression_leqContext extends RelationalExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpression_leqContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterRelationalExpression_leq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitRelationalExpression_leq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitRelationalExpression_leq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationalExpression_unaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(203);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpression_leContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(205);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(206);
						match(Less);
						setState(207);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpression_geContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(208);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(209);
						match(Greater);
						setState(210);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpression_leqContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						match(LessEqual);
						setState(213);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpression_geqContext(new RelationalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(214);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(215);
						match(GreaterEqual);
						setState(216);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualityExpression_unaryContext extends EqualityExpressionContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpression_unaryContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterEqualityExpression_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitEqualityExpression_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitEqualityExpression_unary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpression_equalContext extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpression_equalContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterEqualityExpression_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitEqualityExpression_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitEqualityExpression_equal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpression_inequalContext extends EqualityExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpression_inequalContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterEqualityExpression_inequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitEqualityExpression_inequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitEqualityExpression_inequal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqualityExpression_unaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(223);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpression_equalContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(225);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(226);
						match(Equal);
						setState(227);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpression_inequalContext(new EqualityExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(228);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(229);
						match(NotEqual);
						setState(230);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	 
		public AndExpressionContext() { }
		public void copyFrom(AndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExpression_unaryContext extends AndExpressionContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpression_unaryContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterAndExpression_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitAndExpression_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitAndExpression_unary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpression_binaryContext extends AndExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpression_binaryContext(AndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterAndExpression_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitAndExpression_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitAndExpression_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AndExpression_unaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(237);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpression_binaryContext(new AndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(239);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(240);
					match(And);
					setState(241);
					equalityExpression(0);
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	 
		public ExclusiveOrExpressionContext() { }
		public void copyFrom(ExclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExclusiveOrExpression_unaryContext extends ExclusiveOrExpressionContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpression_unaryContext(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterExclusiveOrExpression_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitExclusiveOrExpression_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitExclusiveOrExpression_unary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExclusiveOrExpression_binaryContext extends ExclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpression_binaryContext(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterExclusiveOrExpression_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitExclusiveOrExpression_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitExclusiveOrExpression_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExclusiveOrExpression_unaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(248);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpression_binaryContext(new ExclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(250);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(251);
					match(Caret);
					setState(252);
					andExpression(0);
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	 
		public InclusiveOrExpressionContext() { }
		public void copyFrom(InclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InclusiveOrExpression_binaryContext extends InclusiveOrExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpression_binaryContext(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterInclusiveOrExpression_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitInclusiveOrExpression_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitInclusiveOrExpression_binary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InclusiveOrExpression_unaryContext extends InclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpression_unaryContext(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterInclusiveOrExpression_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitInclusiveOrExpression_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitInclusiveOrExpression_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new InclusiveOrExpression_unaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(259);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpression_binaryContext(new InclusiveOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(261);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(262);
					match(Or);
					setState(263);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	 
		public LogicalAndExpressionContext() { }
		public void copyFrom(LogicalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalAndExpression_unaryContext extends LogicalAndExpressionContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpression_unaryContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterLogicalAndExpression_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitLogicalAndExpression_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitLogicalAndExpression_unary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalAndExpression_binaryContext extends LogicalAndExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpression_binaryContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterLogicalAndExpression_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitLogicalAndExpression_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitLogicalAndExpression_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalAndExpression_unaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(270);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpression_binaryContext(new LogicalAndExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(272);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(273);
					match(AndAnd);
					setState(274);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalOrExpression_binaryContext extends LogicalOrExpressionContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpression_binaryContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterLogicalOrExpression_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitLogicalOrExpression_binary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitLogicalOrExpression_binary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalOrExpression_unaryContext extends LogicalOrExpressionContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpression_unaryContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterLogicalOrExpression_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitLogicalOrExpression_unary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitLogicalOrExpression_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalOrExpression_unaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(281);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpression_binaryContext(new LogicalOrExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(283);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(284);
					match(OrOr);
					setState(285);
					logicalAndExpression(0);
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public NewDeclaratorContext newDeclarator() {
			return getRuleContext(NewDeclaratorContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(LMxParser.DigitSequence, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				newDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				logicalOrExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				unaryExpression();
				setState(294);
				match(Assign);
				setState(295);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaration_initContext extends DeclarationContext {
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public Declaration_initContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterDeclaration_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitDeclaration_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitDeclaration_init(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Declaration_noneContext extends DeclarationContext {
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public Declaration_noneContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterDeclaration_none(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitDeclaration_none(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitDeclaration_none(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaration);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Declaration_initContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				declarationSpecifier(0);
				setState(301);
				initDeclaratorList(0);
				setState(302);
				match(Semi);
				}
				break;
			case 2:
				_localctx = new Declaration_noneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				declarationSpecifier(0);
				setState(305);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
	 
		public InitDeclaratorListContext() { }
		public void copyFrom(InitDeclaratorListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitDeclaratorList_singleContext extends InitDeclaratorListContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorList_singleContext(InitDeclaratorListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterInitDeclaratorList_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitInitDeclaratorList_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitInitDeclaratorList_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitDeclaratorList_multiContext extends InitDeclaratorListContext {
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorList_multiContext(InitDeclaratorListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterInitDeclaratorList_multi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitInitDeclaratorList_multi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitInitDeclaratorList_multi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new InitDeclaratorList_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(310);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorList_multiContext(new InitDeclaratorListContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(312);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(313);
					match(Comma);
					setState(314);
					initDeclarator();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
	 
		public InitDeclaratorContext() { }
		public void copyFrom(InitDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitDeclarator_initContext extends InitDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitDeclarator_initContext(InitDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterInitDeclarator_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitInitDeclarator_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitInitDeclarator_init(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitDeclarator_noneContext extends InitDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public InitDeclarator_noneContext(InitDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterInitDeclarator_none(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitInitDeclarator_none(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitInitDeclarator_none(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_initDeclarator);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new InitDeclarator_noneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				directDeclarator(0);
				}
				break;
			case 2:
				_localctx = new InitDeclarator_initContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				directDeclarator(0);
				setState(322);
				match(Assign);
				setState(323);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeSpecifier);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case String:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << String) | (1L << Void))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				typedefName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewDeclaratorContext extends ParserRuleContext {
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public NewDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterNewDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitNewDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitNewDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewDeclaratorContext newDeclarator() throws RecognitionException {
		NewDeclaratorContext _localctx = new NewDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(New);
			setState(332);
			declarationSpecifier(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
	 
		public DirectDeclaratorContext() { }
		public void copyFrom(DirectDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DirectDeclarator_IdentifierContext extends DirectDeclaratorContext {
		public TerminalNode Identifier() { return getToken(LMxParser.Identifier, 0); }
		public DirectDeclarator_IdentifierContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterDirectDeclarator_Identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitDirectDeclarator_Identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitDirectDeclarator_Identifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectDeclarator_with_parameterListContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public DirectDeclarator_with_parameterListContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterDirectDeclarator_with_parameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitDirectDeclarator_with_parameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitDirectDeclarator_with_parameterList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectDeclarator_recycleContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public DirectDeclarator_recycleContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterDirectDeclarator_recycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitDirectDeclarator_recycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitDirectDeclarator_recycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				_localctx = new DirectDeclarator_IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(335);
				match(Identifier);
				}
				break;
			case LeftParen:
				{
				_localctx = new DirectDeclarator_recycleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(LeftParen);
				setState(337);
				directDeclarator(0);
				setState(338);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DirectDeclarator_with_parameterListContext(new DirectDeclaratorContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
					setState(342);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(343);
					match(LeftParen);
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << String) | (1L << Void) | (1L << Identifier))) != 0)) {
						{
						setState(344);
						parameterList(0);
						}
					}

					setState(347);
					match(RightParen);
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	 
		public ParameterListContext() { }
		public void copyFrom(ParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterDeclaration_multiContext extends ParameterListContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterDeclaration_multiContext(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterParameterDeclaration_multi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitParameterDeclaration_multi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitParameterDeclaration_multi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterDeclaration_singleContext extends ParameterListContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterDeclaration_singleContext(ParameterListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterParameterDeclaration_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitParameterDeclaration_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitParameterDeclaration_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ParameterDeclaration_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(354);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterDeclaration_multiContext(new ParameterListContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(356);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(357);
					match(Comma);
					setState(358);
					parameterDeclaration();
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			declarationSpecifier(0);
			setState(365);
			directDeclarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(LMxParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitTypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				compoundStatement();
				}
				break;
			case New:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Not:
			case Tilde:
			case Semi:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				expressionStatement();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				selectionStatement();
				}
				break;
			case For:
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				iterationStatement();
				}
				break;
			case Break:
			case Continue:
			case Return:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				jumpStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(LeftBrace);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Break) | (1L << Continue) | (1L << For) | (1L << If) | (1L << Int) | (1L << String) | (1L << Return) | (1L << Void) | (1L << While) | (1L << New) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Semi) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(377);
				blockItem();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_blockItem);
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
				{
				setState(389);
				expression();
				}
			}

			setState(392);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selectionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(If);
			setState(395);
			match(LeftParen);
			setState(396);
			expression();
			setState(397);
			match(RightParen);
			setState(398);
			statement();
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(399);
				match(Else);
				setState(400);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IterationStatement_whileContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(LMxParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IterationStatement_whileContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterIterationStatement_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitIterationStatement_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitIterationStatement_while(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IterationStatement_forContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(LMxParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IterationStatement_forContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterIterationStatement_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitIterationStatement_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitIterationStatement_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_iterationStatement);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				_localctx = new IterationStatement_whileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(While);
				setState(404);
				match(LeftParen);
				setState(405);
				expression();
				setState(406);
				match(RightParen);
				setState(407);
				statement();
				}
				break;
			case For:
				_localctx = new IterationStatement_forContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				match(For);
				setState(410);
				match(LeftParen);
				setState(411);
				forCondition();
				setState(412);
				match(RightParen);
				setState(413);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
	 
		public ForConditionContext() { }
		public void copyFrom(ForConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForCondition_initContext extends ForConditionContext {
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ForCondition_initContext(ForConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterForCondition_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitForCondition_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitForCondition_init(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForCondition_noneContext extends ForConditionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ForCondition_noneContext(ForConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterForCondition_none(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitForCondition_none(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitForCondition_none(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forCondition);
		int _la;
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new ForCondition_initContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				forDeclaration();
				setState(418);
				match(Semi);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
					{
					setState(419);
					forExpression();
					}
				}

				setState(422);
				match(Semi);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
					{
					setState(423);
					forExpression();
					}
				}

				}
				break;
			case 2:
				_localctx = new ForCondition_noneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
					{
					setState(426);
					expression();
					}
				}

				setState(429);
				match(Semi);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
					{
					setState(430);
					forExpression();
					}
				}

				setState(433);
				match(Semi);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
					{
					setState(434);
					forExpression();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	 
		public ForDeclarationContext() { }
		public void copyFrom(ForDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForDeclaration_noneContext extends ForDeclarationContext {
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public ForDeclaration_noneContext(ForDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterForDeclaration_none(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitForDeclaration_none(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitForDeclaration_none(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForDeclaration_initContext extends ForDeclarationContext {
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclaration_initContext(ForDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterForDeclaration_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitForDeclaration_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitForDeclaration_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forDeclaration);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				_localctx = new ForDeclaration_initContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				declarationSpecifier(0);
				setState(440);
				initDeclaratorList(0);
				}
				break;
			case 2:
				_localctx = new ForDeclaration_noneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				declarationSpecifier(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JumpStatement_returnContext extends JumpStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatement_returnContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterJumpStatement_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitJumpStatement_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitJumpStatement_return(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JumpStatement_continueContext extends JumpStatementContext {
		public JumpStatement_continueContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterJumpStatement_continue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitJumpStatement_continue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitJumpStatement_continue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JumpStatement_breakContext extends JumpStatementContext {
		public JumpStatement_breakContext(JumpStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterJumpStatement_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitJumpStatement_break(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitJumpStatement_break(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_jumpStatement);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Continue:
				_localctx = new JumpStatement_continueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(Continue);
				setState(448);
				match(Semi);
				}
				break;
			case Break:
				_localctx = new JumpStatement_breakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(Break);
				setState(450);
				match(Semi);
				}
				break;
			case Return:
				_localctx = new JumpStatement_returnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				match(Return);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << New) | (1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral))) != 0)) {
					{
					setState(452);
					expression();
					}
				}

				setState(455);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LMxParser.EOF, 0); }
		public List<ProgramDeclarationContext> programDeclaration() {
			return getRuleContexts(ProgramDeclarationContext.class);
		}
		public ProgramDeclarationContext programDeclaration(int i) {
			return getRuleContext(ProgramDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << String) | (1L << Void) | (1L << Class) | (1L << LeftParen) | (1L << Semi) | (1L << Identifier))) != 0)) {
				{
				{
				setState(458);
				programDeclaration();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ProgramDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterProgramDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitProgramDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitProgramDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramDeclarationContext programDeclaration() throws RecognitionException {
		ProgramDeclarationContext _localctx = new ProgramDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_programDeclaration);
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(467);
				classDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(468);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(469);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(472);
				declarationSpecifier(0);
				}
				break;
			}
			setState(475);
			directDeclarator(0);
			setState(476);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDefinitionContext extends ParserRuleContext {
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
	 
		public ClassDefinitionContext() { }
		public void copyFrom(ClassDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclaration_noneContext extends ClassDefinitionContext {
		public TerminalNode Identifier() { return getToken(LMxParser.Identifier, 0); }
		public ClassDeclaration_noneContext(ClassDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterClassDeclaration_none(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitClassDeclaration_none(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitClassDeclaration_none(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassDeclaration_declContext extends ClassDefinitionContext {
		public TerminalNode Identifier() { return getToken(LMxParser.Identifier, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ClassDeclaration_declContext(ClassDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterClassDeclaration_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitClassDeclaration_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitClassDeclaration_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_classDefinition);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				_localctx = new ClassDeclaration_declContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(Class);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(479);
					match(Identifier);
					}
				}

				setState(482);
				match(LeftBrace);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << String) | (1L << Void) | (1L << LeftParen) | (1L << Identifier))) != 0)) {
					{
					{
					setState(483);
					classDeclaration();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(489);
				match(RightBrace);
				}
				break;
			case 2:
				_localctx = new ClassDeclaration_noneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(Class);
				setState(491);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classDeclaration);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
				functionDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return declarationSpecifier_sempred((DeclarationSpecifierContext)_localctx, predIndex);
		case 2:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 3:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 7:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 8:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 9:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 10:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 11:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 12:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 13:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 14:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 15:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 16:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 19:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 23:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 24:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declarationSpecifier_sempred(DeclarationSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u01f5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2^\n\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3f\n\3\f"+
		"\3\16\3i\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4v\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0080\n\4\f\4\16\4\u0083\13\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0098\n\6\3\7\3\7\3\b\3\b\5\b\u009e\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ba\n\n\f\n\16\n\u00bd\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c8\n\13\f\13\16\13"+
		"\u00cb\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00dc\n\f\f\f\16\f\u00df\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00ea\n\r\f\r\16\r\u00ed\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u00f5\n\16\f\16\16\16\u00f8\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u0100\n\17\f\17\16\17\u0103\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u010b\n\20\f\20\16\20\u010e\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u0116\n\21\f\21\16\21\u0119\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22"+
		"\u0121\n\22\f\22\16\22\u0124\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u012d\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0136\n\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\7\25\u013e\n\25\f\25\16\25\u0141\13\25\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0148\n\26\3\27\3\27\5\27\u014c\n\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0157\n\31\3\31\3\31\3\31"+
		"\5\31\u015c\n\31\3\31\7\31\u015f\n\31\f\31\16\31\u0162\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\7\32\u016a\n\32\f\32\16\32\u016d\13\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0179\n\35\3\36\3\36\7\36"+
		"\u017d\n\36\f\36\16\36\u0180\13\36\3\36\3\36\3\37\3\37\5\37\u0186\n\37"+
		"\3 \5 \u0189\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u0194\n!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01a2\n\"\3#\3#\3#\5#\u01a7\n#\3"+
		"#\3#\5#\u01ab\n#\3#\5#\u01ae\n#\3#\3#\5#\u01b2\n#\3#\3#\5#\u01b6\n#\5"+
		"#\u01b8\n#\3$\3$\3$\3$\5$\u01be\n$\3%\3%\3&\3&\3&\3&\3&\3&\5&\u01c8\n"+
		"&\3&\5&\u01cb\n&\3\'\7\'\u01ce\n\'\f\'\16\'\u01d1\13\'\3\'\3\'\3(\3(\3"+
		"(\3(\5(\u01d9\n(\3)\5)\u01dc\n)\3)\3)\3)\3*\3*\5*\u01e3\n*\3*\3*\7*\u01e7"+
		"\n*\f*\16*\u01ea\13*\3*\3*\3*\5*\u01ef\n*\3+\3+\5+\u01f3\n+\3+\2\22\4"+
		"\6\b\20\22\24\26\30\32\34\36 \"(\60\62,\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\4\5\2\35\35\37\37)*\4"+
		"\2\b\t\13\13\2\u0212\2]\3\2\2\2\4_\3\2\2\2\6j\3\2\2\2\b\u0084\3\2\2\2"+
		"\n\u0097\3\2\2\2\f\u0099\3\2\2\2\16\u009d\3\2\2\2\20\u009f\3\2\2\2\22"+
		"\u00b0\3\2\2\2\24\u00be\3\2\2\2\26\u00cc\3\2\2\2\30\u00e0\3\2\2\2\32\u00ee"+
		"\3\2\2\2\34\u00f9\3\2\2\2\36\u0104\3\2\2\2 \u010f\3\2\2\2\"\u011a\3\2"+
		"\2\2$\u012c\3\2\2\2&\u0135\3\2\2\2(\u0137\3\2\2\2*\u0147\3\2\2\2,\u014b"+
		"\3\2\2\2.\u014d\3\2\2\2\60\u0156\3\2\2\2\62\u0163\3\2\2\2\64\u016e\3\2"+
		"\2\2\66\u0171\3\2\2\28\u0178\3\2\2\2:\u017a\3\2\2\2<\u0185\3\2\2\2>\u0188"+
		"\3\2\2\2@\u018c\3\2\2\2B\u01a1\3\2\2\2D\u01b7\3\2\2\2F\u01bd\3\2\2\2H"+
		"\u01bf\3\2\2\2J\u01ca\3\2\2\2L\u01cf\3\2\2\2N\u01d8\3\2\2\2P\u01db\3\2"+
		"\2\2R\u01ee\3\2\2\2T\u01f2\3\2\2\2V^\7\62\2\2W^\7\63\2\2X^\7\66\2\2YZ"+
		"\7\21\2\2Z[\5$\23\2[\\\7\22\2\2\\^\3\2\2\2]V\3\2\2\2]W\3\2\2\2]X\3\2\2"+
		"\2]Y\3\2\2\2^\3\3\2\2\2_`\b\3\1\2`a\5,\27\2ag\3\2\2\2bc\f\3\2\2cd\7\23"+
		"\2\2df\7\24\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\5\3\2\2\2ig\3"+
		"\2\2\2jk\b\4\1\2kl\5\2\2\2l\u0081\3\2\2\2mn\f\7\2\2no\7\23\2\2op\5$\23"+
		"\2pq\7\24\2\2q\u0080\3\2\2\2rs\f\6\2\2su\7\21\2\2tv\5\b\5\2ut\3\2\2\2"+
		"uv\3\2\2\2vw\3\2\2\2w\u0080\7\22\2\2xy\f\5\2\2yz\7\61\2\2z\u0080\7\62"+
		"\2\2{|\f\4\2\2|\u0080\7\36\2\2}~\f\3\2\2~\u0080\7 \2\2\177m\3\2\2\2\177"+
		"r\3\2\2\2\177x\3\2\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\7\3\2\2\2\u0083\u0081\3\2\2\2\u0084"+
		"\u0085\b\5\1\2\u0085\u0086\5$\23\2\u0086\u008c\3\2\2\2\u0087\u0088\f\3"+
		"\2\2\u0088\u0089\7-\2\2\u0089\u008b\5$\23\2\u008a\u0087\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\t\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008f\u0098\5\6\4\2\u0090\u0091\7\36\2\2\u0091\u0098"+
		"\5\n\6\2\u0092\u0093\7 \2\2\u0093\u0098\5\n\6\2\u0094\u0095\5\f\7\2\u0095"+
		"\u0096\5\16\b\2\u0096\u0098\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0090\3"+
		"\2\2\2\u0097\u0092\3\2\2\2\u0097\u0094\3\2\2\2\u0098\13\3\2\2\2\u0099"+
		"\u009a\t\2\2\2\u009a\r\3\2\2\2\u009b\u009e\5\n\6\2\u009c\u009e\7\64\2"+
		"\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\17\3\2\2\2\u009f\u00a0"+
		"\b\t\1\2\u00a0\u00a1\5\16\b\2\u00a1\u00ad\3\2\2\2\u00a2\u00a3\f\5\2\2"+
		"\u00a3\u00a4\7!\2\2\u00a4\u00ac\5\16\b\2\u00a5\u00a6\f\4\2\2\u00a6\u00a7"+
		"\7\"\2\2\u00a7\u00ac\5\16\b\2\u00a8\u00a9\f\3\2\2\u00a9\u00aa\7#\2\2\u00aa"+
		"\u00ac\5\16\b\2\u00ab\u00a2\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a8\3"+
		"\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\21\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\b\n\1\2\u00b1\u00b2\5\20\t"+
		"\2\u00b2\u00bb\3\2\2\2\u00b3\u00b4\f\4\2\2\u00b4\u00b5\7\35\2\2\u00b5"+
		"\u00ba\5\20\t\2\u00b6\u00b7\f\3\2\2\u00b7\u00b8\7\37\2\2\u00b8\u00ba\5"+
		"\20\t\2\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\23\3\2\2\2\u00bd\u00bb\3\2\2"+
		"\2\u00be\u00bf\b\13\1\2\u00bf\u00c0\5\22\n\2\u00c0\u00c9\3\2\2\2\u00c1"+
		"\u00c2\f\4\2\2\u00c2\u00c3\7\33\2\2\u00c3\u00c8\5\22\n\2\u00c4\u00c5\f"+
		"\3\2\2\u00c5\u00c6\7\34\2\2\u00c6\u00c8\5\22\n\2\u00c7\u00c1\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\25\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\b\f\1\2\u00cd\u00ce"+
		"\5\24\13\2\u00ce\u00dd\3\2\2\2\u00cf\u00d0\f\6\2\2\u00d0\u00d1\7\27\2"+
		"\2\u00d1\u00dc\5\24\13\2\u00d2\u00d3\f\5\2\2\u00d3\u00d4\7\31\2\2\u00d4"+
		"\u00dc\5\24\13\2\u00d5\u00d6\f\4\2\2\u00d6\u00d7\7\30\2\2\u00d7\u00dc"+
		"\5\24\13\2\u00d8\u00d9\f\3\2\2\u00d9\u00da\7\32\2\2\u00da\u00dc\5\24\13"+
		"\2\u00db\u00cf\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d5\3\2\2\2\u00db\u00d8"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\27\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\b\r\1\2\u00e1\u00e2\5\26\f"+
		"\2\u00e2\u00eb\3\2\2\2\u00e3\u00e4\f\4\2\2\u00e4\u00e5\7/\2\2\u00e5\u00ea"+
		"\5\26\f\2\u00e6\u00e7\f\3\2\2\u00e7\u00e8\7\60\2\2\u00e8\u00ea\5\26\f"+
		"\2\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\31\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00ef\b\16\1\2\u00ef\u00f0\5\30\r\2\u00f0\u00f6\3\2\2\2\u00f1\u00f2\f"+
		"\3\2\2\u00f2\u00f3\7$\2\2\u00f3\u00f5\5\30\r\2\u00f4\u00f1\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\33\3\2\2"+
		"\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\b\17\1\2\u00fa\u00fb\5\32\16\2\u00fb"+
		"\u0101\3\2\2\2\u00fc\u00fd\f\3\2\2\u00fd\u00fe\7(\2\2\u00fe\u0100\5\32"+
		"\16\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\35\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\b\20\1"+
		"\2\u0105\u0106\5\34\17\2\u0106\u010c\3\2\2\2\u0107\u0108\f\3\2\2\u0108"+
		"\u0109\7%\2\2\u0109\u010b\5\34\17\2\u010a\u0107\3\2\2\2\u010b\u010e\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\37\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0110\b\21\1\2\u0110\u0111\5\36\20\2\u0111\u0117"+
		"\3\2\2\2\u0112\u0113\f\3\2\2\u0113\u0114\7&\2\2\u0114\u0116\5\36\20\2"+
		"\u0115\u0112\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118!\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\b\22\1\2\u011b"+
		"\u011c\5 \21\2\u011c\u0122\3\2\2\2\u011d\u011e\f\3\2\2\u011e\u011f\7\'"+
		"\2\2\u011f\u0121\5 \21\2\u0120\u011d\3\2\2\2\u0121\u0124\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123#\3\2\2\2\u0124\u0122\3\2\2\2"+
		"\u0125\u012d\5.\30\2\u0126\u012d\5\"\22\2\u0127\u0128\5\n\6\2\u0128\u0129"+
		"\7.\2\2\u0129\u012a\5$\23\2\u012a\u012d\3\2\2\2\u012b\u012d\7\64\2\2\u012c"+
		"\u0125\3\2\2\2\u012c\u0126\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u012b\3\2"+
		"\2\2\u012d%\3\2\2\2\u012e\u012f\5\4\3\2\u012f\u0130\5(\25\2\u0130\u0131"+
		"\7,\2\2\u0131\u0136\3\2\2\2\u0132\u0133\5\4\3\2\u0133\u0134\7,\2\2\u0134"+
		"\u0136\3\2\2\2\u0135\u012e\3\2\2\2\u0135\u0132\3\2\2\2\u0136\'\3\2\2\2"+
		"\u0137\u0138\b\25\1\2\u0138\u0139\5*\26\2\u0139\u013f\3\2\2\2\u013a\u013b"+
		"\f\3\2\2\u013b\u013c\7-\2\2\u013c\u013e\5*\26\2\u013d\u013a\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140)\3\2\2\2"+
		"\u0141\u013f\3\2\2\2\u0142\u0148\5\60\31\2\u0143\u0144\5\60\31\2\u0144"+
		"\u0145\7.\2\2\u0145\u0146\5$\23\2\u0146\u0148\3\2\2\2\u0147\u0142\3\2"+
		"\2\2\u0147\u0143\3\2\2\2\u0148+\3\2\2\2\u0149\u014c\t\3\2\2\u014a\u014c"+
		"\5\66\34\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c-\3\2\2\2\u014d"+
		"\u014e\7\16\2\2\u014e\u014f\5\4\3\2\u014f/\3\2\2\2\u0150\u0151\b\31\1"+
		"\2\u0151\u0157\7\62\2\2\u0152\u0153\7\21\2\2\u0153\u0154\5\60\31\2\u0154"+
		"\u0155\7\22\2\2\u0155\u0157\3\2\2\2\u0156\u0150\3\2\2\2\u0156\u0152\3"+
		"\2\2\2\u0157\u0160\3\2\2\2\u0158\u0159\f\3\2\2\u0159\u015b\7\21\2\2\u015a"+
		"\u015c\5\62\32\2\u015b\u015a\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3"+
		"\2\2\2\u015d\u015f\7\22\2\2\u015e\u0158\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\61\3\2\2\2\u0162\u0160\3\2\2"+
		"\2\u0163\u0164\b\32\1\2\u0164\u0165\5\64\33\2\u0165\u016b\3\2\2\2\u0166"+
		"\u0167\f\3\2\2\u0167\u0168\7-\2\2\u0168\u016a\5\64\33\2\u0169\u0166\3"+
		"\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\63\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\5\4\3\2\u016f\u0170\5\60\31"+
		"\2\u0170\65\3\2\2\2\u0171\u0172\7\62\2\2\u0172\67\3\2\2\2\u0173\u0179"+
		"\5:\36\2\u0174\u0179\5> \2\u0175\u0179\5@!\2\u0176\u0179\5B\"\2\u0177"+
		"\u0179\5J&\2\u0178\u0173\3\2\2\2\u0178\u0174\3\2\2\2\u0178\u0175\3\2\2"+
		"\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u01799\3\2\2\2\u017a\u017e"+
		"\7\25\2\2\u017b\u017d\5<\37\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2"+
		"\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0181\u0182\7\26\2\2\u0182;\3\2\2\2\u0183\u0186\58\35\2\u0184"+
		"\u0186\5&\24\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186=\3\2\2\2"+
		"\u0187\u0189\5$\23\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018b\7,\2\2\u018b?\3\2\2\2\u018c\u018d\7\7\2\2\u018d\u018e"+
		"\7\21\2\2\u018e\u018f\5$\23\2\u018f\u0190\7\22\2\2\u0190\u0193\58\35\2"+
		"\u0191\u0192\7\5\2\2\u0192\u0194\58\35\2\u0193\u0191\3\2\2\2\u0193\u0194"+
		"\3\2\2\2\u0194A\3\2\2\2\u0195\u0196\7\f\2\2\u0196\u0197\7\21\2\2\u0197"+
		"\u0198\5$\23\2\u0198\u0199\7\22\2\2\u0199\u019a\58\35\2\u019a\u01a2\3"+
		"\2\2\2\u019b\u019c\7\6\2\2\u019c\u019d\7\21\2\2\u019d\u019e\5D#\2\u019e"+
		"\u019f\7\22\2\2\u019f\u01a0\58\35\2\u01a0\u01a2\3\2\2\2\u01a1\u0195\3"+
		"\2\2\2\u01a1\u019b\3\2\2\2\u01a2C\3\2\2\2\u01a3\u01a4\5F$\2\u01a4\u01a6"+
		"\7,\2\2\u01a5\u01a7\5H%\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01aa\7,\2\2\u01a9\u01ab\5H%\2\u01aa\u01a9\3\2\2"+
		"\2\u01aa\u01ab\3\2\2\2\u01ab\u01b8\3\2\2\2\u01ac\u01ae\5$\23\2\u01ad\u01ac"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\7,\2\2\u01b0"+
		"\u01b2\5H%\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2"+
		"\2\u01b3\u01b5\7,\2\2\u01b4\u01b6\5H%\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01a3\3\2\2\2\u01b7\u01ad\3\2\2\2\u01b8"+
		"E\3\2\2\2\u01b9\u01ba\5\4\3\2\u01ba\u01bb\5(\25\2\u01bb\u01be\3\2\2\2"+
		"\u01bc\u01be\5\4\3\2\u01bd\u01b9\3\2\2\2\u01bd\u01bc\3\2\2\2\u01beG\3"+
		"\2\2\2\u01bf\u01c0\5$\23\2\u01c0I\3\2\2\2\u01c1\u01c2\7\4\2\2\u01c2\u01cb"+
		"\7,\2\2\u01c3\u01c4\7\3\2\2\u01c4\u01cb\7,\2\2\u01c5\u01c7\7\n\2\2\u01c6"+
		"\u01c8\5$\23\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01cb\7,\2\2\u01ca\u01c1\3\2\2\2\u01ca\u01c3\3\2\2\2\u01ca"+
		"\u01c5\3\2\2\2\u01cbK\3\2\2\2\u01cc\u01ce\5N(\2\u01cd\u01cc\3\2\2\2\u01ce"+
		"\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d3\7\2\2\3\u01d3M\3\2\2\2\u01d4\u01d9"+
		"\5P)\2\u01d5\u01d9\5R*\2\u01d6\u01d9\5&\24\2\u01d7\u01d9\7,\2\2\u01d8"+
		"\u01d4\3\2\2\2\u01d8\u01d5\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d7\3\2"+
		"\2\2\u01d9O\3\2\2\2\u01da\u01dc\5\4\3\2\u01db\u01da\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\5\60\31\2\u01de\u01df\5:\36\2"+
		"\u01dfQ\3\2\2\2\u01e0\u01e2\7\r\2\2\u01e1\u01e3\7\62\2\2\u01e2\u01e1\3"+
		"\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e8\7\25\2\2\u01e5"+
		"\u01e7\5T+\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2"+
		"\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ef"+
		"\7\26\2\2\u01ec\u01ed\7\r\2\2\u01ed\u01ef\7\62\2\2\u01ee\u01e0\3\2\2\2"+
		"\u01ee\u01ec\3\2\2\2\u01efS\3\2\2\2\u01f0\u01f3\5&\24\2\u01f1\u01f3\5"+
		"P)\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3U\3\2\2\28]gu\177\u0081"+
		"\u008c\u0097\u009d\u00ab\u00ad\u00b9\u00bb\u00c7\u00c9\u00db\u00dd\u00e9"+
		"\u00eb\u00f6\u0101\u010c\u0117\u0122\u012c\u0135\u013f\u0147\u014b\u0156"+
		"\u015b\u0160\u016b\u0178\u017e\u0185\u0188\u0193\u01a1\u01a6\u01aa\u01ad"+
		"\u01b1\u01b5\u01b7\u01bd\u01c7\u01ca\u01cf\u01d8\u01db\u01e2\u01e8\u01ee"+
		"\u01f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}