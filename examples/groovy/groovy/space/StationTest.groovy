package groovy.space

import static org.easymock.EasyMock.*;
import examples.space.Station;
import examples.space.Rocket

class StationTest extends GroovyTestCase {
  public void testRefuelShouldDecrementStationFuel() {
    def station = new Station()
    station.fuel = 1000
    def rocket = createMock(Rocket)
    station.refuel rocket, 50
    assertEquals 950, station.fuel
  }

  public void testRefuelUsesTheHose() {
    def station = new Station()
    station.fuel = 1000
    def rocket = createNiceMock(Rocket)
    rocket.attachFuelHose()
    rocket.detachFuelHose()
    replay rocket 
    station.refuel rocket, 50
    verify rocket
  }

  public void testRefuelDoesThingsInTheCorrectOrder() {
    def station = new Station();
    station.fuel = 1000
    def rocket = createStrictMock(Rocket)
    rocket.dock()
    rocket.attachFuelHose()
    rocket.addFuel 50
    rocket.detachFuelHose()
    rocket.undock()
    replay rocket
    station.refuel rocket, 50
    verify rocket
  }

}