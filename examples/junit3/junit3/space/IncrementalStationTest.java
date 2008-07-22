package junit3.space;

import static org.easymock.EasyMock.*;
import junit.framework.TestCase;
import examples.space.IncrementalStation;
import examples.space.CarefulRocket;
import examples.space.Station;

public class IncrementalStationTest extends TestCase {
  public void testRefuelAbortsIfDockFails() {
    IncrementalStation station = new IncrementalStation();
    CarefulRocket rocket = createMock(CarefulRocket.class);
    expect(rocket.dock()).andReturn(false);
    replay(rocket);
    try {
      station.refuel(rocket, 50);
      fail("expected exception");
    } catch (RuntimeException re) {
      assertEquals("unable to dock", re.getMessage());
    }
    verify(rocket);
  }

  public void testRefuelInOneStep() {
    IncrementalStation station = new IncrementalStation();
    CarefulRocket rocket = createStrictMock(CarefulRocket.class);
    expect(rocket.dock()).andReturn(true);
    expect(rocket.addFuel(50)).andReturn(50);
    rocket.undock();
    replay(rocket);
    station.refuel(rocket, 50);
    verify(rocket);
  }

  public void testRefuelInManySteps() {
    IncrementalStation station = new IncrementalStation();
    CarefulRocket rocket = createStrictMock(CarefulRocket.class);
    expect(rocket.dock()).andReturn(true);
    expect(rocket.addFuel(anyInt())).andReturn(10).times(5);
    rocket.undock();
    replay(rocket);
    station.refuel(rocket, 50);
    verify(rocket);
  }

  public void testMockConcrete() {
    Station station = createMock(Station.class);
  }
  
}
