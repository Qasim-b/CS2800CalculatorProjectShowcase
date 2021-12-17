package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.List;

/**
 * Model for combining both reverse polish and infix calculators.
 *
 * @author qasim
 *
 */
public class CalcModel {
  private RevPolishCalc rpCalc = new RevPolishCalc();
  private float result;
  private float[] memory; // store results in memory arraylist.
  private int counter = 0;

  /**
   * Evaluates the users input and applies it to the calculator they want to use.
   *
   * @param expression string representing the user input
   * @return float calculated value from the expression
   */
  public float evaluate(String expression) {
    this.result = this.rpCalc.evaluate(expression);
    return this.result;

  }
}
