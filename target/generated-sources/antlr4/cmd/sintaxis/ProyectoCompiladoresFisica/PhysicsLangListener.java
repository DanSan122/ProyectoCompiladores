// Generated from cmd\sintaxis\ProyectoCompiladoresFisica\PhysicsLang.g4 by ANTLR 4.5.1
package cmd.sintaxis.ProyectoCompiladoresFisica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PhysicsLangParser}.
 */
public interface PhysicsLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PhysicsLangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PhysicsLangParser.StartContext ctx);
}