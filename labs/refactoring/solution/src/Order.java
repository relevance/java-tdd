import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class Order {
  private List<Pizza> pizzas = new ArrayList<Pizza>();

  public void add(Pizza za) {
    pizzas.add(za);
  }

  public BigDecimal getSubtotal() {
    int subtotal = 0;
    for (Iterator<Pizza> it = pizzas.iterator(); it.hasNext();) {
      subtotal += it.next().getPrice();
    }
    return new BigDecimal(subtotal);
  }

  public BigDecimal getTaxRate() {
    return new BigDecimal(".065");
  }

  public BigDecimal getTax() {
    return getSubtotal().multiply(getTaxRate());
  }

  public BigDecimal getTotal() {
    return getSubtotal().add(getTax());
  }
}
