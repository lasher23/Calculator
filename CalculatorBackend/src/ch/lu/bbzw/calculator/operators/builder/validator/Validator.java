
package ch.lu.bbzw.calculator.operators.builder.validator;

@FunctionalInterface
public interface Validator {
  void validate(String operationString) throws CalculationException;
}
