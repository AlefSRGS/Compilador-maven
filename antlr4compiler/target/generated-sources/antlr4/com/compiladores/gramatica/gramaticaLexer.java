// Generated from java-escape by ANTLR 4.11.1
package com.compiladores.gramatica;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, INT=12, BOOL=13, FLOAT=14, DOUBLE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "ID", "INT", "BOOL", "FLOAT", "DOUBLE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'%'", "'('", "')'", "'int'", "'float'", 
			"'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"INT", "BOOL", "FLOAT", "DOUBLE", "WS"
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

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
		"\u0004\u0000\u0010z\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\nB\b"+
		"\n\u000b\n\f\nC\u0001\n\u0005\nG\b\n\n\n\f\nJ\t\n\u0001\u000b\u0004\u000b"+
		"M\b\u000b\u000b\u000b\f\u000bN\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fZ\b\f\u0001\r\u0004\r]\b\r\u000b"+
		"\r\f\r^\u0001\r\u0001\r\u0004\rc\b\r\u000b\r\f\rd\u0001\u000e\u0004\u000e"+
		"h\b\u000e\u000b\u000e\f\u000ei\u0001\u000e\u0001\u000e\u0004\u000en\b"+
		"\u000e\u000b\u000e\f\u000eo\u0003\u000er\b\u000e\u0001\u000f\u0004\u000f"+
		"u\b\u000f\u000b\u000f\f\u000fv\u0001\u000f\u0001\u000f\u0000\u0000\u0010"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010\u0001\u0000\u0004\u0002\u0000AZaz\u0003\u0000"+
		"09AZaz\u0001\u000009\u0003\u0000\t\n\r\r  \u0083\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003"+
		"#\u0001\u0000\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001"+
		"\u0000\u0000\u0000\t)\u0001\u0000\u0000\u0000\u000b+\u0001\u0000\u0000"+
		"\u0000\r-\u0001\u0000\u0000\u0000\u000f/\u0001\u0000\u0000\u0000\u0011"+
		"3\u0001\u0000\u0000\u0000\u00139\u0001\u0000\u0000\u0000\u0015A\u0001"+
		"\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019Y\u0001\u0000\u0000"+
		"\u0000\u001b\\\u0001\u0000\u0000\u0000\u001dg\u0001\u0000\u0000\u0000"+
		"\u001ft\u0001\u0000\u0000\u0000!\"\u0005*\u0000\u0000\"\u0002\u0001\u0000"+
		"\u0000\u0000#$\u0005/\u0000\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005"+
		"+\u0000\u0000&\u0006\u0001\u0000\u0000\u0000\'(\u0005-\u0000\u0000(\b"+
		"\u0001\u0000\u0000\u0000)*\u0005%\u0000\u0000*\n\u0001\u0000\u0000\u0000"+
		"+,\u0005(\u0000\u0000,\f\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000"+
		".\u000e\u0001\u0000\u0000\u0000/0\u0005i\u0000\u000001\u0005n\u0000\u0000"+
		"12\u0005t\u0000\u00002\u0010\u0001\u0000\u0000\u000034\u0005f\u0000\u0000"+
		"45\u0005l\u0000\u000056\u0005o\u0000\u000067\u0005a\u0000\u000078\u0005"+
		"t\u0000\u00008\u0012\u0001\u0000\u0000\u00009:\u0005d\u0000\u0000:;\u0005"+
		"o\u0000\u0000;<\u0005u\u0000\u0000<=\u0005b\u0000\u0000=>\u0005l\u0000"+
		"\u0000>?\u0005e\u0000\u0000?\u0014\u0001\u0000\u0000\u0000@B\u0007\u0000"+
		"\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DH\u0001\u0000\u0000\u0000"+
		"EG\u0007\u0001\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0016\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KM\u0007\u0002\u0000\u0000"+
		"LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000"+
		"\u0000NO\u0001\u0000\u0000\u0000O\u0018\u0001\u0000\u0000\u0000PQ\u0005"+
		"t\u0000\u0000QR\u0005r\u0000\u0000RS\u0005u\u0000\u0000SZ\u0005e\u0000"+
		"\u0000TU\u0005f\u0000\u0000UV\u0005a\u0000\u0000VW\u0005l\u0000\u0000"+
		"WX\u0005s\u0000\u0000XZ\u0005e\u0000\u0000YP\u0001\u0000\u0000\u0000Y"+
		"T\u0001\u0000\u0000\u0000Z\u001a\u0001\u0000\u0000\u0000[]\u0007\u0002"+
		"\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`b\u0005.\u0000\u0000ac\u0007\u0002\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000e\u001c\u0001\u0000\u0000\u0000fh\u0007\u0002\u0000\u0000gf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jq\u0001\u0000\u0000\u0000km\u0005.\u0000\u0000"+
		"ln\u0007\u0002\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000"+
		"\u0000\u0000qk\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u001e"+
		"\u0001\u0000\u0000\u0000su\u0007\u0003\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0006\u000f\u0000\u0000y \u0001"+
		"\u0000\u0000\u0000\u000b\u0000CHNY^dioqv\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}