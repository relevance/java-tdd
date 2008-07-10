package examples.space;

public interface Rocket {
  public void dock();
  public void attachFuelHose();
  public void addFuel(int amount);
  public void detachFuelHose();
  public void undock();
}
