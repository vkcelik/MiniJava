package compiler.IR;

import java.util.HashSet;

import compiler.PrettyPrinter;
import compiler.Exceptions.CodeGenException;
import compiler.Exceptions.TypeCheckerException;
import compiler.Exceptions.VariableNotFound;

public class MJIdentifier extends MJExpression {

	private String name;
	protected MJVariable decl;

	public MJIdentifier() {
	}

	public MJIdentifier(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public MJVariable getDecl() {
		return decl;
	}

	public void setDecl(MJVariable v) {
		this.decl = v;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print(this.name);
	}

}
