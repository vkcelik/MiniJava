package compiler.IR;

import java.util.HashSet;

import compiler.PrettyPrinter;
import compiler.Exceptions.ClassErrorField;
import compiler.Exceptions.ClassNotFound;
import compiler.Exceptions.CodeGenException;
import compiler.Exceptions.TypeCheckerException;
import compiler.Exceptions.VariableNotFound;

public class MJAssign extends MJStatement {

	private MJExpression rhs;
	private MJIdentifier lhs;

	public MJAssign(MJIdentifier lhs, MJExpression rhs) {
		this.rhs = rhs;
		this.lhs = lhs;
	}

	public MJIdentifier getLhs() {
		return this.lhs;
	}

	public MJExpression getRhs() {
		return this.rhs;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		this.lhs.prettyPrint(prepri);
		prepri.print(" = ");
		this.rhs.prettyPrint(prepri);
		prepri.println(";");
	}
	
}
