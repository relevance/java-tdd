package junit4.cobertura;

import org.junit.Test;
import static org.junit.Assert.*;
import cobertura.Topping;

public class ToppingTest {
  @Test
  public void testStandardToppings() {
    assertEquals(1, Topping.create("pepperoni").getPrice());
  }
}
