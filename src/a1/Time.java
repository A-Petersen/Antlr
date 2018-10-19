package a1;// Generated from Time.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Time extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		XYZ=1, TIME=2, WS=3, ABC=4, ABCD=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"XYZ", "TIME", "WS", "ABC", "ABCD", "HH", "MM"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "XYZ", "TIME", "WS", "ABC", "ABCD"
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


	public Time(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "a1/Time.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\78\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\31\n\3\3\4\6\4\34\n\4\r\4\16\4\35\3\4\3\4\3\5\6\5#\n\5\r\5\16"+
		"\5$\3\5\3\5\3\6\6\6*\n\6\r\6\16\6+\3\6\3\6\3\7\3\7\3\7\3\7\5\7\64\n\7"+
		"\3\b\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\2\17\2\3\2\13\3\2z|\5\2\13\f"+
		"\17\17\"\"\3\2C\\\3\2c|\3\2\62\63\3\2\62;\3\2\64\64\3\2\62\65\3\2\62\67"+
		"\2:\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\21"+
		"\3\2\2\2\5\23\3\2\2\2\7\33\3\2\2\2\t\"\3\2\2\2\13)\3\2\2\2\r\63\3\2\2"+
		"\2\17\65\3\2\2\2\21\22\t\2\2\2\22\4\3\2\2\2\23\24\5\r\7\2\24\25\7<\2\2"+
		"\25\30\5\17\b\2\26\27\7<\2\2\27\31\5\17\b\2\30\26\3\2\2\2\30\31\3\2\2"+
		"\2\31\6\3\2\2\2\32\34\t\3\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2"+
		"\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \b\4\2\2 \b\3\2\2\2!#\t\4\2\2\"!\3\2"+
		"\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\b\5\2\2\'\n\3\2\2\2("+
		"*\t\5\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\b\6\2\2"+
		".\f\3\2\2\2/\60\t\6\2\2\60\64\t\7\2\2\61\62\t\b\2\2\62\64\t\t\2\2\63/"+
		"\3\2\2\2\63\61\3\2\2\2\64\16\3\2\2\2\65\66\t\n\2\2\66\67\t\7\2\2\67\20"+
		"\3\2\2\2\b\2\30\35$+\63\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}