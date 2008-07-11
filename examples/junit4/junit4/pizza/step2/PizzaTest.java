package junit4.pizza.step2;

import org.junit.Test;
import examples.pizza.step2.Pizza;
import static org.junit.Assert.*;

public class PizzaTest {
  @Test
  public void createSmallPizza() {
    Pizza pizza = new Pizza("small");
    assertEquals("small", pizza.getSize());
  }
  @Test
  public void createMediumPizza() {
    Pizza pizza = new Pizza("medium");
    assertEquals("medium", pizza.getSize());
  }
  @Test
  public void createLargePizza() {
    Pizza pizza = new Pizza("large");
    assertEquals("large", pizza.getSize());
  }
}
