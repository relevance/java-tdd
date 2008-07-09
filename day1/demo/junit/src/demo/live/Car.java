package demo.live;

public class Car {
  private String type;
  private String color;
  private int wheels;
  private boolean sunRoof;

  public Car(String type, String color, int wheels, boolean sunRoof) {
    this.type = type;
    this.color = color;
    this.wheels = wheels;
    this.sunRoof = sunRoof;
  }

  public Car(String type) {
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public boolean isSunRoof() {
    return sunRoof;
  }

  public void setSunRoof(boolean sunRoof) {
    this.sunRoof = sunRoof;
  }

  public static Car getCompact(){
    return new Car("compact");


  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
