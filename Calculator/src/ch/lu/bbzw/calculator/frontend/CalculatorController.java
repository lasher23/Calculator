
package ch.lu.bbzw.calculator.frontend;

import ch.lu.bbzw.calculator.frontend.numberpad.NumberPadControll;
import ch.lu.bbzw.calculator.frontend.numberpad.NumberPadModel;
import ch.lu.bbzw.calculator.frontend.operationpad.OperationPadControll;
import ch.lu.bbzw.calculator.frontend.operationpad.OperationPadModel;
import ch.lu.bbzw.calculator.frontend.operationpad.OperationPadModel.Operator;
import ch.lu.bbzw.calculator.operators.FixValue;
import ch.lu.bbzw.calculator.operators.Operation;
import javafx.fxml.FXML;

public class CalculatorController {
  @FXML
  private NumberPadControll numberPad;
  @FXML
  private OperationPadControll operationPad;
  private OperationPadModel operationPadModel;
  private NumberPadModel numberPadModell;
  private Operation operation;

  public void initialize() {
    numberPadModell = numberPad.getModel();
    operationPadModel = operationPad.getModel();
    operationPadModel.addOperatorChangeListener(this::operatorChanged);
  }

  public Operation getLastOperation() {
    if (operation == null) {
      operation = new FixValue(Double.parseDouble(numberPadModell.getNumber()));
    }
    return operation;
  }

  private void operatorChanged(Operator oldValue, Operator newValue) {

  }
}
