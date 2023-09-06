// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.TATO;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TATOLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOME_TORNEIO=1, QUANTIDADE_EQUIPES=2, VANTAGEM=3, CARACTERISTICAS=4, REPESCAGEM=5, 
		PONTOS=6, SIM=7, NAO=8, FIM_TORNEIO=9, FIM_ALGORITMO=10, NMR_EQP=11, WS=12, 
		CADEIA=13, ERRO_CADEIA=14, COMENTARIO=15, ERRO_COMENTARIO=16, DELIM=17, 
		ERRO=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NOME_TORNEIO", "QUANTIDADE_EQUIPES", "VANTAGEM", "CARACTERISTICAS", 
			"REPESCAGEM", "PONTOS", "SIM", "NAO", "FIM_TORNEIO", "FIM_ALGORITMO", 
			"NMR_EQP", "WS", "CADEIA", "ERRO_CADEIA", "COMENTARIO", "ERRO_COMENTARIO", 
			"DELIM", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'nome_torneio'", "'quantidade_equipes'", "'vantagem'", "'caracteristicas'", 
			"'repescagem'", "'pontos'", "'sim'", "'nao'", "'fim_torneio'", "'fim_algoritmo'", 
			null, null, null, null, null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOME_TORNEIO", "QUANTIDADE_EQUIPES", "VANTAGEM", "CARACTERISTICAS", 
			"REPESCAGEM", "PONTOS", "SIM", "NAO", "FIM_TORNEIO", "FIM_ALGORITMO", 
			"NMR_EQP", "WS", "CADEIA", "ERRO_CADEIA", "COMENTARIO", "ERRO_COMENTARIO", 
			"DELIM", "ERRO"
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


	public TATOLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TATO.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u00c3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\n\u0094"+
		"\b\n\u000b\n\f\n\u0095\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0005\f\u009d\b\f\n\f\f\f\u00a0\t\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0005\r\u00a6\b\r\n\r\f\r\u00a9\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00af\b\u000e\n\u000e\f\u000e\u00b2\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00b9\b\u000f"+
		"\n\u000f\f\u000f\u00bc\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0004\u009e\u00a7\u00b0\u00ba\u0000\u0012"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0005\u0003\u0000\t"+
		"\n\r\r  \u0001\u0000\n\n\u0002\u0000\n\n\"\"\u0002\u0000\n\n\r\r\u0002"+
		"\u0000\n\n}}\u00c7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001"+
		"%\u0001\u0000\u0000\u0000\u00032\u0001\u0000\u0000\u0000\u0005E\u0001"+
		"\u0000\u0000\u0000\u0007N\u0001\u0000\u0000\u0000\t^\u0001\u0000\u0000"+
		"\u0000\u000bi\u0001\u0000\u0000\u0000\rp\u0001\u0000\u0000\u0000\u000f"+
		"t\u0001\u0000\u0000\u0000\u0011x\u0001\u0000\u0000\u0000\u0013\u0084\u0001"+
		"\u0000\u0000\u0000\u0015\u0093\u0001\u0000\u0000\u0000\u0017\u0097\u0001"+
		"\u0000\u0000\u0000\u0019\u009a\u0001\u0000\u0000\u0000\u001b\u00a3\u0001"+
		"\u0000\u0000\u0000\u001d\u00ac\u0001\u0000\u0000\u0000\u001f\u00b6\u0001"+
		"\u0000\u0000\u0000!\u00bf\u0001\u0000\u0000\u0000#\u00c1\u0001\u0000\u0000"+
		"\u0000%&\u0005n\u0000\u0000&\'\u0005o\u0000\u0000\'(\u0005m\u0000\u0000"+
		"()\u0005e\u0000\u0000)*\u0005_\u0000\u0000*+\u0005t\u0000\u0000+,\u0005"+
		"o\u0000\u0000,-\u0005r\u0000\u0000-.\u0005n\u0000\u0000./\u0005e\u0000"+
		"\u0000/0\u0005i\u0000\u000001\u0005o\u0000\u00001\u0002\u0001\u0000\u0000"+
		"\u000023\u0005q\u0000\u000034\u0005u\u0000\u000045\u0005a\u0000\u0000"+
		"56\u0005n\u0000\u000067\u0005t\u0000\u000078\u0005i\u0000\u000089\u0005"+
		"d\u0000\u00009:\u0005a\u0000\u0000:;\u0005d\u0000\u0000;<\u0005e\u0000"+
		"\u0000<=\u0005_\u0000\u0000=>\u0005e\u0000\u0000>?\u0005q\u0000\u0000"+
		"?@\u0005u\u0000\u0000@A\u0005i\u0000\u0000AB\u0005p\u0000\u0000BC\u0005"+
		"e\u0000\u0000CD\u0005s\u0000\u0000D\u0004\u0001\u0000\u0000\u0000EF\u0005"+
		"v\u0000\u0000FG\u0005a\u0000\u0000GH\u0005n\u0000\u0000HI\u0005t\u0000"+
		"\u0000IJ\u0005a\u0000\u0000JK\u0005g\u0000\u0000KL\u0005e\u0000\u0000"+
		"LM\u0005m\u0000\u0000M\u0006\u0001\u0000\u0000\u0000NO\u0005c\u0000\u0000"+
		"OP\u0005a\u0000\u0000PQ\u0005r\u0000\u0000QR\u0005a\u0000\u0000RS\u0005"+
		"c\u0000\u0000ST\u0005t\u0000\u0000TU\u0005e\u0000\u0000UV\u0005r\u0000"+
		"\u0000VW\u0005i\u0000\u0000WX\u0005s\u0000\u0000XY\u0005t\u0000\u0000"+
		"YZ\u0005i\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005"+
		"s\u0000\u0000]\b\u0001\u0000\u0000\u0000^_\u0005r\u0000\u0000_`\u0005"+
		"e\u0000\u0000`a\u0005p\u0000\u0000ab\u0005e\u0000\u0000bc\u0005s\u0000"+
		"\u0000cd\u0005c\u0000\u0000de\u0005a\u0000\u0000ef\u0005g\u0000\u0000"+
		"fg\u0005e\u0000\u0000gh\u0005m\u0000\u0000h\n\u0001\u0000\u0000\u0000"+
		"ij\u0005p\u0000\u0000jk\u0005o\u0000\u0000kl\u0005n\u0000\u0000lm\u0005"+
		"t\u0000\u0000mn\u0005o\u0000\u0000no\u0005s\u0000\u0000o\f\u0001\u0000"+
		"\u0000\u0000pq\u0005s\u0000\u0000qr\u0005i\u0000\u0000rs\u0005m\u0000"+
		"\u0000s\u000e\u0001\u0000\u0000\u0000tu\u0005n\u0000\u0000uv\u0005a\u0000"+
		"\u0000vw\u0005o\u0000\u0000w\u0010\u0001\u0000\u0000\u0000xy\u0005f\u0000"+
		"\u0000yz\u0005i\u0000\u0000z{\u0005m\u0000\u0000{|\u0005_\u0000\u0000"+
		"|}\u0005t\u0000\u0000}~\u0005o\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f"+
		"\u0080\u0005n\u0000\u0000\u0080\u0081\u0005e\u0000\u0000\u0081\u0082\u0005"+
		"i\u0000\u0000\u0082\u0083\u0005o\u0000\u0000\u0083\u0012\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005f\u0000\u0000\u0085\u0086\u0005i\u0000\u0000\u0086"+
		"\u0087\u0005m\u0000\u0000\u0087\u0088\u0005_\u0000\u0000\u0088\u0089\u0005"+
		"a\u0000\u0000\u0089\u008a\u0005l\u0000\u0000\u008a\u008b\u0005g\u0000"+
		"\u0000\u008b\u008c\u0005o\u0000\u0000\u008c\u008d\u0005r\u0000\u0000\u008d"+
		"\u008e\u0005i\u0000\u0000\u008e\u008f\u0005t\u0000\u0000\u008f\u0090\u0005"+
		"m\u0000\u0000\u0090\u0091\u0005o\u0000\u0000\u0091\u0014\u0001\u0000\u0000"+
		"\u0000\u0092\u0094\u000209\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0016\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0007\u0000\u0000\u0000\u0098\u0099\u0006\u000b\u0000\u0000\u0099"+
		"\u0018\u0001\u0000\u0000\u0000\u009a\u009e\u0005\"\u0000\u0000\u009b\u009d"+
		"\b\u0001\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005\"\u0000\u0000\u00a2\u001a\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a7\u0005\"\u0000\u0000\u00a4\u00a6\b\u0002\u0000"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005\n\u0000\u0000\u00ab\u001c\u0001\u0000\u0000\u0000"+
		"\u00ac\u00b0\u0005{\u0000\u0000\u00ad\u00af\b\u0003\u0000\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0005}\u0000\u0000\u00b4\u00b5\u0006\u000e\u0001\u0000\u00b5\u001e"+
		"\u0001\u0000\u0000\u0000\u00b6\u00ba\u0005{\u0000\u0000\u00b7\u00b9\b"+
		"\u0004\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005\n\u0000\u0000\u00be \u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005:\u0000\u0000\u00c0\"\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\t\u0000\u0000\u0000\u00c2$\u0001\u0000\u0000\u0000"+
		"\u0006\u0000\u0095\u009e\u00a7\u00b0\u00ba\u0002\u0001\u000b\u0000\u0001"+
		"\u000e\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}