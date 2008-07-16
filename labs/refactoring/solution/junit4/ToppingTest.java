import org.junit.Test;
import static org.junit.Assert.*;

public class ToppingTest {
  @Test
  public void testStandardToppings() {
    assertEquals(1, Topping.create("pepperoni").getPrice());
  }
}
