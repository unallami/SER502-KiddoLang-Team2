// Generated from d:/Desktop 1/ASU/SER502-KiddoLang-Team2/src/KiddoLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class KiddoLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, IF=2, ELSE=3, FOR=4, WHILE=5, TRUE=6, FALSE=7, AND=8, OR=9, NOT=10, 
		ID=11, INT=12, FLOAT=13, STRING=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT", "IF", "ELSE", "FOR", "WHILE", "TRUE", "FALSE", "AND", "OR", 
			"NOT", "ID", "INT", "FLOAT", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'if'", "'else'", "'for'", "'while'", "'true'", "'false'", 
			"'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "IF", "ELSE", "FOR", "WHILE", "TRUE", "FALSE", "AND", 
			"OR", "NOT", "ID", "INT", "FLOAT", "STRING"
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


	public KiddoLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KiddoLang.g4"; }

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
		"\u0004\u0000\u000em\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0005\nN\b\n\n\n\f\nQ\t\n\u0001\u000b\u0004\u000bT\b\u000b\u000b"+
		"\u000b\f\u000bU\u0001\f\u0004\fY\b\f\u000b\f\f\fZ\u0001\f\u0001\f\u0004"+
		"\f_\b\f\u000b\f\f\f`\u0001\r\u0001\r\u0001\r\u0001\r\u0005\rg\b\r\n\r"+
		"\f\rj\t\r\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0004\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0001\u000009\u0002\u0000\"\"\\\\r\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000"+
		"\u0000\u0000\u0003#\u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000"+
		"\u0007+\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b5\u0001"+
		"\u0000\u0000\u0000\r:\u0001\u0000\u0000\u0000\u000f@\u0001\u0000\u0000"+
		"\u0000\u0011D\u0001\u0000\u0000\u0000\u0013G\u0001\u0000\u0000\u0000\u0015"+
		"K\u0001\u0000\u0000\u0000\u0017S\u0001\u0000\u0000\u0000\u0019X\u0001"+
		"\u0000\u0000\u0000\u001bb\u0001\u0000\u0000\u0000\u001d\u001e\u0005p\u0000"+
		"\u0000\u001e\u001f\u0005r\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005"+
		"n\u0000\u0000!\"\u0005t\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$"+
		"\u0005i\u0000\u0000$%\u0005f\u0000\u0000%\u0004\u0001\u0000\u0000\u0000"+
		"&\'\u0005e\u0000\u0000\'(\u0005l\u0000\u0000()\u0005s\u0000\u0000)*\u0005"+
		"e\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005f\u0000\u0000,-\u0005"+
		"o\u0000\u0000-.\u0005r\u0000\u0000.\b\u0001\u0000\u0000\u0000/0\u0005"+
		"w\u0000\u000001\u0005h\u0000\u000012\u0005i\u0000\u000023\u0005l\u0000"+
		"\u000034\u0005e\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005t\u0000"+
		"\u000067\u0005r\u0000\u000078\u0005u\u0000\u000089\u0005e\u0000\u0000"+
		"9\f\u0001\u0000\u0000\u0000:;\u0005f\u0000\u0000;<\u0005a\u0000\u0000"+
		"<=\u0005l\u0000\u0000=>\u0005s\u0000\u0000>?\u0005e\u0000\u0000?\u000e"+
		"\u0001\u0000\u0000\u0000@A\u0005a\u0000\u0000AB\u0005n\u0000\u0000BC\u0005"+
		"d\u0000\u0000C\u0010\u0001\u0000\u0000\u0000DE\u0005o\u0000\u0000EF\u0005"+
		"r\u0000\u0000F\u0012\u0001\u0000\u0000\u0000GH\u0005n\u0000\u0000HI\u0005"+
		"o\u0000\u0000IJ\u0005t\u0000\u0000J\u0014\u0001\u0000\u0000\u0000KO\u0007"+
		"\u0000\u0000\u0000LN\u0007\u0001\u0000\u0000ML\u0001\u0000\u0000\u0000"+
		"NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000P\u0016\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RT\u0007"+
		"\u0002\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0018\u0001\u0000"+
		"\u0000\u0000WY\u0007\u0002\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\^\u0005.\u0000\u0000]_\u0007\u0002\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000a\u001a\u0001\u0000\u0000\u0000"+
		"bh\u0005\"\u0000\u0000cg\b\u0003\u0000\u0000de\u0005\\\u0000\u0000eg\t"+
		"\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005\"\u0000"+
		"\u0000l\u001c\u0001\u0000\u0000\u0000\u0007\u0000OUZ`fh\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}