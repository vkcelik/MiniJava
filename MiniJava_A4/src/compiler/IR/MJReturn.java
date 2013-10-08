package compiler.IR;

import java.util.HashSet;

import compiler.PrettyPrinter;
import compiler.Exceptions.CodeGenException;
import compiler.Exceptions.TypeCheckerException;

public class MJReturn extends MJStatement {

	private MJExpression retExp;

	public MJReturn(MJExpression retExp) {
		this.retExp = retExp;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("return");

		if (!(this.retExp instanceof MJNoExpression)) {
			prepri.print(" ");
			this.retExp.prettyPrint(prepri);
		}

		prepri.println(";");
	}

}
