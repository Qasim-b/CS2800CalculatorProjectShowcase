package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import org.junit.jupiter.api.Test;

class TestNumStack {

  @Test
  void testNumStackCreate() { // test 19- passed by creating NumsStack class.
    NumStack stk = new NumStack();
  }

  @Test
  void testNumStackPush() { // test 20- passed by setting up push method.
    NumStack stk = new NumStack();
    stk.push(2);
  }

  @Test
  void testNumStackPush2() { // test 21- extra testing after test 20.
    NumStack stk = new NumStack();
    stk.push(2);
    stk.push(3);
  }

  @Test
  void testNumStackPop() { // test 22 - pass by creating pop method.
    NumStack stk = new NumStack();
    stk.push(2);
    stk.push(3);
    assertEquals(3, stk.pop());
  }

  @Test
  void testNumStackPop2() { // test 23 - pass by creating pop method.
    NumStack stk = new NumStack();
    stk.push(2);
    stk.push(3);
    assertEquals(3, stk.pop());
    assertEquals(2, stk.pop());
  }

  @Test
  void testStackIsEmpty() { // test 24 - pass by creating isEmpty method.
    NumStack stk = new NumStack();
    assertTrue(stk.isEmpty());
    stk.push(5);
    assertFalse(stk.isEmpty());
  }

  @Test
  void testStackIsEmpty2() { // test 24 - pass by creating isEmpty method.
    NumStack stk = new NumStack();
    assertTrue(stk.isEmpty());
    stk.push(5);
    assertFalse(stk.isEmpty());
    stk.pop();
    assertTrue(stk.isEmpty());
  }
  
  @Test
  void testException() { // test 25 - pass using stacks inbuilt thrown error.
    NumStack stk = new NumStack();
    assertThrows(EmptyStackException.class, () -> stk.pop());
  }
  
}
