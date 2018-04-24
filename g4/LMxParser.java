// Generated from LMx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

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
		Newline=54, BlockComment=55, LineComment=56, NEW=57;
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
		RULE_statement = 27, RULE_compoundStatement = 28, RULE_blockItemList = 29, 
		RULE_blockItem = 30, RULE_expressionStatement = 31, RULE_selectionStatement = 32, 
		RULE_iterationStatement = 33, RULE_forCondition = 34, RULE_forDeclaration = 35, 
		RULE_forExpression = 36, RULE_jumpStatement = 37, RULE_compilationUnit = 38, 
		RULE_translationUnit = 39, RULE_externalDeclaration = 40, RULE_functionDefinition = 41, 
		RULE_classDefinition = 42, RULE_classDeclarationList = 43, RULE_classDeclaration = 44;
	public static final String[] ruleNames = {
		"primaryExpression", "declarationSpecifier", "postfixExpression", "argumentExpressionList", 
		"unaryExpression", "unaryOperator", "castExpression", "multiplicativeExpression", 
		"additiveExpression", "shiftExpression", "relationalExpression", "equalityExpression", 
		"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
		"logicalOrExpression", "expression", "declaration", "initDeclaratorList", 
		"initDeclarator", "typeSpecifier", "newDeclarator", "directDeclarator", 
		"parameterList", "parameterDeclaration", "typedefName", "statement", "compoundStatement", 
		"blockItemList", "blockItem", "expressionStatement", "selectionStatement", 
		"iterationStatement", "forCondition", "forDeclaration", "forExpression", 
		"jumpStatement", "compilationUnit", "translationUnit", "externalDeclaration", 
		"functionDefinition", "classDefinition", "classDeclarationList", "classDeclaration"
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
		"StringLiteral", "Whitespace", "Newline", "BlockComment", "LineComment", 
		"NEW"
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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(Identifier);
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(Constant);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(StringLiteral);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(LeftParen);
				setState(94);
				expression();
				setState(95);
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
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitDeclarationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
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
			setState(100);
			typeSpecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationSpecifier);
					setState(102);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(103);
					match(LeftBracket);
					setState(104);
					match(RightBracket);
					}
					} 
				}
				setState(109);
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
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(LMxParser.Identifier, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitPostfixExpression(this);
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
			setState(111);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(113);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(114);
						match(LeftBracket);
						setState(115);
						expression();
						setState(116);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(118);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(119);
						match(LeftParen);
						setState(121);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << And) | (1L << Or) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral) | (1L << NEW))) != 0)) {
							{
							setState(120);
							argumentExpressionList(0);
							}
						}

						setState(123);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(124);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(125);
						match(Dot);
						setState(126);
						match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(127);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(128);
						match(PlusPlus);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(129);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(130);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(135);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
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
			setState(137);
			expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(139);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(140);
					match(Comma);
					setState(141);
					expression();
					}
					} 
				}
				setState(146);
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
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_unaryExpression);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				postfixExpression(0);
				}
				break;
			case PlusPlus:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(PlusPlus);
				setState(149);
				unaryExpression();
				}
				break;
			case MinusMinus:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(MinusMinus);
				setState(151);
				unaryExpression();
				}
				break;
			case Plus:
			case Minus:
			case And:
			case Or:
			case Not:
			case Tilde:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				unaryOperator();
				setState(153);
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
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << And) | (1L << Or) | (1L << Not) | (1L << Tilde))) != 0)) ) {
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case And:
			case Or:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				unaryExpression();
				}
				break;
			case DigitSequence:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
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
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
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
			setState(164);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(166);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(167);
						match(Star);
						setState(168);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(169);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(170);
						match(Div);
						setState(171);
						castExpression();
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(172);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(173);
						match(Mod);
						setState(174);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(179);
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
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitAdditiveExpression(this);
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
			setState(181);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(183);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(184);
						match(Plus);
						setState(185);
						multiplicativeExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(186);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(187);
						match(Minus);
						setState(188);
						multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(193);
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
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitShiftExpression(this);
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
			setState(195);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(197);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(198);
						match(LeftShift);
						setState(199);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(200);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(201);
						match(RightShift);
						setState(202);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(207);
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
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitRelationalExpression(this);
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
			setState(209);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(211);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(212);
						match(Less);
						setState(213);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(214);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(215);
						match(Greater);
						setState(216);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(217);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(218);
						match(LessEqual);
						setState(219);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(220);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(221);
						match(GreaterEqual);
						setState(222);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(227);
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
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitEqualityExpression(this);
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
			setState(229);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(231);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(232);
						match(Equal);
						setState(233);
						relationalExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(234);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(235);
						match(NotEqual);
						setState(236);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(241);
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
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitAndExpression(this);
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
			setState(243);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(245);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(246);
					match(And);
					setState(247);
					equalityExpression(0);
					}
					} 
				}
				setState(252);
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
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
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
			setState(254);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(256);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(257);
					match(Caret);
					setState(258);
					andExpression(0);
					}
					} 
				}
				setState(263);
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
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
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
			setState(265);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(267);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(268);
					match(Or);
					setState(269);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(274);
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
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
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
			setState(276);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(278);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(279);
					match(AndAnd);
					setState(280);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(285);
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
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
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
			setState(287);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(289);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(290);
					match(OrOr);
					setState(291);
					logicalAndExpression(0);
					}
					} 
				}
				setState(296);
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
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				newDeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				logicalOrExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				unaryExpression();
				setState(300);
				match(Assign);
				setState(301);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
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
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaration);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				declarationSpecifier(0);
				setState(307);
				initDeclaratorList(0);
				setState(308);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				declarationSpecifier(0);
				setState(311);
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
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
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
			setState(316);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(318);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(319);
					match(Comma);
					setState(320);
					initDeclarator();
					}
					} 
				}
				setState(325);
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
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_initDeclarator);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				directDeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				directDeclarator(0);
				setState(328);
				match(Assign);
				setState(329);
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
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case String:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
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
				setState(334);
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
		public TerminalNode NEW() { return getToken(LMxParser.NEW, 0); }
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
			setState(337);
			match(NEW);
			setState(338);
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
		public TerminalNode Identifier() { return getToken(LMxParser.Identifier, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitDirectDeclarator(this);
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
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(341);
				match(Identifier);
				}
				break;
			case LeftParen:
				{
				setState(342);
				match(LeftParen);
				setState(343);
				directDeclarator(0);
				setState(344);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
					setState(348);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(349);
					match(LeftParen);
					setState(351);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << String) | (1L << Void) | (1L << Identifier))) != 0)) {
						{
						setState(350);
						parameterList(0);
						}
					}

					setState(353);
					match(RightParen);
					}
					} 
				}
				setState(358);
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
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitParameterList(this);
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
			setState(360);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(362);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(363);
					match(Comma);
					setState(364);
					parameterDeclaration();
					}
					} 
				}
				setState(369);
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
			setState(370);
			declarationSpecifier(0);
			setState(371);
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
			setState(373);
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
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				compoundStatement();
				}
				break;
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case And:
			case Or:
			case Not:
			case Tilde:
			case Semi:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				expressionStatement();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				selectionStatement();
				}
				break;
			case For:
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				iterationStatement();
				}
				break;
			case Break:
			case Continue:
			case Return:
				enterOuterAlt(_localctx, 5);
				{
				setState(379);
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
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
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
			setState(382);
			match(LeftBrace);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Break) | (1L << Continue) | (1L << For) | (1L << If) | (1L << Int) | (1L << String) | (1L << Return) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << And) | (1L << Or) | (1L << Not) | (1L << Tilde) | (1L << Semi) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral) | (1L << NEW))) != 0)) {
				{
				setState(383);
				blockItemList(0);
				}
			}

			setState(386);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitBlockItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(389);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(391);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(392);
					blockItem();
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		enterRule(_localctx, 60, RULE_blockItem);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
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
		enterRule(_localctx, 62, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << And) | (1L << Or) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral) | (1L << NEW))) != 0)) {
				{
				setState(402);
				expression();
				}
			}

			setState(405);
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
		enterRule(_localctx, 64, RULE_selectionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(If);
			setState(408);
			match(LeftParen);
			setState(409);
			expression();
			setState(410);
			match(RightParen);
			setState(411);
			statement();
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(412);
				match(Else);
				setState(413);
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
		public TerminalNode While() { return getToken(LMxParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode For() { return getToken(LMxParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_iterationStatement);
		try {
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				match(While);
				setState(417);
				match(LeftParen);
				setState(418);
				expression();
				setState(419);
				match(RightParen);
				setState(420);
				statement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(For);
				setState(423);
				match(LeftParen);
				setState(424);
				forCondition();
				setState(425);
				match(RightParen);
				setState(426);
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
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forCondition);
		int _la;
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				forDeclaration();
				setState(431);
				match(Semi);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << And) | (1L << Or) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral) | (1L << NEW))) != 0)) {
					{
					setState(432);
					forExpression();
					}
				}

				setState(435);
				match(Semi);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << And) | (1L << Or) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral) | (1L << NEW))) != 0)) {
					{
					setState(436);
					forExpression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << And) | (1L << Or) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral) | (1L << NEW))) != 0)) {
					{
					setState(439);
					expression();
					}
				}

				setState(442);
				match(Semi);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << And) | (1L << Or) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral) | (1L << NEW))) != 0)) {
					{
					setState(443);
					forExpression();
					}
				}

				setState(446);
				match(Semi);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << And) | (1L << Or) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral) | (1L << NEW))) != 0)) {
					{
					setState(447);
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
		public DeclarationSpecifierContext declarationSpecifier() {
			return getRuleContext(DeclarationSpecifierContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forDeclaration);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				declarationSpecifier(0);
				setState(453);
				initDeclaratorList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
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
		enterRule(_localctx, 72, RULE_forExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_jumpStatement);
		int _la;
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Continue:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(Continue);
				setState(461);
				match(Semi);
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(Break);
				setState(463);
				match(Semi);
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(464);
				match(Return);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LeftParen) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << And) | (1L << Or) | (1L << Not) | (1L << Tilde) | (1L << Identifier) | (1L << Constant) | (1L << DigitSequence) | (1L << StringLiteral) | (1L << NEW))) != 0)) {
					{
					setState(465);
					expression();
					}
				}

				setState(468);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LMxParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << String) | (1L << Void) | (1L << Class) | (1L << LeftParen) | (1L << Semi) | (1L << Identifier))) != 0)) {
				{
				setState(471);
				translationUnit(0);
				}
			}

			setState(474);
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(477);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(479);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(480);
					externalDeclaration();
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ClassDefinitionContext classDefinition() {
			return getRuleContext(ClassDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_externalDeclaration);
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				classDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
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
		enterRule(_localctx, 82, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(492);
				declarationSpecifier(0);
				}
				break;
			}
			setState(495);
			directDeclarator(0);
			setState(496);
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
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(LMxParser.Identifier, 0); }
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_classDefinition);
		int _la;
		try {
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(Class);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(499);
					match(Identifier);
					}
				}

				setState(502);
				match(LeftBrace);
				setState(503);
				classDeclarationList(0);
				setState(504);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(Class);
				setState(507);
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

	public static class ClassDeclarationListContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDeclarationListContext classDeclarationList() {
			return getRuleContext(ClassDeclarationListContext.class,0);
		}
		public ClassDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).enterClassDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LMxListener ) ((LMxListener)listener).exitClassDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LMxVisitor ) return ((LMxVisitor<? extends T>)visitor).visitClassDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationListContext classDeclarationList() throws RecognitionException {
		return classDeclarationList(0);
	}

	private ClassDeclarationListContext classDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ClassDeclarationListContext _localctx = new ClassDeclarationListContext(_ctx, _parentState);
		ClassDeclarationListContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_classDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(511);
			classDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ClassDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_classDeclarationList);
					setState(513);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(514);
					classDeclaration();
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
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
		enterRule(_localctx, 88, RULE_classDeclaration);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
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
		case 29:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 39:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 43:
			return classDeclarationList_sempred((ClassDeclarationListContext)_localctx, predIndex);
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
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean classDeclarationList_sempred(ClassDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u020f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2d\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4|\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0086\n\4\f\4\16\4"+
		"\u0089\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0091\n\5\f\5\16\5\u0094\13\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\7\3\7\3\b\3\b\5\b\u00a4"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b2\n\t\f\t"+
		"\16\t\u00b5\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c0\n\n\f\n"+
		"\16\n\u00c3\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ce"+
		"\n\13\f\13\16\13\u00d1\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\7\f\u00e2\n\f\f\f\16\f\u00e5\13\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00f0\n\r\f\r\16\r\u00f3\13\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u00fb\n\16\f\16\16\16\u00fe\13\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u0106\n\17\f\17\16\17\u0109\13\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\7\20\u0111\n\20\f\20\16\20\u0114\13\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\7\21\u011c\n\21\f\21\16\21\u011f\13\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u0127\n\22\f\22\16\22\u012a\13\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u0133\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u013c\n\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0144\n\25\f\25\16"+
		"\25\u0147\13\25\3\26\3\26\3\26\3\26\3\26\5\26\u014e\n\26\3\27\3\27\5\27"+
		"\u0152\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u015d\n"+
		"\31\3\31\3\31\3\31\5\31\u0162\n\31\3\31\7\31\u0165\n\31\f\31\16\31\u0168"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0170\n\32\f\32\16\32\u0173"+
		"\13\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u017f\n"+
		"\35\3\36\3\36\5\36\u0183\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u018c\n\37\f\37\16\37\u018f\13\37\3 \3 \5 \u0193\n \3!\5!\u0196\n!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01a1\n\"\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\5#\u01af\n#\3$\3$\3$\5$\u01b4\n$\3$\3$\5$\u01b8\n$\3$\5"+
		"$\u01bb\n$\3$\3$\5$\u01bf\n$\3$\3$\5$\u01c3\n$\5$\u01c5\n$\3%\3%\3%\3"+
		"%\5%\u01cb\n%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01d5\n\'\3\'\5\'\u01d8"+
		"\n\'\3(\5(\u01db\n(\3(\3(\3)\3)\3)\3)\3)\7)\u01e4\n)\f)\16)\u01e7\13)"+
		"\3*\3*\3*\3*\5*\u01ed\n*\3+\5+\u01f0\n+\3+\3+\3+\3,\3,\5,\u01f7\n,\3,"+
		"\3,\3,\3,\3,\3,\5,\u01ff\n,\3-\3-\3-\3-\3-\7-\u0206\n-\f-\16-\u0209\13"+
		"-\3.\3.\5.\u020d\n.\3.\2\25\4\6\b\20\22\24\26\30\32\34\36 \"(\60\62<P"+
		"X/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FHJLNPRTVXZ\2\4\6\2\35\35\37\37$%)*\4\2\b\t\13\13\2\u022b\2c\3\2\2\2\4"+
		"e\3\2\2\2\6p\3\2\2\2\b\u008a\3\2\2\2\n\u009d\3\2\2\2\f\u009f\3\2\2\2\16"+
		"\u00a3\3\2\2\2\20\u00a5\3\2\2\2\22\u00b6\3\2\2\2\24\u00c4\3\2\2\2\26\u00d2"+
		"\3\2\2\2\30\u00e6\3\2\2\2\32\u00f4\3\2\2\2\34\u00ff\3\2\2\2\36\u010a\3"+
		"\2\2\2 \u0115\3\2\2\2\"\u0120\3\2\2\2$\u0132\3\2\2\2&\u013b\3\2\2\2(\u013d"+
		"\3\2\2\2*\u014d\3\2\2\2,\u0151\3\2\2\2.\u0153\3\2\2\2\60\u015c\3\2\2\2"+
		"\62\u0169\3\2\2\2\64\u0174\3\2\2\2\66\u0177\3\2\2\28\u017e\3\2\2\2:\u0180"+
		"\3\2\2\2<\u0186\3\2\2\2>\u0192\3\2\2\2@\u0195\3\2\2\2B\u0199\3\2\2\2D"+
		"\u01ae\3\2\2\2F\u01c4\3\2\2\2H\u01ca\3\2\2\2J\u01cc\3\2\2\2L\u01d7\3\2"+
		"\2\2N\u01da\3\2\2\2P\u01de\3\2\2\2R\u01ec\3\2\2\2T\u01ef\3\2\2\2V\u01fe"+
		"\3\2\2\2X\u0200\3\2\2\2Z\u020c\3\2\2\2\\d\7\62\2\2]d\7\63\2\2^d\7\66\2"+
		"\2_`\7\21\2\2`a\5$\23\2ab\7\22\2\2bd\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c^\3"+
		"\2\2\2c_\3\2\2\2d\3\3\2\2\2ef\b\3\1\2fg\5,\27\2gm\3\2\2\2hi\f\3\2\2ij"+
		"\7\23\2\2jl\7\24\2\2kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\5\3\2\2"+
		"\2om\3\2\2\2pq\b\4\1\2qr\5\2\2\2r\u0087\3\2\2\2st\f\7\2\2tu\7\23\2\2u"+
		"v\5$\23\2vw\7\24\2\2w\u0086\3\2\2\2xy\f\6\2\2y{\7\21\2\2z|\5\b\5\2{z\3"+
		"\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0086\7\22\2\2~\177\f\5\2\2\177\u0080\7\61"+
		"\2\2\u0080\u0086\7\62\2\2\u0081\u0082\f\4\2\2\u0082\u0086\7\36\2\2\u0083"+
		"\u0084\f\3\2\2\u0084\u0086\7 \2\2\u0085s\3\2\2\2\u0085x\3\2\2\2\u0085"+
		"~\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\7\3\2\2\2\u0089\u0087\3"+
		"\2\2\2\u008a\u008b\b\5\1\2\u008b\u008c\5$\23\2\u008c\u0092\3\2\2\2\u008d"+
		"\u008e\f\3\2\2\u008e\u008f\7-\2\2\u008f\u0091\5$\23\2\u0090\u008d\3\2"+
		"\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\t\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u009e\5\6\4\2\u0096\u0097\7\36\2"+
		"\2\u0097\u009e\5\n\6\2\u0098\u0099\7 \2\2\u0099\u009e\5\n\6\2\u009a\u009b"+
		"\5\f\7\2\u009b\u009c\5\16\b\2\u009c\u009e\3\2\2\2\u009d\u0095\3\2\2\2"+
		"\u009d\u0096\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u009a\3\2\2\2\u009e\13"+
		"\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0\r\3\2\2\2\u00a1\u00a4\5\n\6\2\u00a2"+
		"\u00a4\7\64\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\17\3\2\2"+
		"\2\u00a5\u00a6\b\t\1\2\u00a6\u00a7\5\16\b\2\u00a7\u00b3\3\2\2\2\u00a8"+
		"\u00a9\f\5\2\2\u00a9\u00aa\7!\2\2\u00aa\u00b2\5\16\b\2\u00ab\u00ac\f\4"+
		"\2\2\u00ac\u00ad\7\"\2\2\u00ad\u00b2\5\16\b\2\u00ae\u00af\f\3\2\2\u00af"+
		"\u00b0\7#\2\2\u00b0\u00b2\5\16\b\2\u00b1\u00a8\3\2\2\2\u00b1\u00ab\3\2"+
		"\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\21\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\n\1"+
		"\2\u00b7\u00b8\5\20\t\2\u00b8\u00c1\3\2\2\2\u00b9\u00ba\f\4\2\2\u00ba"+
		"\u00bb\7\35\2\2\u00bb\u00c0\5\20\t\2\u00bc\u00bd\f\3\2\2\u00bd\u00be\7"+
		"\37\2\2\u00be\u00c0\5\20\t\2\u00bf\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\23\3\2\2"+
		"\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\b\13\1\2\u00c5\u00c6\5\22\n\2\u00c6"+
		"\u00cf\3\2\2\2\u00c7\u00c8\f\4\2\2\u00c8\u00c9\7\33\2\2\u00c9\u00ce\5"+
		"\22\n\2\u00ca\u00cb\f\3\2\2\u00cb\u00cc\7\34\2\2\u00cc\u00ce\5\22\n\2"+
		"\u00cd\u00c7\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\25\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d3\b\f\1\2\u00d3\u00d4\5\24\13\2\u00d4\u00e3\3\2\2\2\u00d5\u00d6\f"+
		"\6\2\2\u00d6\u00d7\7\27\2\2\u00d7\u00e2\5\24\13\2\u00d8\u00d9\f\5\2\2"+
		"\u00d9\u00da\7\31\2\2\u00da\u00e2\5\24\13\2\u00db\u00dc\f\4\2\2\u00dc"+
		"\u00dd\7\30\2\2\u00dd\u00e2\5\24\13\2\u00de\u00df\f\3\2\2\u00df\u00e0"+
		"\7\32\2\2\u00e0\u00e2\5\24\13\2\u00e1\u00d5\3\2\2\2\u00e1\u00d8\3\2\2"+
		"\2\u00e1\u00db\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\27\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\b\r\1\2\u00e7\u00e8\5\26\f\2\u00e8\u00f1\3\2\2\2\u00e9\u00ea\f"+
		"\4\2\2\u00ea\u00eb\7/\2\2\u00eb\u00f0\5\26\f\2\u00ec\u00ed\f\3\2\2\u00ed"+
		"\u00ee\7\60\2\2\u00ee\u00f0\5\26\f\2\u00ef\u00e9\3\2\2\2\u00ef\u00ec\3"+
		"\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\31\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\b\16\1\2\u00f5\u00f6\5\30"+
		"\r\2\u00f6\u00fc\3\2\2\2\u00f7\u00f8\f\3\2\2\u00f8\u00f9\7$\2\2\u00f9"+
		"\u00fb\5\30\r\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3"+
		"\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\33\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\b\17\1\2\u0100\u0101\5\32\16\2\u0101\u0107\3\2\2\2\u0102\u0103"+
		"\f\3\2\2\u0103\u0104\7(\2\2\u0104\u0106\5\32\16\2\u0105\u0102\3\2\2\2"+
		"\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\35"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\b\20\1\2\u010b\u010c\5\34\17"+
		"\2\u010c\u0112\3\2\2\2\u010d\u010e\f\3\2\2\u010e\u010f\7%\2\2\u010f\u0111"+
		"\5\34\17\2\u0110\u010d\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2"+
		"\u0112\u0113\3\2\2\2\u0113\37\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116"+
		"\b\21\1\2\u0116\u0117\5\36\20\2\u0117\u011d\3\2\2\2\u0118\u0119\f\3\2"+
		"\2\u0119\u011a\7&\2\2\u011a\u011c\5\36\20\2\u011b\u0118\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e!\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u0120\u0121\b\22\1\2\u0121\u0122\5 \21\2\u0122\u0128"+
		"\3\2\2\2\u0123\u0124\f\3\2\2\u0124\u0125\7\'\2\2\u0125\u0127\5 \21\2\u0126"+
		"\u0123\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129#\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0133\5.\30\2\u012c\u0133"+
		"\5\"\22\2\u012d\u012e\5\n\6\2\u012e\u012f\7.\2\2\u012f\u0130\5$\23\2\u0130"+
		"\u0133\3\2\2\2\u0131\u0133\7\64\2\2\u0132\u012b\3\2\2\2\u0132\u012c\3"+
		"\2\2\2\u0132\u012d\3\2\2\2\u0132\u0131\3\2\2\2\u0133%\3\2\2\2\u0134\u0135"+
		"\5\4\3\2\u0135\u0136\5(\25\2\u0136\u0137\7,\2\2\u0137\u013c\3\2\2\2\u0138"+
		"\u0139\5\4\3\2\u0139\u013a\7,\2\2\u013a\u013c\3\2\2\2\u013b\u0134\3\2"+
		"\2\2\u013b\u0138\3\2\2\2\u013c\'\3\2\2\2\u013d\u013e\b\25\1\2\u013e\u013f"+
		"\5*\26\2\u013f\u0145\3\2\2\2\u0140\u0141\f\3\2\2\u0141\u0142\7-\2\2\u0142"+
		"\u0144\5*\26\2\u0143\u0140\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146)\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014e"+
		"\5\60\31\2\u0149\u014a\5\60\31\2\u014a\u014b\7.\2\2\u014b\u014c\5$\23"+
		"\2\u014c\u014e\3\2\2\2\u014d\u0148\3\2\2\2\u014d\u0149\3\2\2\2\u014e+"+
		"\3\2\2\2\u014f\u0152\t\3\2\2\u0150\u0152\5\66\34\2\u0151\u014f\3\2\2\2"+
		"\u0151\u0150\3\2\2\2\u0152-\3\2\2\2\u0153\u0154\7;\2\2\u0154\u0155\5\4"+
		"\3\2\u0155/\3\2\2\2\u0156\u0157\b\31\1\2\u0157\u015d\7\62\2\2\u0158\u0159"+
		"\7\21\2\2\u0159\u015a\5\60\31\2\u015a\u015b\7\22\2\2\u015b\u015d\3\2\2"+
		"\2\u015c\u0156\3\2\2\2\u015c\u0158\3\2\2\2\u015d\u0166\3\2\2\2\u015e\u015f"+
		"\f\3\2\2\u015f\u0161\7\21\2\2\u0160\u0162\5\62\32\2\u0161\u0160\3\2\2"+
		"\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\7\22\2\2\u0164"+
		"\u015e\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\61\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016a\b\32\1\2\u016a\u016b"+
		"\5\64\33\2\u016b\u0171\3\2\2\2\u016c\u016d\f\3\2\2\u016d\u016e\7-\2\2"+
		"\u016e\u0170\5\64\33\2\u016f\u016c\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\63\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0175\5\4\3\2\u0175\u0176\5\60\31\2\u0176\65\3\2\2\2\u0177\u0178\7\62"+
		"\2\2\u0178\67\3\2\2\2\u0179\u017f\5:\36\2\u017a\u017f\5@!\2\u017b\u017f"+
		"\5B\"\2\u017c\u017f\5D#\2\u017d\u017f\5L\'\2\u017e\u0179\3\2\2\2\u017e"+
		"\u017a\3\2\2\2\u017e\u017b\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2"+
		"\2\2\u017f9\3\2\2\2\u0180\u0182\7\25\2\2\u0181\u0183\5<\37\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\26\2\2"+
		"\u0185;\3\2\2\2\u0186\u0187\b\37\1\2\u0187\u0188\5> \2\u0188\u018d\3\2"+
		"\2\2\u0189\u018a\f\3\2\2\u018a\u018c\5> \2\u018b\u0189\3\2\2\2\u018c\u018f"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e=\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u0190\u0193\58\35\2\u0191\u0193\5&\24\2\u0192\u0190\3\2"+
		"\2\2\u0192\u0191\3\2\2\2\u0193?\3\2\2\2\u0194\u0196\5$\23\2\u0195\u0194"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7,\2\2\u0198"+
		"A\3\2\2\2\u0199\u019a\7\7\2\2\u019a\u019b\7\21\2\2\u019b\u019c\5$\23\2"+
		"\u019c\u019d\7\22\2\2\u019d\u01a0\58\35\2\u019e\u019f\7\5\2\2\u019f\u01a1"+
		"\58\35\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1C\3\2\2\2\u01a2"+
		"\u01a3\7\f\2\2\u01a3\u01a4\7\21\2\2\u01a4\u01a5\5$\23\2\u01a5\u01a6\7"+
		"\22\2\2\u01a6\u01a7\58\35\2\u01a7\u01af\3\2\2\2\u01a8\u01a9\7\6\2\2\u01a9"+
		"\u01aa\7\21\2\2\u01aa\u01ab\5F$\2\u01ab\u01ac\7\22\2\2\u01ac\u01ad\58"+
		"\35\2\u01ad\u01af\3\2\2\2\u01ae\u01a2\3\2\2\2\u01ae\u01a8\3\2\2\2\u01af"+
		"E\3\2\2\2\u01b0\u01b1\5H%\2\u01b1\u01b3\7,\2\2\u01b2\u01b4\5J&\2\u01b3"+
		"\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\7,"+
		"\2\2\u01b6\u01b8\5J&\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01c5"+
		"\3\2\2\2\u01b9\u01bb\5$\23\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01be\7,\2\2\u01bd\u01bf\5J&\2\u01be\u01bd\3\2\2"+
		"\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2\7,\2\2\u01c1\u01c3"+
		"\5J&\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4"+
		"\u01b0\3\2\2\2\u01c4\u01ba\3\2\2\2\u01c5G\3\2\2\2\u01c6\u01c7\5\4\3\2"+
		"\u01c7\u01c8\5(\25\2\u01c8\u01cb\3\2\2\2\u01c9\u01cb\5\4\3\2\u01ca\u01c6"+
		"\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cbI\3\2\2\2\u01cc\u01cd\5$\23\2\u01cd"+
		"K\3\2\2\2\u01ce\u01cf\7\4\2\2\u01cf\u01d8\7,\2\2\u01d0\u01d1\7\3\2\2\u01d1"+
		"\u01d8\7,\2\2\u01d2\u01d4\7\n\2\2\u01d3\u01d5\5$\23\2\u01d4\u01d3\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\7,\2\2\u01d7"+
		"\u01ce\3\2\2\2\u01d7\u01d0\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d8M\3\2\2\2"+
		"\u01d9\u01db\5P)\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc"+
		"\3\2\2\2\u01dc\u01dd\7\2\2\3\u01ddO\3\2\2\2\u01de\u01df\b)\1\2\u01df\u01e0"+
		"\5R*\2\u01e0\u01e5\3\2\2\2\u01e1\u01e2\f\3\2\2\u01e2\u01e4\5R*\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6Q\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ed\5T+\2\u01e9\u01ed"+
		"\5V,\2\u01ea\u01ed\5&\24\2\u01eb\u01ed\7,\2\2\u01ec\u01e8\3\2\2\2\u01ec"+
		"\u01e9\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01edS\3\2\2\2"+
		"\u01ee\u01f0\5\4\3\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1"+
		"\3\2\2\2\u01f1\u01f2\5\60\31\2\u01f2\u01f3\5:\36\2\u01f3U\3\2\2\2\u01f4"+
		"\u01f6\7\r\2\2\u01f5\u01f7\7\62\2\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3"+
		"\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\7\25\2\2\u01f9\u01fa\5X-\2\u01fa"+
		"\u01fb\7\26\2\2\u01fb\u01ff\3\2\2\2\u01fc\u01fd\7\r\2\2\u01fd\u01ff\7"+
		"\62\2\2\u01fe\u01f4\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ffW\3\2\2\2\u0200\u0201"+
		"\b-\1\2\u0201\u0202\5Z.\2\u0202\u0207\3\2\2\2\u0203\u0204\f\3\2\2\u0204"+
		"\u0206\5Z.\2\u0205\u0203\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2"+
		"\2\u0207\u0208\3\2\2\2\u0208Y\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020d"+
		"\5&\24\2\u020b\u020d\5T+\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d"+
		"[\3\2\2\2:cm{\u0085\u0087\u0092\u009d\u00a3\u00b1\u00b3\u00bf\u00c1\u00cd"+
		"\u00cf\u00e1\u00e3\u00ef\u00f1\u00fc\u0107\u0112\u011d\u0128\u0132\u013b"+
		"\u0145\u014d\u0151\u015c\u0161\u0166\u0171\u017e\u0182\u018d\u0192\u0195"+
		"\u01a0\u01ae\u01b3\u01b7\u01ba\u01be\u01c2\u01c4\u01ca\u01d4\u01d7\u01da"+
		"\u01e5\u01ec\u01ef\u01f6\u01fe\u0207\u020c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}