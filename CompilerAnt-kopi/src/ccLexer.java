// Generated from cc.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ccLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, BOOLSQ=14, BOOLEAN=15, IDENT=16, 
		WHITESPACE=17, COMMENT=18, LONGCOMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "BOOLSQ", "BOOLEAN", "IDENT", "WHITESPACE", 
			"COMMENT", "LONGCOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.latches'", "'->'", 
			"'.update'", "'='", "'!'", "'&&'", "'||'", "'('", "')'", "'.simulate'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "BOOLSQ", "BOOLEAN", "IDENT", "WHITESPACE", "COMMENT", "LONGCOMMENT"
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


	public ccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cc.g4"; }

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
		"\u0004\u0000\u0013\u009e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0004\rp\b\r\u000b\r\f\rq\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000fx\b\u000f\n\u000f\f\u000f{\t\u000f\u0001"+
		"\u0010\u0004\u0010~\b\u0010\u000b\u0010\f\u0010\u007f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0088"+
		"\b\u0011\n\u0011\f\u0011\u008b\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u0095\b\u0012\n\u0012\f\u0012\u0098\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\u0001\u0000\u0006\u0002\u0000AZaz\u0003\u000009AZaz\u0002"+
		"\u0000\t\n  \u0001\u0000\n\n\u0001\u0000**\u0001\u0000//\u00a3\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001"+
		"\'\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00059\u0001"+
		"\u0000\u0000\u0000\u0007B\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000"+
		"\u0000\u000bN\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000\u000f"+
		"X\u0001\u0000\u0000\u0000\u0011Z\u0001\u0000\u0000\u0000\u0013]\u0001"+
		"\u0000\u0000\u0000\u0015`\u0001\u0000\u0000\u0000\u0017b\u0001\u0000\u0000"+
		"\u0000\u0019d\u0001\u0000\u0000\u0000\u001bo\u0001\u0000\u0000\u0000\u001d"+
		"s\u0001\u0000\u0000\u0000\u001fu\u0001\u0000\u0000\u0000!}\u0001\u0000"+
		"\u0000\u0000#\u0083\u0001\u0000\u0000\u0000%\u008e\u0001\u0000\u0000\u0000"+
		"\'(\u0005.\u0000\u0000()\u0005h\u0000\u0000)*\u0005a\u0000\u0000*+\u0005"+
		"r\u0000\u0000+,\u0005d\u0000\u0000,-\u0005w\u0000\u0000-.\u0005a\u0000"+
		"\u0000./\u0005r\u0000\u0000/0\u0005e\u0000\u00000\u0002\u0001\u0000\u0000"+
		"\u000012\u0005.\u0000\u000023\u0005i\u0000\u000034\u0005n\u0000\u0000"+
		"45\u0005p\u0000\u000056\u0005u\u0000\u000067\u0005t\u0000\u000078\u0005"+
		"s\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005.\u0000\u0000:;\u0005"+
		"o\u0000\u0000;<\u0005u\u0000\u0000<=\u0005t\u0000\u0000=>\u0005p\u0000"+
		"\u0000>?\u0005u\u0000\u0000?@\u0005t\u0000\u0000@A\u0005s\u0000\u0000"+
		"A\u0006\u0001\u0000\u0000\u0000BC\u0005.\u0000\u0000CD\u0005l\u0000\u0000"+
		"DE\u0005a\u0000\u0000EF\u0005t\u0000\u0000FG\u0005c\u0000\u0000GH\u0005"+
		"h\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005s\u0000\u0000J\b\u0001\u0000"+
		"\u0000\u0000KL\u0005-\u0000\u0000LM\u0005>\u0000\u0000M\n\u0001\u0000"+
		"\u0000\u0000NO\u0005.\u0000\u0000OP\u0005u\u0000\u0000PQ\u0005p\u0000"+
		"\u0000QR\u0005d\u0000\u0000RS\u0005a\u0000\u0000ST\u0005t\u0000\u0000"+
		"TU\u0005e\u0000\u0000U\f\u0001\u0000\u0000\u0000VW\u0005=\u0000\u0000"+
		"W\u000e\u0001\u0000\u0000\u0000XY\u0005!\u0000\u0000Y\u0010\u0001\u0000"+
		"\u0000\u0000Z[\u0005&\u0000\u0000[\\\u0005&\u0000\u0000\\\u0012\u0001"+
		"\u0000\u0000\u0000]^\u0005|\u0000\u0000^_\u0005|\u0000\u0000_\u0014\u0001"+
		"\u0000\u0000\u0000`a\u0005(\u0000\u0000a\u0016\u0001\u0000\u0000\u0000"+
		"bc\u0005)\u0000\u0000c\u0018\u0001\u0000\u0000\u0000de\u0005.\u0000\u0000"+
		"ef\u0005s\u0000\u0000fg\u0005i\u0000\u0000gh\u0005m\u0000\u0000hi\u0005"+
		"u\u0000\u0000ij\u0005l\u0000\u0000jk\u0005a\u0000\u0000kl\u0005t\u0000"+
		"\u0000lm\u0005e\u0000\u0000m\u001a\u0001\u0000\u0000\u0000np\u0003\u001d"+
		"\u000e\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u001c\u0001\u0000\u0000"+
		"\u0000st\u000201\u0000t\u001e\u0001\u0000\u0000\u0000uy\u0007\u0000\u0000"+
		"\u0000vx\u0007\u0001\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000"+
		"\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z \u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0007\u0002\u0000\u0000"+
		"}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0006\u0010\u0000\u0000\u0082\"\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005/\u0000\u0000\u0084\u0085\u0005/\u0000\u0000"+
		"\u0085\u0089\u0001\u0000\u0000\u0000\u0086\u0088\b\u0003\u0000\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0006\u0011\u0000\u0000\u008d$\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005/\u0000\u0000\u008f\u0090\u0005*\u0000\u0000\u0090\u0096\u0001\u0000"+
		"\u0000\u0000\u0091\u0095\b\u0004\u0000\u0000\u0092\u0093\u0005*\u0000"+
		"\u0000\u0093\u0095\b\u0005\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005*\u0000\u0000\u009a\u009b\u0005/\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u0012\u0000\u0000\u009d&\u0001"+
		"\u0000\u0000\u0000\u0007\u0000qy\u007f\u0089\u0094\u0096\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}