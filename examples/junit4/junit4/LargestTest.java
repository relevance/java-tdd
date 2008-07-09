package junit4;

import examples.Largest;
import org.junit.Test;

public class LargestTest {
  @Test
  public void nullArray() {
    Largest.largest(null);
  }
}
