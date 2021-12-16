package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestNumStack {

  @Test
  void testNumStackCreate() { // test 19- passed by creating NumsStack class.
    NumStack stk = new NumStack();
  }

  @Test
  void testNumStackPush() { // test 20- passed by inheriting from stack class.
    NumStack stk = new NumStack();
    Entry ent = new Entry(2);
    stk.push(ent);
  }
  @Test
  void testNumStackEval() { // test 21-
    NumStack stk = new NumStack();
    Entry ent = new Entry(2);
    Entry ent2 = new Entry(2);
    Symbol plus = Symbol.PLUS;
    Entry ent3 = new Entry(plus);
    stk.push(ent);
    stk.push(ent2);
    stk.push(ent3);
    stk.evaluate();

  }



}
