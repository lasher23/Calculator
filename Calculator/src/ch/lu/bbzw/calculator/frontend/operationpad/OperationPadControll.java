package ch.lu.bbzw.calculator.frontend.operationpad;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class OperationPadControll extends VBox{
	private OperationPadController controller;
	public OperationPadControll() {
		controller = new OperationPadController();
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("OperationPadView.fxml"));
			loader.setRoot(this);
			loader.setController(controller);
			loader.load();
		} catch (IOException e) {
			new RuntimeException(e);
		}
	}
	
	public OperationPadController getController() {
		return controller;
	}
}
