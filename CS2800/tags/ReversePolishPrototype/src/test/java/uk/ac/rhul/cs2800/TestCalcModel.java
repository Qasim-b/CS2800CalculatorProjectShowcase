package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCalcModel {

  @Test
  void testModelCreation() { // test 35 - passed by creating CalcModel class.
    CalcModel calcmod = new CalcModel();
  }

  @Test
  void testCalcModelEval() { // test 36 - passed by creating evaluation class.
    CalcModel calcmod = new CalcModel();
    assertEquals(calcmod.evaluate("2 2 +"), 4);
  }

  @Test
  void testCalcModelEval2() { // test 37 - extra evaluation test.
    CalcModel calcmod = new CalcModel();
    assertEquals(calcmod.evaluate("2 2 -"), 0);
  }

  @Test
  void testCalcModelEval3() { // test 38 - extra complicated evaluation test.
    CalcModel calcmod = new CalcModel();
    assertEquals(calcmod.evaluate("2 2 - 2 + 2 *"), 4);
  }

}
