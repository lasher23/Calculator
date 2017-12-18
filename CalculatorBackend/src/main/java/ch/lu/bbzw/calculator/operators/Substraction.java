/**
 * File Name: Substraction.java
 * 
 * Copyright (c) 2017 BISON Schweiz AG, All Rights Reserved.
 */

package ch.lu.bbzw.calculator.operators;

/**
 *
 * @author nicolas.schmid
 */
public class Substraction implements Operation {

  private Operation leftValue;
  private Operation rightValue;

  public Substraction(Operation leftValue, Operation rightValue) {
    this.leftValue = leftValue;
    this.rightValue = rightValue;

  }

  @Override
  public double getResult() {
    return leftValue.getResult() - rightValue.getResult();
  }

}
