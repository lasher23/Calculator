
package ch.lu.bbzw.calculator.frontend;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculatorView.fxml"));
    VBox box = loader.load();
    primaryStage.setScene(new Scene(box));
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
