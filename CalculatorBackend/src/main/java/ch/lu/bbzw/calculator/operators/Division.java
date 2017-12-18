package ch.lu.bbzw.calculator.operators;

public class Division implements Operation {

	private Operation leftpart;
	private Operation rightpart;

	public Division(Operation leftpart, Operation rightpart) {
		this.leftpart = leftpart;
		this.rightpart = rightpart;
	}

	@Override
	public double getResult() {
		return leftpart.getResult() / rightpart.getResult();
	}

}
