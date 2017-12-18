
package ch.lu.bbzw.calculator.frontend;

import java.util.ArrayList;
import java.util.List;

import ch.lu.bbzw.calculator.frontend.operationpad.OperationPadModel.Operator;

public class CalculatorModel {
  private List<OperationStringChangeListener> changeListeners = new ArrayList<>();
  private StringBuilder operationString = new StringBuilder();

  public void addNumber(double value) {
    String oldValue = getOperationString();
    operationString.append(String.valueOf(value));
    fireOperationStringChangeListeners(oldValue);
  }

  public void addOperator(Operator operator) {
    String oldValue = getOperationString();
    operationString.append(operator.getOperatorSign());
    fireOperationStringChangeListeners(oldValue);
  }

  public String getOperationString() {
    return operationString.toString();
  }

  public void reset() {
    operationString = new StringBuilder();
  }

  public void addOperationStringChangeListener(OperationStringChangeListener operationStringChangeListener) {
    changeListeners.add(operationStringChangeListener);
  }

  private void fireOperationStringChangeListeners(String oldValue) {
    for (OperationStringChangeListener operationStringChangeListener : changeListeners) {
      operationStringChangeListener.onOperationStringChange(oldValue, getOperationString());
    }
  }

  public interface OperationStringChangeListener {
    void onOperationStringChange(String oldValue, String newValue);
  }
}
