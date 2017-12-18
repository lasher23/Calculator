
package ch.lu.bbzw.calculator.builder;

import java.util.List;

import ch.lu.bbzw.calculator.operators.builder.InvalidOperationException;
import ch.lu.bbzw.calculator.operators.builder.OperationBuilder;
import ch.lu.bbzw.calculator.operators.builder.validator.OperationStringValidatorManager;

public class CalculationManager {
  private CalculationManager() {
    throw new IllegalAccessError();
  }

  public static double calculateFromString(String operationString) throws InvalidOperationStringException {
    List<String> failures = OperationStringValidatorManager.validate(operationString);
    if (!failures.isEmpty()) {
      throw new InvalidOperationStringException(failures);
    }
    OperationBuilder operationBuilder = new OperationBuilder();
    // if the validation is correct no exception should be thrown
    try {
      return operationBuilder.build(operationString).getResult();
    } catch (InvalidOperationException e) {
      throw new InvalidOperationStringRuntimeException(e.getMessage());
    }
  }
}
