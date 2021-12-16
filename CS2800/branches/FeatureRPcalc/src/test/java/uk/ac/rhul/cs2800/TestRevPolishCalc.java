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
    assertEquals(rpcalc.evaluate("2 2 +"),4);
  }
}
