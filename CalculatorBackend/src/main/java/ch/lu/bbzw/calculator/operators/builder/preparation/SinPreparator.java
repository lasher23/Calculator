package ch.lu.bbzw.calculator.operators.builder.preparation;

public class SinPreparator implements Preparator{

	@Override
	public String prepare(String input) {
		return input.replace("sin", "s");
	}
}
