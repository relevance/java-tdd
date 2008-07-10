package junit3.space;

import static org.easymock.EasyMock.*;
import junit.framework.TestCase;
import examples.space.Station;
import examples.space.Rocket;

public class StationTest extends TestCase {
  public void testRefuelShouldDecrementStationFuel() {
    Station station = new Station();
    station.setFuel(1000);
    // by not calling replay, the mock acts as a stub
    // could also call createNiceMock
    Rocket rocket = createMock(Rocket.class);
    station.refuel(rocket, 50);
    assertEquals(950, station.getFuel());
  }

  public void testRefuelUsesTheHose() {
    Station station = new Station();
    station.setFuel(1000);
    Rocket rocket = createNiceMock(Rocket.class);
    rocket.attachFuelHose();
    rocket.detachFuelHose();
    replay(rocket);
    station.refuel(rocket, 50);
    verify(rocket);
  }

  public void testRefuelDoesThingsInTheCorrectOrder() {
    Station station = new Station();
    station.setFuel(1000);
    Rocket rocket = createStrictMock(Rocket.class);
    rocket.dock();
    rocket.attachFuelHose();
    rocket.addFuel(50);
    rocket.detachFuelHose();
    rocket.undock();
    replay(rocket);
    station.refuel(rocket, 50);
    verify(rocket);
  }

}

