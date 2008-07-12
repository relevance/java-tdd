package examples.ipod.after;

public class Song extends Object {
  private final String name;
  private final int duration;

  public Song(String name, int duration) {
    this.name = name;
    this.duration = duration;
  }
  public String getName() {
    return name;
  }

  public int getDuration() {
    return duration;
  }

}
