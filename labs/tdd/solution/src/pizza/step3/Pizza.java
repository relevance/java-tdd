package pizza.step3;

public class Pizza {
  private final String size;

  private Pizza(String size) {
    this.size = size;
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
}
