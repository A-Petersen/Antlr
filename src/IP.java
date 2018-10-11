// Generated from IP.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IP extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PI=1, WS=2, ABC=3, ABCD=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PI", "WS", "ABC", "ABCD", "IPPIECE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PI", "WS", "ABC", "ABCD"
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


	public IP(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IP.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6\66\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6"+
		"\3\27\n\3\r\3\16\3\30\3\3\3\3\3\4\6\4\36\n\4\r\4\16\4\37\3\4\3\4\3\5\6"+
		"\5%\n\5\r\5\16\5&\3\5\3\5\3\6\5\6,\n\6\3\6\5\6/\n\6\3\6\3\6\3\6\3\6\5"+
		"\6\65\n\6\2\2\7\3\3\5\4\7\5\t\6\13\2\3\2\t\5\2\13\f\17\17\"\"\3\2C\\\3"+
		"\2c|\3\2\62\63\3\2\62;\3\2\64\64\3\2\62\67\2:\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\3\r\3\2\2\2\5\26\3\2\2\2\7\35\3\2\2\2\t$\3\2"+
		"\2\2\13\64\3\2\2\2\r\16\5\13\6\2\16\17\7\60\2\2\17\20\5\13\6\2\20\21\7"+
		"\60\2\2\21\22\5\13\6\2\22\23\7\60\2\2\23\24\5\13\6\2\24\4\3\2\2\2\25\27"+
		"\t\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32"+
		"\3\2\2\2\32\33\b\3\2\2\33\6\3\2\2\2\34\36\t\3\2\2\35\34\3\2\2\2\36\37"+
		"\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\b\4\2\2\"\b\3\2\2\2#%"+
		"\t\4\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\b\5\2\2"+
		")\n\3\2\2\2*,\t\5\2\2+*\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/\t\6\2\2.-\3\2\2"+
		"\2./\3\2\2\2/\60\3\2\2\2\60\65\t\6\2\2\61\62\t\7\2\2\62\63\t\b\2\2\63"+
		"\65\t\b\2\2\64+\3\2\2\2\64\61\3\2\2\2\65\f\3\2\2\2\t\2\30\37&+.\64\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}