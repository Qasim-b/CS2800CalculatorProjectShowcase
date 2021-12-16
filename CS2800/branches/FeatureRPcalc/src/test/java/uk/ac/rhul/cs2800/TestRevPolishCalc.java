package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestRevPolishCalc {

  @Test
  void testRevPolishCalcCreate() {
    RevPolishCalc rpcalc = new RevPolishCalc();
  }

  @Test
  void testRevPolishCalcEvaluate() {
    RevPolishCalc rpcalc = new RevPolishCalc();
    assertEquals(rpcalc.evaluate("2 2 +"), 4);
  }

  @Test
  void testRevPolishCalcEvaluate2() {
    RevPolishCalc rpcalc = new RevPolishCalc();
    assertEquals(rpcalc.evaluate("2 2 + 2 +"), 6);
  }
  
  @Test
  void testRevPolishCalcSubtract() {
    RevPolishCalc rpcalc = new RevPolishCalc();
    assertEquals(rpcalc.evaluate("4 2 -"), 2);
  }
}
