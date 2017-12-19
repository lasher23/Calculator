package ch.lu.bbzw.calculator.operators.builder.validator;

import java.util.ArrayList;
import java.util.List;

public final class ValidatorFactory {
	private ValidatorFactory() {
		throw new IllegalAccessError();
	}

	public static List<Validator> createAllValidators() {
		List<Validator> validators = new ArrayList<>();
		validators.add(new EndsWithOperationValidator());
		return validators;
	}
}
