package cobertura;

import org.apache.commons.lang.StringUtils;

import java.util.*;

public class Pizza {
  private String size;
  private List<Topping> toppings;
  private Map sizes;
  private int baseCookTime;

  private Pizza(String size, int baseCookTime) {
    this.size = size;
    this.baseCookTime = baseCookTime;
    toppings = new ArrayList();

    sizes = new HashMap();
    sizes.put("Small", new Integer(10));
    sizes.put("Medium", new Integer(15));
    sizes.put("Large", new Integer(20));

  }

  public static Pizza small() {
    return new Pizza("Small", 15);
  }

  public static Pizza medium() {
    return new Pizza("Medium", 25);
  }

  public static Pizza large() {
    return new Pizza("Large", 30);
  }

  public String getSize() {
    return size;
  }

  public void addTopping(String topping) {
    toppings.add(Topping.create(topping));
  }

  public String getToppings() {
    return StringUtils.join(toppings, ", ");
  }

  public int getPrice() {
    int price = ((Integer)sizes.get(getSize())).intValue();

    for (Iterator<Topping> it = toppings.iterator(); it.hasNext();) {
      price += it.next().getPrice();
    }
    return price;
  }

  public int getCookTime() {
    int time = baseCookTime;
    for (Iterator<Topping> it = toppings.iterator(); it.hasNext();) {
      time += it.next().getExtraCookTime();
    }
    return time;
  }
}
