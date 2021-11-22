package uk.ac.rhul.cs2800;

import java.util.Objects;

/**
 * Class responsible for organising data to be used in the Stack.
 *
 * @author Qasim
 */
public class Entry {
  private float number;
  private Symbol other;
  private String str;
  private Type type;

  /**
   * Constructor for creating an Entry object with a float.
   *
   * @param value stores number for the entry.
   */
  public Entry(float value) {
    this.number = value;
    this.type = Type.NUMBER;
  }

  /**
   * Constructor for creating an Entry object with a Symbol.
   *
   * @param which stores the symbol enum for the entry.
   */
  public Entry(Symbol which) {
    this.other = which;
    this.type = Type.SYMBOL;
  }

  /**
   * Constructor for creating an Entry object with a string.
   *
   * @param str stores the entry as a string.
   */
  public Entry(String str) {
    this.str = str;
    this.type = Type.STRING;
  }

  /**
   * Returns Type of entry.
   *
   * @return Enum of type of Entry.
   * @throws IllegalArgumentException if type is invalid.
   */
  public Type getType() {
    if (this.type == null) {
      throw new IllegalArgumentException("Bad Type");
    }
    return this.type;
  }

  /**
   * Returns String value of Entry.
   *
   * @return String of Enum other.
   * @throws IllegalArgumentException if string does not exits.
   */
  public String getString() {
    if (this.str == null) {
      throw new IllegalArgumentException("Bad Type");
    }
    return this.str;
  }

  /**
   * Returns Symbol of Entry.
   *
   * @return Symbol as an Enum.
   * @throws IllegalArgumentException if symbol doesn't exist.
   */
  public Symbol getSymbol() {
    if (this.other == null) {
      throw new IllegalArgumentException("Bad Type");
    }
    return this.other;
  }

  /**
   * Returns Value of Entry.
   *
   * @return Value as a float.
   * @throws IllegalArgumentException if type is not valid.
   */
  public float getValue() {
    if (this.type.toString() != "NUMBER") { // Only type number is relevant for this function.
      throw new IllegalArgumentException("Bad Type");
    }
    return this.number;
  }

  @Override
  public int hashCode() { // Used inbuilt Eclipse hashcode and equals functions.
    return Objects.hash(number, other, str, type);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Entry other = (Entry) obj;
    return Float.floatToIntBits(number) == Float.floatToIntBits(other.number)
        && this.other == other.other && Objects.equals(str, other.str) && type == other.type;
  }


}


