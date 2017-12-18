
package ch.lu.bbzw.calculator.builder;

import java.util.List;

import ch.lu.bbzw.calculator.operators.Addition;
import ch.lu.bbzw.calculator.operators.FixValue;
import ch.lu.bbzw.calculator.operators.Operation;
import ch.lu.bbzw.calculator.operators.Substraction;
import ch.lu.bbzw.calculator.operators.builder.validator.OperationStringValidatorManager;

public class CalculationManager {
  public static double calculateFromString(String operationString) throws InvalidOperationStringException {
    List<String> failures = OperationStringValidatorManager.validate(operationString);
    if (!failures.isEmpty()) {
      throw new InvalidOperationStringException(failures);
    }
    return create(operationString).getResult();
  }

  private static Operation create(String operationString) {
    String[] operations = operationString.split("(?=[-\\+])", 2);
    double value = Double.parseDouble(operations[0]);
    FixValue leftPart = new FixValue(value);
    if (operations.length == 1) {
      return leftPart;
    }
    String operationSign = operations[1].substring(0, 1);
    String nextOperation = operations[1].substring(1, operations[1].length());
    if (operationSign.equals("+")) {
      return new Addition(leftPart, create(nextOperation));
    } else if (operationSign.equals("-")) {
      return new Substraction(leftPart, create(nextOperation));
    }
    throw new InvalidOperationStringRuntimeException("Unerwarteter Fehler während des berechnen");
  }
}
