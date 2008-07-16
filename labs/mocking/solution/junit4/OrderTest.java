import org.junit.Test;
import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class OrderTest {
  @Test
  public void totalCostOneItemUsingFake() {
    Order order = new Order();
    OrderItem item1 = new OrderItemFake("item 1", 50);
    order.addItem(item1);
    assertEquals(50, order.totalCost());
  }

  @Test
  public void totalCostMultipleItemsUsingFake() {
    Order order = new Order();
    OrderItem item1 = new OrderItemFake("item 1", 50);
    OrderItem item2 = new OrderItemFake("item 2", 35);
    order.addItem(item1);
    order.addItem(item2);
    assertEquals(85, order.totalCost());
  }

  @Test
  public void totalCostOneItemUsingMock() {
    Order order = new Order();
    OrderItem orderItem = createMock(OrderItem.class);
    expect(orderItem.cost()).andReturn(50);
    replay(orderItem);
    order.addItem(orderItem);
    assertEquals(50, order.totalCost());
  }

  //TODO: separate fixture helper?
  //TODO: refactor printing to use template?
  @Test
  public void printUsingFake() throws IOException {
    Order order = new Order();
    OrderItem item1 = new OrderItemFake("item 1", 50);
    OrderItem item2 = new OrderItemFake("item 2", 35);
    order.addItem(item1);
    order.addItem(item2);
    String expected = FileUtils.readFileToString(new File("fixtures/OrderPrintResult.txt"));
    assertEquals(expected, order.print());
  }

  @Test
  public void printUsingMock() throws IOException {
    Order order = new Order();
    OrderItem item1 = createMock(OrderItem.class);
    OrderItem item2 = createMock(OrderItem.class);
    expect(item1.cost()).andReturn(50).atLeastOnce();
    expect(item2.cost()).andReturn(35).atLeastOnce();
    expect(item1.display()).andReturn("item 1").atLeastOnce();
    expect(item2.display()).andReturn("item 2").atLeastOnce();
    replay(item1);
    replay(item2);
    order.addItem(item1);
    order.addItem(item2);
    String expected = FileUtils.readFileToString(new File("fixtures/OrderPrintResult.txt"));
    assertEquals(expected, order.print());
  }

}
