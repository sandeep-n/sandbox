// Generated from Chatlang.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChatlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SAYS=7, SHOUTS=8, WORD=9, 
		WHITESPACE=10, NEWLINE=11, NUMBER=12, TEXT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "A", "S", "Y", "H", "O", 
			"U", "T", "DIGIT", "LOWERCASE", "UPPERCASE", "SAYS", "SHOUTS", "WORD", 
			"WHITESPACE", "NEWLINE", "NUMBER", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'-'", "')'", "'('", "'/'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "SAYS", "SHOUTS", "WORD", "WHITESPACE", 
			"NEWLINE", "NUMBER", "TEXT"
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


	public ChatlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Chatlang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\6\24a\n\24\r\24\16\24b\3\25\3\25\3\26\5\26h\n\26\3\26\3\26\6\26l\n\26"+
		"\r\26\16\26m\3\27\6\27q\n\27\r\27\16\27r\3\27\3\27\6\27w\n\27\r\27\16"+
		"\27x\5\27{\n\27\3\30\3\30\6\30\177\n\30\r\30\16\30\u0080\3\30\3\30\2\2"+
		"\31\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37"+
		"\2!\2#\t%\n\'\13)\f+\r-\16/\17\3\2\20\4\2CCcc\4\2UUuu\4\2[[{{\4\2JJjj"+
		"\4\2QQqq\4\2WWww\4\2VVvv\3\2\62;\3\2c|\3\2C\\\4\2\13\13\"\"\3\2\60\60"+
		"\4\2**]]\4\2++__\2\u0083\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2"+
		"\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23A\3"+
		"\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33I\3\2\2\2\35K\3\2\2\2\37"+
		"M\3\2\2\2!O\3\2\2\2#Q\3\2\2\2%V\3\2\2\2\'`\3\2\2\2)d\3\2\2\2+k\3\2\2\2"+
		"-p\3\2\2\2/|\3\2\2\2\61\62\7<\2\2\62\4\3\2\2\2\63\64\7/\2\2\64\6\3\2\2"+
		"\2\65\66\7+\2\2\66\b\3\2\2\2\678\7*\2\28\n\3\2\2\29:\7\61\2\2:\f\3\2\2"+
		"\2;<\7B\2\2<\16\3\2\2\2=>\t\2\2\2>\20\3\2\2\2?@\t\3\2\2@\22\3\2\2\2AB"+
		"\t\4\2\2B\24\3\2\2\2CD\t\5\2\2D\26\3\2\2\2EF\t\6\2\2F\30\3\2\2\2GH\t\7"+
		"\2\2H\32\3\2\2\2IJ\t\b\2\2J\34\3\2\2\2KL\t\t\2\2L\36\3\2\2\2MN\t\n\2\2"+
		"N \3\2\2\2OP\t\13\2\2P\"\3\2\2\2QR\5\21\t\2RS\5\17\b\2ST\5\23\n\2TU\5"+
		"\21\t\2U$\3\2\2\2VW\5\21\t\2WX\5\25\13\2XY\5\27\f\2YZ\5\31\r\2Z[\5\33"+
		"\16\2[\\\5\21\t\2\\&\3\2\2\2]a\5\37\20\2^a\5!\21\2_a\7a\2\2`]\3\2\2\2"+
		"`^\3\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c(\3\2\2\2de\t\f\2\2"+
		"e*\3\2\2\2fh\7\17\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2il\7\f\2\2jl\7\17\2"+
		"\2kg\3\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n,\3\2\2\2oq\5\35"+
		"\17\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2sz\3\2\2\2tv\t\r\2\2uw\5"+
		"\35\17\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zt\3\2\2\2z"+
		"{\3\2\2\2{.\3\2\2\2|~\t\16\2\2}\177\n\17\2\2~}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\t\17\2\2\u0083\60\3\2\2\2\f\2`bgkmrxz\u0080\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}