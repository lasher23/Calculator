/**
 * File Name: InvalidOperationException.java
 * 
 * Copyright (c) 2017 BISON Schweiz AG, All Rights Reserved.
 */

package ch.lu.bbzw.calculator.operators.builder;

/**
 *
 * @author nicolas.schmid
 */
public class InvalidOperationException extends Exception {
  private static final long serialVersionUID = 8378497659188045783L;

  public InvalidOperationException(String message) {
    super(message);
  }
}
