
package ch.lu.bbzw.calculator.operators.builder;

import ch.lu.bbzw.calculator.operators.Addition;
import ch.lu.bbzw.calculator.operators.FixValue;
import ch.lu.bbzw.calculator.operators.Operation;
import ch.lu.bbzw.calculator.operators.Substraction;

public class OperationBuilder {
  public Operation build(String operationString) throws InvalidOperationException {
    String[] operations = operationString.split("(?=[-\\+])", 2);
    double value = Double.parseDouble(operations[0]);
    FixValue leftPart = new FixValue(value);
    if (operations.length == 1) {
      return leftPart;
    }
    String operationSign = operations[1].substring(0, 1);
    String nextOperation = operations[1].substring(1, operations[1].length());
    if (operationSign.equals("+")) {
      return new Addition(leftPart, build(nextOperation));
    } else if (operationSign.equals("-")) {
      return new Substraction(leftPart, build(nextOperation));
    }
    throw new InvalidOperationException("Unerwarteter Systemfehler, kontaktieren sie den Support");
  }
}
