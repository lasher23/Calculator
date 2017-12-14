
package ch.lu.bbzw.calculator.frontend.operationpad;

import java.util.ArrayList;
import java.util.List;

public class OperationPadModel {
  private Operator operator;
  private List<OperatorChangeListener> operatorChangeListeners = new ArrayList<>();

  public Operator getOperator() {
    return operator;
  }

  public void setOperator(Operator operator) {
    Operator oldValue = this.operator;
    this.operator = operator;
    fireOperatorChangeListeners(oldValue);
  }

  public void addOperatorChangeListener(OperatorChangeListener operatorChangeListener) {
    operatorChangeListeners.add(operatorChangeListener);
  }

  private void fireOperatorChangeListeners(Operator oldValue) {
    for (OperatorChangeListener operatorChangeListener : operatorChangeListeners) {
      operatorChangeListener.onOperatorChange(oldValue, operator);
    }
  }

  public enum Operator {
    ADDITION, MINUS
  }

  public interface OperatorChangeListener {
    void onOperatorChange(Operator oldValue, Operator newValue);
  }
}
