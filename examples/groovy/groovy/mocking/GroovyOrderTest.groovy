package groovy.mocking;

import groovy.util.GroovyTestCase;
import groovy.GroovyOrder;
import groovy.GroovyOrderItem;

public class GroovyOrderTest extends GroovyTestCase {
  def testTotalCostOneItemUsingFake() {
    def order = new GroovyOrder();
    def item1 = new GroovyOrderItem("item 1", 50);
    order.addItem(item1);
    assertEquals(50, order.totalCost());
  }

  def testTotalCostMultipleItemsUsingFake() {
    def order = new GroovyOrder()
    def item1 = new GroovyOrderItem("item 1", 50)
    def item2 = new GroovyOrderItem("item 2", 35)
    order.addItem(item1)
    order.addItem(item2)
    assertEquals(85, order.totalCost())
  }

  def testLoadOrders () {
    def order = new GroovyOrder()
    def orderXML = """
<orders>
  <orderitem cost="15">Pizza</orderitem>
  <orderitem cost="5">Soda</orderitem>
  <orderitem cost="10">Breadsticks</orderitem>
</orders>
"""
    order.loadOrders(orderXML);
    assertEquals(30, order.totalCost())
  }
}
