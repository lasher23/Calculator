
package ch.lu.bbzw.calculator.frontend.numberpad;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class NumberPadControll extends VBox {
  private NumberPadController controller;

  public NumberPadControll() {
    controller = new NumberPadController();
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("NumberPadView.fxml"));
      loader.setRoot(this);
      loader.setController(controller);
      loader.load();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public NumberPadController getController() {
    return controller;
  }
}
