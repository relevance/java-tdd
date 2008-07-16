import java.util.*;

public class Pizza {
  private String size;
  private List toppings;
  private int price;
  private Map sizes;
  private Map standardToppings;

  private Pizza(String size) {
    this.size = size;
    toppings = new ArrayList();

    sizes = new HashMap();
    sizes.put("Small", new Integer(10));
    sizes.put("Medium", new Integer(15));
    sizes.put("Large", new Integer(20));

    standardToppings = new HashMap();
    standardToppings.put("cheese", new Integer(1));
    standardToppings.put("pepperoni", new Integer(1));
    standardToppings.put("sausage", new Integer(1));
  }

  public static Pizza small() {
    return new Pizza("Small");
  }

  public static Pizza medium() {
    return new Pizza("Medium");
  }

  public static Pizza large() {
    return new Pizza("Large");
  }

  public String getSize() {
    return size;
  }

  public String addTopping(String topping) {
    toppings.add(topping);
    return topping;
  }

  public String getToppings() {
    String out = "";
    for (Iterator iterator = toppings.iterator(); iterator.hasNext();) {
      String topping = (String) iterator.next();
      out += topping + ", ";
    }
    out = out.substring(0, (out.length() - 2));
    return out;
  }

  public int getPrice() {
    price = 0;
    price = ((Integer)sizes.get(getSize())).intValue();

    for (Iterator iterator = toppings.iterator(); iterator.hasNext();) {
      String topping = (String) iterator.next();
      if(standardToppings.containsKey(topping)){
        price += ((Integer)standardToppings.get(topping)).intValue();
      }
      else{
        price += 2;
      }
    }
    return price;
  }
}
