package examples.pizza.step5;

import org.apache.commons.lang.StringUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Pizza {
  private final String size;
  private List toppings;

  private Pizza(String size) {
    this.size = size;
    this.toppings = new ArrayList();
  }

  public static Pizza small() {
    return new Pizza("small");
  }

  public static Pizza medium() {
    return new Pizza("medium");
  }

  public static Pizza large() {
    return new Pizza("large");
  }

  public String getSize() {
    return size;
  }

  public void addTopping(String s) {
    toppings.add(s);
  }

  public Object getToppings() {
    return StringUtils.join(toppings, ", ");
  }

}
