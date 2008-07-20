package groovy

import groovy.OrderItem

class GroovyOrderItem implements OrderItem {
  int cost
  String display
  GroovyOrderItem(String display, int cost) {
    this.cost = cost;
    this.display = display;
  }
  int cost() { cost }
  String display() { display }
}