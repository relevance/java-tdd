package lab3.pizza.solution;

public class OrderItemMock implements OrderItem {
  String display;
  int cost;

  public OrderItemMock(String display, int cost) {
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
