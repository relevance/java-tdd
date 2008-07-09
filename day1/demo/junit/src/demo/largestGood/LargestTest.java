package demo.largestGood;

import junit.framework.TestCase;

public class LargestTest extends TestCase {
  public void testSimple(){
    int[] test = {7,8,9};
    assertEquals("expected 9", 9, Largest.largest(test));
  }
}
