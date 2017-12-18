/**
 * File Name: OperationCharachters.java
 * 
 * Copyright (c) 2017 BISON Schweiz AG, All Rights Reserved.
 */

package ch.lu.bbzw.calculator.operators.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OperationCharachters {
  private static final List<String> OPERATION_CHARACHTERS = new ArrayList<>();

  static {
    OPERATION_CHARACHTERS.add("+");
    OPERATION_CHARACHTERS.add("-");
  }

  private OperationCharachters() {
    throw new IllegalAccessError();
  }

  public static List<String> getImmutableOperationList() {
    return Collections.unmodifiableList(OPERATION_CHARACHTERS);
  }
}
