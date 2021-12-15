package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author qasim
 *
 */
class TestNumStack {

  @Test
  void testNumStackCreate() {
    NumStack stk = new NumStack();
  }

  @Test
  void testNumStackPush() {
    NumStack stk = new NumStack();
    Entry ent = new Entry(2);
    stk.push(ent);
  }

}
