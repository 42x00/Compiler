package Parser;// Generated from LMx.g4 by ANTLR 4.7.1
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
		Break=1, Continue=2, Else=3, For=4, If=5, Int=6, String=7, Return=8, Void=9, 
		While=10, Class=11, New=12, True=13, False=14, LeftParen=15, RightParen=16, 
		LeftBracket=17, RightBracket=18, LeftBrace=19, RightBrace=20, Less=21, 
		LessEqual=22, Greater=23, GreaterEqual=24, LeftShift=25, RightShift=26, 
		Plus=27, PlusPlus=28, Minus=29, MinusMinus=30, Star=31, Div=32, Mod=33, 
		And=34, Or=35, AndAnd=36, OrOr=37, Caret=38, Not=39, Tilde=40, Colon=41, 
		Semi=42, Comma=43, Assign=44, Equal=45, NotEqual=46, Dot=47, Identifier=48, 
		Constant=49, DigitSequence=50, BooleanConstant=51, StringLiteral=52, Whitespace=53, 
		Newline=54, BlockComment=55, LineComment=56;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Break", "Continue", "Else", "For", "If", "Int", "String", "Return", "Void", 
		"While", "Class", "New", "True", "False", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", 
		"GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", 
		"MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", 
		"Not", "Tilde", "Colon", "Semi", "Comma", "Assign", "Equal", "NotEqual", 
		"Dot", "Identifier", "Nondigit", "Digit", "Constant", "IntegerConstant", 
		"NonzeroDigit", "DigitSequence", "BooleanConstant", "EscapeSequence", 
		"StringLiteral", "SCharSequence", "SChar", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u017c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\7\61\u011e\n\61\f\61\16\61\u0121"+
		"\13\61\3\62\3\62\3\63\3\63\3\64\3\64\5\64\u0129\n\64\3\65\3\65\7\65\u012d"+
		"\n\65\f\65\16\65\u0130\13\65\3\66\3\66\3\67\6\67\u0135\n\67\r\67\16\67"+
		"\u0136\38\38\58\u013b\n8\39\39\39\3:\3:\5:\u0142\n:\3:\3:\3;\6;\u0147"+
		"\n;\r;\16;\u0148\3<\3<\3<\3<\3<\3<\3<\5<\u0152\n<\3=\6=\u0155\n=\r=\16"+
		"=\u0156\3=\3=\3>\3>\5>\u015d\n>\3>\5>\u0160\n>\3>\3>\3?\3?\3?\3?\7?\u0168"+
		"\n?\f?\16?\u016b\13?\3?\3?\3?\3?\3?\3@\3@\3@\3@\7@\u0176\n@\f@\16@\u0179"+
		"\13@\3@\3@\3\u0169\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2"+
		"e\2g\63i\2k\2m\64o\65q\2s\66u\2w\2y\67{8}9\177:\3\2\t\5\2C\\aac|\3\2\62"+
		";\3\2\63;\f\2$$))AA^^cdhhppttvvxx\6\2\f\f\17\17$$^^\4\2\13\13\"\"\4\2"+
		"\f\f\17\17\2\u0184\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2g\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2s\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u0087\3"+
		"\2\2\2\7\u0090\3\2\2\2\t\u0095\3\2\2\2\13\u0099\3\2\2\2\r\u009c\3\2\2"+
		"\2\17\u00a0\3\2\2\2\21\u00a7\3\2\2\2\23\u00ae\3\2\2\2\25\u00b3\3\2\2\2"+
		"\27\u00b9\3\2\2\2\31\u00bf\3\2\2\2\33\u00c3\3\2\2\2\35\u00c8\3\2\2\2\37"+
		"\u00ce\3\2\2\2!\u00d0\3\2\2\2#\u00d2\3\2\2\2%\u00d4\3\2\2\2\'\u00d6\3"+
		"\2\2\2)\u00d8\3\2\2\2+\u00da\3\2\2\2-\u00dc\3\2\2\2/\u00df\3\2\2\2\61"+
		"\u00e1\3\2\2\2\63\u00e4\3\2\2\2\65\u00e7\3\2\2\2\67\u00ea\3\2\2\29\u00ec"+
		"\3\2\2\2;\u00ef\3\2\2\2=\u00f1\3\2\2\2?\u00f4\3\2\2\2A\u00f6\3\2\2\2C"+
		"\u00f8\3\2\2\2E\u00fa\3\2\2\2G\u00fc\3\2\2\2I\u00fe\3\2\2\2K\u0101\3\2"+
		"\2\2M\u0104\3\2\2\2O\u0106\3\2\2\2Q\u0108\3\2\2\2S\u010a\3\2\2\2U\u010c"+
		"\3\2\2\2W\u010e\3\2\2\2Y\u0110\3\2\2\2[\u0112\3\2\2\2]\u0115\3\2\2\2_"+
		"\u0118\3\2\2\2a\u011a\3\2\2\2c\u0122\3\2\2\2e\u0124\3\2\2\2g\u0128\3\2"+
		"\2\2i\u012a\3\2\2\2k\u0131\3\2\2\2m\u0134\3\2\2\2o\u013a\3\2\2\2q\u013c"+
		"\3\2\2\2s\u013f\3\2\2\2u\u0146\3\2\2\2w\u0151\3\2\2\2y\u0154\3\2\2\2{"+
		"\u015f\3\2\2\2}\u0163\3\2\2\2\177\u0171\3\2\2\2\u0081\u0082\7d\2\2\u0082"+
		"\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2\u0085\u0086\7m\2\2"+
		"\u0086\4\3\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089\u008a\7p"+
		"\2\2\u008a\u008b\7v\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e"+
		"\7w\2\2\u008e\u008f\7g\2\2\u008f\6\3\2\2\2\u0090\u0091\7g\2\2\u0091\u0092"+
		"\7n\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094\b\3\2\2\2\u0095\u0096"+
		"\7h\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098\n\3\2\2\2\u0099\u009a"+
		"\7k\2\2\u009a\u009b\7h\2\2\u009b\f\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e"+
		"\7p\2\2\u009e\u009f\7v\2\2\u009f\16\3\2\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2"+
		"\7v\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5"+
		"\u00a6\7i\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9"+
		"\u00aa\7v\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7p\2\2"+
		"\u00ad\22\3\2\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7"+
		"k\2\2\u00b1\u00b2\7f\2\2\u00b2\24\3\2\2\2\u00b3\u00b4\7y\2\2\u00b4\u00b5"+
		"\7j\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\26\3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7c\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd\u00be\7u\2\2\u00be\30\3\2\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7y\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7\7g\2\2\u00c7\34\3\2\2\2\u00c8"+
		"\u00c9\7h\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2"+
		"\u00cc\u00cd\7g\2\2\u00cd\36\3\2\2\2\u00ce\u00cf\7*\2\2\u00cf \3\2\2\2"+
		"\u00d0\u00d1\7+\2\2\u00d1\"\3\2\2\2\u00d2\u00d3\7]\2\2\u00d3$\3\2\2\2"+
		"\u00d4\u00d5\7_\2\2\u00d5&\3\2\2\2\u00d6\u00d7\7}\2\2\u00d7(\3\2\2\2\u00d8"+
		"\u00d9\7\177\2\2\u00d9*\3\2\2\2\u00da\u00db\7>\2\2\u00db,\3\2\2\2\u00dc"+
		"\u00dd\7>\2\2\u00dd\u00de\7?\2\2\u00de.\3\2\2\2\u00df\u00e0\7@\2\2\u00e0"+
		"\60\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2\u00e3\7?\2\2\u00e3\62\3\2\2\2\u00e4"+
		"\u00e5\7>\2\2\u00e5\u00e6\7>\2\2\u00e6\64\3\2\2\2\u00e7\u00e8\7@\2\2\u00e8"+
		"\u00e9\7@\2\2\u00e9\66\3\2\2\2\u00ea\u00eb\7-\2\2\u00eb8\3\2\2\2\u00ec"+
		"\u00ed\7-\2\2\u00ed\u00ee\7-\2\2\u00ee:\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0"+
		"<\3\2\2\2\u00f1\u00f2\7/\2\2\u00f2\u00f3\7/\2\2\u00f3>\3\2\2\2\u00f4\u00f5"+
		"\7,\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7B\3\2\2\2\u00f8\u00f9"+
		"\7\'\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7(\2\2\u00fbF\3\2\2\2\u00fc\u00fd"+
		"\7~\2\2\u00fdH\3\2\2\2\u00fe\u00ff\7(\2\2\u00ff\u0100\7(\2\2\u0100J\3"+
		"\2\2\2\u0101\u0102\7~\2\2\u0102\u0103\7~\2\2\u0103L\3\2\2\2\u0104\u0105"+
		"\7`\2\2\u0105N\3\2\2\2\u0106\u0107\7#\2\2\u0107P\3\2\2\2\u0108\u0109\7"+
		"\u0080\2\2\u0109R\3\2\2\2\u010a\u010b\7<\2\2\u010bT\3\2\2\2\u010c\u010d"+
		"\7=\2\2\u010dV\3\2\2\2\u010e\u010f\7.\2\2\u010fX\3\2\2\2\u0110\u0111\7"+
		"?\2\2\u0111Z\3\2\2\2\u0112\u0113\7?\2\2\u0113\u0114\7?\2\2\u0114\\\3\2"+
		"\2\2\u0115\u0116\7#\2\2\u0116\u0117\7?\2\2\u0117^\3\2\2\2\u0118\u0119"+
		"\7\60\2\2\u0119`\3\2\2\2\u011a\u011f\5c\62\2\u011b\u011e\5c\62\2\u011c"+
		"\u011e\5e\63\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120b\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0123\t\2\2\2\u0123d\3\2\2\2\u0124\u0125\t\3\2\2\u0125"+
		"f\3\2\2\2\u0126\u0129\5i\65\2\u0127\u0129\5o8\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0127\3\2\2\2\u0129h\3\2\2\2\u012a\u012e\5k\66\2\u012b\u012d\5e\63\2"+
		"\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012fj\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\t\4\2\2\u0132"+
		"l\3\2\2\2\u0133\u0135\5e\63\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2"+
		"\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137n\3\2\2\2\u0138\u013b\5"+
		"\33\16\2\u0139\u013b\5\35\17\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2"+
		"\u013bp\3\2\2\2\u013c\u013d\7^\2\2\u013d\u013e\t\5\2\2\u013er\3\2\2\2"+
		"\u013f\u0141\7$\2\2\u0140\u0142\5u;\2\u0141\u0140\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7$\2\2\u0144t\3\2\2\2\u0145\u0147"+
		"\5w<\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149v\3\2\2\2\u014a\u0152\n\6\2\2\u014b\u0152\5q9\2\u014c"+
		"\u014d\7^\2\2\u014d\u0152\7\f\2\2\u014e\u014f\7^\2\2\u014f\u0150\7\17"+
		"\2\2\u0150\u0152\7\f\2\2\u0151\u014a\3\2\2\2\u0151\u014b\3\2\2\2\u0151"+
		"\u014c\3\2\2\2\u0151\u014e\3\2\2\2\u0152x\3\2\2\2\u0153\u0155\t\7\2\2"+
		"\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b=\2\2\u0159z\3\2\2\2\u015a\u015c"+
		"\7\17\2\2\u015b\u015d\7\f\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2"+
		"\u015d\u0160\3\2\2\2\u015e\u0160\7\f\2\2\u015f\u015a\3\2\2\2\u015f\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\b>\2\2\u0162|\3\2\2\2\u0163\u0164"+
		"\7\61\2\2\u0164\u0165\7,\2\2\u0165\u0169\3\2\2\2\u0166\u0168\13\2\2\2"+
		"\u0167\u0166\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u016a\3\2\2\2\u0169\u0167"+
		"\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7,\2\2\u016d"+
		"\u016e\7\61\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b?\2\2\u0170~\3\2\2\2"+
		"\u0171\u0172\7\61\2\2\u0172\u0173\7\61\2\2\u0173\u0177\3\2\2\2\u0174\u0176"+
		"\n\b\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\b@"+
		"\2\2\u017b\u0080\3\2\2\2\21\2\u011d\u011f\u0128\u012e\u0136\u013a\u0141"+
		"\u0148\u0151\u0156\u015c\u015f\u0169\u0177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}