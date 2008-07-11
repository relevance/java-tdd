package junit4.mocking;

import examples.mocking.OrderItem;

public class OrderItemFake implements OrderItem {
  private final int cost;
  private final String display;

  public OrderItemFake(String display, int cost) {
    this.display = display;
    this.cost = cost;
  }

  public int cost() {
    return cost;
  }

  public String display() {
    return display;
  }
}
