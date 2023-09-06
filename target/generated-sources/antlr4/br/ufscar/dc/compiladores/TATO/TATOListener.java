// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.TATO;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TATOParser}.
 */
public interface TATOListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TATOParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(TATOParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(TATOParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TATOParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(TATOParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(TATOParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TATOParser#nome_torneio}.
	 * @param ctx the parse tree
	 */
	void enterNome_torneio(TATOParser.Nome_torneioContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#nome_torneio}.
	 * @param ctx the parse tree
	 */
	void exitNome_torneio(TATOParser.Nome_torneioContext ctx);
	/**
	 * Enter a parse tree produced by {@link TATOParser#equipes}.
	 * @param ctx the parse tree
	 */
	void enterEquipes(TATOParser.EquipesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#equipes}.
	 * @param ctx the parse tree
	 */
	void exitEquipes(TATOParser.EquipesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TATOParser#nmr_equipes}.
	 * @param ctx the parse tree
	 */
	void enterNmr_equipes(TATOParser.Nmr_equipesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#nmr_equipes}.
	 * @param ctx the parse tree
	 */
	void exitNmr_equipes(TATOParser.Nmr_equipesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TATOParser#nome_equipes}.
	 * @param ctx the parse tree
	 */
	void enterNome_equipes(TATOParser.Nome_equipesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#nome_equipes}.
	 * @param ctx the parse tree
	 */
	void exitNome_equipes(TATOParser.Nome_equipesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TATOParser#equipe_vantagem}.
	 * @param ctx the parse tree
	 */
	void enterEquipe_vantagem(TATOParser.Equipe_vantagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#equipe_vantagem}.
	 * @param ctx the parse tree
	 */
	void exitEquipe_vantagem(TATOParser.Equipe_vantagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TATOParser#propriedades}.
	 * @param ctx the parse tree
	 */
	void enterPropriedades(TATOParser.PropriedadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#propriedades}.
	 * @param ctx the parse tree
	 */
	void exitPropriedades(TATOParser.PropriedadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TATOParser#caract}.
	 * @param ctx the parse tree
	 */
	void enterCaract(TATOParser.CaractContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#caract}.
	 * @param ctx the parse tree
	 */
	void exitCaract(TATOParser.CaractContext ctx);
	/**
	 * Enter a parse tree produced by {@link TATOParser#rep}.
	 * @param ctx the parse tree
	 */
	void enterRep(TATOParser.RepContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#rep}.
	 * @param ctx the parse tree
	 */
	void exitRep(TATOParser.RepContext ctx);
	/**
	 * Enter a parse tree produced by {@link TATOParser#pts}.
	 * @param ctx the parse tree
	 */
	void enterPts(TATOParser.PtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#pts}.
	 * @param ctx the parse tree
	 */
	void exitPts(TATOParser.PtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TATOParser#sn}.
	 * @param ctx the parse tree
	 */
	void enterSn(TATOParser.SnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TATOParser#sn}.
	 * @param ctx the parse tree
	 */
	void exitSn(TATOParser.SnContext ctx);
}