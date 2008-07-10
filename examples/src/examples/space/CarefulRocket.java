package examples.space;

public interface CarefulRocket {
  public boolean dock();
  public int addFuel(int requestedAmount);
  public void undock();
}
