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
		this.id.prettyPrint(prepri);
		prepri.print("(");
		for (int i=0; i<this.parameters.size(); i++){
			this.parameters.get(i).prettyPrint(prepri);
			if (i < this.parameters.size()-1){
				prepri.print(", ");
			}
		}
		prepri.println(");");
	}
	
}
