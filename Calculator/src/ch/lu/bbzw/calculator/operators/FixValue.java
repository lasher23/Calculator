package ch.lu.bbzw.calculator.operators;

public class FixValue implements Operation {
	private double value;
	
	public FixValue(double value) {
		this.value = value;
	}

	@Override
	public double getResult() {
		return value;
	}
}
