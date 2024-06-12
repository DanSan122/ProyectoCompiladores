// Generated from cmd\sintaxis\ProyectoCompiladoresFisica\PhysicsLang.g4 by ANTLR 4.5.1
package cmd.sintaxis.ProyectoCompiladoresFisica;

	import java.util.Map;//para usarlos en members
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