package compiler.IR;

import compiler.PrettyPrinter;

public class MJWhile extends MJStatement {
	private MJExpression expression;
	private MJStatement statement;

	public MJWhile(MJExpression expression, MJStatement statement) {
		this.expression = expression;
		this.statement = statement;

	}

	public void prettyPrint(PrettyPrinter prepri) {
		prepri.print("while (");
		this.expression.prettyPrint(prepri);
		prepri.print(")");
		this.statement.prettyPrint(prepri);

	}

}
