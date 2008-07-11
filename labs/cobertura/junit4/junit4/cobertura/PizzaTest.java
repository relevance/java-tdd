package junit4.cobertura;

import org.junit.Test;
import static org.junit.Assert.*;
import cobertura.Pizza;

public class PizzaTest {
  @Test
  public void testNoToppings() {
    Pizza pizza = Pizza.medium();
    assertEquals("", pizza.getToppings());
  }

  @Test
  public void testOneTopping() {
    Pizza pizza = Pizza.medium();
    pizza.addTopping("cheese");
    assertEquals("cheese", pizza.getToppings());
  }

  @Test
  public void testTwoToppings() {
    Pizza pizza = Pizza.medium();
    pizza.addTopping("cheese");
    pizza.addTopping("pepperoni");
    assertEquals("cheese, pepperoni", pizza.getToppings());
  }

  @Test
  public void smallCookTime() {
    assertEquals(15, Pizza.small().getCookTime());
  }

  @Test
  public void mediumCookTime() {
    assertEquals(25, Pizza.medium().getCookTime());
  }

  @Test
  public void largeCookTime() {
    assertEquals(30, Pizza.large().getCookTime());
  }

}
