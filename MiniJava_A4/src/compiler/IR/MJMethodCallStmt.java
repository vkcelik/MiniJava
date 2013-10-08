package compiler.IR;

import java.util.HashSet;
import java.util.LinkedList;

import compiler.PrettyPrinter;
import compiler.Exceptions.ClassErrorMethod;
import compiler.Exceptions.ClassNotFound;
import compiler.Exceptions.CodeGenException;
import compiler.Exceptions.MethodNotFound;
import compiler.Exceptions.TypeCheckerException;
import compiler.Exceptions.VariableNotFound;

public class MJMethodCallStmt extends MJStatement {
	
	MJIdentifier id;
	LinkedList<MJExpression> parameters;
	
	public MJMethodCallStmt(MJIdentifier id, LinkedList<MJExpression> parameters){
		this.id=id;
		this.parameters = parameters;
	}

	public void prettyPrint(PrettyPrinter prepri) {
	}
	
}
