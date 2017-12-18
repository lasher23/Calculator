/**
 * File Name: StringEndValidator.java
 * 
 * Copyright (c) 2017 BISON Schweiz AG, All Rights Reserved.
 */

package ch.lu.bbzw.calculator.operators.builder.validator;

import ch.lu.bbzw.calculator.operators.builder.OperationCharachters;

class EndsWithOperationValidator implements Validator {

	@Override
	public void validate(String operationString) throws CalculationException {
		if (endsWithOperation(operationString)) {
			throw new IncorrectEndingException("Endet mit invalidem Zeichen");
		}
	}

	private boolean endsWithOperation(String operationString) {
		for (String operation : OperationCharachters.getImmutableOperationList()) {
			if (operationString.endsWith(operation)) {
				return true;
			}
		}
		return false;
	}
}
