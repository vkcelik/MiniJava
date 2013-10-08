package compiler.IR;

import java.util.HashSet;

import compiler.PrettyPrinter;
import compiler.Exceptions.TypeCheckerException;
import compiler.Exceptions.VariableAlreadyDeclared;

public class MJVariable extends IR {

	private MJType type;
	private String name;
	private boolean field;
	
	public MJVariable(MJType t, String name) {
		this.type = t;
		this.name = name;
	}

	public MJType getType() {
		return type;
	}

	public String getName() {
		return name;
	}
	
	public boolean isField() {
		return this.field;
	}

	public void setField() {
		this.field = true;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print(this.type + " " + this.name);

	}

}
