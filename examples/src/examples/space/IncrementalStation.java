package examples.space;

public class IncrementalStation {
  //station fuel management omitted for brevity
  
  public void refuel(CarefulRocket rocket, int amount) {
    if (!rocket.dock()) {
      throw new RuntimeException("unable to dock");
    }
    int completed = 0;
    while (completed < amount) {
      completed += rocket.addFuel(amount);
    }
    rocket.undock();
  }
}
