package uk.ac.rhul.cs2800;

/**
 * A class used to evaluate reverse polish expressions.
 *
 * @author qasim
 *
 */
public class NumStack {
  private Stack numstack = new Stack();

  /**
   * Pushes a number onto the stack.
   *
   * @param i number to be pushed onto the stack
   */
  public void push(float i) {
    Entry numentry = new Entry(i);
    this.numstack.push(numentry);
  }

  /**
   * Returns the top of the stack as a float value instead of Entry type.
   *
   * @return float value of entry in the numstack
   */
  public float pop() {
    return this.numstack.pop().getValue();
  }

  /**
   * Checks if numstack is empty.
   *
   * @return true if empty, false if not empty
   */
  public boolean isEmpty() {
    if (this.numstack.size() == 0) {
      return true;
    }
    return false;
  }



}
