package ch.lu.bbzw.calculator.operators;

public class Multiplication implements Operation {

	private Operation leftPart;
	private Operation rightPart;

	public Multiplication(Operation leftPart, Operation rightPart) {
		this.leftPart = leftPart;
		this.rightPart = rightPart;
	}

	@Override
	public double getResult() {
		return leftPart.getResult() * rightPart.getResult();
	}
}
