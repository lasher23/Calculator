
package ch.lu.bbzw.calculator.operators;

public class Addition implements Operation {
  private Operation leftPart;
  private Operation rightPart;

  public Addition(Operation leftPart, Operation rightPart) {
    this.leftPart = leftPart;
    this.rightPart = rightPart;
  }

  @Override
  public double getResult() {
    return rightPart.getResult() + leftPart.getResult();
  }
}
