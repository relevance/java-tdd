package lab.lab2.pizza;

import junit.framework.TestCase;

public class PizzaTest extends TestCase {
  public void testSmallPizza() {
    Pizza pizza = Pizza.small();
    assertEquals("expecting small", "Small", pizza.getSize());
    assertEquals("price is wrong", 10, pizza.getPrice());
  }

  public void testMediumPizza() {
    Pizza pizza = Pizza.medium();
    assertEquals("expecting medium", "Medium", pizza.getSize());
    assertEquals("price is wrong", 15, pizza.getPrice());
  }

  public void testLargePizza() {
    Pizza pizza = Pizza.large();
    assertEquals("expecting large", "Large", pizza.getSize());
    assertEquals("price is wrong", 20, pizza.getPrice());
  }

  public void testAddTopping() {
    Pizza pizza = Pizza.large();
    String actual = pizza.addTopping("pickles");
    assertEquals("pickles", actual);
  }

  public void testGetToppings() {
    Pizza pizza = Pizza.large();
    pizza.addTopping("cheese");
    pizza.addTopping("pepperoni");
    pizza.addTopping("sausage");
    String expected = "cheese, pepperoni, sausage";
    assertEquals(expected, pizza.getToppings());
  }

  public void testGetPriceWithStandardTopping(){
    Pizza pizza = Pizza.large();
    pizza.addTopping("cheese");
    assertEquals(21, pizza.getPrice());
  }

  public void testGetPriceWithNonStandardTopping(){
    Pizza pizza = Pizza.large();
    pizza.addTopping("pickles");
    assertEquals(22, pizza.getPrice());
  }
}
