package compiler.IR;

public abstract class MJBinaryOp extends MJExpression {

	protected MJExpression lhs;
	protected MJExpression rhs;
	
	public MJBinaryOp(MJExpression lhs) {
		this.lhs = lhs;
		this.rhs = null;
	}
	
	public MJBinaryOp(MJExpression lhs, MJExpression rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public void setRhs(MJExpression rhs){
		this.rhs = rhs;
	}

}
