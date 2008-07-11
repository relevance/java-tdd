package junit4.refactoring;

import org.junit.Test;
import static org.junit.Assert.*;
import examples.refactoring.Order;
import examples.refactoring.Pizza;

import java.math.BigDecimal;

public class OrderTest {
  @Test
  public void subtotal() {
    Order order = new Order();
    order.add(Pizza.large());
    assertEquals(20, order.getSubtotal().intValueExact());
  }

  @Test
  public void tax() {
    Order order = new Order();
    order.add(Pizza.small());
    assertEquals(new BigDecimal(".650"), order.getTax());
  }

  @Test
  public void total() {
    Order order = new Order();
    order.add(Pizza.small());
    assertEquals(new BigDecimal("10.650"), order.getTotal());
  }

}
