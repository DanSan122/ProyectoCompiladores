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
	/**
	 * Enter a parse tree produced by {@link PhysicsLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PhysicsLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PhysicsLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PhysicsLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CrearVariable}
	 * labeled alternative in {@link PhysicsLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCrearVariable(PhysicsLangParser.CrearVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CrearVariable}
	 * labeled alternative in {@link PhysicsLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCrearVariable(PhysicsLangParser.CrearVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asignacion}
	 * labeled alternative in {@link PhysicsLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(PhysicsLangParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asignacion}
	 * labeled alternative in {@link PhysicsLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(PhysicsLangParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MostrarVariable}
	 * labeled alternative in {@link PhysicsLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterMostrarVariable(PhysicsLangParser.MostrarVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MostrarVariable}
	 * labeled alternative in {@link PhysicsLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitMostrarVariable(PhysicsLangParser.MostrarVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSuma(PhysicsLangParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Suma}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSuma(PhysicsLangParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(PhysicsLangParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(PhysicsLangParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacion(PhysicsLangParser.MultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplicacion}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacion(PhysicsLangParser.MultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(PhysicsLangParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link PhysicsLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(PhysicsLangParser.IntContext ctx);
}