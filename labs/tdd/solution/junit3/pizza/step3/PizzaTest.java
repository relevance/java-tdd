package junit3.pizza.step3;

import junit.framework.TestCase;
import pizza.step3.Pizza;

public class PizzaTest extends TestCase {
  public void testSmallPizza() {
    assertEquals("small", Pizza.small().getSize());
  }
  public void testMediumPizza() {
    assertEquals("medium", Pizza.medium().getSize());
  }
  public void testLargePizza() {
    assertEquals("large", Pizza.large().getSize());
  }
}
