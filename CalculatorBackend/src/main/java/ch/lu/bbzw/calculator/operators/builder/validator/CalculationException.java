/**
 * File Name: CalculationException.java
 * 
 * Copyright (c) 2017 BISON Schweiz AG, All Rights Reserved.
 */

package ch.lu.bbzw.calculator.operators.builder.validator;

public class CalculationException extends Exception {
  private static final long serialVersionUID = -6531172021579045259L;

  public CalculationException(String message) {
    super(message);
  }
}
