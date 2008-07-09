package lab3.pizza;

import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Order {
  List orderItems;

  public Order(){
    orderItems = new ArrayList();
  }

  public List addItem(OrderItem orderItem){
    orderItems.add(orderItem);
    return Collections.unmodifiableList(orderItems);
  }

  public int totalCost(){
    int cost = 0;
    for (Iterator iterator = orderItems.iterator(); iterator.hasNext();) {
      OrderItem orderItem = (OrderItem) iterator.next();
      cost += orderItem.cost();
    }
    return cost;
  }

  public String print(){
    String out = "";
    out += StringUtils.center("ORDER", 40);
    out += "\n";
    for (Iterator iterator = orderItems.iterator(); iterator.hasNext();) {
      OrderItem orderItem = (OrderItem) iterator.next();
      out += StringUtils.rightPad(orderItem.display(), 35, ".");
      out += "$" + StringUtils.leftPad(Integer.toString(orderItem.cost()), 4);
      out += "\n";
    }
    out += StringUtils.repeat(" ", 35);
    out += StringUtils.repeat("-", 5);
    out += "\n";

    out += StringUtils.repeat(" ", 35);
    out += "$" + StringUtils.leftPad(Integer.toString(totalCost()), 4);
    out += "\n";

    return out;
  }

}
