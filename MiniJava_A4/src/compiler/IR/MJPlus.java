package compiler.IR;

import java.util.HashSet;

import compiler.PrettyPrinter;
import compiler.Exceptions.CodeGenException;
import compiler.Exceptions.TypeCheckerException;

public class MJPlus extends MJBinaryOp {

	public MJPlus(MJExpression a) {
		super(a);
	
	}

	public void prettyPrint(PrettyPrinter prepri) {
		super.lhs.prettyPrint(prepri);
		prepri.print(" + ");
		super.rhs.prettyPrint(prepri);
	}

}
