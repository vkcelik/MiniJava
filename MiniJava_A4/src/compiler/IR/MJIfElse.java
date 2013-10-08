package compiler.IR;

import compiler.PrettyPrinter;

public class MJIfElse extends MJStatement {
	
	private MJExpression ifCondition;
	private MJBlock ifBlock;
	private MJBlock elseBlock;
	
	public MJIfElse(MJExpression ifCondition, MJBlock ifBlock){
		this.ifCondition = ifCondition;
		this.ifBlock = ifBlock;
		this.elseBlock = null;
	}
	
	public MJIfElse(MJExpression ifCondition, MJBlock ifBlock, MJBlock elseBlock){
		this.ifCondition = ifCondition;
		this.ifBlock = ifBlock;
		this.elseBlock = elseBlock;
	}

	public MJExpression getIfCondition() {
		return ifCondition;
	}

	public MJBlock getIfBlock() {
		return ifBlock;
	}
 
	public MJBlock getElseBlock() {
		return elseBlock;
	}

	public void prettyPrint(PrettyPrinter prepri) {
	}
	
}
