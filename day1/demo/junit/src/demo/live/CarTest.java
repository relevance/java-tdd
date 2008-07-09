package demo.live;

import junit.framework.TestCase;
import junit.framework.Assert;

public class CarTest extends TestCase{

  public void testCar(){
    Car car = Car.getCompact();

    Assert.assertEquals("compact", car.getType());   

  }

}
