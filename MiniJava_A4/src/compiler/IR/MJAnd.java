package compiler.IR;

import java.util.HashSet;

import compiler.PrettyPrinter;
import compiler.Exceptions.*;

public class MJAnd extends MJBinaryOp {

	public MJAnd(MJExpression a, MJExpression b) {
		super(a, b);
	}

	public void prettyPrint(PrettyPrinter prepri) {
		this.lhs.prettyPrint(prepri);
		prepri.print(" && ");
		this.rhs.prettyPrint(prepri);
	}

}
