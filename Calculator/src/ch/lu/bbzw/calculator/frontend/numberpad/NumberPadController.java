
package ch.lu.bbzw.calculator.frontend.numberpad;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class NumberPadController {
  private List<NumberChangeListener> numberChangeListeners = new ArrayList<>();
  private String number = "";

  @FXML
  public void buttonNumber7(ActionEvent event) {
    increaseNumber("7");
  }

  @FXML
  public void buttonNumber8(ActionEvent event) {
    increaseNumber("8");
  }

  @FXML
  public void buttonNumber9(ActionEvent event) {
    increaseNumber("9");
  }

  @FXML
  public void buttonNumber4(ActionEvent event) {
    increaseNumber("4");
  }

  @FXML
  public void buttonNumber5(ActionEvent event) {
    increaseNumber("5");
  }

  @FXML
  public void buttonNumber6(ActionEvent event) {
    increaseNumber("6");
  }

  @FXML
  public void buttonNumber3(ActionEvent event) {
    increaseNumber("3");
  }

  @FXML
  public void buttonNumber2(ActionEvent event) {
    increaseNumber("2");
  }

  @FXML
  public void buttonNumber1(ActionEvent event) {
    increaseNumber("1");
  }

  private void increaseNumber(String number) {
    this.number += number;
    fireChangeListeners();
  }

  public double getNumber() {
    return Double.parseDouble(number);
  }

  public void reset() {
    number = "";
  }

  public void addNumberChangeListener(NumberChangeListener changeListener) {
    numberChangeListeners.add(changeListener);
  }

  private void fireChangeListeners() {
    for (NumberChangeListener numberChangeListener : numberChangeListeners) {
      numberChangeListener.onNumberChange();
    }
  }

  @FunctionalInterface
  public interface NumberChangeListener {
    void onNumberChange();
  }
}
