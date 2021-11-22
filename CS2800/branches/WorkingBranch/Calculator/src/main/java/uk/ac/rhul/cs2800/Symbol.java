package uk.ac.rhul.cs2800;

/**
 * Creates Enums representing calculator symbols.
 *
 * @author Qasim
 *
 */
public enum Symbol {
  LEFTBRACKET("LEFTBRACKET"), RIGHTBRACKET("RIGHTBRACKET"), TIMES("TIMES"), DIVIDE("DIVIDE"), PLUS(
      "PLUS"), MINUS("MINUS"), INVALID("INVALID");

  private final String symbol;

  Symbol(String symbol) {
    this.symbol = symbol;
  }

  @Override
  public String toString() {
    return this.symbol;
  }
}
