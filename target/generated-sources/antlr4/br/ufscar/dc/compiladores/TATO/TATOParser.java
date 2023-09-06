// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.TATO;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TATOParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOME_TORNEIO=1, QUANTIDADE_EQUIPES=2, VANTAGEM=3, CARACTERISTICAS=4, REPESCAGEM=5, 
		PONTOS=6, SIM=7, NAO=8, FIM_TORNEIO=9, FIM_ALGORITMO=10, NMR_EQP=11, WS=12, 
		CADEIA=13, ERRO_CADEIA=14, COMENTARIO=15, ERRO_COMENTARIO=16, DELIM=17, 
		ERRO=18;
	public static final int
		RULE_programa = 0, RULE_corpo = 1, RULE_nome_torneio = 2, RULE_equipes = 3, 
		RULE_nmr_equipes = 4, RULE_nome_equipes = 5, RULE_equipe_vantagem = 6, 
		RULE_propriedades = 7, RULE_caract = 8, RULE_rep = 9, RULE_pts = 10, RULE_sn = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "corpo", "nome_torneio", "equipes", "nmr_equipes", "nome_equipes", 
			"equipe_vantagem", "propriedades", "caract", "rep", "pts", "sn"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TATOParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(TATOParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			corpo();
			setState(25);
			match(FIM_ALGORITMO);
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
	public static class CorpoContext extends ParserRuleContext {
		public List<Nome_torneioContext> nome_torneio() {
			return getRuleContexts(Nome_torneioContext.class);
		}
		public Nome_torneioContext nome_torneio(int i) {
			return getRuleContext(Nome_torneioContext.class,i);
		}
		public List<EquipesContext> equipes() {
			return getRuleContexts(EquipesContext.class);
		}
		public EquipesContext equipes(int i) {
			return getRuleContext(EquipesContext.class,i);
		}
		public List<PropriedadesContext> propriedades() {
			return getRuleContexts(PropriedadesContext.class);
		}
		public PropriedadesContext propriedades(int i) {
			return getRuleContext(PropriedadesContext.class,i);
		}
		public List<TerminalNode> FIM_TORNEIO() { return getTokens(TATOParser.FIM_TORNEIO); }
		public TerminalNode FIM_TORNEIO(int i) {
			return getToken(TATOParser.FIM_TORNEIO, i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				nome_torneio();
				setState(28);
				equipes();
				setState(29);
				propriedades();
				setState(30);
				match(FIM_TORNEIO);
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOME_TORNEIO );
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
	public static class Nome_torneioContext extends ParserRuleContext {
		public TerminalNode NOME_TORNEIO() { return getToken(TATOParser.NOME_TORNEIO, 0); }
		public TerminalNode DELIM() { return getToken(TATOParser.DELIM, 0); }
		public TerminalNode CADEIA() { return getToken(TATOParser.CADEIA, 0); }
		public Nome_torneioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_torneio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterNome_torneio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitNome_torneio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitNome_torneio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_torneioContext nome_torneio() throws RecognitionException {
		Nome_torneioContext _localctx = new Nome_torneioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nome_torneio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(NOME_TORNEIO);
			setState(37);
			match(DELIM);
			setState(38);
			match(CADEIA);
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
	public static class EquipesContext extends ParserRuleContext {
		public Nmr_equipesContext nmr_equipes() {
			return getRuleContext(Nmr_equipesContext.class,0);
		}
		public List<Nome_equipesContext> nome_equipes() {
			return getRuleContexts(Nome_equipesContext.class);
		}
		public Nome_equipesContext nome_equipes(int i) {
			return getRuleContext(Nome_equipesContext.class,i);
		}
		public EquipesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equipes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterEquipes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitEquipes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitEquipes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquipesContext equipes() throws RecognitionException {
		EquipesContext _localctx = new EquipesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_equipes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			nmr_equipes();
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41);
				nome_equipes();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
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
	public static class Nmr_equipesContext extends ParserRuleContext {
		public TerminalNode QUANTIDADE_EQUIPES() { return getToken(TATOParser.QUANTIDADE_EQUIPES, 0); }
		public TerminalNode DELIM() { return getToken(TATOParser.DELIM, 0); }
		public TerminalNode NMR_EQP() { return getToken(TATOParser.NMR_EQP, 0); }
		public Nmr_equipesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nmr_equipes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterNmr_equipes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitNmr_equipes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitNmr_equipes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nmr_equipesContext nmr_equipes() throws RecognitionException {
		Nmr_equipesContext _localctx = new Nmr_equipesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nmr_equipes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(QUANTIDADE_EQUIPES);
			setState(47);
			match(DELIM);
			setState(48);
			match(NMR_EQP);
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
	public static class Nome_equipesContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(TATOParser.CADEIA, 0); }
		public Equipe_vantagemContext equipe_vantagem() {
			return getRuleContext(Equipe_vantagemContext.class,0);
		}
		public Nome_equipesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_equipes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterNome_equipes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitNome_equipes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitNome_equipes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_equipesContext nome_equipes() throws RecognitionException {
		Nome_equipesContext _localctx = new Nome_equipesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nome_equipes);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(CADEIA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				equipe_vantagem();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Equipe_vantagemContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(TATOParser.CADEIA, 0); }
		public TerminalNode DELIM() { return getToken(TATOParser.DELIM, 0); }
		public TerminalNode VANTAGEM() { return getToken(TATOParser.VANTAGEM, 0); }
		public Equipe_vantagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equipe_vantagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterEquipe_vantagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitEquipe_vantagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitEquipe_vantagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equipe_vantagemContext equipe_vantagem() throws RecognitionException {
		Equipe_vantagemContext _localctx = new Equipe_vantagemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_equipe_vantagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(CADEIA);
			setState(55);
			match(DELIM);
			setState(56);
			match(VANTAGEM);
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
	public static class PropriedadesContext extends ParserRuleContext {
		public TerminalNode CARACTERISTICAS() { return getToken(TATOParser.CARACTERISTICAS, 0); }
		public TerminalNode DELIM() { return getToken(TATOParser.DELIM, 0); }
		public CaractContext caract() {
			return getRuleContext(CaractContext.class,0);
		}
		public PropriedadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propriedades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterPropriedades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitPropriedades(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitPropriedades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropriedadesContext propriedades() throws RecognitionException {
		PropriedadesContext _localctx = new PropriedadesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_propriedades);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CARACTERISTICAS) {
				{
				setState(58);
				match(CARACTERISTICAS);
				setState(59);
				match(DELIM);
				setState(60);
				caract();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaractContext extends ParserRuleContext {
		public RepContext rep() {
			return getRuleContext(RepContext.class,0);
		}
		public PtsContext pts() {
			return getRuleContext(PtsContext.class,0);
		}
		public CaractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caract; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterCaract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitCaract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitCaract(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaractContext caract() throws RecognitionException {
		CaractContext _localctx = new CaractContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_caract);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPESCAGEM:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				rep();
				}
				break;
			case PONTOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				pts();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepContext extends ParserRuleContext {
		public TerminalNode REPESCAGEM() { return getToken(TATOParser.REPESCAGEM, 0); }
		public TerminalNode DELIM() { return getToken(TATOParser.DELIM, 0); }
		public SnContext sn() {
			return getRuleContext(SnContext.class,0);
		}
		public PtsContext pts() {
			return getRuleContext(PtsContext.class,0);
		}
		public RepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterRep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitRep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitRep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepContext rep() throws RecognitionException {
		RepContext _localctx = new RepContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rep);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(REPESCAGEM);
			setState(68);
			match(DELIM);
			setState(69);
			sn();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTOS) {
				{
				setState(70);
				pts();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PtsContext extends ParserRuleContext {
		public TerminalNode PONTOS() { return getToken(TATOParser.PONTOS, 0); }
		public TerminalNode DELIM() { return getToken(TATOParser.DELIM, 0); }
		public SnContext sn() {
			return getRuleContext(SnContext.class,0);
		}
		public RepContext rep() {
			return getRuleContext(RepContext.class,0);
		}
		public PtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterPts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitPts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitPts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PtsContext pts() throws RecognitionException {
		PtsContext _localctx = new PtsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(PONTOS);
			setState(74);
			match(DELIM);
			setState(75);
			sn();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPESCAGEM) {
				{
				setState(76);
				rep();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SnContext extends ParserRuleContext {
		public TerminalNode SIM() { return getToken(TATOParser.SIM, 0); }
		public TerminalNode NAO() { return getToken(TATOParser.NAO, 0); }
		public SnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).enterSn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TATOListener ) ((TATOListener)listener).exitSn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TATOVisitor ) return ((TATOVisitor<? extends T>)visitor).visitSn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SnContext sn() throws RecognitionException {
		SnContext _localctx = new SnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==SIM || _la==NAO) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0012R\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0004\u0001!\b\u0001\u000b\u0001\f\u0001\"\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u0003"+
		"+\b\u0003\u000b\u0003\f\u0003,\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0003\u00055\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007>\b\u0007\u0001\b\u0001\b\u0003\bB\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\tH\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nN\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0000\u0001\u0001\u0000\u0007\bL\u0000\u0018"+
		"\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004$\u0001\u0000"+
		"\u0000\u0000\u0006(\u0001\u0000\u0000\u0000\b.\u0001\u0000\u0000\u0000"+
		"\n4\u0001\u0000\u0000\u0000\f6\u0001\u0000\u0000\u0000\u000e=\u0001\u0000"+
		"\u0000\u0000\u0010A\u0001\u0000\u0000\u0000\u0012C\u0001\u0000\u0000\u0000"+
		"\u0014I\u0001\u0000\u0000\u0000\u0016O\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0003\u0002\u0001\u0000\u0019\u001a\u0005\n\u0000\u0000\u001a\u0001\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0003\u0004\u0002\u0000\u001c\u001d\u0003"+
		"\u0006\u0003\u0000\u001d\u001e\u0003\u000e\u0007\u0000\u001e\u001f\u0005"+
		"\t\u0000\u0000\u001f!\u0001\u0000\u0000\u0000 \u001b\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000"+
		"\u0000%&\u0005\u0011\u0000\u0000&\'\u0005\r\u0000\u0000\'\u0005\u0001"+
		"\u0000\u0000\u0000(*\u0003\b\u0004\u0000)+\u0003\n\u0005\u0000*)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-\u0007\u0001\u0000\u0000\u0000./\u0005\u0002"+
		"\u0000\u0000/0\u0005\u0011\u0000\u000001\u0005\u000b\u0000\u00001\t\u0001"+
		"\u0000\u0000\u000025\u0005\r\u0000\u000035\u0003\f\u0006\u000042\u0001"+
		"\u0000\u0000\u000043\u0001\u0000\u0000\u00005\u000b\u0001\u0000\u0000"+
		"\u000067\u0005\r\u0000\u000078\u0005\u0011\u0000\u000089\u0005\u0003\u0000"+
		"\u00009\r\u0001\u0000\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0005\u0011"+
		"\u0000\u0000<>\u0003\u0010\b\u0000=:\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>\u000f\u0001\u0000\u0000\u0000?B\u0003\u0012\t\u0000@B\u0003"+
		"\u0014\n\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000B\u0011"+
		"\u0001\u0000\u0000\u0000CD\u0005\u0005\u0000\u0000DE\u0005\u0011\u0000"+
		"\u0000EG\u0003\u0016\u000b\u0000FH\u0003\u0014\n\u0000GF\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000H\u0013\u0001\u0000\u0000\u0000IJ\u0005"+
		"\u0006\u0000\u0000JK\u0005\u0011\u0000\u0000KM\u0003\u0016\u000b\u0000"+
		"LN\u0003\u0012\t\u0000ML\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000"+
		"N\u0015\u0001\u0000\u0000\u0000OP\u0007\u0000\u0000\u0000P\u0017\u0001"+
		"\u0000\u0000\u0000\u0007\",4=AGM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}