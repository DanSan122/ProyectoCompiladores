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
}