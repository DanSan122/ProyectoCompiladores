// Generated from PhysicsLang.g4 by ANTLR 4.4
package cmd.sintaxis.ProyectoCompiladoresFisica;

    import java.util.Map;
    import java.util.HashMap;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PhysicsLangParser}.
 */
public interface PhysicsLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull PhysicsLangParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull PhysicsLangParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#calcular_densidad}.
	 * @param ctx the parse tree
	 */
	void enterCalcular_densidad(@NotNull PhysicsLangParser.Calcular_densidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#calcular_densidad}.
	 * @param ctx the parse tree
	 */
	void exitCalcular_densidad(@NotNull PhysicsLangParser.Calcular_densidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#mru_sentence}.
	 * @param ctx the parse tree
	 */
	void enterMru_sentence(@NotNull PhysicsLangParser.Mru_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#mru_sentence}.
	 * @param ctx the parse tree
	 */
	void exitMru_sentence(@NotNull PhysicsLangParser.Mru_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#ley_ohm_sentence}.
	 * @param ctx the parse tree
	 */
	void enterLey_ohm_sentence(@NotNull PhysicsLangParser.Ley_ohm_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#ley_ohm_sentence}.
	 * @param ctx the parse tree
	 */
	void exitLey_ohm_sentence(@NotNull PhysicsLangParser.Ley_ohm_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#calcular_caida_libre}.
	 * @param ctx the parse tree
	 */
	void enterCalcular_caida_libre(@NotNull PhysicsLangParser.Calcular_caida_libreContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#calcular_caida_libre}.
	 * @param ctx the parse tree
	 */
	void exitCalcular_caida_libre(@NotNull PhysicsLangParser.Calcular_caida_libreContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#densidad_sentence}.
	 * @param ctx the parse tree
	 */
	void enterDensidad_sentence(@NotNull PhysicsLangParser.Densidad_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#densidad_sentence}.
	 * @param ctx the parse tree
	 */
	void exitDensidad_sentence(@NotNull PhysicsLangParser.Densidad_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#calcular_segunda_ley_newton}.
	 * @param ctx the parse tree
	 */
	void enterCalcular_segunda_ley_newton(@NotNull PhysicsLangParser.Calcular_segunda_ley_newtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#calcular_segunda_ley_newton}.
	 * @param ctx the parse tree
	 */
	void exitCalcular_segunda_ley_newton(@NotNull PhysicsLangParser.Calcular_segunda_ley_newtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#caida_libre_sentence}.
	 * @param ctx the parse tree
	 */
	void enterCaida_libre_sentence(@NotNull PhysicsLangParser.Caida_libre_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#caida_libre_sentence}.
	 * @param ctx the parse tree
	 */
	void exitCaida_libre_sentence(@NotNull PhysicsLangParser.Caida_libre_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#calcular_ley_ohm}.
	 * @param ctx the parse tree
	 */
	void enterCalcular_ley_ohm(@NotNull PhysicsLangParser.Calcular_ley_ohmContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#calcular_ley_ohm}.
	 * @param ctx the parse tree
	 */
	void exitCalcular_ley_ohm(@NotNull PhysicsLangParser.Calcular_ley_ohmContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#mruv_sentence}.
	 * @param ctx the parse tree
	 */
	void enterMruv_sentence(@NotNull PhysicsLangParser.Mruv_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#mruv_sentence}.
	 * @param ctx the parse tree
	 */
	void exitMruv_sentence(@NotNull PhysicsLangParser.Mruv_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#segunda_ley_newton_sentence}.
	 * @param ctx the parse tree
	 */
	void enterSegunda_ley_newton_sentence(@NotNull PhysicsLangParser.Segunda_ley_newton_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#segunda_ley_newton_sentence}.
	 * @param ctx the parse tree
	 */
	void exitSegunda_ley_newton_sentence(@NotNull PhysicsLangParser.Segunda_ley_newton_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#variable_declativa}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declativa(@NotNull PhysicsLangParser.Variable_declativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#variable_declativa}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declativa(@NotNull PhysicsLangParser.Variable_declativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#exprecion}.
	 * @param ctx the parse tree
	 */
	void enterExprecion(@NotNull PhysicsLangParser.ExprecionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#exprecion}.
	 * @param ctx the parse tree
	 */
	void exitExprecion(@NotNull PhysicsLangParser.ExprecionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#jerarOPE}.
	 * @param ctx the parse tree
	 */
	void enterJerarOPE(@NotNull PhysicsLangParser.JerarOPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#jerarOPE}.
	 * @param ctx the parse tree
	 */
	void exitJerarOPE(@NotNull PhysicsLangParser.JerarOPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(@NotNull PhysicsLangParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(@NotNull PhysicsLangParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(@NotNull PhysicsLangParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(@NotNull PhysicsLangParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#variable_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterVariable_asignacion(@NotNull PhysicsLangParser.Variable_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#variable_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitVariable_asignacion(@NotNull PhysicsLangParser.Variable_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(@NotNull PhysicsLangParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(@NotNull PhysicsLangParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#calcular_mruv}.
	 * @param ctx the parse tree
	 */
	void enterCalcular_mruv(@NotNull PhysicsLangParser.Calcular_mruvContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#calcular_mruv}.
	 * @param ctx the parse tree
	 */
	void exitCalcular_mruv(@NotNull PhysicsLangParser.Calcular_mruvContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#calcular_mru}.
	 * @param ctx the parse tree
	 */
	void enterCalcular_mru(@NotNull PhysicsLangParser.Calcular_mruContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#calcular_mru}.
	 * @param ctx the parse tree
	 */
	void exitCalcular_mru(@NotNull PhysicsLangParser.Calcular_mruContext ctx);
}