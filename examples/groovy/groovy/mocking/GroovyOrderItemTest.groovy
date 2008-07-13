package groovy.mocking

import groovy.GroovyOrderItem
import examples.mocking.OrderItem

class GroovyOrderItemTest extends GroovyTestCase {
  def testEmptyOrderItem() {
    OrderItem item = new GroovyOrderItem("foo", 0)
    assertEquals(0, item.cost())
    assertEquals("foo", item.display())
  }
}