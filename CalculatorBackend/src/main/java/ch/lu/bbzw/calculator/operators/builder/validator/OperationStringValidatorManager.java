/**
 * File Name: OperationStringValidator.java
 * 
 * Copyright (c) 2017 BISON Schweiz AG, All Rights Reserved.
 */

package ch.lu.bbzw.calculator.operators.builder.validator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OperationStringValidatorManager {
  private OperationStringValidatorManager() {
    throw new IllegalAccessError();
  }

  public static List<String> validate(String operationString) {
    List<String> failures = new ArrayList<>();
    for (Validator validator : ValidatorFactory.createAllValidators()) {
      try {
        validator.validate(operationString);
      } catch (CalculationException e) {
        failures.add(e.getMessage());
      }
    }
    return failures;
  }
}
