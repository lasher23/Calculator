
package ch.lu.bbzw.calculator.frontend.numberpad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class NumberPadController {
  private NumberPadModel model;

  public NumberPadController(NumberPadModel model) {
    this.model = model;
  }

  @FXML
  public void buttonNumber7(ActionEvent event) {
    model.setNumber(model.getNumber() + "7");
  }

  @FXML
  public void buttonNumber8(ActionEvent event) {
    model.setNumber(model.getNumber() + "8");
  }

  @FXML
  public void buttonNumber9(ActionEvent event) {
    model.setNumber(model.getNumber() + "9");
  }

  @FXML
  public void buttonNumber4(ActionEvent event) {
    model.setNumber(model.getNumber() + "4");
  }

  @FXML
  public void buttonNumber5(ActionEvent event) {
    model.setNumber(model.getNumber() + "5");
  }

  @FXML
  public void buttonNumber6(ActionEvent event) {
    model.setNumber(model.getNumber() + "6");
  }

  @FXML
  public void buttonNumber3(ActionEvent event) {
    model.setNumber(model.getNumber() + "3");
  }

  @FXML
  public void buttonNumber2(ActionEvent event) {
    model.setNumber(model.getNumber() + "2");
  }

  @FXML
  public void buttonNumber1(ActionEvent event) {
    model.setNumber(model.getNumber() + "1");
  }
}
