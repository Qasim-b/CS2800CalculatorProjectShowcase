package uk.ac.rhul.cs2800;

/**
 * Creates Enums representing data types.
 *
 * @author Qasim
 * 
 */
public enum Type {
  NUMBER("NUMBER"), SYMBOL("SYMBOL"), STRING("STRING"), INVALID("INVALID");

  private final String type;

  Type(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return this.type;
  }
}
