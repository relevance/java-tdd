package lab3.pizza.solution;

import junit.framework.TestCase;
import org.easymock.MockControl;
import org.apache.commons.lang.StringUtils;

public class OrderTest extends TestCase {

  public void testConcreteMockTotalCost(){
    Order order = new Order();
    order.addItem(new OrderItemMock("test1", 15));
    order.addItem(new OrderItemMock("test2", 25));
    int expected = 40;
    assertEquals(expected, order.totalCost());
  }

  public void testVirtualMockTotalCost(){
    Order order = new Order();
    MockControl orderItemControl = MockControl.createControl(OrderItem.class);
    OrderItem orderItem = (OrderItem) orderItemControl.getMock();

    orderItem.cost();
    orderItemControl.setReturnValue(15);
    orderItem.cost();
    orderItemControl.setReturnValue(25);
    orderItemControl.replay();

    order.addItem(orderItem);
    order.addItem(orderItem);

    int expected = 40;
    assertEquals(expected, order.totalCost());    
  }

  public void testConcreteMockPrint(){
    Order order = new Order();
    order.addItem(new OrderItemMock("test1", 15));
    order.addItem(new OrderItemMock("test2", 25));
    System.out.println(order.print());

    String[] lines = order.print().split("\n");
    assertTrue(StringUtils.contains(lines[0], "ORDER"));
    assertTrue(StringUtils.contains(lines[1], "test1"));
    assertTrue(StringUtils.contains(lines[2], "test2"));
    assertTrue(StringUtils.contains(lines[3], "-"));
    assertTrue(StringUtils.contains(lines[4], "40"));
  }

  public void testVirtualMockPrint(){
    Order order = new Order();
    MockControl orderItemControl = MockControl.createControl(OrderItem.class);
    OrderItem orderItem = (OrderItem) orderItemControl.getMock();

    orderItem.display();
    orderItemControl.setReturnValue("test1");
    orderItem.cost();
    orderItemControl.setReturnValue(15);
    orderItem.display();
    orderItemControl.setReturnValue("test2");
    orderItem.cost();
    orderItemControl.setReturnValue(25);
    orderItem.cost();
    orderItemControl.setReturnValue(15);
    orderItem.cost();
    orderItemControl.setReturnValue(25);
    orderItemControl.replay();

    order.addItem(orderItem);
    order.addItem(orderItem);

    String[] lines = order.print().split("\n");
    assertTrue(StringUtils.contains(lines[0], "ORDER"));
    assertTrue(StringUtils.contains(lines[1], "test1"));
    assertTrue(StringUtils.contains(lines[2], "test2"));
    assertTrue(StringUtils.contains(lines[3], "-"));
    assertTrue(StringUtils.contains(lines[4], "40"));
  }
}
