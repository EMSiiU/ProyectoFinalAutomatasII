// Generated from c:/Escuela/ProyectoFinalAutomatasII/grammar/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, PRIVATE=2, PROTECTED=3, STATIC=4, FINAL=5, ABSTRACT=6, SYNCHRONIZED=7, 
		VOLATILE=8, TRANSIENT=9, NATIVE=10, STRICTFP=11, VOID=12, CLASS=13, SYSTEM=14, 
		OUT=15, PRINTLN=16, DEFAULT=17, THIS=18, STRING=19, BYTE=20, SHORT=21, 
		INT=22, LONG=23, FLOAT=24, DOUBLE=25, CHAR=26, BOOLEAN=27, IF=28, ELSE=29, 
		SWITCH=30, CASE=31, FOR=32, WHILE=33, DO=34, BREAK=35, CONTINUE=36, RETURN=37, 
		ELSE_IF=38, TRUE=39, FALSE=40, NULL=41, INTERFACE=42, EXTENDS=43, IMPLEMENTS=44, 
		NEW=45, SUPER=46, INSTANCEOF=47, ENUM=48, TRY=49, CATCH=50, FINALLY=51, 
		THROW=52, THROWS=53, PACKAGE=54, IMPORT=55, ASSERT=56, IDT=57, ENTERO=58, 
		DECIMAL=59, CADENA=60, ASIGNACION=61, MAS=62, MENOS=63, POR=64, ENTRE=65, 
		MODULO=66, AND=67, OR=68, NOT=69, MAYOR=70, MAYOR_IGUAL=71, MENOR=72, 
		MENOR_IGUAL=73, IGUAL=74, DIFERENTE=75, INCREMENTO=76, DECREMENTO=77, 
		TERNARIO=78, PAR_1=79, PAR_2=80, COR_1=81, COR_2=82, LLA_1=83, LLA_2=84, 
		PUNTO_COMA=85, PUNTO=86, COMA=87, DOS_PUNTOS=88, ARROBA=89, COMENTARIO_LINEA=90, 
		COMENTARIO_BLOQUE=91, WS=92, ERROR_TOKEN=93;
	public static final int
		RULE_root = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'private'", "'protected'", "'static'", "'final'", 
			"'abstract'", "'synchronized'", "'volatile'", "'transient'", "'native'", 
			"'strictfp'", "'void'", "'class'", "'System'", "'out'", "'println'", 
			"'default'", "'this'", "'String'", "'byte'", "'short'", "'int'", "'long'", 
			"'float'", "'double'", "'char'", "'boolean'", "'if'", "'else'", "'switch'", 
			"'case'", "'for'", "'while'", "'do'", "'break'", "'continue'", "'return'", 
			"'else if'", "'true'", "'false'", "'null'", "'interface'", "'extends'", 
			"'implements'", "'new'", "'super'", "'instanceof'", "'enum'", "'try'", 
			"'catch'", "'finally'", "'throw'", "'throws'", "'package'", "'import'", 
			"'assert'", null, null, null, null, "'='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'&&'", "'||'", "'!'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", 
			"'++'", "'--'", "'?'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", 
			"'.'", "','", "':'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", "ABSTRACT", 
			"SYNCHRONIZED", "VOLATILE", "TRANSIENT", "NATIVE", "STRICTFP", "VOID", 
			"CLASS", "SYSTEM", "OUT", "PRINTLN", "DEFAULT", "THIS", "STRING", "BYTE", 
			"SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "CHAR", "BOOLEAN", "IF", "ELSE", 
			"SWITCH", "CASE", "FOR", "WHILE", "DO", "BREAK", "CONTINUE", "RETURN", 
			"ELSE_IF", "TRUE", "FALSE", "NULL", "INTERFACE", "EXTENDS", "IMPLEMENTS", 
			"NEW", "SUPER", "INSTANCEOF", "ENUM", "TRY", "CATCH", "FINALLY", "THROW", 
			"THROWS", "PACKAGE", "IMPORT", "ASSERT", "IDT", "ENTERO", "DECIMAL", 
			"CADENA", "ASIGNACION", "MAS", "MENOS", "POR", "ENTRE", "MODULO", "AND", 
			"OR", "NOT", "MAYOR", "MAYOR_IGUAL", "MENOR", "MENOR_IGUAL", "IGUAL", 
			"DIFERENTE", "INCREMENTO", "DECREMENTO", "TERNARIO", "PAR_1", "PAR_2", 
			"COR_1", "COR_2", "LLA_1", "LLA_2", "PUNTO_COMA", "PUNTO", "COMA", "DOS_PUNTOS", 
			"ARROBA", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS", "ERROR_TOKEN"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expr();
			setState(5);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			match(EOF);
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

	public static final String _serializedATN =
		"\u0004\u0001]\n\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0000\u0007\u0000\u0004\u0001\u0000\u0000"+
		"\u0000\u0002\u0007\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001"+
		"\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000"+
		"\u0000\u0007\b\u0005\u0000\u0000\u0001\b\u0003\u0001\u0000\u0000\u0000"+
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