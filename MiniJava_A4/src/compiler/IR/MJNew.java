package compiler.IR;

import java.util.HashSet;
import java.util.LinkedList;

import compiler.PrettyPrinter;
import compiler.Exceptions.ClassErrorMethod;
import compiler.Exceptions.CodeGenException;
import compiler.Exceptions.MethodNotFound;
import compiler.Exceptions.TypeCheckerException;

public class MJNew extends MJExpression {

	public MJNew(String string) {
		this.type = MJType.getClassType(string);
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("new ");
		prepri.print(this.type.getName());
		prepri.println("();");
	}

}
