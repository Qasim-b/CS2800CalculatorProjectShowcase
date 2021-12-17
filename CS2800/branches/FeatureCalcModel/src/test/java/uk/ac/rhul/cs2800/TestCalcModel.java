package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestCalcModel {

  @Test
  void testModelCreation() {
    CalcModel calcmod = new CalcModel();
  }

  @Test
  void testCalcModelEval() {
    CalcModel calcmod = new CalcModel();
    assertTrue(calcmod.evaluate("2 2 +",false),4);
  }

}
