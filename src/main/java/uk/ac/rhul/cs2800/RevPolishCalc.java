package uk.ac.rhul.cs2800;

/**
 * Evaluates reverse polish expressions.
 *
 * @author qasim
 *
 */
public class RevPolishCalc implements Calculator {
  private NumStack values = new NumStack();

  /**
   * Evaluates a given argument in reverse polish format.
   */
  public float evaluate(String what) throws IllegalArgumentException {
    String[] splitInput = what.split(" ");
    String symbols = "*/+-";
    for (String t : splitInput) {
      if (!symbols.contains(t)) {
        values.push(Float.parseFloat(t));
      }
    }
    return 0;

  }
}
