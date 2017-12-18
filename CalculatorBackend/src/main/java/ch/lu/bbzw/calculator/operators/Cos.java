package ch.lu.bbzw.calculator.operators;

public class Cos implements Operation {

	private Operation operation;

	public Cos(Operation operation) {
		this.operation = operation;
	}

	@Override
	public double getResult() {
		return Math.cos(operation.getResult());
	}

}
