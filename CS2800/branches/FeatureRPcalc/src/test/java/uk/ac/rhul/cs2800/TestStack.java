package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.EmptyStackException;
import org.junit.jupiter.api.Test;

class TestStack {

  @Test
  void test() { // test 10- passed by creating an empty stack class.
    Stack stk = new Stack();
  }

  @Test
  void testSize() { // test 11 - passed by setting size to 0 when class is created.
    Stack stk = new Stack();
    assertEquals(0, stk.size(), "Testing a new stack to see if size is 0");
  }

  @Test
  void testPush() { // test 12 - passed by creating push function, size is increased every call.
    Stack stk = new Stack();
    Entry ent = new Entry(2);
    Entry ent2 = new Entry("abc");
    stk.push(ent);
    assertEquals(1, stk.size(), "Testing push function to see if size is update to 1");
    stk.push(ent2);
    assertEquals(2, stk.size(), "Testing push function to see if size is updated to 2");

  }

  @Test
  void testEmptyPop() { // test 13 - passed by creating a pop function handling stack exceptions.
    Stack stk = new Stack();
    assertThrows(EmptyStackException.class, () -> stk.pop());
  }

  @Test
  void pushThenPop() { // test 14 - passed by making pop function return index position size-1
    Stack stk = new Stack();
    Entry ent = new Entry(3);
    stk.push(ent);
    assertEquals(3, stk.pop().getValue(), "should return 3");
  }

  @Test
  void pushTwice() { // test 15 - passed by updating size to be reduced after every pop.
    Stack stk = new Stack();
    Entry ent = new Entry(3);
    Entry ent2 = new Entry(9);
    stk.push(ent);
    stk.push(ent2);
    assertEquals(2, stk.size(), "should return 2");
    assertEquals(9, stk.pop().getValue(), "should return 9 as it was second pushed");
    assertEquals(3, stk.pop().getValue(), "should return 3 as it was second pushed");
    assertThrows(EmptyStackException.class, () -> stk.pop());
  }

  @Test
  void pushMany() { // test 16 - passed stress test of push function.
    Stack stk = new Stack();
    for (int index = 0; index < 100; index += 1) {
      Entry ent = new Entry(index);
      stk.push(ent);
      assertEquals(1 + index, stk.size(), "Size should increase");
    }
  }

  @Test
  void testEmptyTop() { // test 17 - passed by creating top function with exception handling.
    Stack stk = new Stack();
    assertThrows(EmptyStackException.class, () -> stk.top());

  }

  @Test
  void testTop() { // test 18 - passed by getting top to return the Entry at size-1 index.
    Stack stk = new Stack();
    Entry ent = new Entry(1);
    Entry ent2 = new Entry(4);
    stk.push(ent);
    assertEquals(1, stk.top().getValue(), "Should return 1 and keep it stored in stack.");
    stk.push(ent2);
    assertEquals(4, stk.top().getValue(), "Should return 4 and keep it stored in stack");

  }

}
