// Generated from cmd\sintaxis\ProyectoCompiladoresFisica\PhysicsLang.g4 by ANTLR 4.5.1
package cmd.sintaxis.ProyectoCompiladoresFisica;

	import java.util.Map;//para usarlos en members
	import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PhysicsLangParser}.
 */
public interface PhysicsLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(PhysicsLangParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(PhysicsLangParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(PhysicsLangParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(PhysicsLangParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#variable_declativa}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declativa(PhysicsLangParser.Variable_declativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#variable_declativa}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declativa(PhysicsLangParser.Variable_declativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#variable_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterVariable_asignacion(PhysicsLangParser.Variable_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#variable_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitVariable_asignacion(PhysicsLangParser.Variable_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(PhysicsLangParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(PhysicsLangParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#exprecion}.
	 * @param ctx the parse tree
	 */
	void enterExprecion(PhysicsLangParser.ExprecionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#exprecion}.
	 * @param ctx the parse tree
	 */
	void exitExprecion(PhysicsLangParser.ExprecionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#jerarOPE}.
	 * @param ctx the parse tree
	 */
	void enterJerarOPE(PhysicsLangParser.JerarOPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#jerarOPE}.
	 * @param ctx the parse tree
	 */
	void exitJerarOPE(PhysicsLangParser.JerarOPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(PhysicsLangParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(PhysicsLangParser.TerminoContext ctx);
}