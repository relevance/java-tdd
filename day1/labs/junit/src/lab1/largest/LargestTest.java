package lab1.largest;

import junit.framework.TestCase;

public class LargestTest extends TestCase {
  public void testBasic(){
    int[] list = {9,8,7};
    int test = Largest.largest(list);
    assertEquals("expecting 9", 9, test);
  }
}
