package ch.lu.bbzw.calculator.operators;

public class SquareRoot implements Operation {
	private Operation operation;

	public SquareRoot(Operation operation) {
		this.operation = operation;
	}

	@Override
	public double getResult() {
		return Math.sqrt(operation.getResult());
	}

}
