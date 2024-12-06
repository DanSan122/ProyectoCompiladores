// Generated from PhysicsLang.g4 by ANTLR 4.4
package cmd.sintaxis.ProyectoCompiladoresFisica;

	import java.util.Map;//para usarlos en members
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
}