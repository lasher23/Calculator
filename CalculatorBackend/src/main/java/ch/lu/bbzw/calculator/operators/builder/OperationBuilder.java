
package ch.lu.bbzw.calculator.operators.builder;

import ch.lu.bbzw.calculator.operators.Addition;
import ch.lu.bbzw.calculator.operators.Cos;
import ch.lu.bbzw.calculator.operators.Division;
import ch.lu.bbzw.calculator.operators.FixValue;
import ch.lu.bbzw.calculator.operators.Multiplication;
import ch.lu.bbzw.calculator.operators.Sin;
import ch.lu.bbzw.calculator.operators.Operation;
import ch.lu.bbzw.calculator.operators.Substraction;
import ch.lu.bbzw.calculator.operators.builder.preparation.PreparatorManager;

public class OperationBuilder {
	public Operation build(String operationString) throws InvalidOperationException {
		return builder(prepare(operationString));
	}

	private String prepare(String operationString) {
		return PreparatorManager.pepare(operationString);
	}

	private Operation builder(String operationString) throws InvalidOperationException {
		Operation leftPart;
		if (operationString.startsWith("(")) {
			String substring = operationString.substring(operationString.indexOf('(') + 1,
					operationString.lastIndexOf(')'));
			leftPart = builder(substring);
			operationString = operationString.replace("(" + substring + ")", String.valueOf(leftPart.getResult()));
			if (operationString.isEmpty()) {
				return leftPart;
			}
		}
		String[] operations = operationString.split("(?=[-\\+\\*/])", 2);
		if (operationString.startsWith("s")) {
			String substring = operationString.substring(2, operationString.lastIndexOf(")"));
			leftPart = new Sin(builder(substring));
			operationString = operationString.replace("s(" + substring + ")", String.valueOf(leftPart.getResult()));
		} else if (operationString.startsWith("c")) {
			String substring = operationString.substring(2, operationString.lastIndexOf(")"));
			leftPart = new Cos(builder(substring));
			operationString = operationString.replace("c(" + substring + ")", String.valueOf(leftPart.getResult()));
		}
		double value = Double.parseDouble(operations[0]);
		leftPart = new FixValue(value);

		if (operations.length == 1) {
			return leftPart;
		}
		String operationSign = operations[1].substring(0, 1);
		String nextOperation = operations[1].substring(1, operations[1].length());
		if (operationSign.equals("+")) {
			return new Addition(leftPart, builder(nextOperation));
		} else if (operationSign.equals("-")) {
			return new Substraction(leftPart, builder(nextOperation));
		} else if (operationSign.equals("*")) {
			return new Multiplication(leftPart, builder(nextOperation));
		}else if(operationSign.equals("/")) {
			return new Division(leftPart, builder(nextOperation));
		}
		throw new InvalidOperationException("Unerwarteter Systemfehler, kontaktieren sie den Support");
	}
}
