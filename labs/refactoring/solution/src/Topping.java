import java.util.Set;
import java.util.HashSet;

/**
 * Contra the lab instructions, there is no separate StandardTopping class
 * here. Which approach do you prefer?
 */
public class Topping {
  private String name;
  private int price;
  private int extraCookTime;
  private final static Set standardToppingNames;

  private Topping(String name, int price, int extraCookTime) {
    this.name = name;
    this.price = price;
    this.extraCookTime = extraCookTime;
  }

  static {
    standardToppingNames = new HashSet();
    standardToppingNames.add("pepperoni");
    standardToppingNames.add("sausage");
  }
  public static Topping create(String name) {
    int price = standardToppingNames.contains(name) ? 1 : 2;
    int extraCookTime = standardToppingNames.contains(name) ? 0 : 2;
    return new Topping(name, price, extraCookTime);
  }

  public int getPrice() {
    return price;
  }

  public String toString() {
    return name;
  }

  public int getExtraCookTime() {
    return extraCookTime;
  }
}
