package examples;

/**
 * Inspired by the book, "Pragmatic Unit Testing in Java with JUnit"
 *                        (Visit www.PragmaticProgrammer.com)
 * may have deliberate bugs!
 */

public class Largest {
  public static int largest(int [] list) {
    int max=Integer.MAX_VALUE;

    if (list == null) {
      throw new RuntimeException("Null list");
    }

    for (int index = 0; index < list.length - 1; index++) {
      if (list[index] > max) {
        max = list[index];
      }
    }
    return max;
  }
}
