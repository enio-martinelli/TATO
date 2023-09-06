// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.TATO;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TATOParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TATOVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TATOParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TATOParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TATOParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(TATOParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TATOParser#nome_torneio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome_torneio(TATOParser.Nome_torneioContext ctx);
	/**
	 * Visit a parse tree produced by {@link TATOParser#equipes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquipes(TATOParser.EquipesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TATOParser#nmr_equipes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNmr_equipes(TATOParser.Nmr_equipesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TATOParser#nome_equipes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome_equipes(TATOParser.Nome_equipesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TATOParser#equipe_vantagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquipe_vantagem(TATOParser.Equipe_vantagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TATOParser#propriedades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropriedades(TATOParser.PropriedadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TATOParser#caract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaract(TATOParser.CaractContext ctx);
	/**
	 * Visit a parse tree produced by {@link TATOParser#rep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRep(TATOParser.RepContext ctx);
	/**
	 * Visit a parse tree produced by {@link TATOParser#pts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPts(TATOParser.PtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TATOParser#sn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSn(TATOParser.SnContext ctx);
}