// Generated from Kalkulator_2.g4 by ANTLR 4.7.1

package a4;
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Kalkulator_2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, ID=8, NL=9, MUL=10, 
		DIV=11, ADD=12, SUB=13, POW=14, EQU=15, BIG=16, SMA=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INT", "ID", "NL", "MUL", 
		"DIV", "ADD", "SUB", "POW", "EQU", "BIG", "SMA", "WS", "ID_LETTER", "DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'clear'", "'('", "')'", "'?'", "':'", null, null, null, 
		"'*'", "'/'", "'+'", "'-'", "'^'", "'=='", "'>'", "'<'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "INT", "ID", "NL", "MUL", "DIV", 
		"ADD", "SUB", "POW", "EQU", "BIG", "SMA", "WS"
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


	public Kalkulator_2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Kalkulator_2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b=\n\b\r\b\16\b>\3\t\3\t\7\tC\n\t\f\t\16"+
		"\tF\13\t\3\n\5\nI\n\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23_\n\23\r\23\16\23`\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2\3\2\5\4\2"+
		"\13\13\"\"\4\2C\\c|\3\2\62;\2i\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7\63"+
		"\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17<\3\2\2\2\21@\3\2\2\2"+
		"\23H\3\2\2\2\25L\3\2\2\2\27N\3\2\2\2\31P\3\2\2\2\33R\3\2\2\2\35T\3\2\2"+
		"\2\37V\3\2\2\2!Y\3\2\2\2#[\3\2\2\2%^\3\2\2\2\'d\3\2\2\2)f\3\2\2\2+,\7"+
		"?\2\2,\4\3\2\2\2-.\7e\2\2./\7n\2\2/\60\7g\2\2\60\61\7c\2\2\61\62\7t\2"+
		"\2\62\6\3\2\2\2\63\64\7*\2\2\64\b\3\2\2\2\65\66\7+\2\2\66\n\3\2\2\2\67"+
		"8\7A\2\28\f\3\2\2\29:\7<\2\2:\16\3\2\2\2;=\5)\25\2<;\3\2\2\2=>\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?\20\3\2\2\2@D\5\'\24\2AC\5\'\24\2BA\3\2\2\2CF\3\2"+
		"\2\2DB\3\2\2\2DE\3\2\2\2E\22\3\2\2\2FD\3\2\2\2GI\7\17\2\2HG\3\2\2\2HI"+
		"\3\2\2\2IJ\3\2\2\2JK\7\f\2\2K\24\3\2\2\2LM\7,\2\2M\26\3\2\2\2NO\7\61\2"+
		"\2O\30\3\2\2\2PQ\7-\2\2Q\32\3\2\2\2RS\7/\2\2S\34\3\2\2\2TU\7`\2\2U\36"+
		"\3\2\2\2VW\7?\2\2WX\7?\2\2X \3\2\2\2YZ\7@\2\2Z\"\3\2\2\2[\\\7>\2\2\\$"+
		"\3\2\2\2]_\t\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2b"+
		"c\b\23\2\2c&\3\2\2\2de\t\3\2\2e(\3\2\2\2fg\t\4\2\2g*\3\2\2\2\7\2>DH`\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}