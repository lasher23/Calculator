package ch.lu.bbzw.calculator.operators.builder.preparation;

public class CosPreparator implements Preparator {

	@Override
	public String prepare(String input) {
		return input.replace("cos", "c");
	}

}
