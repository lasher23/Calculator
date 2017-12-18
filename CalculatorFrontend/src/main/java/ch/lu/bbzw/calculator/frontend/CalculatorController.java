
package ch.lu.bbzw.calculator.frontend;

import java.util.List;

import ch.lu.bbzw.calculator.builder.CalculationManager;
import ch.lu.bbzw.calculator.builder.InvalidOperationStringException;
import ch.lu.bbzw.calculator.frontend.numberpad.NumberPadControll;
import ch.lu.bbzw.calculator.frontend.numberpad.NumberPadModel;
import ch.lu.bbzw.calculator.frontend.operationpad.OperationPadControll;
import ch.lu.bbzw.calculator.frontend.operationpad.OperationPadModel;
import ch.lu.bbzw.calculator.frontend.operationpad.OperationPadModel.Operator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class CalculatorController {
  @FXML
  private NumberPadControll numberPad;
  @FXML
  private OperationPadControll operationPad;
  @FXML
  private TextField outputField;
  private OperationPadModel operationPadModel;
  private NumberPadModel numberPadModell;
  private CalculatorModel model;

  @FXML
  public void initialize() {
    model = new CalculatorModel();
    numberPadModell = numberPad.getModel();
    operationPadModel = operationPad.getModel();
    operationPadModel.addOperatorChangeListener((oldValue, newValue) -> {
      model.addNumber(Double.parseDouble(numberPadModell.getNumber()));
      numberPadModell.reset();
      oldValue = Operator.ADDITION;
      model.addOperator(newValue);
    });
    numberPadModell.addNumberChangeListeners((oldValue, newValue) -> outputField.setText(model.getOperationString() + newValue));
    model.addOperationStringChangeListener((oldValue, newValue) -> outputField.setText(newValue));
  }

  @FXML
  public void onEqual(ActionEvent event) {
    model.addNumber(Double.parseDouble(numberPadModell.getNumber()));
    numberPadModell.reset();
    try {
      outputField.setText(String.valueOf(CalculationManager.calculateFromString(model.getOperationString())));
      model.reset();
    } catch (InvalidOperationStringException e) {
      showErrorAlert(buildErrorMessage(e.getFailures()));
    }
  }

  private void showErrorAlert(String message) {
    Alert alert = new Alert(AlertType.ERROR);
    alert.setHeaderText("Fehler beim Rechnen");
    alert.setContentText(message);
    alert.showAndWait();
  }

  private String buildErrorMessage(List<String> messages) {
    StringBuilder sb = new StringBuilder();
    for (String string : messages) {
      sb.append(string);
      sb.append('\n');
    }
    return sb.toString();
  }
}
