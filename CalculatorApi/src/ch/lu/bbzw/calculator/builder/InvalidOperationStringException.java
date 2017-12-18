/**
 * File Name: InvalidOperationStringException.java
 * 
 * Copyright (c) 2017 BISON Schweiz AG, All Rights Reserved.
 */

package ch.lu.bbzw.calculator.builder;

import java.util.Collections;
import java.util.List;

public class InvalidOperationStringException extends Exception {

  private final List<String> failures;
  private static final long serialVersionUID = 1L;

  public InvalidOperationStringException(List<String> failures) {
    this.failures = failures;
  }

  public List<String> getFailures() {
    return Collections.unmodifiableList(failures);
  }

}
