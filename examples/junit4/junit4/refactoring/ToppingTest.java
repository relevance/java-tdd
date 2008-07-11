package junit4.refactoring;

import org.junit.Test;
import static org.junit.Assert.*;
import examples.refactoring.Topping;

public class ToppingTest {
  @Test
  public void testStandardToppings() {
    assertEquals(1, Topping.create("pepperoni").getPrice());
  }
}
