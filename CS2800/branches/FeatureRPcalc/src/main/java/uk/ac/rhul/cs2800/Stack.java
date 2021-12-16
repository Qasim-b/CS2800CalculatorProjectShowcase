package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Stack class that is able to store and remove entries.
 *
 * @author Qasim
 *
 */
public class Stack {
  private int size = 0;
  private List<Entry> entries = new ArrayList<Entry>();

  /**
   * Adds an entry to the Stack.
   *
   * @param i an Entry object.
   * 
   */

  public void push(Entry i) {
    this.entries.add(i);
    this.size += 1;
  }

  /**
   * Returns and removes the most recent entry in the Stack.
   *
   * @return Entry at index position (size-1).
   * @throws EmptyStackException - if the stack contains no Entries.
   */
  public Entry pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    this.size = size - 1;
    return this.entries.remove(this.size);
  }

  /**
   * Returns the most recent entry in Stack.
   *
   * @return Entry at index position (size-1).
   * @throws EmptyStackException - if the stack contains no Entries.
   */
  public Entry top() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    return this.entries.get(size - 1);
  }

  /**
   * Returns size of stack list.
   *
   * @return size as integer.
   */
  public int size() {
    return size;
  }
}
