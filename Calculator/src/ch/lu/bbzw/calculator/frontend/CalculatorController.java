
package ch.lu.bbzw.calculator.frontend;

import ch.lu.bbzw.calculator.frontend.numberpad.NumberPadControll;
import ch.lu.bbzw.calculator.frontend.numberpad.NumberPadController;
import ch.lu.bbzw.calculator.frontend.operationpad.OperationPadControll;
import ch.lu.bbzw.calculator.frontend.operationpad.OperationPadController;
import ch.lu.bbzw.calculator.frontend.operationpad.OperationPadController.Operator;
import ch.lu.bbzw.calculator.operators.FixValue;
import ch.lu.bbzw.calculator.operators.Operation;
import javafx.fxml.FXML;

public class CalculatorController {
  @FXML
  private NumberPadControll numberPad;
  @FXML
  private OperationPadControll operationPad;
  private OperationPadController operationPadController;
  private NumberPadController numberPadController;
  private Operation operation;
  private Operator lastOperator;

  public void initialize() {
    numberPadController = numberPad.getController();
    operationPadController = operationPad.getController();
    operationPadController.addOperatorPressedListener(this::operatorPressed);
  }

  public Operation getLastOperation() {
    if (operation == null) {
      operation = new FixValue(numberPadController.getNumber());
    }
    return operation;
  }

  private void operatorPressed(Operator operator) {
    lastOperator = operator;
  }
}
