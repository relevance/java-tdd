package junit3;

import examples.Largest;
import junit.framework.TestCase;

public class LargestTest extends TestCase {
  public void testNullArray(){
    int[] test = null;
    try{
      Largest.largest(test);
      fail("We didn't get a IAE");
    }
    catch(NullPointerException e) {
      //ok
    }
  }

  public void testEmptyArray(){
    int[] actual = {};
    try{
      Largest.largest(actual);
      fail("We didnt' get a RTE");
    }
    catch(RuntimeException re) {
      //ok
    }
  }

  public void testFirstIsLargest(){
    int[] actual = {3,2,1};
    assertEquals(3, Largest.largest(actual));
  }

  public void testLastIsLargest() {
    int[] actual = {1,2,3};
    assertEquals(3, Largest.largest(actual));
  }
}
