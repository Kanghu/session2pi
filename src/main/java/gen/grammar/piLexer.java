// Generated from D:/Users/Kanghu/Github/session-pi/src/main/resources/grammar\pi.g4 by ANTLR 4.8
package gen.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class piLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, WHITESPACE=12, NEWLINE=13, EMPTY=14, RECV=15, SEND=16, 
		REPL=17, NEW=18, IN=19, IF=20, THEN=21, ELSE=22, AND=23, CONTINUE=24, 
		WITH=25, FST=26, SND=27, CONS=28, NIL=29, LET=30, BRANCH=31, SELECT=32, 
		INT=33, LIT=34, TRUE=35, FALSE=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "WHITESPACE", "NEWLINE", "EMPTY", "RECV", "SEND", "REPL", 
			"NEW", "IN", "IF", "THEN", "ELSE", "AND", "CONTINUE", "WITH", "FST", 
			"SND", "CONS", "NIL", "LET", "BRANCH", "SELECT", "INT", "LIT", "TRUE", 
			"FALSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'{'", "':'", "'}'", "'('", "')'", "'['", "']'", "'+'", 
			"'-'", "'/'", null, null, "'O'", "'?'", "'!'", "'*'", "'new'", "'in'", 
			"'if'", "'then'", "'else'", null, "'.'", "','", "'fst'", "'snd'", "'cons'", 
			"'nil'", "'let'", "'>'", "'<'", null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WHITESPACE", "NEWLINE", "EMPTY", "RECV", "SEND", "REPL", "NEW", "IN", 
			"IF", "THEN", "ELSE", "AND", "CONTINUE", "WITH", "FST", "SND", "CONS", 
			"NIL", "LET", "BRANCH", "SELECT", "INT", "LIT", "TRUE", "FALSE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public piLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pi.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00bf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\5\16g\n\16\3\16\3\16\6\16k\n\16\r\16\16\16l\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\5\30\u008e"+
		"\n\30\3\30\3\30\5\30\u0092\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&\3\2\5\4\2\13\13\"\"\3\2\62;\3\2c|\2\u00c3\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\r"+
		"U\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23[\3\2\2\2\25]\3\2\2\2\27_\3\2\2\2"+
		"\31a\3\2\2\2\33j\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v\3\2\2\2%"+
		"x\3\2\2\2\'|\3\2\2\2)\177\3\2\2\2+\u0082\3\2\2\2-\u0087\3\2\2\2/\u008d"+
		"\3\2\2\2\61\u0093\3\2\2\2\63\u0095\3\2\2\2\65\u0097\3\2\2\2\67\u009b\3"+
		"\2\2\29\u009f\3\2\2\2;\u00a4\3\2\2\2=\u00a8\3\2\2\2?\u00ac\3\2\2\2A\u00ae"+
		"\3\2\2\2C\u00b0\3\2\2\2E\u00b2\3\2\2\2G\u00b4\3\2\2\2I\u00b9\3\2\2\2K"+
		"L\7?\2\2L\4\3\2\2\2MN\7}\2\2N\6\3\2\2\2OP\7<\2\2P\b\3\2\2\2QR\7\177\2"+
		"\2R\n\3\2\2\2ST\7*\2\2T\f\3\2\2\2UV\7+\2\2V\16\3\2\2\2WX\7]\2\2X\20\3"+
		"\2\2\2YZ\7_\2\2Z\22\3\2\2\2[\\\7-\2\2\\\24\3\2\2\2]^\7/\2\2^\26\3\2\2"+
		"\2_`\7\61\2\2`\30\3\2\2\2ab\t\2\2\2bc\3\2\2\2cd\b\r\2\2d\32\3\2\2\2eg"+
		"\7\17\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hk\7\f\2\2ik\7\17\2\2jf\3\2\2\2"+
		"ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\16\2\2o\34\3\2"+
		"\2\2pq\7Q\2\2q\36\3\2\2\2rs\7A\2\2s \3\2\2\2tu\7#\2\2u\"\3\2\2\2vw\7,"+
		"\2\2w$\3\2\2\2xy\7p\2\2yz\7g\2\2z{\7y\2\2{&\3\2\2\2|}\7k\2\2}~\7p\2\2"+
		"~(\3\2\2\2\177\u0080\7k\2\2\u0080\u0081\7h\2\2\u0081*\3\2\2\2\u0082\u0083"+
		"\7v\2\2\u0083\u0084\7j\2\2\u0084\u0085\7g\2\2\u0085\u0086\7p\2\2\u0086"+
		",\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7n\2\2\u0089\u008a\7u\2\2\u008a"+
		"\u008b\7g\2\2\u008b.\3\2\2\2\u008c\u008e\5\31\r\2\u008d\u008c\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7~\2\2\u0090\u0092"+
		"\5\31\r\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\60\3\2\2\2\u0093"+
		"\u0094\7\60\2\2\u0094\62\3\2\2\2\u0095\u0096\7.\2\2\u0096\64\3\2\2\2\u0097"+
		"\u0098\7h\2\2\u0098\u0099\7u\2\2\u0099\u009a\7v\2\2\u009a\66\3\2\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7p\2\2\u009d\u009e\7f\2\2\u009e8\3\2\2\2\u009f"+
		"\u00a0\7e\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7u\2\2"+
		"\u00a3:\3\2\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7n\2"+
		"\2\u00a7<\3\2\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7"+
		"v\2\2\u00ab>\3\2\2\2\u00ac\u00ad\7@\2\2\u00ad@\3\2\2\2\u00ae\u00af\7>"+
		"\2\2\u00afB\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1D\3\2\2\2\u00b2\u00b3\t\4"+
		"\2\2\u00b3F\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7"+
		"\7w\2\2\u00b7\u00b8\7g\2\2\u00b8H\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb"+
		"\7c\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be"+
		"J\3\2\2\2\b\2fjl\u008d\u0091\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}