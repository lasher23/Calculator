
package ch.lu.bbzw.calculator.frontend.numberpad;

import java.util.ArrayList;
import java.util.List;

public class NumberPadModel {
  private String number = "";
  private List<NumberChangeListener> numberChangeListeners = new ArrayList<>();

  public void setNumber(String number) {
    Double.parseDouble(number);
    String oldValue = this.number;
    this.number = number;
    fireNumberChangeListeners(oldValue);
  }

  public String getNumber() {
    return number;
  }

  public void addNumberChangeListeners(NumberChangeListener numberChangeListener) {
    numberChangeListeners.add(numberChangeListener);
  }

  private void fireNumberChangeListeners(String oldValue) {
    for (NumberChangeListener numberChangeListener : numberChangeListeners) {
      numberChangeListener.onNumberChange(oldValue, number);
    }
  }

  public interface NumberChangeListener {
    void onNumberChange(String oldValue, String newValue);
  }
}
