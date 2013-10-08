package compiler.IR;

import java.util.HashSet;

import compiler.PrettyPrinter;
import compiler.Exceptions.CodeGenException;
import compiler.Exceptions.TypeCheckerException;

public class MJMult extends MJBinaryOp {

	public MJMult(MJExpression lhs, MJExpression rhs) {
		super(lhs, rhs);
	}

	public void prettyPrint(PrettyPrinter prepri) {
	}

}
