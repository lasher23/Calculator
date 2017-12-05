package ch.lu.bbzw.calculator.frontend.numberpad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class NumberPadController {
	private String number = "";

	@FXML
	public void buttonNumber7(ActionEvent event) {
		number += "7";
	}

	@FXML
	public void buttonNumber8(ActionEvent event) {
		number += "8";
	}

	@FXML
	public void buttonNumber9(ActionEvent event) {
		number += "9";
	}

	@FXML
	public void buttonNumber4(ActionEvent event) {
		number += "4";
	}

	@FXML
	public void buttonNumber5(ActionEvent event) {
		number += "5";
	}

	@FXML
	public void buttonNumber6(ActionEvent event) {
		number += "6";
	}

	@FXML
	public void buttonNumber3(ActionEvent event) {
		number += "3";
	}

	@FXML
	public void buttonNumber2(ActionEvent event) {
		number += "2";
	}

	@FXML
	public void buttonNumber1(ActionEvent event) {
		number += "1";
	}

	public double getNumber() {
		return Double.parseDouble(number);
	}

	public void reset() {
		number = "";
	}
}
