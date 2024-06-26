
package cmd.sintaxis.ProyectoCompiladoresFisica;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "smp";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		PhysicsLangLexer lexer = new PhysicsLangLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PhysicsLangParser parser = new PhysicsLangParser(tokens);

		PhysicsLangParser.FuncionContext tree = parser.funcion();
		//PhysicsLangParser.MruContext tree = parser.mru();

		PhysicsLangCustomVisitor visitor = new PhysicsLangCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
