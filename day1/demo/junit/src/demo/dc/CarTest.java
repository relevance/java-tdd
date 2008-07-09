package demo.dc;

import junit.framework.TestCase;

public class CarTest extends TestCase {

  public void testStart(){
    Car car = new Car();
    car.addGas(1);
    assertTrue("why didn't my car start?",car.start());

    
  }


  public void testOutOfGas(){
    Car car = new Car();
    assertFalse(car.start());

    car.addGas(12);
    assertTrue(car.start());


  }
}
