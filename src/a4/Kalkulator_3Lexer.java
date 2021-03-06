package a4;// Generated from Kalkulator_3.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Kalkulator_3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INT=11, ID=12, NL=13, MUL=14, DIV=15, ADD=16, SUB=17, POW=18, 
		EQU=19, BIG=20, SMA=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "INT", "ID", "NL", "MUL", "DIV", "ADD", "SUB", "POW", "EQU", "BIG", 
		"SMA", "WS", "ID_LETTER", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'clear'", "'('", "')'", "'?'", "':'", "'if'", "'{'", "'}'", 
		"'else'", null, null, null, "'*'", "'/'", "'+'", "'-'", "'^'", "'=='", 
		"'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "INT", 
		"ID", "NL", "MUL", "DIV", "ADD", "SUB", "POW", "EQU", "BIG", "SMA", "WS"
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


	public Kalkulator_3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kalkulator_3.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\6\fQ\n\f\r\f\16\f"+
		"R\3\r\3\r\7\rW\n\r\f\r\16\rZ\13\r\3\16\5\16]\n\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\6\27s\n\27\r\27\16\27t\3\27\3\27\3\30\3\30\3\31\3\31\2\2\32"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\3\2\5\4\2\13\13\"\"\4\2C\\"+
		"c|\3\2\62;\2}\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\3\63\3\2\2\2\5\65\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2"+
		"\2\2\17C\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25J\3\2\2\2\27P\3\2\2\2\31T\3"+
		"\2\2\2\33\\\3\2\2\2\35`\3\2\2\2\37b\3\2\2\2!d\3\2\2\2#f\3\2\2\2%h\3\2"+
		"\2\2\'j\3\2\2\2)m\3\2\2\2+o\3\2\2\2-r\3\2\2\2/x\3\2\2\2\61z\3\2\2\2\63"+
		"\64\7?\2\2\64\4\3\2\2\2\65\66\7e\2\2\66\67\7n\2\2\678\7g\2\289\7c\2\2"+
		"9:\7t\2\2:\6\3\2\2\2;<\7*\2\2<\b\3\2\2\2=>\7+\2\2>\n\3\2\2\2?@\7A\2\2"+
		"@\f\3\2\2\2AB\7<\2\2B\16\3\2\2\2CD\7k\2\2DE\7h\2\2E\20\3\2\2\2FG\7}\2"+
		"\2G\22\3\2\2\2HI\7\177\2\2I\24\3\2\2\2JK\7g\2\2KL\7n\2\2LM\7u\2\2MN\7"+
		"g\2\2N\26\3\2\2\2OQ\5\61\31\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2"+
		"S\30\3\2\2\2TX\5/\30\2UW\5/\30\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2"+
		"\2Y\32\3\2\2\2ZX\3\2\2\2[]\7\17\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_"+
		"\7\f\2\2_\34\3\2\2\2`a\7,\2\2a\36\3\2\2\2bc\7\61\2\2c \3\2\2\2de\7-\2"+
		"\2e\"\3\2\2\2fg\7/\2\2g$\3\2\2\2hi\7`\2\2i&\3\2\2\2jk\7?\2\2kl\7?\2\2"+
		"l(\3\2\2\2mn\7@\2\2n*\3\2\2\2op\7>\2\2p,\3\2\2\2qs\t\2\2\2rq\3\2\2\2s"+
		"t\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\27\2\2w.\3\2\2\2xy\t\3\2\2"+
		"y\60\3\2\2\2z{\t\4\2\2{\62\3\2\2\2\7\2RX\\t\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}