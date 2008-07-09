package demo;

import junit.framework.TestCase;

public class CarTest extends TestCase {
  Car car;

  public void setUp(){
    car = Car.compact();
  }


  public void testWheels(){
    assertEquals(4, car.getWheels());
  }

  public void testColor(){
    assertEquals("black", car.getColor());
  }


}
