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
    String[] splitInput = what.split(" "); // splits string into an array of numbers and symbols.
    String symbols = "*/+-";
    float firstnum;
    float secondnum;
    for (String t : splitInput) {
      if (!symbols.contains(t)) { // checks if the current item in the array is a symbol.
        values.push(Float.parseFloat(t)); // if not a symbol it is pushed onto the numstack.
      } else {
        firstnum = values.pop();
        secondnum = values.pop();
        switch (t) {
          case ("+"):
            values.push(firstnum + secondnum);
            break;
          case ("-"):
            values.push(secondnum - firstnum);
            break;
          case ("/"):
            values.push(secondnum / firstnum);
            break;
        }
      }

    }
    return values.pop();

  }
}
