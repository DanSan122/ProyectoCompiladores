// Generated from cmd\sintaxis\ProyectoCompiladoresFisica\PhysicsLang.g4 by ANTLR 4.5.1
package cmd.sintaxis.ProyectoCompiladoresFisica;
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
	 * Visit a parse tree produced by {@link PhysicsLangParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PhysicsLangParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PhysicsLangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(PhysicsLangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CrearVariable}
	 * labeled alternative in {@link PhysicsLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrearVariable(PhysicsLangParser.CrearVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asignacion}
	 * labeled alternative in {@link PhysicsLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PhysicsLangParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MostrarVariable}
	 * labeled alternative in {@link PhysicsLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrarVariable(PhysicsLangParser.MostrarVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(PhysicsLangParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(PhysicsLangParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacion(PhysicsLangParser.MultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(PhysicsLangParser.IntContext ctx);
}