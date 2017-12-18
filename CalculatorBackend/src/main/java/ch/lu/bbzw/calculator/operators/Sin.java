package ch.lu.bbzw.calculator.operators;

public class Sin implements Operation {
	private Operation operation;
	public Sin(Operation operation) {
		this.operation = operation;
	}
	@Override
	public double getResult() {
		return Math.sin(operation.getResult());
	}

}
