
package ch.lu.bbzw.calculator.frontend.operationpad;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class OperationPadControll extends VBox {
  private OperationPadModel model;

  public OperationPadControll() {
    OperationPadController controller = new OperationPadController(model);
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("OperationPadView.fxml"));
      loader.setRoot(this);
      loader.setController(controller);
      loader.load();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public OperationPadModel getModel() {
    return model;
  }

}
