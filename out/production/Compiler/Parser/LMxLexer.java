// Generated from LMx.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LMxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Break=2, Continue=3, Else=4, For=5, If=6, Int=7, String=8, Return=9, 
		Void=10, While=11, Class=12, New=13, True=14, False=15, Null=16, Bool=17, 
		LeftParen=18, RightParen=19, LeftBracket=20, RightBracket=21, LeftBrace=22, 
		RightBrace=23, Less=24, LessEqual=25, Greater=26, GreaterEqual=27, LeftShift=28, 
		RightShift=29, Plus=30, PlusPlus=31, Minus=32, MinusMinus=33, Star=34, 
		Div=35, Mod=36, And=37, Or=38, AndAnd=39, OrOr=40, Caret=41, Not=42, Tilde=43, 
		Colon=44, Semi=45, Comma=46, Assign=47, Equal=48, NotEqual=49, Dot=50, 
		Identifier=51, Constant=52, DigitSequence=53, StringLiteral=54, Whitespace=55, 
		Newline=56, BlockComment=57, LineComment=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "Break", "Continue", "Else", "For", "If", "Int", "String", "Return", 
		"Void", "While", "Class", "New", "True", "False", "Null", "Bool", "LeftParen", 
		"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
		"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
		"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
		"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Colon", "Semi", "Comma", 
		"Assign", "Equal", "NotEqual", "Dot", "Identifier", "Nondigitnon", "Nondigit", 
		"Digit", "Constant", "IntegerConstant", "NonzeroDigit", "DigitSequence", 
		"CChar", "EscapeSequence", "StringLiteral", "SCharSequence", "SChar", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'this'", "'break'", "'continue'", "'else'", "'for'", "'if'", "'int'", 
		"'string'", "'return'", "'void'", "'while'", "'class'", "'new'", "'true'", 
		"'false'", "'null'", "'bool'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
		"'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", 
		"'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", 
		"':'", "';'", "','", "'='", "'=='", "'!='", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Break", "Continue", "Else", "For", "If", "Int", "String", 
		"Return", "Void", "While", "Class", "New", "True", "False", "Null", "Bool", 
		"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
		"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
		"RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", 
		"Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Colon", 
		"Semi", "Comma", "Assign", "Equal", "NotEqual", "Dot", "Identifier", "Constant", 
		"DigitSequence", "StringLiteral", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
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


	public LMxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LMx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0193\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3$\3$"+
		"\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64"+
		"\7\64\u0135\n\64\f\64\16\64\u0138\13\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\79\u0144\n9\f9\169\u0147\139\3:\3:\3;\6;\u014c\n;\r;\16;"+
		"\u014d\3<\3<\5<\u0152\n<\3=\3=\3=\3>\3>\5>\u0159\n>\3>\3>\3?\6?\u015e"+
		"\n?\r?\16?\u015f\3@\3@\3@\3@\3@\3@\3@\5@\u0169\n@\3A\6A\u016c\nA\rA\16"+
		"A\u016d\3A\3A\3B\3B\5B\u0174\nB\3B\5B\u0177\nB\3B\3B\3C\3C\3C\3C\7C\u017f"+
		"\nC\fC\16C\u0182\13C\3C\3C\3C\3C\3C\3D\3D\3D\3D\7D\u018d\nD\fD\16D\u0190"+
		"\13D\3D\3D\3\u0180\2E\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\2k\2m\2o\66q\2s\2u\67w\2y\2{8}\2\177\2\u00819\u0083:\u0085;"+
		"\u0087<\3\2\13\4\2C\\c|\5\2C\\aac|\3\2\62;\3\2\63;\6\2\f\f\17\17))^^\f"+
		"\2$$))AA^^cdhhppttvvxx\6\2\f\f\17\17$$^^\4\2\13\13\"\"\4\2\f\f\17\17\2"+
		"\u0198\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2o\3\2\2\2\2u\3\2\2\2\2"+
		"{\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2"+
		"\2\2\3\u0089\3\2\2\2\5\u008e\3\2\2\2\7\u0094\3\2\2\2\t\u009d\3\2\2\2\13"+
		"\u00a2\3\2\2\2\r\u00a6\3\2\2\2\17\u00a9\3\2\2\2\21\u00ad\3\2\2\2\23\u00b4"+
		"\3\2\2\2\25\u00bb\3\2\2\2\27\u00c0\3\2\2\2\31\u00c6\3\2\2\2\33\u00cc\3"+
		"\2\2\2\35\u00d0\3\2\2\2\37\u00d5\3\2\2\2!\u00db\3\2\2\2#\u00e0\3\2\2\2"+
		"%\u00e5\3\2\2\2\'\u00e7\3\2\2\2)\u00e9\3\2\2\2+\u00eb\3\2\2\2-\u00ed\3"+
		"\2\2\2/\u00ef\3\2\2\2\61\u00f1\3\2\2\2\63\u00f3\3\2\2\2\65\u00f6\3\2\2"+
		"\2\67\u00f8\3\2\2\29\u00fb\3\2\2\2;\u00fe\3\2\2\2=\u0101\3\2\2\2?\u0103"+
		"\3\2\2\2A\u0106\3\2\2\2C\u0108\3\2\2\2E\u010b\3\2\2\2G\u010d\3\2\2\2I"+
		"\u010f\3\2\2\2K\u0111\3\2\2\2M\u0113\3\2\2\2O\u0115\3\2\2\2Q\u0118\3\2"+
		"\2\2S\u011b\3\2\2\2U\u011d\3\2\2\2W\u011f\3\2\2\2Y\u0121\3\2\2\2[\u0123"+
		"\3\2\2\2]\u0125\3\2\2\2_\u0127\3\2\2\2a\u0129\3\2\2\2c\u012c\3\2\2\2e"+
		"\u012f\3\2\2\2g\u0131\3\2\2\2i\u0139\3\2\2\2k\u013b\3\2\2\2m\u013d\3\2"+
		"\2\2o\u013f\3\2\2\2q\u0141\3\2\2\2s\u0148\3\2\2\2u\u014b\3\2\2\2w\u0151"+
		"\3\2\2\2y\u0153\3\2\2\2{\u0156\3\2\2\2}\u015d\3\2\2\2\177\u0168\3\2\2"+
		"\2\u0081\u016b\3\2\2\2\u0083\u0176\3\2\2\2\u0085\u017a\3\2\2\2\u0087\u0188"+
		"\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b\7j\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7u\2\2\u008d\4\3\2\2\2\u008e\u008f\7d\2\2\u008f\u0090\7t\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7c\2\2\u0092\u0093\7m\2\2\u0093\6\3\2\2\2\u0094"+
		"\u0095\7e\2\2\u0095\u0096\7q\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2"+
		"\u0098\u0099\7k\2\2\u0099\u009a\7p\2\2\u009a\u009b\7w\2\2\u009b\u009c"+
		"\7g\2\2\u009c\b\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f\u00a0"+
		"\7u\2\2\u00a0\u00a1\7g\2\2\u00a1\n\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4"+
		"\7q\2\2\u00a4\u00a5\7t\2\2\u00a5\f\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8"+
		"\7h\2\2\u00a8\16\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac"+
		"\7v\2\2\u00ac\20\3\2\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7v\2\2\u00af\u00b0"+
		"\7t\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7i\2\2\u00b3"+
		"\22\3\2\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7v\2\2\u00b7"+
		"\u00b8\7w\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7p\2\2\u00ba\24\3\2\2\2\u00bb"+
		"\u00bc\7x\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7f\2\2"+
		"\u00bf\26\3\2\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c3\7"+
		"k\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7g\2\2\u00c5\30\3\2\2\2\u00c6\u00c7"+
		"\7e\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7u\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\32\3\2\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"\u00cf\7y\2\2\u00cf\34\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7t\2\2\u00d2"+
		"\u00d3\7w\2\2\u00d3\u00d4\7g\2\2\u00d4\36\3\2\2\2\u00d5\u00d6\7h\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7g\2\2"+
		"\u00da \3\2\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7w\2\2\u00dd\u00de\7n\2"+
		"\2\u00de\u00df\7n\2\2\u00df\"\3\2\2\2\u00e0\u00e1\7d\2\2\u00e1\u00e2\7"+
		"q\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7n\2\2\u00e4$\3\2\2\2\u00e5\u00e6"+
		"\7*\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7+\2\2\u00e8(\3\2\2\2\u00e9\u00ea\7"+
		"]\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7_\2\2\u00ec,\3\2\2\2\u00ed\u00ee\7}"+
		"\2\2\u00ee.\3\2\2\2\u00ef\u00f0\7\177\2\2\u00f0\60\3\2\2\2\u00f1\u00f2"+
		"\7>\2\2\u00f2\62\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4\u00f5\7?\2\2\u00f5\64"+
		"\3\2\2\2\u00f6\u00f7\7@\2\2\u00f7\66\3\2\2\2\u00f8\u00f9\7@\2\2\u00f9"+
		"\u00fa\7?\2\2\u00fa8\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc\u00fd\7>\2\2\u00fd"+
		":\3\2\2\2\u00fe\u00ff\7@\2\2\u00ff\u0100\7@\2\2\u0100<\3\2\2\2\u0101\u0102"+
		"\7-\2\2\u0102>\3\2\2\2\u0103\u0104\7-\2\2\u0104\u0105\7-\2\2\u0105@\3"+
		"\2\2\2\u0106\u0107\7/\2\2\u0107B\3\2\2\2\u0108\u0109\7/\2\2\u0109\u010a"+
		"\7/\2\2\u010aD\3\2\2\2\u010b\u010c\7,\2\2\u010cF\3\2\2\2\u010d\u010e\7"+
		"\61\2\2\u010eH\3\2\2\2\u010f\u0110\7\'\2\2\u0110J\3\2\2\2\u0111\u0112"+
		"\7(\2\2\u0112L\3\2\2\2\u0113\u0114\7~\2\2\u0114N\3\2\2\2\u0115\u0116\7"+
		"(\2\2\u0116\u0117\7(\2\2\u0117P\3\2\2\2\u0118\u0119\7~\2\2\u0119\u011a"+
		"\7~\2\2\u011aR\3\2\2\2\u011b\u011c\7`\2\2\u011cT\3\2\2\2\u011d\u011e\7"+
		"#\2\2\u011eV\3\2\2\2\u011f\u0120\7\u0080\2\2\u0120X\3\2\2\2\u0121\u0122"+
		"\7<\2\2\u0122Z\3\2\2\2\u0123\u0124\7=\2\2\u0124\\\3\2\2\2\u0125\u0126"+
		"\7.\2\2\u0126^\3\2\2\2\u0127\u0128\7?\2\2\u0128`\3\2\2\2\u0129\u012a\7"+
		"?\2\2\u012a\u012b\7?\2\2\u012bb\3\2\2\2\u012c\u012d\7#\2\2\u012d\u012e"+
		"\7?\2\2\u012ed\3\2\2\2\u012f\u0130\7\60\2\2\u0130f\3\2\2\2\u0131\u0136"+
		"\5i\65\2\u0132\u0135\5k\66\2\u0133\u0135\5m\67\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137h\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\t\2\2\2\u013aj\3\2"+
		"\2\2\u013b\u013c\t\3\2\2\u013cl\3\2\2\2\u013d\u013e\t\4\2\2\u013en\3\2"+
		"\2\2\u013f\u0140\5q9\2\u0140p\3\2\2\2\u0141\u0145\5s:\2\u0142\u0144\5"+
		"m\67\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146r\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\t\5\2\2"+
		"\u0149t\3\2\2\2\u014a\u014c\5m\67\2\u014b\u014a\3\2\2\2\u014c\u014d\3"+
		"\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014ev\3\2\2\2\u014f\u0152"+
		"\n\6\2\2\u0150\u0152\5y=\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"x\3\2\2\2\u0153\u0154\7^\2\2\u0154\u0155\t\7\2\2\u0155z\3\2\2\2\u0156"+
		"\u0158\7$\2\2\u0157\u0159\5}?\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2"+
		"\2\u0159\u015a\3\2\2\2\u015a\u015b\7$\2\2\u015b|\3\2\2\2\u015c\u015e\5"+
		"\177@\2\u015d\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160~\3\2\2\2\u0161\u0169\n\b\2\2\u0162\u0169\5y=\2\u0163"+
		"\u0164\7^\2\2\u0164\u0169\7\f\2\2\u0165\u0166\7^\2\2\u0166\u0167\7\17"+
		"\2\2\u0167\u0169\7\f\2\2\u0168\u0161\3\2\2\2\u0168\u0162\3\2\2\2\u0168"+
		"\u0163\3\2\2\2\u0168\u0165\3\2\2\2\u0169\u0080\3\2\2\2\u016a\u016c\t\t"+
		"\2\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\bA\2\2\u0170\u0082\3\2"+
		"\2\2\u0171\u0173\7\17\2\2\u0172\u0174\7\f\2\2\u0173\u0172\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0177\7\f\2\2\u0176\u0171\3\2"+
		"\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\bB\2\2\u0179"+
		"\u0084\3\2\2\2\u017a\u017b\7\61\2\2\u017b\u017c\7,\2\2\u017c\u0180\3\2"+
		"\2\2\u017d\u017f\13\2\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0183\u0184\7,\2\2\u0184\u0185\7\61\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\bC\2\2\u0187\u0086\3\2\2\2\u0188\u0189\7\61\2\2\u0189\u018a\7\61"+
		"\2\2\u018a\u018e\3\2\2\2\u018b\u018d\n\n\2\2\u018c\u018b\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2"+
		"\2\2\u0190\u018e\3\2\2\2\u0191\u0192\bD\2\2\u0192\u0088\3\2\2\2\20\2\u0134"+
		"\u0136\u0145\u014d\u0151\u0158\u015f\u0168\u016d\u0173\u0176\u0180\u018e"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}