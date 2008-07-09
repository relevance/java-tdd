package demo;

public class Car {
  public static  Car compact(){
    return new Car();
  }

  private Car(){}

  public int getWheels(){
    return 4;
  }

  public String getColor(){
    return "black";
  }
}
