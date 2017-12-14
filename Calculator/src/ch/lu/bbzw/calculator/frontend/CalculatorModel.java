
package ch.lu.bbzw.calculator.frontend;

import java.util.LinkedList;
import java.util.Queue;

public class CalculatorModel {
  private Queue<Double> numberHistory = new LinkedList<>();

  public void addToNumberHistory(double number) {
    numberHistory.add(Double.valueOf(number));
  }
}
