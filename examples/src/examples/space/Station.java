package examples.space;

public class Station {
  private int fuel;

  public void refuel(Rocket r, int amount) {
    r.dock();
    r.attachFuelHose();
    r.addFuel(amount);
    fuel -= amount;
    r.detachFuelHose();
    r.undock();
  }

  public int getFuel() {
    return fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
}
