package junit4.calculator;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import examples.Calculator;

public class CalculatorTest {
  /**
   * static Calculator not really necessary here.
   * Pretend setup is much more expensive to justify this, and
   * the resulting need for resetCalculator.
   */
  private static Calculator calculator = new Calculator();

  @Before
  public void resetCalculator() {
    calculator.reset();
  }
  @Test
  public void add() {
    assertEquals(3, calculator.add(3));
    assertEquals(5, calculator.add(2));
  }
  @Test
  public void subtract() {
    assertEquals(-1, calculator.subtract(1));
    assertEquals(-11, calculator.subtract(10));
  }
  @Test
  public void multiply() {
    calculator.add(2);
    assertEquals(10, calculator.multiply(5));
  }
  @Test
  public void divide() {
    calculator.add(7);
    assertEquals(2, calculator.divide(3));
  }
  @Test(expected = ArithmeticException.class)
  public void divideByZero() {
    calculator.divide(0);    
  }
  @Test
  public void divideByZeroDoesNotAlterResult() {
    calculator.add(2);
    try {
      calculator.divide(0);
    } catch (ArithmeticException ae) {}
    //would it be better to test against result next? How?
    assertEquals(4, calculator.add(2));
  }
}
