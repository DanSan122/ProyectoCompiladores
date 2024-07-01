// Generated from cmd\sintaxis\ProyectoCompiladoresFisica\PhysicsLang.g4 by ANTLR 4.5.1
package cmd.sintaxis.ProyectoCompiladoresFisica;

    import java.util.Map;
    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PhysicsLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PhysicsLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(PhysicsLangParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(PhysicsLangParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#variable_declativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declativa(PhysicsLangParser.Variable_declativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#variable_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_asignacion(PhysicsLangParser.Variable_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#mostrar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrar(PhysicsLangParser.MostrarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#mru_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMru_sentence(PhysicsLangParser.Mru_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#calcular_mru}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcular_mru(PhysicsLangParser.Calcular_mruContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#mruv_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMruv_sentence(PhysicsLangParser.Mruv_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#calcular_mruv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcular_mruv(PhysicsLangParser.Calcular_mruvContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#caida_libre_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaida_libre_sentence(PhysicsLangParser.Caida_libre_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#calcular_caida_libre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcular_caida_libre(PhysicsLangParser.Calcular_caida_libreContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#segunda_ley_newton_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegunda_ley_newton_sentence(PhysicsLangParser.Segunda_ley_newton_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#calcular_segunda_ley_newton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcular_segunda_ley_newton(PhysicsLangParser.Calcular_segunda_ley_newtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#densidad_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDensidad_sentence(PhysicsLangParser.Densidad_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#calcular_densidad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcular_densidad(PhysicsLangParser.Calcular_densidadContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#ley_ohm_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLey_ohm_sentence(PhysicsLangParser.Ley_ohm_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#calcular_ley_ohm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcular_ley_ohm(PhysicsLangParser.Calcular_ley_ohmContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#exprecion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprecion(PhysicsLangParser.ExprecionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#jerarOPE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJerarOPE(PhysicsLangParser.JerarOPEContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(PhysicsLangParser.TerminoContext ctx);
}