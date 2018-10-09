// Generated from Time.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TimeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		END=1, XYZ=2, TIME=3, WS=4, ABC=5, ABCD=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"END", "XYZ", "TIME", "WS", "ABC", "ABCD"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "END", "XYZ", "TIME", "WS", "ABC", "ABCD"
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


	public TimeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Time.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b9\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\21\n\2\r\2\16\2\22\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4\33\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4#\n\4\3\5\6"+
		"\5&\n\5\r\5\16\5\'\3\5\3\5\3\6\6\6-\n\6\r\6\16\6.\3\6\3\6\3\7\6\7\64\n"+
		"\7\r\7\16\7\65\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\13\3\2z|\3\2"+
		"\62\63\3\2\62;\3\2\64\64\3\2\62\65\3\2\62\67\5\2\13\f\17\17\"\"\3\2C\\"+
		"\3\2c|\2>\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\3\20\3\2\2\2\5\24\3\2\2\2\7\32\3\2\2\2\t%\3\2\2\2\13,\3\2"+
		"\2\2\r\63\3\2\2\2\17\21\5\7\4\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2"+
		"\2\2\22\23\3\2\2\2\23\4\3\2\2\2\24\25\t\2\2\2\25\6\3\2\2\2\26\27\t\3\2"+
		"\2\27\33\t\4\2\2\30\31\t\5\2\2\31\33\t\6\2\2\32\26\3\2\2\2\32\30\3\2\2"+
		"\2\33\34\3\2\2\2\34\35\7<\2\2\35\36\t\7\2\2\36\"\t\4\2\2\37 \7<\2\2 !"+
		"\t\7\2\2!#\t\4\2\2\"\37\3\2\2\2\"#\3\2\2\2#\b\3\2\2\2$&\t\b\2\2%$\3\2"+
		"\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\b\5\2\2*\n\3\2\2\2+"+
		"-\t\t\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\b"+
		"\6\2\2\61\f\3\2\2\2\62\64\t\n\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3"+
		"\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\b\7\2\28\16\3\2\2\2\t\2\22\32\""+
		"\'.\65\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}