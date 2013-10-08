package compiler.IR;

import java.util.HashSet;

import compiler.PrettyPrinter;
import compiler.Exceptions.CodeGenException;
import compiler.Exceptions.TypeCheckerException;

public class MJPrint extends MJStatement {
	private MJExpression parameter;

	public MJPrint(MJExpression parameter) {
		this.parameter = parameter;

	}

	public MJExpression getParameter() {
		return parameter;
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("System.out.print(");
		this.parameter.prettyPrint(prepri);
		prepri.println(");");
	}

}
