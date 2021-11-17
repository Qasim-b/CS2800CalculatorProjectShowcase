package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestType {

  @Test
  void testEnums() { // Test 1 - passed by creating one of each type enums.
    Type num = Type.NUMBER;
    Type sym = Type.SYMBOL;
    Type str = Type.STRING;
    Type inv = Type.INVALID;
  }
}
