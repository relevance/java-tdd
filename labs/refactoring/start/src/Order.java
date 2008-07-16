package lab2.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Order {

  public static void main(String[] args) {
    Order order = new Order();
    order.placeOrder();
  }

  public void placeOrder(){
    Pizza pizza1 = Pizza.large();
    pizza1.addTopping("cheese");
    pizza1.addTopping("peppers");
    pizza1.addTopping("onions");
    System.out.println("Pizza 1:\t" + pizza1.getToppings());
    System.out.println("Cost:\t" + pizza1.getPrice());

    Pizza pizza2 = Pizza.medium();
    pizza2.addTopping("ham");
    pizza2.addTopping("pinapple");
    System.out.println("Pizza 2:\t" + pizza1.getToppings());
    System.out.println("Cost:\t" + pizza1.getPrice());

    List orders = new ArrayList();
    orders.add(pizza1);
    orders.add(pizza2);

    int subtotal = 0;
    for (Iterator iterator = orders.iterator(); iterator.hasNext();) {
      Pizza pizza = (Pizza) iterator.next();
      subtotal += pizza.getPrice();
    }
    System.out.println("Subtotal:\t" + subtotal);
    System.out.println("Tax:\t" + (subtotal * 0.065));
    System.out.println("Total:\t" + subtotal + (subtotal * 0.065));
  }
}
