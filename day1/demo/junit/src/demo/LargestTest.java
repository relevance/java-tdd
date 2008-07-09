package demo;

import junit.framework.TestCase;

public class LargestTest extends TestCase {
  public void testNullArray(){
    int[] test = null;
    try{
      Largest.largest(test);
      fail("We didn't get a IAE");
    }
    catch(IllegalArgumentException iae){
      System.out.println("Everything's OK");  
    }
  }

  public void testEmptyArray(){
    int[] actual = {};
    try{
      Largest.largest(actual);
      fail("We didnt' get a RTE");
    }
    catch(RuntimeException re){
      System.out.println("OK");  
    }
  }

  public void testGoodArray(){
    int[] actual = {1,2,3};
    assertEquals("There are only 3 channels on public TV", 3, Largest.largest(actual));    
  }


}
