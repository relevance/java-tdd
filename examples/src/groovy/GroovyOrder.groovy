package groovy;

import groovy.OrderItem;

public class GroovyOrder {
  def orderItems = []
  void addItem(OrderItem item) {
    orderItems << item
  }
  int totalCost() {
    orderItems.inject(0) {sum, item -> sum + item.cost()}     
  }
  void loadOrders(String xml) {
    new XmlSlurper().parseText(xml).orderitem.each {
      orderItems << new GroovyOrderItem(it.text(), it.@cost.text().toInteger())      
    }
  }
}
