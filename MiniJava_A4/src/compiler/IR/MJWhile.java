package compiler.IR;

import compiler.PrettyPrinter;

public class MJWhile extends MJStatement {
	
	private MJExpression whileCondition;
	private MJStatement whileStatement;
	
	public MJWhile(MJExpression whileCondition, MJStatement whileStatement) {
		this.whileCondition = whileCondition;
		this.whileStatement = whileStatement;
	}

	public MJExpression getWhileCondition() {
		return whileCondition;
	}

	public MJStatement getWhileStatement() {
		return whileStatement;
	}

	public void prettyPrint(PrettyPrinter prepri) {
	}
	
}
