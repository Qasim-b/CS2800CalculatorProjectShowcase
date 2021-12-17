package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestRevPolishCalc {

  @Test
  void testRevPolishCalcCreate() { // test 26 - passed by creating class file.
    RevPolishCalc rpcalc = new RevPolishCalc();
  }

  @Test
  void testRevPolishCalcEvaluate() { // test 27 - passed by creating evaluate 
    RevPolishCalc rpcalc = new RevPolishCalc(); // with addition handling.
    assertEquals(rpcalc.evaluate("2 2 +"), 4);
  }

  @Test
  void testRevPolishCalcEvaluate2() { // test 28 - extra test for addition.
    RevPolishCalc rpcalc = new RevPolishCalc();
    assertEquals(rpcalc.evaluate("2 2 + 2 +"), 6);
  }
  
  @Test
  void testRevPolishCalcSubtract() { // test 29 - passed by adding subtraction handling.
    RevPolishCalc rpcalc = new RevPolishCalc();
    assertEquals(rpcalc.evaluate("4 2 -"), 2);
  }
  
  @Test
  void testRevPolishCalcSubtract2() { // test 30 - extra subtraction test.
    RevPolishCalc rpcalc = new RevPolishCalc();
    assertEquals(rpcalc.evaluate("4 2 - 1 -"), 1);
  }
  
  @Test
  void testRevPolishCalcDivide() { // test 31 - passed by creating division handling.
    RevPolishCalc rpcalc = new RevPolishCalc();
    assertEquals(rpcalc.evaluate("6 3 /"), 2);
  }
  
  @Test
  void testRevPolishCalcDivide2() { // test 32 - extra division test.
    RevPolishCalc rpcalc = new RevPolishCalc();
    assertEquals(rpcalc.evaluate("6 3 / 2 /"), 1);
  }
  
  @Test
  void testRevPolishCalcMulitply() { // test 33 - passed by adding multiplication handling.
    RevPolishCalc rpcalc = new RevPolishCalc();
    assertEquals(rpcalc.evaluate("6 3 *"), 18);
  }
  
  @Test
  void testRevPolishCalcMulitply2() { // test 34 - extra multiplication test.
    RevPolishCalc rpcalc = new RevPolishCalc();
    assertEquals(rpcalc.evaluate("6 3 * 2 *"), 36);
  }
}
