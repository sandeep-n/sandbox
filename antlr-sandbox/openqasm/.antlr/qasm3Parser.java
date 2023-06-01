// Generated from /home/sandeep/sandbox/antlr-sandbox/openqasm/qasm3.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class qasm3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, LBRACKET=91, RBRACKET=92, LBRACE=93, RBRACE=94, 
		LPAREN=95, RPAREN=96, COLON=97, SEMICOLON=98, DOT=99, COMMA=100, EQUALS=101, 
		ARROW=102, PLUS=103, MINUS=104, MUL=105, DIV=106, MOD=107, Constant=108, 
		Whitespace=109, Newline=110, Integer=111, Identifier=112, RealNumber=113, 
		TimingLiteral=114, StringLiteral=115, LineComment=116, BlockComment=117;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_version = 2, RULE_include = 3, 
		RULE_ioIdentifier = 4, RULE_io = 5, RULE_globalStatement = 6, RULE_statement = 7, 
		RULE_quantumDeclarationStatement = 8, RULE_classicalDeclarationStatement = 9, 
		RULE_classicalAssignment = 10, RULE_assignmentStatement = 11, RULE_returnSignature = 12, 
		RULE_designator = 13, RULE_doubleDesignator = 14, RULE_identifierList = 15, 
		RULE_quantumDeclaration = 16, RULE_quantumArgument = 17, RULE_quantumArgumentList = 18, 
		RULE_bitType = 19, RULE_singleDesignatorType = 20, RULE_doubleDesignatorType = 21, 
		RULE_noDesignatorType = 22, RULE_classicalType = 23, RULE_constantDeclaration = 24, 
		RULE_singleDesignatorDeclaration = 25, RULE_doubleDesignatorDeclaration = 26, 
		RULE_noDesignatorDeclaration = 27, RULE_bitDeclaration = 28, RULE_classicalDeclaration = 29, 
		RULE_classicalTypeList = 30, RULE_classicalArgument = 31, RULE_classicalArgumentList = 32, 
		RULE_anyTypeArgument = 33, RULE_anyTypeArgumentList = 34, RULE_aliasStatement = 35, 
		RULE_indexIdentifier = 36, RULE_indexIdentifierList = 37, RULE_rangeDefinition = 38, 
		RULE_quantumGateDefinition = 39, RULE_quantumGateSignature = 40, RULE_quantumGateName = 41, 
		RULE_quantumBlock = 42, RULE_quantumLoop = 43, RULE_quantumLoopBlock = 44, 
		RULE_quantumStatement = 45, RULE_quantumInstruction = 46, RULE_quantumPhase = 47, 
		RULE_quantumReset = 48, RULE_quantumMeasurement = 49, RULE_quantumMeasurementAssignment = 50, 
		RULE_quantumBarrier = 51, RULE_quantumGateModifier = 52, RULE_powModifier = 53, 
		RULE_ctrlModifier = 54, RULE_quantumGateCall = 55, RULE_unaryOperator = 56, 
		RULE_comparisonOperator = 57, RULE_equalityOperator = 58, RULE_logicalOperator = 59, 
		RULE_expressionStatement = 60, RULE_expression = 61, RULE_logicalAndExpression = 62, 
		RULE_bitOrExpression = 63, RULE_xOrExpression = 64, RULE_bitAndExpression = 65, 
		RULE_equalityExpression = 66, RULE_comparisonExpression = 67, RULE_bitShiftExpression = 68, 
		RULE_additiveExpression = 69, RULE_multiplicativeExpression = 70, RULE_unaryExpression = 71, 
		RULE_powerExpression = 72, RULE_expressionTerminator = 73, RULE_booleanLiteral = 74, 
		RULE_incrementor = 75, RULE_builtInCall = 76, RULE_builtInMath = 77, RULE_castOperator = 78, 
		RULE_expressionList = 79, RULE_equalsExpression = 80, RULE_assignmentOperator = 81, 
		RULE_setDeclaration = 82, RULE_programBlock = 83, RULE_branchingStatement = 84, 
		RULE_loopSignature = 85, RULE_loopStatement = 86, RULE_endStatement = 87, 
		RULE_returnStatement = 88, RULE_controlDirective = 89, RULE_externDeclaration = 90, 
		RULE_externOrSubroutineCall = 91, RULE_subroutineDefinition = 92, RULE_subroutineBlock = 93, 
		RULE_pragma = 94, RULE_timingType = 95, RULE_timingBox = 96, RULE_timingIdentifier = 97, 
		RULE_timingInstructionName = 98, RULE_timingInstruction = 99, RULE_timingStatement = 100, 
		RULE_calibration = 101, RULE_calibrationGrammarDeclaration = 102, RULE_calibrationDefinition = 103, 
		RULE_calibrationGrammar = 104, RULE_calibrationArgumentList = 105;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "header", "version", "include", "ioIdentifier", "io", "globalStatement", 
			"statement", "quantumDeclarationStatement", "classicalDeclarationStatement", 
			"classicalAssignment", "assignmentStatement", "returnSignature", "designator", 
			"doubleDesignator", "identifierList", "quantumDeclaration", "quantumArgument", 
			"quantumArgumentList", "bitType", "singleDesignatorType", "doubleDesignatorType", 
			"noDesignatorType", "classicalType", "constantDeclaration", "singleDesignatorDeclaration", 
			"doubleDesignatorDeclaration", "noDesignatorDeclaration", "bitDeclaration", 
			"classicalDeclaration", "classicalTypeList", "classicalArgument", "classicalArgumentList", 
			"anyTypeArgument", "anyTypeArgumentList", "aliasStatement", "indexIdentifier", 
			"indexIdentifierList", "rangeDefinition", "quantumGateDefinition", "quantumGateSignature", 
			"quantumGateName", "quantumBlock", "quantumLoop", "quantumLoopBlock", 
			"quantumStatement", "quantumInstruction", "quantumPhase", "quantumReset", 
			"quantumMeasurement", "quantumMeasurementAssignment", "quantumBarrier", 
			"quantumGateModifier", "powModifier", "ctrlModifier", "quantumGateCall", 
			"unaryOperator", "comparisonOperator", "equalityOperator", "logicalOperator", 
			"expressionStatement", "expression", "logicalAndExpression", "bitOrExpression", 
			"xOrExpression", "bitAndExpression", "equalityExpression", "comparisonExpression", 
			"bitShiftExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "powerExpression", "expressionTerminator", "booleanLiteral", 
			"incrementor", "builtInCall", "builtInMath", "castOperator", "expressionList", 
			"equalsExpression", "assignmentOperator", "setDeclaration", "programBlock", 
			"branchingStatement", "loopSignature", "loopStatement", "endStatement", 
			"returnStatement", "controlDirective", "externDeclaration", "externOrSubroutineCall", 
			"subroutineDefinition", "subroutineBlock", "pragma", "timingType", "timingBox", 
			"timingIdentifier", "timingInstructionName", "timingInstruction", "timingStatement", 
			"calibration", "calibrationGrammarDeclaration", "calibrationDefinition", 
			"calibrationGrammar", "calibrationArgumentList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'OPENQASM'", "'include'", "'input'", "'output'", "'qreg'", "'qubit'", 
			"'bit'", "'creg'", "'int'", "'uint'", "'float'", "'angle'", "'fixed'", 
			"'bool'", "'const'", "'let'", "'||'", "'gate'", "'U'", "'CX'", "'gphase'", 
			"'reset'", "'measure'", "'barrier'", "'inv'", "'@'", "'pow'", "'ctrl'", 
			"'negctrl'", "'~'", "'!'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'&&'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'**'", "'true'", "'false'", 
			"'++'", "'--'", "'sin'", "'cos'", "'tan'", "'exp'", "'ln'", "'sqrt'", 
			"'rotl'", "'rotr'", "'popcount'", "'+='", "'-='", "'*='", "'/='", "'&='", 
			"'|='", "'~='", "'^='", "'<<='", "'>>='", "'%='", "'**='", "'if'", "'else'", 
			"'for'", "'in'", "'while'", "'end'", "'return'", "'break'", "'continue'", 
			"'extern'", "'def'", "'#pragma'", "'duration'", "'stretch'", "'box'", 
			"'durationof'", "'delay'", "'rotary'", "'defcalgrammar'", "'defcal'", 
			"'\"openpulse\"'", "'['", "']'", "'{'", "'}'", "'('", "')'", "':'", "';'", 
			"'.'", "','", "'='", "'->'", "'+'", "'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "LBRACKET", "RBRACKET", "LBRACE", 
			"RBRACE", "LPAREN", "RPAREN", "COLON", "SEMICOLON", "DOT", "COMMA", "EQUALS", 
			"ARROW", "PLUS", "MINUS", "MUL", "DIV", "MOD", "Constant", "Whitespace", 
			"Newline", "Integer", "Identifier", "RealNumber", "TimingLiteral", "StringLiteral", 
			"LineComment", "BlockComment"
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

	@Override
	public String getGrammarFileName() { return "qasm3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public qasm3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<GlobalStatementContext> globalStatement() {
			return getRuleContexts(GlobalStatementContext.class);
		}
		public GlobalStatementContext globalStatement(int i) {
			return getRuleContext(GlobalStatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			header();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__71 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__78 - 70)) | (1L << (T__79 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__82 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__86 - 70)) | (1L << (T__87 - 70)) | (1L << (T__88 - 70)) | (1L << (LPAREN - 70)) | (1L << (MINUS - 70)) | (1L << (Constant - 70)) | (1L << (Integer - 70)) | (1L << (Identifier - 70)) | (1L << (RealNumber - 70)) | (1L << (TimingLiteral - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
				{
				setState(215);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case T__5:
				case T__17:
				case T__78:
				case T__79:
				case T__80:
				case T__87:
				case T__88:
					{
					setState(213);
					globalStatement();
					}
					break;
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__44:
				case T__45:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__54:
				case T__55:
				case T__56:
				case T__69:
				case T__71:
				case T__73:
				case T__74:
				case T__81:
				case T__82:
				case T__83:
				case T__84:
				case T__85:
				case T__86:
				case LPAREN:
				case MINUS:
				case Constant:
				case Integer:
				case Identifier:
				case RealNumber:
				case TimingLiteral:
				case StringLiteral:
					{
					setState(214);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<IoContext> io() {
			return getRuleContexts(IoContext.class);
		}
		public IoContext io(int i) {
			return getRuleContext(IoContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(220);
				version();
				}
			}

			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(223);
				include();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(229);
				io();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public TerminalNode Integer() { return getToken(qasm3Parser.Integer, 0); }
		public TerminalNode RealNumber() { return getToken(qasm3Parser.RealNumber, 0); }
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__0);
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==Integer || _la==RealNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(237);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(qasm3Parser.StringLiteral, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__1);
			setState(240);
			match(StringLiteral);
			setState(241);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IoIdentifierContext extends ParserRuleContext {
		public IoIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioIdentifier; }
	}

	public final IoIdentifierContext ioIdentifier() throws RecognitionException {
		IoIdentifierContext _localctx = new IoIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ioIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IoContext extends ParserRuleContext {
		public IoIdentifierContext ioIdentifier() {
			return getRuleContext(IoIdentifierContext.class,0);
		}
		public ClassicalTypeContext classicalType() {
			return getRuleContext(ClassicalTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public IoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io; }
	}

	public final IoContext io() throws RecognitionException {
		IoContext _localctx = new IoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_io);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			ioIdentifier();
			setState(246);
			classicalType();
			setState(247);
			match(Identifier);
			setState(248);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalStatementContext extends ParserRuleContext {
		public SubroutineDefinitionContext subroutineDefinition() {
			return getRuleContext(SubroutineDefinitionContext.class,0);
		}
		public ExternDeclarationContext externDeclaration() {
			return getRuleContext(ExternDeclarationContext.class,0);
		}
		public QuantumGateDefinitionContext quantumGateDefinition() {
			return getRuleContext(QuantumGateDefinitionContext.class,0);
		}
		public CalibrationContext calibration() {
			return getRuleContext(CalibrationContext.class,0);
		}
		public QuantumDeclarationStatementContext quantumDeclarationStatement() {
			return getRuleContext(QuantumDeclarationStatementContext.class,0);
		}
		public PragmaContext pragma() {
			return getRuleContext(PragmaContext.class,0);
		}
		public GlobalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStatement; }
	}

	public final GlobalStatementContext globalStatement() throws RecognitionException {
		GlobalStatementContext _localctx = new GlobalStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_globalStatement);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__79:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				subroutineDefinition();
				}
				break;
			case T__78:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				externDeclaration();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				quantumGateDefinition();
				}
				break;
			case T__87:
			case T__88:
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				calibration();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				quantumDeclarationStatement();
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				pragma();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ClassicalDeclarationStatementContext classicalDeclarationStatement() {
			return getRuleContext(ClassicalDeclarationStatementContext.class,0);
		}
		public BranchingStatementContext branchingStatement() {
			return getRuleContext(BranchingStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public EndStatementContext endStatement() {
			return getRuleContext(EndStatementContext.class,0);
		}
		public AliasStatementContext aliasStatement() {
			return getRuleContext(AliasStatementContext.class,0);
		}
		public QuantumStatementContext quantumStatement() {
			return getRuleContext(QuantumStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				assignmentStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				classicalDeclarationStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				branchingStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				loopStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				endStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				aliasStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				quantumStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumDeclarationStatementContext extends ParserRuleContext {
		public QuantumDeclarationContext quantumDeclaration() {
			return getRuleContext(QuantumDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public QuantumDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumDeclarationStatement; }
	}

	public final QuantumDeclarationStatementContext quantumDeclarationStatement() throws RecognitionException {
		QuantumDeclarationStatementContext _localctx = new QuantumDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quantumDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			quantumDeclaration();
			setState(269);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassicalDeclarationStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ClassicalDeclarationContext classicalDeclaration() {
			return getRuleContext(ClassicalDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public ClassicalDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicalDeclarationStatement; }
	}

	public final ClassicalDeclarationStatementContext classicalDeclarationStatement() throws RecognitionException {
		ClassicalDeclarationStatementContext _localctx = new ClassicalDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classicalDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__81:
			case T__82:
				{
				setState(271);
				classicalDeclaration();
				}
				break;
			case T__14:
				{
				setState(272);
				constantDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassicalAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassicalAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicalAssignment; }
	}

	public final ClassicalAssignmentContext classicalAssignment() throws RecognitionException {
		ClassicalAssignmentContext _localctx = new ClassicalAssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classicalAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(Identifier);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(278);
				designator();
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (T__57 - 58)) | (1L << (T__58 - 58)) | (1L << (T__59 - 58)) | (1L << (T__60 - 58)) | (1L << (T__61 - 58)) | (1L << (T__62 - 58)) | (1L << (T__63 - 58)) | (1L << (T__64 - 58)) | (1L << (T__65 - 58)) | (1L << (T__66 - 58)) | (1L << (T__67 - 58)) | (1L << (T__68 - 58)) | (1L << (EQUALS - 58)))) != 0)) {
				{
				setState(281);
				assignmentOperator();
				setState(282);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ClassicalAssignmentContext classicalAssignment() {
			return getRuleContext(ClassicalAssignmentContext.class,0);
		}
		public QuantumMeasurementAssignmentContext quantumMeasurementAssignment() {
			return getRuleContext(QuantumMeasurementAssignmentContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(286);
				classicalAssignment();
				}
				break;
			case 2:
				{
				setState(287);
				quantumMeasurementAssignment();
				}
				break;
			}
			setState(290);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnSignatureContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(qasm3Parser.ARROW, 0); }
		public ClassicalTypeContext classicalType() {
			return getRuleContext(ClassicalTypeContext.class,0);
		}
		public ReturnSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnSignature; }
	}

	public final ReturnSignatureContext returnSignature() throws RecognitionException {
		ReturnSignatureContext _localctx = new ReturnSignatureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnSignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(ARROW);
			setState(293);
			classicalType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(qasm3Parser.LBRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(qasm3Parser.RBRACKET, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_designator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LBRACKET);
			setState(296);
			expression(0);
			setState(297);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleDesignatorContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(qasm3Parser.LBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(qasm3Parser.COMMA, 0); }
		public TerminalNode RBRACKET() { return getToken(qasm3Parser.RBRACKET, 0); }
		public DoubleDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleDesignator; }
	}

	public final DoubleDesignatorContext doubleDesignator() throws RecognitionException {
		DoubleDesignatorContext _localctx = new DoubleDesignatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_doubleDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(LBRACKET);
			setState(300);
			expression(0);
			setState(301);
			match(COMMA);
			setState(302);
			expression(0);
			setState(303);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(qasm3Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(qasm3Parser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					match(Identifier);
					setState(306);
					match(COMMA);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(312);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public QuantumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumDeclaration; }
	}

	public final QuantumDeclarationContext quantumDeclaration() throws RecognitionException {
		QuantumDeclarationContext _localctx = new QuantumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_quantumDeclaration);
		int _la;
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(T__4);
				setState(315);
				match(Identifier);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(316);
					designator();
					}
				}

				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(T__5);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(320);
					designator();
					}
				}

				setState(323);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumArgumentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public QuantumArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumArgument; }
	}

	public final QuantumArgumentContext quantumArgument() throws RecognitionException {
		QuantumArgumentContext _localctx = new QuantumArgumentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_quantumArgument);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(T__4);
				setState(327);
				match(Identifier);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(328);
					designator();
					}
				}

				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(T__5);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(332);
					designator();
					}
				}

				setState(335);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumArgumentListContext extends ParserRuleContext {
		public List<QuantumArgumentContext> quantumArgument() {
			return getRuleContexts(QuantumArgumentContext.class);
		}
		public QuantumArgumentContext quantumArgument(int i) {
			return getRuleContext(QuantumArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public QuantumArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumArgumentList; }
	}

	public final QuantumArgumentListContext quantumArgumentList() throws RecognitionException {
		QuantumArgumentListContext _localctx = new QuantumArgumentListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_quantumArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			quantumArgument();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(339);
				match(COMMA);
				setState(340);
				quantumArgument();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitTypeContext extends ParserRuleContext {
		public BitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitType; }
	}

	public final BitTypeContext bitType() throws RecognitionException {
		BitTypeContext _localctx = new BitTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bitType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDesignatorTypeContext extends ParserRuleContext {
		public SingleDesignatorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDesignatorType; }
	}

	public final SingleDesignatorTypeContext singleDesignatorType() throws RecognitionException {
		SingleDesignatorTypeContext _localctx = new SingleDesignatorTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_singleDesignatorType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleDesignatorTypeContext extends ParserRuleContext {
		public DoubleDesignatorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleDesignatorType; }
	}

	public final DoubleDesignatorTypeContext doubleDesignatorType() throws RecognitionException {
		DoubleDesignatorTypeContext _localctx = new DoubleDesignatorTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_doubleDesignatorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoDesignatorTypeContext extends ParserRuleContext {
		public TimingTypeContext timingType() {
			return getRuleContext(TimingTypeContext.class,0);
		}
		public NoDesignatorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noDesignatorType; }
	}

	public final NoDesignatorTypeContext noDesignatorType() throws RecognitionException {
		NoDesignatorTypeContext _localctx = new NoDesignatorTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_noDesignatorType);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(T__13);
				}
				break;
			case T__81:
			case T__82:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				timingType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassicalTypeContext extends ParserRuleContext {
		public SingleDesignatorTypeContext singleDesignatorType() {
			return getRuleContext(SingleDesignatorTypeContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DoubleDesignatorTypeContext doubleDesignatorType() {
			return getRuleContext(DoubleDesignatorTypeContext.class,0);
		}
		public DoubleDesignatorContext doubleDesignator() {
			return getRuleContext(DoubleDesignatorContext.class,0);
		}
		public NoDesignatorTypeContext noDesignatorType() {
			return getRuleContext(NoDesignatorTypeContext.class,0);
		}
		public BitTypeContext bitType() {
			return getRuleContext(BitTypeContext.class,0);
		}
		public ClassicalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicalType; }
	}

	public final ClassicalTypeContext classicalType() throws RecognitionException {
		ClassicalTypeContext _localctx = new ClassicalTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classicalType);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				singleDesignatorType();
				setState(357);
				designator();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				doubleDesignatorType();
				setState(360);
				doubleDesignator();
				}
				break;
			case T__13:
			case T__81:
			case T__82:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				noDesignatorType();
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				bitType();
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(364);
					designator();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public EqualsExpressionContext equalsExpression() {
			return getRuleContext(EqualsExpressionContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__14);
			setState(370);
			match(Identifier);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(371);
				equalsExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDesignatorDeclarationContext extends ParserRuleContext {
		public SingleDesignatorTypeContext singleDesignatorType() {
			return getRuleContext(SingleDesignatorTypeContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public EqualsExpressionContext equalsExpression() {
			return getRuleContext(EqualsExpressionContext.class,0);
		}
		public SingleDesignatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDesignatorDeclaration; }
	}

	public final SingleDesignatorDeclarationContext singleDesignatorDeclaration() throws RecognitionException {
		SingleDesignatorDeclarationContext _localctx = new SingleDesignatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_singleDesignatorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			singleDesignatorType();
			setState(375);
			designator();
			setState(376);
			match(Identifier);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(377);
				equalsExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleDesignatorDeclarationContext extends ParserRuleContext {
		public DoubleDesignatorTypeContext doubleDesignatorType() {
			return getRuleContext(DoubleDesignatorTypeContext.class,0);
		}
		public DoubleDesignatorContext doubleDesignator() {
			return getRuleContext(DoubleDesignatorContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public EqualsExpressionContext equalsExpression() {
			return getRuleContext(EqualsExpressionContext.class,0);
		}
		public DoubleDesignatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleDesignatorDeclaration; }
	}

	public final DoubleDesignatorDeclarationContext doubleDesignatorDeclaration() throws RecognitionException {
		DoubleDesignatorDeclarationContext _localctx = new DoubleDesignatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_doubleDesignatorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			doubleDesignatorType();
			setState(381);
			doubleDesignator();
			setState(382);
			match(Identifier);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(383);
				equalsExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoDesignatorDeclarationContext extends ParserRuleContext {
		public NoDesignatorTypeContext noDesignatorType() {
			return getRuleContext(NoDesignatorTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public EqualsExpressionContext equalsExpression() {
			return getRuleContext(EqualsExpressionContext.class,0);
		}
		public NoDesignatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noDesignatorDeclaration; }
	}

	public final NoDesignatorDeclarationContext noDesignatorDeclaration() throws RecognitionException {
		NoDesignatorDeclarationContext _localctx = new NoDesignatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_noDesignatorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			noDesignatorType();
			setState(387);
			match(Identifier);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(388);
				equalsExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public EqualsExpressionContext equalsExpression() {
			return getRuleContext(EqualsExpressionContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public BitDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitDeclaration; }
	}

	public final BitDeclarationContext bitDeclaration() throws RecognitionException {
		BitDeclarationContext _localctx = new BitDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bitDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(391);
				match(T__7);
				setState(392);
				match(Identifier);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(393);
					designator();
					}
				}

				}
				break;
			case T__6:
				{
				setState(396);
				match(T__6);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(397);
					designator();
					}
				}

				setState(400);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(403);
				equalsExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassicalDeclarationContext extends ParserRuleContext {
		public SingleDesignatorDeclarationContext singleDesignatorDeclaration() {
			return getRuleContext(SingleDesignatorDeclarationContext.class,0);
		}
		public DoubleDesignatorDeclarationContext doubleDesignatorDeclaration() {
			return getRuleContext(DoubleDesignatorDeclarationContext.class,0);
		}
		public NoDesignatorDeclarationContext noDesignatorDeclaration() {
			return getRuleContext(NoDesignatorDeclarationContext.class,0);
		}
		public BitDeclarationContext bitDeclaration() {
			return getRuleContext(BitDeclarationContext.class,0);
		}
		public ClassicalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicalDeclaration; }
	}

	public final ClassicalDeclarationContext classicalDeclaration() throws RecognitionException {
		ClassicalDeclarationContext _localctx = new ClassicalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_classicalDeclaration);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				singleDesignatorDeclaration();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				doubleDesignatorDeclaration();
				}
				break;
			case T__13:
			case T__81:
			case T__82:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				noDesignatorDeclaration();
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				bitDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassicalTypeListContext extends ParserRuleContext {
		public List<ClassicalTypeContext> classicalType() {
			return getRuleContexts(ClassicalTypeContext.class);
		}
		public ClassicalTypeContext classicalType(int i) {
			return getRuleContext(ClassicalTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public ClassicalTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicalTypeList; }
	}

	public final ClassicalTypeListContext classicalTypeList() throws RecognitionException {
		ClassicalTypeListContext _localctx = new ClassicalTypeListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_classicalTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					classicalType();
					setState(413);
					match(COMMA);
					}
					} 
				}
				setState(419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(420);
			classicalType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassicalArgumentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public SingleDesignatorTypeContext singleDesignatorType() {
			return getRuleContext(SingleDesignatorTypeContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DoubleDesignatorTypeContext doubleDesignatorType() {
			return getRuleContext(DoubleDesignatorTypeContext.class,0);
		}
		public DoubleDesignatorContext doubleDesignator() {
			return getRuleContext(DoubleDesignatorContext.class,0);
		}
		public NoDesignatorTypeContext noDesignatorType() {
			return getRuleContext(NoDesignatorTypeContext.class,0);
		}
		public ClassicalArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicalArgument; }
	}

	public final ClassicalArgumentContext classicalArgument() throws RecognitionException {
		ClassicalArgumentContext _localctx = new ClassicalArgumentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_classicalArgument);
		int _la;
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__81:
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case T__11:
					{
					setState(422);
					singleDesignatorType();
					setState(423);
					designator();
					}
					break;
				case T__12:
					{
					setState(425);
					doubleDesignatorType();
					setState(426);
					doubleDesignator();
					}
					break;
				case T__13:
				case T__81:
				case T__82:
					{
					setState(428);
					noDesignatorType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(431);
				match(Identifier);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(T__7);
				setState(434);
				match(Identifier);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(435);
					designator();
					}
				}

				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				match(T__6);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACKET) {
					{
					setState(439);
					designator();
					}
				}

				setState(442);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassicalArgumentListContext extends ParserRuleContext {
		public List<ClassicalArgumentContext> classicalArgument() {
			return getRuleContexts(ClassicalArgumentContext.class);
		}
		public ClassicalArgumentContext classicalArgument(int i) {
			return getRuleContext(ClassicalArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public ClassicalArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classicalArgumentList; }
	}

	public final ClassicalArgumentListContext classicalArgumentList() throws RecognitionException {
		ClassicalArgumentListContext _localctx = new ClassicalArgumentListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classicalArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			classicalArgument();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(446);
				match(COMMA);
				setState(447);
				classicalArgument();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyTypeArgumentContext extends ParserRuleContext {
		public ClassicalArgumentContext classicalArgument() {
			return getRuleContext(ClassicalArgumentContext.class,0);
		}
		public QuantumArgumentContext quantumArgument() {
			return getRuleContext(QuantumArgumentContext.class,0);
		}
		public AnyTypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyTypeArgument; }
	}

	public final AnyTypeArgumentContext anyTypeArgument() throws RecognitionException {
		AnyTypeArgumentContext _localctx = new AnyTypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_anyTypeArgument);
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__81:
			case T__82:
				enterOuterAlt(_localctx, 1);
				{
				setState(453);
				classicalArgument();
				}
				break;
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				quantumArgument();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyTypeArgumentListContext extends ParserRuleContext {
		public List<AnyTypeArgumentContext> anyTypeArgument() {
			return getRuleContexts(AnyTypeArgumentContext.class);
		}
		public AnyTypeArgumentContext anyTypeArgument(int i) {
			return getRuleContext(AnyTypeArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public AnyTypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyTypeArgumentList; }
	}

	public final AnyTypeArgumentListContext anyTypeArgumentList() throws RecognitionException {
		AnyTypeArgumentListContext _localctx = new AnyTypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_anyTypeArgumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(457);
					anyTypeArgument();
					setState(458);
					match(COMMA);
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(465);
			anyTypeArgument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode EQUALS() { return getToken(qasm3Parser.EQUALS, 0); }
		public IndexIdentifierContext indexIdentifier() {
			return getRuleContext(IndexIdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public AliasStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasStatement; }
	}

	public final AliasStatementContext aliasStatement() throws RecognitionException {
		AliasStatementContext _localctx = new AliasStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_aliasStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(T__15);
			setState(468);
			match(Identifier);
			setState(469);
			match(EQUALS);
			setState(470);
			indexIdentifier(0);
			setState(471);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public RangeDefinitionContext rangeDefinition() {
			return getRuleContext(RangeDefinitionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(qasm3Parser.LBRACKET, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(qasm3Parser.RBRACKET, 0); }
		public List<IndexIdentifierContext> indexIdentifier() {
			return getRuleContexts(IndexIdentifierContext.class);
		}
		public IndexIdentifierContext indexIdentifier(int i) {
			return getRuleContext(IndexIdentifierContext.class,i);
		}
		public IndexIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexIdentifier; }
	}

	public final IndexIdentifierContext indexIdentifier() throws RecognitionException {
		return indexIdentifier(0);
	}

	private IndexIdentifierContext indexIdentifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IndexIdentifierContext _localctx = new IndexIdentifierContext(_ctx, _parentState);
		IndexIdentifierContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_indexIdentifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(474);
				match(Identifier);
				setState(475);
				rangeDefinition();
				}
				break;
			case 2:
				{
				setState(476);
				match(Identifier);
				setState(481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(477);
					match(LBRACKET);
					setState(478);
					expressionList();
					setState(479);
					match(RBRACKET);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IndexIdentifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_indexIdentifier);
					setState(485);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(486);
					match(T__16);
					setState(487);
					indexIdentifier(2);
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IndexIdentifierListContext extends ParserRuleContext {
		public List<IndexIdentifierContext> indexIdentifier() {
			return getRuleContexts(IndexIdentifierContext.class);
		}
		public IndexIdentifierContext indexIdentifier(int i) {
			return getRuleContext(IndexIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public IndexIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexIdentifierList; }
	}

	public final IndexIdentifierListContext indexIdentifierList() throws RecognitionException {
		IndexIdentifierListContext _localctx = new IndexIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_indexIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			indexIdentifier(0);
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(494);
				match(COMMA);
				setState(495);
				indexIdentifier(0);
				}
				}
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeDefinitionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(qasm3Parser.LBRACKET, 0); }
		public List<TerminalNode> COLON() { return getTokens(qasm3Parser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(qasm3Parser.COLON, i);
		}
		public TerminalNode RBRACKET() { return getToken(qasm3Parser.RBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RangeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeDefinition; }
	}

	public final RangeDefinitionContext rangeDefinition() throws RecognitionException {
		RangeDefinitionContext _localctx = new RangeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_rangeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(LBRACKET);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__81 - 82)) | (1L << (T__82 - 82)) | (1L << (T__84 - 82)) | (1L << (LPAREN - 82)) | (1L << (MINUS - 82)) | (1L << (Constant - 82)) | (1L << (Integer - 82)) | (1L << (Identifier - 82)) | (1L << (RealNumber - 82)) | (1L << (TimingLiteral - 82)) | (1L << (StringLiteral - 82)))) != 0)) {
				{
				setState(502);
				expression(0);
				}
			}

			setState(505);
			match(COLON);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__81 - 82)) | (1L << (T__82 - 82)) | (1L << (T__84 - 82)) | (1L << (LPAREN - 82)) | (1L << (MINUS - 82)) | (1L << (Constant - 82)) | (1L << (Integer - 82)) | (1L << (Identifier - 82)) | (1L << (RealNumber - 82)) | (1L << (TimingLiteral - 82)) | (1L << (StringLiteral - 82)))) != 0)) {
				{
				setState(506);
				expression(0);
				}
			}

			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(509);
				match(COLON);
				setState(510);
				expression(0);
				}
			}

			setState(513);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumGateDefinitionContext extends ParserRuleContext {
		public QuantumGateSignatureContext quantumGateSignature() {
			return getRuleContext(QuantumGateSignatureContext.class,0);
		}
		public QuantumBlockContext quantumBlock() {
			return getRuleContext(QuantumBlockContext.class,0);
		}
		public QuantumGateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumGateDefinition; }
	}

	public final QuantumGateDefinitionContext quantumGateDefinition() throws RecognitionException {
		QuantumGateDefinitionContext _localctx = new QuantumGateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_quantumGateDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__17);
			setState(516);
			quantumGateSignature();
			setState(517);
			quantumBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumGateSignatureContext extends ParserRuleContext {
		public QuantumGateNameContext quantumGateName() {
			return getRuleContext(QuantumGateNameContext.class,0);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public QuantumGateSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumGateSignature; }
	}

	public final QuantumGateSignatureContext quantumGateSignature() throws RecognitionException {
		QuantumGateSignatureContext _localctx = new QuantumGateSignatureContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_quantumGateSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			quantumGateName();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(520);
				match(LPAREN);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(521);
					identifierList();
					}
				}

				setState(524);
				match(RPAREN);
				}
			}

			setState(527);
			identifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumGateNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public QuantumGateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumGateName; }
	}

	public final QuantumGateNameContext quantumGateName() throws RecognitionException {
		QuantumGateNameContext _localctx = new QuantumGateNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_quantumGateName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public List<QuantumStatementContext> quantumStatement() {
			return getRuleContexts(QuantumStatementContext.class);
		}
		public QuantumStatementContext quantumStatement(int i) {
			return getRuleContext(QuantumStatementContext.class,i);
		}
		public List<QuantumLoopContext> quantumLoop() {
			return getRuleContexts(QuantumLoopContext.class);
		}
		public QuantumLoopContext quantumLoop(int i) {
			return getRuleContext(QuantumLoopContext.class,i);
		}
		public QuantumBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumBlock; }
	}

	public final QuantumBlockContext quantumBlock() throws RecognitionException {
		QuantumBlockContext _localctx = new QuantumBlockContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_quantumBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(LBRACE);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__73 - 72)) | (1L << (T__83 - 72)) | (1L << (T__85 - 72)) | (1L << (T__86 - 72)) | (1L << (Identifier - 72)))) != 0)) {
				{
				setState(534);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__26:
				case T__27:
				case T__28:
				case T__83:
				case T__85:
				case T__86:
				case Identifier:
					{
					setState(532);
					quantumStatement();
					}
					break;
				case T__71:
				case T__73:
					{
					setState(533);
					quantumLoop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(539);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumLoopContext extends ParserRuleContext {
		public LoopSignatureContext loopSignature() {
			return getRuleContext(LoopSignatureContext.class,0);
		}
		public QuantumLoopBlockContext quantumLoopBlock() {
			return getRuleContext(QuantumLoopBlockContext.class,0);
		}
		public QuantumLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumLoop; }
	}

	public final QuantumLoopContext quantumLoop() throws RecognitionException {
		QuantumLoopContext _localctx = new QuantumLoopContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_quantumLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			loopSignature();
			setState(542);
			quantumLoopBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumLoopBlockContext extends ParserRuleContext {
		public List<QuantumStatementContext> quantumStatement() {
			return getRuleContexts(QuantumStatementContext.class);
		}
		public QuantumStatementContext quantumStatement(int i) {
			return getRuleContext(QuantumStatementContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public QuantumLoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumLoopBlock; }
	}

	public final QuantumLoopBlockContext quantumLoopBlock() throws RecognitionException {
		QuantumLoopBlockContext _localctx = new QuantumLoopBlockContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_quantumLoopBlock);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case T__83:
			case T__85:
			case T__86:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				quantumStatement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				match(LBRACE);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (T__83 - 84)) | (1L << (T__85 - 84)) | (1L << (T__86 - 84)) | (1L << (Identifier - 84)))) != 0)) {
					{
					{
					setState(546);
					quantumStatement();
					}
					}
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(552);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumStatementContext extends ParserRuleContext {
		public QuantumInstructionContext quantumInstruction() {
			return getRuleContext(QuantumInstructionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public TimingStatementContext timingStatement() {
			return getRuleContext(TimingStatementContext.class,0);
		}
		public QuantumStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumStatement; }
	}

	public final QuantumStatementContext quantumStatement() throws RecognitionException {
		QuantumStatementContext _localctx = new QuantumStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_quantumStatement);
		try {
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case T__27:
			case T__28:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				quantumInstruction();
				setState(556);
				match(SEMICOLON);
				}
				break;
			case T__83:
			case T__85:
			case T__86:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				timingStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumInstructionContext extends ParserRuleContext {
		public QuantumGateCallContext quantumGateCall() {
			return getRuleContext(QuantumGateCallContext.class,0);
		}
		public QuantumPhaseContext quantumPhase() {
			return getRuleContext(QuantumPhaseContext.class,0);
		}
		public QuantumMeasurementContext quantumMeasurement() {
			return getRuleContext(QuantumMeasurementContext.class,0);
		}
		public QuantumResetContext quantumReset() {
			return getRuleContext(QuantumResetContext.class,0);
		}
		public QuantumBarrierContext quantumBarrier() {
			return getRuleContext(QuantumBarrierContext.class,0);
		}
		public QuantumInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumInstruction; }
	}

	public final QuantumInstructionContext quantumInstruction() throws RecognitionException {
		QuantumInstructionContext _localctx = new QuantumInstructionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_quantumInstruction);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				quantumGateCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562);
				quantumPhase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				quantumMeasurement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(564);
				quantumReset();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(565);
				quantumBarrier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumPhaseContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public List<QuantumGateModifierContext> quantumGateModifier() {
			return getRuleContexts(QuantumGateModifierContext.class);
		}
		public QuantumGateModifierContext quantumGateModifier(int i) {
			return getRuleContext(QuantumGateModifierContext.class,i);
		}
		public IndexIdentifierListContext indexIdentifierList() {
			return getRuleContext(IndexIdentifierListContext.class,0);
		}
		public QuantumPhaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumPhase; }
	}

	public final QuantumPhaseContext quantumPhase() throws RecognitionException {
		QuantumPhaseContext _localctx = new QuantumPhaseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_quantumPhase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) {
				{
				{
				setState(568);
				quantumGateModifier();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(T__20);
			setState(575);
			match(LPAREN);
			setState(576);
			expression(0);
			setState(577);
			match(RPAREN);
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(578);
				indexIdentifierList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumResetContext extends ParserRuleContext {
		public IndexIdentifierListContext indexIdentifierList() {
			return getRuleContext(IndexIdentifierListContext.class,0);
		}
		public QuantumResetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumReset; }
	}

	public final QuantumResetContext quantumReset() throws RecognitionException {
		QuantumResetContext _localctx = new QuantumResetContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_quantumReset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(T__21);
			setState(582);
			indexIdentifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumMeasurementContext extends ParserRuleContext {
		public IndexIdentifierListContext indexIdentifierList() {
			return getRuleContext(IndexIdentifierListContext.class,0);
		}
		public QuantumMeasurementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumMeasurement; }
	}

	public final QuantumMeasurementContext quantumMeasurement() throws RecognitionException {
		QuantumMeasurementContext _localctx = new QuantumMeasurementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_quantumMeasurement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(T__22);
			setState(585);
			indexIdentifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumMeasurementAssignmentContext extends ParserRuleContext {
		public QuantumMeasurementContext quantumMeasurement() {
			return getRuleContext(QuantumMeasurementContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(qasm3Parser.ARROW, 0); }
		public IndexIdentifierListContext indexIdentifierList() {
			return getRuleContext(IndexIdentifierListContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(qasm3Parser.EQUALS, 0); }
		public QuantumMeasurementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumMeasurementAssignment; }
	}

	public final QuantumMeasurementAssignmentContext quantumMeasurementAssignment() throws RecognitionException {
		QuantumMeasurementAssignmentContext _localctx = new QuantumMeasurementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_quantumMeasurementAssignment);
		int _la;
		try {
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(587);
				quantumMeasurement();
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARROW) {
					{
					setState(588);
					match(ARROW);
					setState(589);
					indexIdentifierList();
					}
				}

				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				indexIdentifierList();
				setState(593);
				match(EQUALS);
				setState(594);
				quantumMeasurement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumBarrierContext extends ParserRuleContext {
		public IndexIdentifierListContext indexIdentifierList() {
			return getRuleContext(IndexIdentifierListContext.class,0);
		}
		public QuantumBarrierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumBarrier; }
	}

	public final QuantumBarrierContext quantumBarrier() throws RecognitionException {
		QuantumBarrierContext _localctx = new QuantumBarrierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_quantumBarrier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__23);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(599);
				indexIdentifierList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumGateModifierContext extends ParserRuleContext {
		public PowModifierContext powModifier() {
			return getRuleContext(PowModifierContext.class,0);
		}
		public CtrlModifierContext ctrlModifier() {
			return getRuleContext(CtrlModifierContext.class,0);
		}
		public QuantumGateModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumGateModifier; }
	}

	public final QuantumGateModifierContext quantumGateModifier() throws RecognitionException {
		QuantumGateModifierContext _localctx = new QuantumGateModifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_quantumGateModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				{
				setState(602);
				match(T__24);
				}
				break;
			case T__26:
				{
				setState(603);
				powModifier();
				}
				break;
			case T__27:
			case T__28:
				{
				setState(604);
				ctrlModifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(607);
			match(T__25);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowModifierContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public PowModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powModifier; }
	}

	public final PowModifierContext powModifier() throws RecognitionException {
		PowModifierContext _localctx = new PowModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_powModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__26);
			setState(610);
			match(LPAREN);
			setState(611);
			expression(0);
			setState(612);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtrlModifierContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public CtrlModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctrlModifier; }
	}

	public final CtrlModifierContext ctrlModifier() throws RecognitionException {
		CtrlModifierContext _localctx = new CtrlModifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_ctrlModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(615);
				match(LPAREN);
				setState(616);
				expression(0);
				setState(617);
				match(RPAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantumGateCallContext extends ParserRuleContext {
		public QuantumGateNameContext quantumGateName() {
			return getRuleContext(QuantumGateNameContext.class,0);
		}
		public IndexIdentifierListContext indexIdentifierList() {
			return getRuleContext(IndexIdentifierListContext.class,0);
		}
		public List<QuantumGateModifierContext> quantumGateModifier() {
			return getRuleContexts(QuantumGateModifierContext.class);
		}
		public QuantumGateModifierContext quantumGateModifier(int i) {
			return getRuleContext(QuantumGateModifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public QuantumGateCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantumGateCall; }
	}

	public final QuantumGateCallContext quantumGateCall() throws RecognitionException {
		QuantumGateCallContext _localctx = new QuantumGateCallContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_quantumGateCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) {
				{
				{
				setState(621);
				quantumGateModifier();
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(627);
			quantumGateName();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(628);
				match(LPAREN);
				setState(629);
				expressionList();
				setState(630);
				match(RPAREN);
				}
			}

			setState(634);
			indexIdentifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(qasm3Parser.MINUS, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30 || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityOperatorContext extends ParserRuleContext {
		public EqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityOperator; }
	}

	public final EqualityOperatorContext equalityOperator() throws RecognitionException {
		EqualityOperatorContext _localctx = new EqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_equalityOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__37) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			expression(0);
			setState(645);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionTerminatorContext expressionTerminator() {
			return getRuleContext(ExpressionTerminatorContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 122;
		enterRecursionRule(_localctx, 122, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(648);
				expressionTerminator(0);
				}
				break;
			case 2:
				{
				setState(649);
				unaryExpression();
				}
				break;
			case 3:
				{
				setState(650);
				logicalAndExpression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(658);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(653);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(654);
					match(T__16);
					setState(655);
					logicalAndExpression(0);
					}
					} 
				}
				setState(660);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public BitOrExpressionContext bitOrExpression() {
			return getRuleContext(BitOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(662);
			bitOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(664);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(665);
					match(T__37);
					setState(666);
					bitOrExpression(0);
					}
					} 
				}
				setState(671);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BitOrExpressionContext extends ParserRuleContext {
		public XOrExpressionContext xOrExpression() {
			return getRuleContext(XOrExpressionContext.class,0);
		}
		public BitOrExpressionContext bitOrExpression() {
			return getRuleContext(BitOrExpressionContext.class,0);
		}
		public BitOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitOrExpression; }
	}

	public final BitOrExpressionContext bitOrExpression() throws RecognitionException {
		return bitOrExpression(0);
	}

	private BitOrExpressionContext bitOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitOrExpressionContext _localctx = new BitOrExpressionContext(_ctx, _parentState);
		BitOrExpressionContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_bitOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(673);
			xOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BitOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitOrExpression);
					setState(675);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(676);
					match(T__38);
					setState(677);
					xOrExpression(0);
					}
					} 
				}
				setState(682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class XOrExpressionContext extends ParserRuleContext {
		public BitAndExpressionContext bitAndExpression() {
			return getRuleContext(BitAndExpressionContext.class,0);
		}
		public XOrExpressionContext xOrExpression() {
			return getRuleContext(XOrExpressionContext.class,0);
		}
		public XOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xOrExpression; }
	}

	public final XOrExpressionContext xOrExpression() throws RecognitionException {
		return xOrExpression(0);
	}

	private XOrExpressionContext xOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XOrExpressionContext _localctx = new XOrExpressionContext(_ctx, _parentState);
		XOrExpressionContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_xOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(684);
			bitAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new XOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_xOrExpression);
					setState(686);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(687);
					match(T__39);
					setState(688);
					bitAndExpression(0);
					}
					} 
				}
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BitAndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public BitAndExpressionContext bitAndExpression() {
			return getRuleContext(BitAndExpressionContext.class,0);
		}
		public BitAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitAndExpression; }
	}

	public final BitAndExpressionContext bitAndExpression() throws RecognitionException {
		return bitAndExpression(0);
	}

	private BitAndExpressionContext bitAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitAndExpressionContext _localctx = new BitAndExpressionContext(_ctx, _parentState);
		BitAndExpressionContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_bitAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(695);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BitAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitAndExpression);
					setState(697);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(698);
					match(T__40);
					setState(699);
					equalityExpression(0);
					}
					} 
				}
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityOperatorContext equalityOperator() {
			return getRuleContext(EqualityOperatorContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(706);
			comparisonExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqualityExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
					setState(708);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(709);
					equalityOperator();
					setState(710);
					comparisonExpression(0);
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public BitShiftExpressionContext bitShiftExpression() {
			return getRuleContext(BitShiftExpressionContext.class,0);
		}
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		return comparisonExpression(0);
	}

	private ComparisonExpressionContext comparisonExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, _parentState);
		ComparisonExpressionContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_comparisonExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(718);
			bitShiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparisonExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparisonExpression);
					setState(720);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(721);
					comparisonOperator();
					setState(722);
					bitShiftExpression(0);
					}
					} 
				}
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BitShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public BitShiftExpressionContext bitShiftExpression() {
			return getRuleContext(BitShiftExpressionContext.class,0);
		}
		public BitShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitShiftExpression; }
	}

	public final BitShiftExpressionContext bitShiftExpression() throws RecognitionException {
		return bitShiftExpression(0);
	}

	private BitShiftExpressionContext bitShiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitShiftExpressionContext _localctx = new BitShiftExpressionContext(_ctx, _parentState);
		BitShiftExpressionContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_bitShiftExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(730);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BitShiftExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bitShiftExpression);
					setState(732);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(733);
					_la = _input.LA(1);
					if ( !(_la==T__41 || _la==T__42) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(734);
					additiveExpression(0);
					}
					} 
				}
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(qasm3Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(qasm3Parser.MINUS, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_additiveExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(741);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(748);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(743);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(744);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(745);
					multiplicativeExpression(0);
					}
					} 
				}
				setState(750);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public PowerExpressionContext powerExpression() {
			return getRuleContext(PowerExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode MUL() { return getToken(qasm3Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(qasm3Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(qasm3Parser.MOD, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_multiplicativeExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__44:
			case T__45:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__81:
			case T__82:
			case T__84:
			case LPAREN:
			case Constant:
			case Integer:
			case Identifier:
			case RealNumber:
			case TimingLiteral:
			case StringLiteral:
				{
				setState(752);
				powerExpression();
				}
				break;
			case T__29:
			case T__30:
			case MINUS:
				{
				setState(753);
				unaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(764);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(756);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(757);
					_la = _input.LA(1);
					if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (MUL - 105)) | (1L << (DIV - 105)) | (1L << (MOD - 105)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(760);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__6:
					case T__7:
					case T__8:
					case T__9:
					case T__10:
					case T__11:
					case T__12:
					case T__13:
					case T__44:
					case T__45:
					case T__48:
					case T__49:
					case T__50:
					case T__51:
					case T__52:
					case T__53:
					case T__54:
					case T__55:
					case T__56:
					case T__81:
					case T__82:
					case T__84:
					case LPAREN:
					case Constant:
					case Integer:
					case Identifier:
					case RealNumber:
					case TimingLiteral:
					case StringLiteral:
						{
						setState(758);
						powerExpression();
						}
						break;
					case T__29:
					case T__30:
					case MINUS:
						{
						setState(759);
						unaryExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public PowerExpressionContext powerExpression() {
			return getRuleContext(PowerExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_unaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			unaryOperator();
			setState(768);
			powerExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowerExpressionContext extends ParserRuleContext {
		public ExpressionTerminatorContext expressionTerminator() {
			return getRuleContext(ExpressionTerminatorContext.class,0);
		}
		public PowerExpressionContext powerExpression() {
			return getRuleContext(PowerExpressionContext.class,0);
		}
		public PowerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powerExpression; }
	}

	public final PowerExpressionContext powerExpression() throws RecognitionException {
		PowerExpressionContext _localctx = new PowerExpressionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_powerExpression);
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				expressionTerminator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				expressionTerminator(0);
				setState(772);
				match(T__43);
				setState(773);
				powerExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionTerminatorContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(qasm3Parser.Constant, 0); }
		public TerminalNode Integer() { return getToken(qasm3Parser.Integer, 0); }
		public TerminalNode RealNumber() { return getToken(qasm3Parser.RealNumber, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(qasm3Parser.StringLiteral, 0); }
		public BuiltInCallContext builtInCall() {
			return getRuleContext(BuiltInCallContext.class,0);
		}
		public ExternOrSubroutineCallContext externOrSubroutineCall() {
			return getRuleContext(ExternOrSubroutineCallContext.class,0);
		}
		public TimingIdentifierContext timingIdentifier() {
			return getRuleContext(TimingIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public ExpressionTerminatorContext expressionTerminator() {
			return getRuleContext(ExpressionTerminatorContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(qasm3Parser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(qasm3Parser.RBRACKET, 0); }
		public IncrementorContext incrementor() {
			return getRuleContext(IncrementorContext.class,0);
		}
		public ExpressionTerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionTerminator; }
	}

	public final ExpressionTerminatorContext expressionTerminator() throws RecognitionException {
		return expressionTerminator(0);
	}

	private ExpressionTerminatorContext expressionTerminator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionTerminatorContext _localctx = new ExpressionTerminatorContext(_ctx, _parentState);
		ExpressionTerminatorContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_expressionTerminator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(778);
				match(Constant);
				}
				break;
			case 2:
				{
				setState(779);
				match(Integer);
				}
				break;
			case 3:
				{
				setState(780);
				match(RealNumber);
				}
				break;
			case 4:
				{
				setState(781);
				booleanLiteral();
				}
				break;
			case 5:
				{
				setState(782);
				match(Identifier);
				}
				break;
			case 6:
				{
				setState(783);
				match(StringLiteral);
				}
				break;
			case 7:
				{
				setState(784);
				builtInCall();
				}
				break;
			case 8:
				{
				setState(785);
				externOrSubroutineCall();
				}
				break;
			case 9:
				{
				setState(786);
				timingIdentifier();
				}
				break;
			case 10:
				{
				setState(787);
				match(LPAREN);
				setState(788);
				expression(0);
				setState(789);
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(800);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionTerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionTerminator);
						setState(793);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(794);
						match(LBRACKET);
						setState(795);
						expression(0);
						setState(796);
						match(RBRACKET);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionTerminatorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionTerminator);
						setState(798);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(799);
						incrementor();
						}
						break;
					}
					} 
				}
				setState(804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__45) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementorContext extends ParserRuleContext {
		public IncrementorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementor; }
	}

	public final IncrementorContext incrementor() throws RecognitionException {
		IncrementorContext _localctx = new IncrementorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_incrementor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltInCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public BuiltInMathContext builtInMath() {
			return getRuleContext(BuiltInMathContext.class,0);
		}
		public CastOperatorContext castOperator() {
			return getRuleContext(CastOperatorContext.class,0);
		}
		public BuiltInCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInCall; }
	}

	public final BuiltInCallContext builtInCall() throws RecognitionException {
		BuiltInCallContext _localctx = new BuiltInCallContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_builtInCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
				{
				setState(809);
				builtInMath();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__81:
			case T__82:
				{
				setState(810);
				castOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(813);
			match(LPAREN);
			setState(814);
			expressionList();
			setState(815);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuiltInMathContext extends ParserRuleContext {
		public BuiltInMathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInMath; }
	}

	public final BuiltInMathContext builtInMath() throws RecognitionException {
		BuiltInMathContext _localctx = new BuiltInMathContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_builtInMath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastOperatorContext extends ParserRuleContext {
		public ClassicalTypeContext classicalType() {
			return getRuleContext(ClassicalTypeContext.class,0);
		}
		public CastOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castOperator; }
	}

	public final CastOperatorContext castOperator() throws RecognitionException {
		CastOperatorContext _localctx = new CastOperatorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_castOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			classicalType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(qasm3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(qasm3Parser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			expression(0);
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(822);
				match(COMMA);
				setState(823);
				expression(0);
				}
				}
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualsExpressionContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(qasm3Parser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EqualsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsExpression; }
	}

	public final EqualsExpressionContext equalsExpression() throws RecognitionException {
		EqualsExpressionContext _localctx = new EqualsExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_equalsExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(EQUALS);
			setState(830);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(qasm3Parser.EQUALS, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (T__57 - 58)) | (1L << (T__58 - 58)) | (1L << (T__59 - 58)) | (1L << (T__60 - 58)) | (1L << (T__61 - 58)) | (1L << (T__62 - 58)) | (1L << (T__63 - 58)) | (1L << (T__64 - 58)) | (1L << (T__65 - 58)) | (1L << (T__66 - 58)) | (1L << (T__67 - 58)) | (1L << (T__68 - 58)) | (1L << (EQUALS - 58)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetDeclarationContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public RangeDefinitionContext rangeDefinition() {
			return getRuleContext(RangeDefinitionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public SetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setDeclaration; }
	}

	public final SetDeclarationContext setDeclaration() throws RecognitionException {
		SetDeclarationContext _localctx = new SetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_setDeclaration);
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(834);
				match(LBRACE);
				setState(835);
				expressionList();
				setState(836);
				match(RBRACE);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				rangeDefinition();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(839);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ControlDirectiveContext> controlDirective() {
			return getRuleContexts(ControlDirectiveContext.class);
		}
		public ControlDirectiveContext controlDirective(int i) {
			return getRuleContext(ControlDirectiveContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public ProgramBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programBlock; }
	}

	public final ProgramBlockContext programBlock() throws RecognitionException {
		ProgramBlockContext _localctx = new ProgramBlockContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_programBlock);
		int _la;
		try {
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				controlDirective();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				match(LBRACE);
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__71 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__75 - 70)) | (1L << (T__76 - 70)) | (1L << (T__77 - 70)) | (1L << (T__81 - 70)) | (1L << (T__82 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__86 - 70)) | (1L << (LPAREN - 70)) | (1L << (MINUS - 70)) | (1L << (Constant - 70)) | (1L << (Integer - 70)) | (1L << (Identifier - 70)) | (1L << (RealNumber - 70)) | (1L << (TimingLiteral - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
					{
					setState(847);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(845);
						statement();
						}
						break;
					case 2:
						{
						setState(846);
						controlDirective();
						}
						break;
					}
					}
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(852);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchingStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public List<ProgramBlockContext> programBlock() {
			return getRuleContexts(ProgramBlockContext.class);
		}
		public ProgramBlockContext programBlock(int i) {
			return getRuleContext(ProgramBlockContext.class,i);
		}
		public BranchingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchingStatement; }
	}

	public final BranchingStatementContext branchingStatement() throws RecognitionException {
		BranchingStatementContext _localctx = new BranchingStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_branchingStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(T__69);
			setState(856);
			match(LPAREN);
			setState(857);
			expression(0);
			setState(858);
			match(RPAREN);
			setState(859);
			programBlock();
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(860);
				match(T__70);
				setState(861);
				programBlock();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopSignatureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public SetDeclarationContext setDeclaration() {
			return getRuleContext(SetDeclarationContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public LoopSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopSignature; }
	}

	public final LoopSignatureContext loopSignature() throws RecognitionException {
		LoopSignatureContext _localctx = new LoopSignatureContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_loopSignature);
		try {
			setState(873);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__71:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				match(T__71);
				setState(865);
				match(Identifier);
				setState(866);
				match(T__72);
				setState(867);
				setDeclaration();
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				match(T__73);
				setState(869);
				match(LPAREN);
				setState(870);
				expression(0);
				setState(871);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public LoopSignatureContext loopSignature() {
			return getRuleContext(LoopSignatureContext.class,0);
		}
		public ProgramBlockContext programBlock() {
			return getRuleContext(ProgramBlockContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_loopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			loopSignature();
			setState(876);
			programBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public EndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStatement; }
	}

	public final EndStatementContext endStatement() throws RecognitionException {
		EndStatementContext _localctx = new EndStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_endStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(T__74);
			setState(879);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QuantumMeasurementContext quantumMeasurement() {
			return getRuleContext(QuantumMeasurementContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(T__75);
			setState(884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__29:
			case T__30:
			case T__44:
			case T__45:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__81:
			case T__82:
			case T__84:
			case LPAREN:
			case MINUS:
			case Constant:
			case Integer:
			case Identifier:
			case RealNumber:
			case TimingLiteral:
			case StringLiteral:
				{
				setState(882);
				expression(0);
				}
				break;
			case T__22:
				{
				setState(883);
				quantumMeasurement();
				}
				break;
			case SEMICOLON:
				break;
			default:
				break;
			}
			setState(886);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlDirectiveContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public EndStatementContext endStatement() {
			return getRuleContext(EndStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ControlDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlDirective; }
	}

	public final ControlDirectiveContext controlDirective() throws RecognitionException {
		ControlDirectiveContext _localctx = new ControlDirectiveContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_controlDirective);
		int _la;
		try {
			setState(892);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__76:
			case T__77:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				_la = _input.LA(1);
				if ( !(_la==T__76 || _la==T__77) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(889);
				match(SEMICOLON);
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				endStatement();
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 3);
				{
				setState(891);
				returnStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public ClassicalTypeListContext classicalTypeList() {
			return getRuleContext(ClassicalTypeListContext.class,0);
		}
		public ReturnSignatureContext returnSignature() {
			return getRuleContext(ReturnSignatureContext.class,0);
		}
		public ExternDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externDeclaration; }
	}

	public final ExternDeclarationContext externDeclaration() throws RecognitionException {
		ExternDeclarationContext _localctx = new ExternDeclarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_externDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(T__78);
			setState(895);
			match(Identifier);
			setState(896);
			match(LPAREN);
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0) || _la==T__81 || _la==T__82) {
				{
				setState(897);
				classicalTypeList();
				}
			}

			setState(900);
			match(RPAREN);
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(901);
				returnSignature();
				}
			}

			setState(904);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternOrSubroutineCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExternOrSubroutineCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externOrSubroutineCall; }
	}

	public final ExternOrSubroutineCallContext externOrSubroutineCall() throws RecognitionException {
		ExternOrSubroutineCallContext _localctx = new ExternOrSubroutineCallContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_externOrSubroutineCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(Identifier);
			setState(907);
			match(LPAREN);
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__81 - 82)) | (1L << (T__82 - 82)) | (1L << (T__84 - 82)) | (1L << (LPAREN - 82)) | (1L << (MINUS - 82)) | (1L << (Constant - 82)) | (1L << (Integer - 82)) | (1L << (Identifier - 82)) | (1L << (RealNumber - 82)) | (1L << (TimingLiteral - 82)) | (1L << (StringLiteral - 82)))) != 0)) {
				{
				setState(908);
				expressionList();
				}
			}

			setState(911);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubroutineDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public SubroutineBlockContext subroutineBlock() {
			return getRuleContext(SubroutineBlockContext.class,0);
		}
		public AnyTypeArgumentListContext anyTypeArgumentList() {
			return getRuleContext(AnyTypeArgumentListContext.class,0);
		}
		public ReturnSignatureContext returnSignature() {
			return getRuleContext(ReturnSignatureContext.class,0);
		}
		public SubroutineDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineDefinition; }
	}

	public final SubroutineDefinitionContext subroutineDefinition() throws RecognitionException {
		SubroutineDefinitionContext _localctx = new SubroutineDefinitionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_subroutineDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(T__79);
			setState(914);
			match(Identifier);
			setState(915);
			match(LPAREN);
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0) || _la==T__81 || _la==T__82) {
				{
				setState(916);
				anyTypeArgumentList();
				}
			}

			setState(919);
			match(RPAREN);
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(920);
				returnSignature();
				}
			}

			setState(923);
			subroutineBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubroutineBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public SubroutineBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineBlock; }
	}

	public final SubroutineBlockContext subroutineBlock() throws RecognitionException {
		SubroutineBlockContext _localctx = new SubroutineBlockContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_subroutineBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(925);
			match(LBRACE);
			setState(929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__71 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__81 - 70)) | (1L << (T__82 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__86 - 70)) | (1L << (LPAREN - 70)) | (1L << (MINUS - 70)) | (1L << (Constant - 70)) | (1L << (Integer - 70)) | (1L << (Identifier - 70)) | (1L << (RealNumber - 70)) | (1L << (TimingLiteral - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
				{
				{
				setState(926);
				statement();
				}
				}
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__75) {
				{
				setState(932);
				returnStatement();
				}
			}

			setState(935);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_pragma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(T__80);
			setState(938);
			match(LBRACE);
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__71 - 70)) | (1L << (T__73 - 70)) | (1L << (T__74 - 70)) | (1L << (T__81 - 70)) | (1L << (T__82 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__86 - 70)) | (1L << (LPAREN - 70)) | (1L << (MINUS - 70)) | (1L << (Constant - 70)) | (1L << (Integer - 70)) | (1L << (Identifier - 70)) | (1L << (RealNumber - 70)) | (1L << (TimingLiteral - 70)) | (1L << (StringLiteral - 70)))) != 0)) {
				{
				{
				setState(939);
				statement();
				}
				}
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(945);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimingTypeContext extends ParserRuleContext {
		public TimingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timingType; }
	}

	public final TimingTypeContext timingType() throws RecognitionException {
		TimingTypeContext _localctx = new TimingTypeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_timingType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			_la = _input.LA(1);
			if ( !(_la==T__81 || _la==T__82) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimingBoxContext extends ParserRuleContext {
		public QuantumBlockContext quantumBlock() {
			return getRuleContext(QuantumBlockContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TimingBoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timingBox; }
	}

	public final TimingBoxContext timingBox() throws RecognitionException {
		TimingBoxContext _localctx = new TimingBoxContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_timingBox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(T__83);
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(950);
				designator();
				}
			}

			setState(953);
			quantumBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimingIdentifierContext extends ParserRuleContext {
		public TerminalNode TimingLiteral() { return getToken(qasm3Parser.TimingLiteral, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public QuantumBlockContext quantumBlock() {
			return getRuleContext(QuantumBlockContext.class,0);
		}
		public TimingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timingIdentifier; }
	}

	public final TimingIdentifierContext timingIdentifier() throws RecognitionException {
		TimingIdentifierContext _localctx = new TimingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_timingIdentifier);
		try {
			setState(963);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TimingLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				match(TimingLiteral);
				}
				break;
			case T__84:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(T__84);
				setState(957);
				match(LPAREN);
				setState(960);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(958);
					match(Identifier);
					}
					break;
				case LBRACE:
					{
					setState(959);
					quantumBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(962);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimingInstructionNameContext extends ParserRuleContext {
		public TimingInstructionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timingInstructionName; }
	}

	public final TimingInstructionNameContext timingInstructionName() throws RecognitionException {
		TimingInstructionNameContext _localctx = new TimingInstructionNameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_timingInstructionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_la = _input.LA(1);
			if ( !(_la==T__85 || _la==T__86) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimingInstructionContext extends ParserRuleContext {
		public TimingInstructionNameContext timingInstructionName() {
			return getRuleContext(TimingInstructionNameContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public IndexIdentifierListContext indexIdentifierList() {
			return getRuleContext(IndexIdentifierListContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TimingInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timingInstruction; }
	}

	public final TimingInstructionContext timingInstruction() throws RecognitionException {
		TimingInstructionContext _localctx = new TimingInstructionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_timingInstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			timingInstructionName();
			setState(973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(968);
				match(LPAREN);
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__81 - 82)) | (1L << (T__82 - 82)) | (1L << (T__84 - 82)) | (1L << (LPAREN - 82)) | (1L << (MINUS - 82)) | (1L << (Constant - 82)) | (1L << (Integer - 82)) | (1L << (Identifier - 82)) | (1L << (RealNumber - 82)) | (1L << (TimingLiteral - 82)) | (1L << (StringLiteral - 82)))) != 0)) {
					{
					setState(969);
					expressionList();
					}
				}

				setState(972);
				match(RPAREN);
				}
			}

			setState(975);
			designator();
			setState(976);
			indexIdentifierList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimingStatementContext extends ParserRuleContext {
		public TimingInstructionContext timingInstruction() {
			return getRuleContext(TimingInstructionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public TimingBoxContext timingBox() {
			return getRuleContext(TimingBoxContext.class,0);
		}
		public TimingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timingStatement; }
	}

	public final TimingStatementContext timingStatement() throws RecognitionException {
		TimingStatementContext _localctx = new TimingStatementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_timingStatement);
		try {
			setState(982);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__85:
			case T__86:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				timingInstruction();
				setState(979);
				match(SEMICOLON);
				}
				break;
			case T__83:
				enterOuterAlt(_localctx, 2);
				{
				setState(981);
				timingBox();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalibrationContext extends ParserRuleContext {
		public CalibrationGrammarDeclarationContext calibrationGrammarDeclaration() {
			return getRuleContext(CalibrationGrammarDeclarationContext.class,0);
		}
		public CalibrationDefinitionContext calibrationDefinition() {
			return getRuleContext(CalibrationDefinitionContext.class,0);
		}
		public CalibrationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calibration; }
	}

	public final CalibrationContext calibration() throws RecognitionException {
		CalibrationContext _localctx = new CalibrationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_calibration);
		try {
			setState(986);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__87:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				calibrationGrammarDeclaration();
				}
				break;
			case T__88:
				enterOuterAlt(_localctx, 2);
				{
				setState(985);
				calibrationDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalibrationGrammarDeclarationContext extends ParserRuleContext {
		public CalibrationGrammarContext calibrationGrammar() {
			return getRuleContext(CalibrationGrammarContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(qasm3Parser.SEMICOLON, 0); }
		public CalibrationGrammarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calibrationGrammarDeclaration; }
	}

	public final CalibrationGrammarDeclarationContext calibrationGrammarDeclaration() throws RecognitionException {
		CalibrationGrammarDeclarationContext _localctx = new CalibrationGrammarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_calibrationGrammarDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(T__87);
			setState(989);
			calibrationGrammar();
			setState(990);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalibrationDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(qasm3Parser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(qasm3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(qasm3Parser.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(qasm3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(qasm3Parser.RPAREN, 0); }
		public ReturnSignatureContext returnSignature() {
			return getRuleContext(ReturnSignatureContext.class,0);
		}
		public CalibrationArgumentListContext calibrationArgumentList() {
			return getRuleContext(CalibrationArgumentListContext.class,0);
		}
		public CalibrationDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calibrationDefinition; }
	}

	public final CalibrationDefinitionContext calibrationDefinition() throws RecognitionException {
		CalibrationDefinitionContext _localctx = new CalibrationDefinitionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_calibrationDefinition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(T__88);
			setState(993);
			match(Identifier);
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(994);
				match(LPAREN);
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__29) | (1L << T__30) | (1L << T__44) | (1L << T__45) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (T__81 - 82)) | (1L << (T__82 - 82)) | (1L << (T__84 - 82)) | (1L << (LPAREN - 82)) | (1L << (MINUS - 82)) | (1L << (Constant - 82)) | (1L << (Integer - 82)) | (1L << (Identifier - 82)) | (1L << (RealNumber - 82)) | (1L << (TimingLiteral - 82)) | (1L << (StringLiteral - 82)))) != 0)) {
					{
					setState(995);
					calibrationArgumentList();
					}
				}

				setState(998);
				match(RPAREN);
				}
			}

			setState(1001);
			identifierList();
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(1002);
				returnSignature();
				}
			}

			setState(1005);
			match(LBRACE);
			setState(1009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(1006);
					matchWildcard();
					}
					} 
				}
				setState(1011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			}
			setState(1012);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalibrationGrammarContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(qasm3Parser.StringLiteral, 0); }
		public CalibrationGrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calibrationGrammar; }
	}

	public final CalibrationGrammarContext calibrationGrammar() throws RecognitionException {
		CalibrationGrammarContext _localctx = new CalibrationGrammarContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_calibrationGrammar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			_la = _input.LA(1);
			if ( !(_la==T__89 || _la==StringLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalibrationArgumentListContext extends ParserRuleContext {
		public ClassicalArgumentListContext classicalArgumentList() {
			return getRuleContext(ClassicalArgumentListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public CalibrationArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calibrationArgumentList; }
	}

	public final CalibrationArgumentListContext calibrationArgumentList() throws RecognitionException {
		CalibrationArgumentListContext _localctx = new CalibrationArgumentListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_calibrationArgumentList);
		try {
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				classicalArgumentList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 36:
			return indexIdentifier_sempred((IndexIdentifierContext)_localctx, predIndex);
		case 61:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 62:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 63:
			return bitOrExpression_sempred((BitOrExpressionContext)_localctx, predIndex);
		case 64:
			return xOrExpression_sempred((XOrExpressionContext)_localctx, predIndex);
		case 65:
			return bitAndExpression_sempred((BitAndExpressionContext)_localctx, predIndex);
		case 66:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 67:
			return comparisonExpression_sempred((ComparisonExpressionContext)_localctx, predIndex);
		case 68:
			return bitShiftExpression_sempred((BitShiftExpressionContext)_localctx, predIndex);
		case 69:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 70:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 73:
			return expressionTerminator_sempred((ExpressionTerminatorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean indexIdentifier_sempred(IndexIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bitOrExpression_sempred(BitOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean xOrExpression_sempred(XOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bitAndExpression_sempred(BitAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean comparisonExpression_sempred(ComparisonExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bitShiftExpression_sempred(BitShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionTerminator_sempred(ExpressionTerminatorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3w\u03ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\3\2\3\2\3\2\7\2\u00da\n\2\f\2\16\2\u00dd\13\2\3\3\5\3\u00e0\n\3\3\3"+
		"\7\3\u00e3\n\3\f\3\16\3\u00e6\13\3\3\3\7\3\u00e9\n\3\f\3\16\3\u00ec\13"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0103\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u010d"+
		"\n\t\3\n\3\n\3\n\3\13\3\13\5\13\u0114\n\13\3\13\3\13\3\f\3\f\5\f\u011a"+
		"\n\f\3\f\3\f\3\f\5\f\u011f\n\f\3\r\3\r\5\r\u0123\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\7\21"+
		"\u0136\n\21\f\21\16\21\u0139\13\21\3\21\3\21\3\22\3\22\3\22\5\22\u0140"+
		"\n\22\3\22\3\22\5\22\u0144\n\22\3\22\5\22\u0147\n\22\3\23\3\23\3\23\5"+
		"\23\u014c\n\23\3\23\3\23\5\23\u0150\n\23\3\23\5\23\u0153\n\23\3\24\3\24"+
		"\3\24\7\24\u0158\n\24\f\24\16\24\u015b\13\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\5\30\u0165\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0170\n\31\5\31\u0172\n\31\3\32\3\32\3\32\5\32\u0177\n\32\3"+
		"\33\3\33\3\33\3\33\5\33\u017d\n\33\3\34\3\34\3\34\3\34\5\34\u0183\n\34"+
		"\3\35\3\35\3\35\5\35\u0188\n\35\3\36\3\36\3\36\5\36\u018d\n\36\3\36\3"+
		"\36\5\36\u0191\n\36\3\36\5\36\u0194\n\36\3\36\5\36\u0197\n\36\3\37\3\37"+
		"\3\37\3\37\5\37\u019d\n\37\3 \3 \3 \7 \u01a2\n \f \16 \u01a5\13 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\5!\u01b0\n!\3!\3!\3!\3!\3!\5!\u01b7\n!\3!\3!\5"+
		"!\u01bb\n!\3!\5!\u01be\n!\3\"\3\"\3\"\7\"\u01c3\n\"\f\"\16\"\u01c6\13"+
		"\"\3#\3#\5#\u01ca\n#\3$\3$\3$\7$\u01cf\n$\f$\16$\u01d2\13$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01e4\n&\5&\u01e6\n&\3&\3&\3"+
		"&\7&\u01eb\n&\f&\16&\u01ee\13&\3\'\3\'\3\'\7\'\u01f3\n\'\f\'\16\'\u01f6"+
		"\13\'\3(\3(\5(\u01fa\n(\3(\3(\5(\u01fe\n(\3(\3(\5(\u0202\n(\3(\3(\3)\3"+
		")\3)\3)\3*\3*\3*\5*\u020d\n*\3*\5*\u0210\n*\3*\3*\3+\3+\3,\3,\3,\7,\u0219"+
		"\n,\f,\16,\u021c\13,\3,\3,\3-\3-\3-\3.\3.\3.\7.\u0226\n.\f.\16.\u0229"+
		"\13.\3.\5.\u022c\n.\3/\3/\3/\3/\5/\u0232\n/\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u0239\n\60\3\61\7\61\u023c\n\61\f\61\16\61\u023f\13\61\3\61\3\61\3"+
		"\61\3\61\3\61\5\61\u0246\n\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\5\64\u0251\n\64\3\64\3\64\3\64\3\64\5\64\u0257\n\64\3\65\3\65\5"+
		"\65\u025b\n\65\3\66\3\66\3\66\5\66\u0260\n\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\58\u026e\n8\39\79\u0271\n9\f9\169\u0274\139"+
		"\39\39\39\39\39\59\u027b\n9\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?"+
		"\3?\3?\3?\5?\u028e\n?\3?\3?\3?\7?\u0293\n?\f?\16?\u0296\13?\3@\3@\3@\3"+
		"@\3@\3@\7@\u029e\n@\f@\16@\u02a1\13@\3A\3A\3A\3A\3A\3A\7A\u02a9\nA\fA"+
		"\16A\u02ac\13A\3B\3B\3B\3B\3B\3B\7B\u02b4\nB\fB\16B\u02b7\13B\3C\3C\3"+
		"C\3C\3C\3C\7C\u02bf\nC\fC\16C\u02c2\13C\3D\3D\3D\3D\3D\3D\3D\7D\u02cb"+
		"\nD\fD\16D\u02ce\13D\3E\3E\3E\3E\3E\3E\3E\7E\u02d7\nE\fE\16E\u02da\13"+
		"E\3F\3F\3F\3F\3F\3F\7F\u02e2\nF\fF\16F\u02e5\13F\3G\3G\3G\3G\3G\3G\7G"+
		"\u02ed\nG\fG\16G\u02f0\13G\3H\3H\3H\5H\u02f5\nH\3H\3H\3H\3H\5H\u02fb\n"+
		"H\7H\u02fd\nH\fH\16H\u0300\13H\3I\3I\3I\3J\3J\3J\3J\3J\5J\u030a\nJ\3K"+
		"\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u031a\nK\3K\3K\3K\3K\3K\3K"+
		"\3K\7K\u0323\nK\fK\16K\u0326\13K\3L\3L\3M\3M\3N\3N\5N\u032e\nN\3N\3N\3"+
		"N\3N\3O\3O\3P\3P\3Q\3Q\3Q\7Q\u033b\nQ\fQ\16Q\u033e\13Q\3R\3R\3R\3S\3S"+
		"\3T\3T\3T\3T\3T\3T\5T\u034b\nT\3U\3U\3U\3U\3U\7U\u0352\nU\fU\16U\u0355"+
		"\13U\3U\5U\u0358\nU\3V\3V\3V\3V\3V\3V\3V\5V\u0361\nV\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\5W\u036c\nW\3X\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\5Z\u0377\nZ\3Z\3Z\3"+
		"[\3[\3[\3[\5[\u037f\n[\3\\\3\\\3\\\3\\\5\\\u0385\n\\\3\\\3\\\5\\\u0389"+
		"\n\\\3\\\3\\\3]\3]\3]\5]\u0390\n]\3]\3]\3^\3^\3^\3^\5^\u0398\n^\3^\3^"+
		"\5^\u039c\n^\3^\3^\3_\3_\7_\u03a2\n_\f_\16_\u03a5\13_\3_\5_\u03a8\n_\3"+
		"_\3_\3`\3`\3`\7`\u03af\n`\f`\16`\u03b2\13`\3`\3`\3a\3a\3b\3b\5b\u03ba"+
		"\nb\3b\3b\3c\3c\3c\3c\3c\5c\u03c3\nc\3c\5c\u03c6\nc\3d\3d\3e\3e\3e\5e"+
		"\u03cd\ne\3e\5e\u03d0\ne\3e\3e\3e\3f\3f\3f\3f\5f\u03d9\nf\3g\3g\5g\u03dd"+
		"\ng\3h\3h\3h\3h\3i\3i\3i\3i\5i\u03e7\ni\3i\5i\u03ea\ni\3i\3i\5i\u03ee"+
		"\ni\3i\3i\7i\u03f2\ni\fi\16i\u03f5\13i\3i\3i\3j\3j\3k\3k\5k\u03fd\nk\3"+
		"k\3\u03f3\16J|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0094"+
		"l\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\2\27\4\2qqss\3\2\5\6\3\2\t\n\3\2\13\16\4\2\25\26rr\3\2\36\37\4\2 !jj"+
		"\3\2\"%\3\2&\'\4\2\23\23((\3\2,-\3\2ij\3\2km\3\2/\60\3\2\61\62\3\2\63"+
		";\4\2<Ggg\3\2OP\3\2TU\3\2XY\4\2\\\\uu\2\u0423\2\u00d6\3\2\2\2\4\u00df"+
		"\3\2\2\2\6\u00ed\3\2\2\2\b\u00f1\3\2\2\2\n\u00f5\3\2\2\2\f\u00f7\3\2\2"+
		"\2\16\u0102\3\2\2\2\20\u010c\3\2\2\2\22\u010e\3\2\2\2\24\u0113\3\2\2\2"+
		"\26\u0117\3\2\2\2\30\u0122\3\2\2\2\32\u0126\3\2\2\2\34\u0129\3\2\2\2\36"+
		"\u012d\3\2\2\2 \u0137\3\2\2\2\"\u0146\3\2\2\2$\u0152\3\2\2\2&\u0154\3"+
		"\2\2\2(\u015c\3\2\2\2*\u015e\3\2\2\2,\u0160\3\2\2\2.\u0164\3\2\2\2\60"+
		"\u0171\3\2\2\2\62\u0173\3\2\2\2\64\u0178\3\2\2\2\66\u017e\3\2\2\28\u0184"+
		"\3\2\2\2:\u0193\3\2\2\2<\u019c\3\2\2\2>\u01a3\3\2\2\2@\u01bd\3\2\2\2B"+
		"\u01bf\3\2\2\2D\u01c9\3\2\2\2F\u01d0\3\2\2\2H\u01d5\3\2\2\2J\u01e5\3\2"+
		"\2\2L\u01ef\3\2\2\2N\u01f7\3\2\2\2P\u0205\3\2\2\2R\u0209\3\2\2\2T\u0213"+
		"\3\2\2\2V\u0215\3\2\2\2X\u021f\3\2\2\2Z\u022b\3\2\2\2\\\u0231\3\2\2\2"+
		"^\u0238\3\2\2\2`\u023d\3\2\2\2b\u0247\3\2\2\2d\u024a\3\2\2\2f\u0256\3"+
		"\2\2\2h\u0258\3\2\2\2j\u025f\3\2\2\2l\u0263\3\2\2\2n\u0268\3\2\2\2p\u0272"+
		"\3\2\2\2r\u027e\3\2\2\2t\u0280\3\2\2\2v\u0282\3\2\2\2x\u0284\3\2\2\2z"+
		"\u0286\3\2\2\2|\u028d\3\2\2\2~\u0297\3\2\2\2\u0080\u02a2\3\2\2\2\u0082"+
		"\u02ad\3\2\2\2\u0084\u02b8\3\2\2\2\u0086\u02c3\3\2\2\2\u0088\u02cf\3\2"+
		"\2\2\u008a\u02db\3\2\2\2\u008c\u02e6\3\2\2\2\u008e\u02f4\3\2\2\2\u0090"+
		"\u0301\3\2\2\2\u0092\u0309\3\2\2\2\u0094\u0319\3\2\2\2\u0096\u0327\3\2"+
		"\2\2\u0098\u0329\3\2\2\2\u009a\u032d\3\2\2\2\u009c\u0333\3\2\2\2\u009e"+
		"\u0335\3\2\2\2\u00a0\u0337\3\2\2\2\u00a2\u033f\3\2\2\2\u00a4\u0342\3\2"+
		"\2\2\u00a6\u034a\3\2\2\2\u00a8\u0357\3\2\2\2\u00aa\u0359\3\2\2\2\u00ac"+
		"\u036b\3\2\2\2\u00ae\u036d\3\2\2\2\u00b0\u0370\3\2\2\2\u00b2\u0373\3\2"+
		"\2\2\u00b4\u037e\3\2\2\2\u00b6\u0380\3\2\2\2\u00b8\u038c\3\2\2\2\u00ba"+
		"\u0393\3\2\2\2\u00bc\u039f\3\2\2\2\u00be\u03ab\3\2\2\2\u00c0\u03b5\3\2"+
		"\2\2\u00c2\u03b7\3\2\2\2\u00c4\u03c5\3\2\2\2\u00c6\u03c7\3\2\2\2\u00c8"+
		"\u03c9\3\2\2\2\u00ca\u03d8\3\2\2\2\u00cc\u03dc\3\2\2\2\u00ce\u03de\3\2"+
		"\2\2\u00d0\u03e2\3\2\2\2\u00d2\u03f8\3\2\2\2\u00d4\u03fc\3\2\2\2\u00d6"+
		"\u00db\5\4\3\2\u00d7\u00da\5\16\b\2\u00d8\u00da\5\20\t\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\3\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e0\5\6\4\2"+
		"\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3"+
		"\5\b\5\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00ea\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\5\f"+
		"\7\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\5\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\3\2\2"+
		"\u00ee\u00ef\t\2\2\2\u00ef\u00f0\7d\2\2\u00f0\7\3\2\2\2\u00f1\u00f2\7"+
		"\4\2\2\u00f2\u00f3\7u\2\2\u00f3\u00f4\7d\2\2\u00f4\t\3\2\2\2\u00f5\u00f6"+
		"\t\3\2\2\u00f6\13\3\2\2\2\u00f7\u00f8\5\n\6\2\u00f8\u00f9\5\60\31\2\u00f9"+
		"\u00fa\7r\2\2\u00fa\u00fb\7d\2\2\u00fb\r\3\2\2\2\u00fc\u0103\5\u00ba^"+
		"\2\u00fd\u0103\5\u00b6\\\2\u00fe\u0103\5P)\2\u00ff\u0103\5\u00ccg\2\u0100"+
		"\u0103\5\22\n\2\u0101\u0103\5\u00be`\2\u0102\u00fc\3\2\2\2\u0102\u00fd"+
		"\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\17\3\2\2\2\u0104\u010d\5z>\2\u0105\u010d\5\30\r\2"+
		"\u0106\u010d\5\24\13\2\u0107\u010d\5\u00aaV\2\u0108\u010d\5\u00aeX\2\u0109"+
		"\u010d\5\u00b0Y\2\u010a\u010d\5H%\2\u010b\u010d\5\\/\2\u010c\u0104\3\2"+
		"\2\2\u010c\u0105\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0107\3\2\2\2\u010c"+
		"\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2"+
		"\2\2\u010d\21\3\2\2\2\u010e\u010f\5\"\22\2\u010f\u0110\7d\2\2\u0110\23"+
		"\3\2\2\2\u0111\u0114\5<\37\2\u0112\u0114\5\62\32\2\u0113\u0111\3\2\2\2"+
		"\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7d\2\2\u0116\25\3"+
		"\2\2\2\u0117\u0119\7r\2\2\u0118\u011a\5\34\17\2\u0119\u0118\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011e\3\2\2\2\u011b\u011c\5\u00a4S\2\u011c\u011d"+
		"\5|?\2\u011d\u011f\3\2\2\2\u011e\u011b\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\27\3\2\2\2\u0120\u0123\5\26\f\2\u0121\u0123\5f\64\2\u0122\u0120\3\2\2"+
		"\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\7d\2\2\u0125\31"+
		"\3\2\2\2\u0126\u0127\7h\2\2\u0127\u0128\5\60\31\2\u0128\33\3\2\2\2\u0129"+
		"\u012a\7]\2\2\u012a\u012b\5|?\2\u012b\u012c\7^\2\2\u012c\35\3\2\2\2\u012d"+
		"\u012e\7]\2\2\u012e\u012f\5|?\2\u012f\u0130\7f\2\2\u0130\u0131\5|?\2\u0131"+
		"\u0132\7^\2\2\u0132\37\3\2\2\2\u0133\u0134\7r\2\2\u0134\u0136\7f\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7r\2\2\u013b"+
		"!\3\2\2\2\u013c\u013d\7\7\2\2\u013d\u013f\7r\2\2\u013e\u0140\5\34\17\2"+
		"\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0147\3\2\2\2\u0141\u0143"+
		"\7\b\2\2\u0142\u0144\5\34\17\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0144\u0145\3\2\2\2\u0145\u0147\7r\2\2\u0146\u013c\3\2\2\2\u0146\u0141"+
		"\3\2\2\2\u0147#\3\2\2\2\u0148\u0149\7\7\2\2\u0149\u014b\7r\2\2\u014a\u014c"+
		"\5\34\17\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0153\3\2\2\2"+
		"\u014d\u014f\7\b\2\2\u014e\u0150\5\34\17\2\u014f\u014e\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\7r\2\2\u0152\u0148\3\2\2\2\u0152"+
		"\u014d\3\2\2\2\u0153%\3\2\2\2\u0154\u0159\5$\23\2\u0155\u0156\7f\2\2\u0156"+
		"\u0158\5$\23\2\u0157\u0155\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\'\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d"+
		"\t\4\2\2\u015d)\3\2\2\2\u015e\u015f\t\5\2\2\u015f+\3\2\2\2\u0160\u0161"+
		"\7\17\2\2\u0161-\3\2\2\2\u0162\u0165\7\20\2\2\u0163\u0165\5\u00c0a\2\u0164"+
		"\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165/\3\2\2\2\u0166\u0167\5*\26\2"+
		"\u0167\u0168\5\34\17\2\u0168\u0172\3\2\2\2\u0169\u016a\5,\27\2\u016a\u016b"+
		"\5\36\20\2\u016b\u0172\3\2\2\2\u016c\u0172\5.\30\2\u016d\u016f\5(\25\2"+
		"\u016e\u0170\5\34\17\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172"+
		"\3\2\2\2\u0171\u0166\3\2\2\2\u0171\u0169\3\2\2\2\u0171\u016c\3\2\2\2\u0171"+
		"\u016d\3\2\2\2\u0172\61\3\2\2\2\u0173\u0174\7\21\2\2\u0174\u0176\7r\2"+
		"\2\u0175\u0177\5\u00a2R\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177"+
		"\63\3\2\2\2\u0178\u0179\5*\26\2\u0179\u017a\5\34\17\2\u017a\u017c\7r\2"+
		"\2\u017b\u017d\5\u00a2R\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\65\3\2\2\2\u017e\u017f\5,\27\2\u017f\u0180\5\36\20\2\u0180\u0182\7r\2"+
		"\2\u0181\u0183\5\u00a2R\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\67\3\2\2\2\u0184\u0185\5.\30\2\u0185\u0187\7r\2\2\u0186\u0188\5\u00a2"+
		"R\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u01889\3\2\2\2\u0189\u018a"+
		"\7\n\2\2\u018a\u018c\7r\2\2\u018b\u018d\5\34\17\2\u018c\u018b\3\2\2\2"+
		"\u018c\u018d\3\2\2\2\u018d\u0194\3\2\2\2\u018e\u0190\7\t\2\2\u018f\u0191"+
		"\5\34\17\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2"+
		"\u0192\u0194\7r\2\2\u0193\u0189\3\2\2\2\u0193\u018e\3\2\2\2\u0194\u0196"+
		"\3\2\2\2\u0195\u0197\5\u00a2R\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2"+
		"\2\u0197;\3\2\2\2\u0198\u019d\5\64\33\2\u0199\u019d\5\66\34\2\u019a\u019d"+
		"\58\35\2\u019b\u019d\5:\36\2\u019c\u0198\3\2\2\2\u019c\u0199\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019d=\3\2\2\2\u019e\u019f\5\60\31"+
		"\2\u019f\u01a0\7f\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019e\3\2\2\2\u01a2\u01a5"+
		"\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5"+
		"\u01a3\3\2\2\2\u01a6\u01a7\5\60\31\2\u01a7?\3\2\2\2\u01a8\u01a9\5*\26"+
		"\2\u01a9\u01aa\5\34\17\2\u01aa\u01b0\3\2\2\2\u01ab\u01ac\5,\27\2\u01ac"+
		"\u01ad\5\36\20\2\u01ad\u01b0\3\2\2\2\u01ae\u01b0\5.\30\2\u01af\u01a8\3"+
		"\2\2\2\u01af\u01ab\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\7r\2\2\u01b2\u01be\3\2\2\2\u01b3\u01b4\7\n\2\2\u01b4\u01b6\7r\2"+
		"\2\u01b5\u01b7\5\34\17\2\u01b6\u01b5\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01be\3\2\2\2\u01b8\u01ba\7\t\2\2\u01b9\u01bb\5\34\17\2\u01ba\u01b9\3"+
		"\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\7r\2\2\u01bd"+
		"\u01af\3\2\2\2\u01bd\u01b3\3\2\2\2\u01bd\u01b8\3\2\2\2\u01beA\3\2\2\2"+
		"\u01bf\u01c4\5@!\2\u01c0\u01c1\7f\2\2\u01c1\u01c3\5@!\2\u01c2\u01c0\3"+
		"\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"C\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01ca\5@!\2\u01c8\u01ca\5$\23\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01caE\3\2\2\2\u01cb\u01cc\5D#\2\u01cc"+
		"\u01cd\7f\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cb\3\2\2\2\u01cf\u01d2\3\2"+
		"\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d3\u01d4\5D#\2\u01d4G\3\2\2\2\u01d5\u01d6\7\22\2\2\u01d6"+
		"\u01d7\7r\2\2\u01d7\u01d8\7g\2\2\u01d8\u01d9\5J&\2\u01d9\u01da\7d\2\2"+
		"\u01daI\3\2\2\2\u01db\u01dc\b&\1\2\u01dc\u01dd\7r\2\2\u01dd\u01e6\5N("+
		"\2\u01de\u01e3\7r\2\2\u01df\u01e0\7]\2\2\u01e0\u01e1\5\u00a0Q\2\u01e1"+
		"\u01e2\7^\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01df\3\2\2\2\u01e3\u01e4\3\2"+
		"\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01db\3\2\2\2\u01e5\u01de\3\2\2\2\u01e6"+
		"\u01ec\3\2\2\2\u01e7\u01e8\f\3\2\2\u01e8\u01e9\7\23\2\2\u01e9\u01eb\5"+
		"J&\4\u01ea\u01e7\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01edK\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f4\5J&\2\u01f0"+
		"\u01f1\7f\2\2\u01f1\u01f3\5J&\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\3\2\2"+
		"\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5M\3\2\2\2\u01f6\u01f4"+
		"\3\2\2\2\u01f7\u01f9\7]\2\2\u01f8\u01fa\5|?\2\u01f9\u01f8\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\7c\2\2\u01fc\u01fe\5|?"+
		"\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u0200"+
		"\7c\2\2\u0200\u0202\5|?\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\7^\2\2\u0204O\3\2\2\2\u0205\u0206\7\24\2\2"+
		"\u0206\u0207\5R*\2\u0207\u0208\5V,\2\u0208Q\3\2\2\2\u0209\u020f\5T+\2"+
		"\u020a\u020c\7a\2\2\u020b\u020d\5 \21\2\u020c\u020b\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\7b\2\2\u020f\u020a\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\5 \21\2\u0212S\3\2\2\2"+
		"\u0213\u0214\t\6\2\2\u0214U\3\2\2\2\u0215\u021a\7_\2\2\u0216\u0219\5\\"+
		"/\2\u0217\u0219\5X-\2\u0218\u0216\3\2\2\2\u0218\u0217\3\2\2\2\u0219\u021c"+
		"\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021d\u021e\7`\2\2\u021eW\3\2\2\2\u021f\u0220\5\u00acW"+
		"\2\u0220\u0221\5Z.\2\u0221Y\3\2\2\2\u0222\u022c\5\\/\2\u0223\u0227\7_"+
		"\2\2\u0224\u0226\5\\/\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227"+
		"\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u022a\u022c\7`\2\2\u022b\u0222\3\2\2\2\u022b\u0223\3\2\2\2\u022c"+
		"[\3\2\2\2\u022d\u022e\5^\60\2\u022e\u022f\7d\2\2\u022f\u0232\3\2\2\2\u0230"+
		"\u0232\5\u00caf\2\u0231\u022d\3\2\2\2\u0231\u0230\3\2\2\2\u0232]\3\2\2"+
		"\2\u0233\u0239\5p9\2\u0234\u0239\5`\61\2\u0235\u0239\5d\63\2\u0236\u0239"+
		"\5b\62\2\u0237\u0239\5h\65\2\u0238\u0233\3\2\2\2\u0238\u0234\3\2\2\2\u0238"+
		"\u0235\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239_\3\2\2\2"+
		"\u023a\u023c\5j\66\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240"+
		"\u0241\7\27\2\2\u0241\u0242\7a\2\2\u0242\u0243\5|?\2\u0243\u0245\7b\2"+
		"\2\u0244\u0246\5L\'\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246a\3"+
		"\2\2\2\u0247\u0248\7\30\2\2\u0248\u0249\5L\'\2\u0249c\3\2\2\2\u024a\u024b"+
		"\7\31\2\2\u024b\u024c\5L\'\2\u024ce\3\2\2\2\u024d\u0250\5d\63\2\u024e"+
		"\u024f\7h\2\2\u024f\u0251\5L\'\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2"+
		"\2\u0251\u0257\3\2\2\2\u0252\u0253\5L\'\2\u0253\u0254\7g\2\2\u0254\u0255"+
		"\5d\63\2\u0255\u0257\3\2\2\2\u0256\u024d\3\2\2\2\u0256\u0252\3\2\2\2\u0257"+
		"g\3\2\2\2\u0258\u025a\7\32\2\2\u0259\u025b\5L\'\2\u025a\u0259\3\2\2\2"+
		"\u025a\u025b\3\2\2\2\u025bi\3\2\2\2\u025c\u0260\7\33\2\2\u025d\u0260\5"+
		"l\67\2\u025e\u0260\5n8\2\u025f\u025c\3\2\2\2\u025f\u025d\3\2\2\2\u025f"+
		"\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\7\34\2\2\u0262k\3\2\2\2"+
		"\u0263\u0264\7\35\2\2\u0264\u0265\7a\2\2\u0265\u0266\5|?\2\u0266\u0267"+
		"\7b\2\2\u0267m\3\2\2\2\u0268\u026d\t\7\2\2\u0269\u026a\7a\2\2\u026a\u026b"+
		"\5|?\2\u026b\u026c\7b\2\2\u026c\u026e\3\2\2\2\u026d\u0269\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026eo\3\2\2\2\u026f\u0271\5j\66\2\u0270\u026f\3\2\2\2"+
		"\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275"+
		"\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u027a\5T+\2\u0276\u0277\7a\2\2\u0277"+
		"\u0278\5\u00a0Q\2\u0278\u0279\7b\2\2\u0279\u027b\3\2\2\2\u027a\u0276\3"+
		"\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\5L\'\2\u027d"+
		"q\3\2\2\2\u027e\u027f\t\b\2\2\u027fs\3\2\2\2\u0280\u0281\t\t\2\2\u0281"+
		"u\3\2\2\2\u0282\u0283\t\n\2\2\u0283w\3\2\2\2\u0284\u0285\t\13\2\2\u0285"+
		"y\3\2\2\2\u0286\u0287\5|?\2\u0287\u0288\7d\2\2\u0288{\3\2\2\2\u0289\u028a"+
		"\b?\1\2\u028a\u028e\5\u0094K\2\u028b\u028e\5\u0090I\2\u028c\u028e\5~@"+
		"\2\u028d\u0289\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2\u028e\u0294"+
		"\3\2\2\2\u028f\u0290\f\3\2\2\u0290\u0291\7\23\2\2\u0291\u0293\5~@\2\u0292"+
		"\u028f\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295}\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0298\b@\1\2\u0298\u0299"+
		"\5\u0080A\2\u0299\u029f\3\2\2\2\u029a\u029b\f\3\2\2\u029b\u029c\7(\2\2"+
		"\u029c\u029e\5\u0080A\2\u029d\u029a\3\2\2\2\u029e\u02a1\3\2\2\2\u029f"+
		"\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\177\3\2\2\2\u02a1\u029f\3\2\2"+
		"\2\u02a2\u02a3\bA\1\2\u02a3\u02a4\5\u0082B\2\u02a4\u02aa\3\2\2\2\u02a5"+
		"\u02a6\f\3\2\2\u02a6\u02a7\7)\2\2\u02a7\u02a9\5\u0082B\2\u02a8\u02a5\3"+
		"\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u0081\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\bB\1\2\u02ae\u02af\5\u0084"+
		"C\2\u02af\u02b5\3\2\2\2\u02b0\u02b1\f\3\2\2\u02b1\u02b2\7*\2\2\u02b2\u02b4"+
		"\5\u0084C\2\u02b3\u02b0\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2"+
		"\2\u02b5\u02b6\3\2\2\2\u02b6\u0083\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02b9"+
		"\bC\1\2\u02b9\u02ba\5\u0086D\2\u02ba\u02c0\3\2\2\2\u02bb\u02bc\f\3\2\2"+
		"\u02bc\u02bd\7+\2\2\u02bd\u02bf\5\u0086D\2\u02be\u02bb\3\2\2\2\u02bf\u02c2"+
		"\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u0085\3\2\2\2\u02c2"+
		"\u02c0\3\2\2\2\u02c3\u02c4\bD\1\2\u02c4\u02c5\5\u0088E\2\u02c5\u02cc\3"+
		"\2\2\2\u02c6\u02c7\f\3\2\2\u02c7\u02c8\5v<\2\u02c8\u02c9\5\u0088E\2\u02c9"+
		"\u02cb\3\2\2\2\u02ca\u02c6\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2"+
		"\2\2\u02cc\u02cd\3\2\2\2\u02cd\u0087\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf"+
		"\u02d0\bE\1\2\u02d0\u02d1\5\u008aF\2\u02d1\u02d8\3\2\2\2\u02d2\u02d3\f"+
		"\3\2\2\u02d3\u02d4\5t;\2\u02d4\u02d5\5\u008aF\2\u02d5\u02d7\3\2\2\2\u02d6"+
		"\u02d2\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u0089\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dc\bF\1\2\u02dc"+
		"\u02dd\5\u008cG\2\u02dd\u02e3\3\2\2\2\u02de\u02df\f\3\2\2\u02df\u02e0"+
		"\t\f\2\2\u02e0\u02e2\5\u008cG\2\u02e1\u02de\3\2\2\2\u02e2\u02e5\3\2\2"+
		"\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u008b\3\2\2\2\u02e5\u02e3"+
		"\3\2\2\2\u02e6\u02e7\bG\1\2\u02e7\u02e8\5\u008eH\2\u02e8\u02ee\3\2\2\2"+
		"\u02e9\u02ea\f\3\2\2\u02ea\u02eb\t\r\2\2\u02eb\u02ed\5\u008eH\2\u02ec"+
		"\u02e9\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02ef\u008d\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f2\bH\1\2\u02f2"+
		"\u02f5\5\u0092J\2\u02f3\u02f5\5\u0090I\2\u02f4\u02f1\3\2\2\2\u02f4\u02f3"+
		"\3\2\2\2\u02f5\u02fe\3\2\2\2\u02f6\u02f7\f\3\2\2\u02f7\u02fa\t\16\2\2"+
		"\u02f8\u02fb\5\u0092J\2\u02f9\u02fb\5\u0090I\2\u02fa\u02f8\3\2\2\2\u02fa"+
		"\u02f9\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02f6\3\2\2\2\u02fd\u0300\3\2"+
		"\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u008f\3\2\2\2\u0300"+
		"\u02fe\3\2\2\2\u0301\u0302\5r:\2\u0302\u0303\5\u0092J\2\u0303\u0091\3"+
		"\2\2\2\u0304\u030a\5\u0094K\2\u0305\u0306\5\u0094K\2\u0306\u0307\7.\2"+
		"\2\u0307\u0308\5\u0092J\2\u0308\u030a\3\2\2\2\u0309\u0304\3\2\2\2\u0309"+
		"\u0305\3\2\2\2\u030a\u0093\3\2\2\2\u030b\u030c\bK\1\2\u030c\u031a\7n\2"+
		"\2\u030d\u031a\7q\2\2\u030e\u031a\7s\2\2\u030f\u031a\5\u0096L\2\u0310"+
		"\u031a\7r\2\2\u0311\u031a\7u\2\2\u0312\u031a\5\u009aN\2\u0313\u031a\5"+
		"\u00b8]\2\u0314\u031a\5\u00c4c\2\u0315\u0316\7a\2\2\u0316\u0317\5|?\2"+
		"\u0317\u0318\7b\2\2\u0318\u031a\3\2\2\2\u0319\u030b\3\2\2\2\u0319\u030d"+
		"\3\2\2\2\u0319\u030e\3\2\2\2\u0319\u030f\3\2\2\2\u0319\u0310\3\2\2\2\u0319"+
		"\u0311\3\2\2\2\u0319\u0312\3\2\2\2\u0319\u0313\3\2\2\2\u0319\u0314\3\2"+
		"\2\2\u0319\u0315\3\2\2\2\u031a\u0324\3\2\2\2\u031b\u031c\f\4\2\2\u031c"+
		"\u031d\7]\2\2\u031d\u031e\5|?\2\u031e\u031f\7^\2\2\u031f\u0323\3\2\2\2"+
		"\u0320\u0321\f\3\2\2\u0321\u0323\5\u0098M\2\u0322\u031b\3\2\2\2\u0322"+
		"\u0320\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2"+
		"\2\2\u0325\u0095\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u0328\t\17\2\2\u0328"+
		"\u0097\3\2\2\2\u0329\u032a\t\20\2\2\u032a\u0099\3\2\2\2\u032b\u032e\5"+
		"\u009cO\2\u032c\u032e\5\u009eP\2\u032d\u032b\3\2\2\2\u032d\u032c\3\2\2"+
		"\2\u032e\u032f\3\2\2\2\u032f\u0330\7a\2\2\u0330\u0331\5\u00a0Q\2\u0331"+
		"\u0332\7b\2\2\u0332\u009b\3\2\2\2\u0333\u0334\t\21\2\2\u0334\u009d\3\2"+
		"\2\2\u0335\u0336\5\60\31\2\u0336\u009f\3\2\2\2\u0337\u033c\5|?\2\u0338"+
		"\u0339\7f\2\2\u0339\u033b\5|?\2\u033a\u0338\3\2\2\2\u033b\u033e\3\2\2"+
		"\2\u033c\u033a\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u00a1\3\2\2\2\u033e\u033c"+
		"\3\2\2\2\u033f\u0340\7g\2\2\u0340\u0341\5|?\2\u0341\u00a3\3\2\2\2\u0342"+
		"\u0343\t\22\2\2\u0343\u00a5\3\2\2\2\u0344\u0345\7_\2\2\u0345\u0346\5\u00a0"+
		"Q\2\u0346\u0347\7`\2\2\u0347\u034b\3\2\2\2\u0348\u034b\5N(\2\u0349\u034b"+
		"\7r\2\2\u034a\u0344\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034b"+
		"\u00a7\3\2\2\2\u034c\u0358\5\20\t\2\u034d\u0358\5\u00b4[\2\u034e\u0353"+
		"\7_\2\2\u034f\u0352\5\20\t\2\u0350\u0352\5\u00b4[\2\u0351\u034f\3\2\2"+
		"\2\u0351\u0350\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354"+
		"\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0353\3\2\2\2\u0356\u0358\7`\2\2\u0357"+
		"\u034c\3\2\2\2\u0357\u034d\3\2\2\2\u0357\u034e\3\2\2\2\u0358\u00a9\3\2"+
		"\2\2\u0359\u035a\7H\2\2\u035a\u035b\7a\2\2\u035b\u035c\5|?\2\u035c\u035d"+
		"\7b\2\2\u035d\u0360\5\u00a8U\2\u035e\u035f\7I\2\2\u035f\u0361\5\u00a8"+
		"U\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u00ab\3\2\2\2\u0362"+
		"\u0363\7J\2\2\u0363\u0364\7r\2\2\u0364\u0365\7K\2\2\u0365\u036c\5\u00a6"+
		"T\2\u0366\u0367\7L\2\2\u0367\u0368\7a\2\2\u0368\u0369\5|?\2\u0369\u036a"+
		"\7b\2\2\u036a\u036c\3\2\2\2\u036b\u0362\3\2\2\2\u036b\u0366\3\2\2\2\u036c"+
		"\u00ad\3\2\2\2\u036d\u036e\5\u00acW\2\u036e\u036f\5\u00a8U\2\u036f\u00af"+
		"\3\2\2\2\u0370\u0371\7M\2\2\u0371\u0372\7d\2\2\u0372\u00b1\3\2\2\2\u0373"+
		"\u0376\7N\2\2\u0374\u0377\5|?\2\u0375\u0377\5d\63\2\u0376\u0374\3\2\2"+
		"\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0379"+
		"\7d\2\2\u0379\u00b3\3\2\2\2\u037a\u037b\t\23\2\2\u037b\u037f\7d\2\2\u037c"+
		"\u037f\5\u00b0Y\2\u037d\u037f\5\u00b2Z\2\u037e\u037a\3\2\2\2\u037e\u037c"+
		"\3\2\2\2\u037e\u037d\3\2\2\2\u037f\u00b5\3\2\2\2\u0380\u0381\7Q\2\2\u0381"+
		"\u0382\7r\2\2\u0382\u0384\7a\2\2\u0383\u0385\5> \2\u0384\u0383\3\2\2\2"+
		"\u0384\u0385\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\7b\2\2\u0387\u0389"+
		"\5\32\16\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2"+
		"\u038a\u038b\7d\2\2\u038b\u00b7\3\2\2\2\u038c\u038d\7r\2\2\u038d\u038f"+
		"\7a\2\2\u038e\u0390\5\u00a0Q\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2"+
		"\u0390\u0391\3\2\2\2\u0391\u0392\7b\2\2\u0392\u00b9\3\2\2\2\u0393\u0394"+
		"\7R\2\2\u0394\u0395\7r\2\2\u0395\u0397\7a\2\2\u0396\u0398\5F$\2\u0397"+
		"\u0396\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\7b"+
		"\2\2\u039a\u039c\5\32\16\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c"+
		"\u039d\3\2\2\2\u039d\u039e\5\u00bc_\2\u039e\u00bb\3\2\2\2\u039f\u03a3"+
		"\7_\2\2\u03a0\u03a2\5\20\t\2\u03a1\u03a0\3\2\2\2\u03a2\u03a5\3\2\2\2\u03a3"+
		"\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2"+
		"\2\2\u03a6\u03a8\5\u00b2Z\2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03a9\3\2\2\2\u03a9\u03aa\7`\2\2\u03aa\u00bd\3\2\2\2\u03ab\u03ac\7S\2"+
		"\2\u03ac\u03b0\7_\2\2\u03ad\u03af\5\20\t\2\u03ae\u03ad\3\2\2\2\u03af\u03b2"+
		"\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b3\3\2\2\2\u03b2"+
		"\u03b0\3\2\2\2\u03b3\u03b4\7`\2\2\u03b4\u00bf\3\2\2\2\u03b5\u03b6\t\24"+
		"\2\2\u03b6\u00c1\3\2\2\2\u03b7\u03b9\7V\2\2\u03b8\u03ba\5\34\17\2\u03b9"+
		"\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\5V"+
		",\2\u03bc\u00c3\3\2\2\2\u03bd\u03c6\7t\2\2\u03be\u03bf\7W\2\2\u03bf\u03c2"+
		"\7a\2\2\u03c0\u03c3\7r\2\2\u03c1\u03c3\5V,\2\u03c2\u03c0\3\2\2\2\u03c2"+
		"\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c6\7b\2\2\u03c5\u03bd\3\2"+
		"\2\2\u03c5\u03be\3\2\2\2\u03c6\u00c5\3\2\2\2\u03c7\u03c8\t\25\2\2\u03c8"+
		"\u00c7\3\2\2\2\u03c9\u03cf\5\u00c6d\2\u03ca\u03cc\7a\2\2\u03cb\u03cd\5"+
		"\u00a0Q\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\3\2\2\2"+
		"\u03ce\u03d0\7b\2\2\u03cf\u03ca\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1"+
		"\3\2\2\2\u03d1\u03d2\5\34\17\2\u03d2\u03d3\5L\'\2\u03d3\u00c9\3\2\2\2"+
		"\u03d4\u03d5\5\u00c8e\2\u03d5\u03d6\7d\2\2\u03d6\u03d9\3\2\2\2\u03d7\u03d9"+
		"\5\u00c2b\2\u03d8\u03d4\3\2\2\2\u03d8\u03d7\3\2\2\2\u03d9\u00cb\3\2\2"+
		"\2\u03da\u03dd\5\u00ceh\2\u03db\u03dd\5\u00d0i\2\u03dc\u03da\3\2\2\2\u03dc"+
		"\u03db\3\2\2\2\u03dd\u00cd\3\2\2\2\u03de\u03df\7Z\2\2\u03df\u03e0\5\u00d2"+
		"j\2\u03e0\u03e1\7d\2\2\u03e1\u00cf\3\2\2\2\u03e2\u03e3\7[\2\2\u03e3\u03e9"+
		"\7r\2\2\u03e4\u03e6\7a\2\2\u03e5\u03e7\5\u00d4k\2\u03e6\u03e5\3\2\2\2"+
		"\u03e6\u03e7\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03ea\7b\2\2\u03e9\u03e4"+
		"\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ed\5 \21\2\u03ec"+
		"\u03ee\5\32\16\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef\3"+
		"\2\2\2\u03ef\u03f3\7_\2\2\u03f0\u03f2\13\2\2\2\u03f1\u03f0\3\2\2\2\u03f2"+
		"\u03f5\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f6\3\2"+
		"\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f7\7`\2\2\u03f7\u00d1\3\2\2\2\u03f8"+
		"\u03f9\t\26\2\2\u03f9\u00d3\3\2\2\2\u03fa\u03fd\5B\"\2\u03fb\u03fd\5\u00a0"+
		"Q\2\u03fc\u03fa\3\2\2\2\u03fc\u03fb\3\2\2\2\u03fd\u00d5\3\2\2\2p\u00d9"+
		"\u00db\u00df\u00e4\u00ea\u0102\u010c\u0113\u0119\u011e\u0122\u0137\u013f"+
		"\u0143\u0146\u014b\u014f\u0152\u0159\u0164\u016f\u0171\u0176\u017c\u0182"+
		"\u0187\u018c\u0190\u0193\u0196\u019c\u01a3\u01af\u01b6\u01ba\u01bd\u01c4"+
		"\u01c9\u01d0\u01e3\u01e5\u01ec\u01f4\u01f9\u01fd\u0201\u020c\u020f\u0218"+
		"\u021a\u0227\u022b\u0231\u0238\u023d\u0245\u0250\u0256\u025a\u025f\u026d"+
		"\u0272\u027a\u028d\u0294\u029f\u02aa\u02b5\u02c0\u02cc\u02d8\u02e3\u02ee"+
		"\u02f4\u02fa\u02fe\u0309\u0319\u0322\u0324\u032d\u033c\u034a\u0351\u0353"+
		"\u0357\u0360\u036b\u0376\u037e\u0384\u0388\u038f\u0397\u039b\u03a3\u03a7"+
		"\u03b0\u03b9\u03c2\u03c5\u03cc\u03cf\u03d8\u03dc\u03e6\u03e9\u03ed\u03f3"+
		"\u03fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}