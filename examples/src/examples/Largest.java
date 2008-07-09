package examples;

/**
 * Inspired by the book, "Pragmatic Unit Testing in Java with JUnit"
 *                        (Visit www.PragmaticProgrammer.com)
 *
 * Things to think about:
 *
 * initial value of max
 * should you check list for null?
 * should you check list for empty?
 * what are the right loop boundaries?
 */

public class Largest {
  public static int largestBAD(int [] list) {
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

  public static int largest(int[] list) {
    int max=Integer.MIN_VALUE;

    if (list.length == 0) {
      throw new RuntimeException("Empty list");
    }

    for (int value : list) {
      if (value > max) {
        max = value;
      }
    }
    return max;
  }
}
