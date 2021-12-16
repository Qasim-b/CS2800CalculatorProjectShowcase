package uk.ac.rhul.cs2800;

/**
 * Interface for reverse polish and infix calculator classes.
 *
 * @author Qasim
 */
public interface Calculator {
  public float evaluate(String what) throws IllegalArgumentException;
}
