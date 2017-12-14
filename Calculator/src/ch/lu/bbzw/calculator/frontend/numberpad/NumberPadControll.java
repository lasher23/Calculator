
package ch.lu.bbzw.calculator.frontend.numberpad;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class NumberPadControll extends VBox {
  private NumberPadModel model;

  public NumberPadControll() {
    NumberPadController controller = new NumberPadController(model);
    try {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("NumberPadView.fxml"));
      loader.setRoot(this);
      loader.setController(controller);
      loader.load();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public NumberPadModel getModel() {
    return model;
  }
}
