package compiler.IR;

import java.util.HashSet;

import compiler.PrettyPrinter;
import compiler.Exceptions.CodeGenException;
import compiler.Exceptions.TypeCheckerException;

public class MJNewArray extends MJNew {
	private MJExpression expression;
	
	
	public MJNewArray(MJExpression expression){
		super("");
		this.expression = expression;
		this.type = MJType.getArrayType(MJType.getIntType());
	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("new ");
		prepri.print(this.type.getName());
		prepri.print("[");
		this.expression.prettyPrint(prepri);
		prepri.println("];");
	}

}
