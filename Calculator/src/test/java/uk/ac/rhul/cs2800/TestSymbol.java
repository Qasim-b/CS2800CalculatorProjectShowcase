package uk.ac.rhul.cs2800;

import org.junit.jupiter.api.Test;

class TestSymbol { // Test 2 - passed by creating one of each symbol enum.

  @Test
  void testSymbol() {
    Symbol leftbr = Symbol.LEFTBRACKET;
    Symbol rightbr = Symbol.RIGHTBRACKET;
    Symbol times = Symbol.TIMES;
    Symbol plus = Symbol.PLUS;
    Symbol minus = Symbol.MINUS;
    Symbol invalid = Symbol.INVALID;
  }



}
