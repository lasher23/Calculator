
package ch.lu.bbzw.calculator.frontend.operationpad;

import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;

public class OperationPadController {
  private List<OperatorPressedListener> operatorPressedListeners = new ArrayList<>();

  @FXML
  public void buttonAdditionPressed() {
    fireOperatorPressedListeners(Operator.ADDITION);
  }

  public void addOperatorPressedListener(OperatorPressedListener operatorPressedListener) {
    operatorPressedListeners.add(operatorPressedListener);
  }

  private void fireOperatorPressedListeners(Operator operator) {
    for (OperatorPressedListener operatorPressedListener : operatorPressedListeners) {
      operatorPressedListener.operatorClicked(operator);
    }
  }

  public enum Operator {
    ADDITION, MINUS
  }

  @FunctionalInterface
  public interface OperatorPressedListener {
    void operatorClicked(Operator operator);
  }
}
