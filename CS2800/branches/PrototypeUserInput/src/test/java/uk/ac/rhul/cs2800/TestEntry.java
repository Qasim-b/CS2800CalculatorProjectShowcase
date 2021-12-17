package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TestEntry {

  @Test
  void testFloatEntry() { // Test 3- Passed by creating an entry object using float constructor.
    Entry ent = new Entry(8);
  }

  @Test
  void testSymbolEntry() { // Test4 - Passed by creating entry object using symbol constructor.
    Entry ent = new Entry(Symbol.MINUS);
  }

  @Test
  void testStringEntry() { // test 5 - Passed by creating entry object using string constructor.
    Entry ent = new Entry("abc");
  }

  @Test
  void testfloatEntryGetters() { // test6 - Passed by creating getters with exception handling.
    Entry ent = new Entry(3);
    assertEquals(3, ent.getValue(), "Checking that getValue works if result is 3");
    assertEquals("NUMBER", ent.getType().toString(), "check type, should return NUMBER");
    assertThrows(IllegalArgumentException.class, () -> ent.getString(),
        "check getString should throw exception");
    assertThrows(IllegalArgumentException.class, () -> ent.getSymbol(),
        "check getSymbol should throw exception");
  }

  @Test
  void testSymbolEntryGetters() { // test7 - Passed by creating additional Bad Type exceptions.
    Entry ent = new Entry(Symbol.PLUS);
    assertThrows(IllegalArgumentException.class, () -> ent.getValue(),
        "Checking that getValue throws exception");
    assertEquals("SYMBOL", ent.getType().toString(), "check type, should return SYMBOL");
    assertThrows(IllegalArgumentException.class, () -> ent.getString(),
        "check getString should throw exception");
    assertEquals("PLUS", ent.getSymbol().toString(), "checking if symbol is Plus");
  }

  @Test
  void testStringEntryGetters() { // test8 - Passed by creating additional Bad Type exceptions.
    Entry ent = new Entry("abcd");
    assertThrows(IllegalArgumentException.class, () -> ent.getValue(),
        "Checking that getValue throws exception");
    assertEquals("abcd", ent.getString(), "check string, should return abc");
    assertThrows(IllegalArgumentException.class, () -> ent.getSymbol(),
        "check getSymbol should throws exception");
    assertEquals("STRING", ent.getType().toString(), "checking if type is string");
  }

  @Test
  void testHashCodeAndEquals() { // test9 - Passed by using Eclipse inbuilt override methods.
    Entry ent = new Entry(2);
    Entry ent2 = new Entry(2);
    assertEquals(ent, ent2);
    assertTrue(ent.hashCode() == ent2.hashCode());

    Entry ent3 = new Entry("abc");
    Entry ent4 = new Entry("abc");
    assertEquals(ent3, ent4);
    assertTrue(ent3.hashCode() == ent4.hashCode());
  }


}
