package compiler.IR;

import compiler.PrettyPrinter;
import compiler.Exceptions.CodeGenException;

public abstract class MJStatement extends IR {
	
	public MJStatement() {}
	
	public abstract void prettyPrint(PrettyPrinter prepri);

}
