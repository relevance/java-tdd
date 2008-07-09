package junit4;

import examples.Largest;
import org.junit.Test;
import static org.junit.Assert.*;

public class LargestTest {
  @Test(expected= NullPointerException.class)
  public void nullArray() {
    Largest.largest(null);
  }

  @Test(expected = RuntimeException.class)
  public void emptyArray() {
    int[] empty = {};
    Largest.largest(empty);
  }

  @Test
  public void largestFirst() {
    assertEquals(3, Largest.largest(new int[]{3,2,1}));
  }

  @Test
  public void largestLast() {
    assertEquals(3, Largest.largest(new int[]{1,2,3}));
  }
}

