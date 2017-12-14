
package ch.lu.bbzw.calculator.frontend.operationpad;

import ch.lu.bbzw.calculator.frontend.operationpad.OperationPadModel.Operator;
import javafx.fxml.FXML;

public class OperationPadController {

  private OperationPadModel model;

  public OperationPadController(OperationPadModel model) {
    this.model = model;
  }

  @FXML
  public void buttonAdditionPressed() {
    model.setOperator(Operator.ADDITION);
  }

  @FXML
  public void buttonSubstractionPressed() {
    model.setOperator(Operator.SUBSTRACTION);
  }

}
