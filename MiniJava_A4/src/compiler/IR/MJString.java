package compiler.IR;

import java.util.HashSet;

import compiler.PrettyPrinter;
import compiler.Exceptions.CodeGenException;
import compiler.Exceptions.TypeCheckerException;

public class MJString extends MJExpression {

	private String string;

	public MJString(String string) {
		this.string = string;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print(this.string);
	}

}
