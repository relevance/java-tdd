package junit4.mocking;

import org.junit.Test;
import examples.mocking.Order;

public class OrderTest {
  @Test
  public void createOrder() {
    new Order();
  }
}
