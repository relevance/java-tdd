package testng.calculator;

import org.testng.annotations.*;
import examples.Calculator;

public class CalculatorTest {
  private Calculator calculator;

  @BeforeClass
  public void createCalculator() {
    calculator = new Calculator();
  }

  @BeforeMethod
  public void resetCalculator() {
    calculator.reset();
  }
  
  @Test
  public void add() {
    assert 3 == calculator.add(3);
    assert 5 == calculator.add(2);
  }

  @Test
  public void subtract() {
    assert -1 == calculator.subtract(1);
    assert -11 == calculator.subtract(10);
  }

  @Test
  public void multiply() {
    calculator.add(2);
    assert 10 == calculator.multiply(5);
  }
  @Test
  public void divide() {
    calculator.add(7);
    assert 2 == calculator.divide(3);
  }
  @Test(expectedExceptions = ArithmeticException.class)
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
    assert 4 == calculator.add(2);
  }

}
