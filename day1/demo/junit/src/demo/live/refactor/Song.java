package demo.live.refactor;

public class Song {
  private String title;
  private int duration;

  public Song(String title, int duration) {
    this.title = title;
    this.duration = duration;
  }

  public int getDuration() {
    return duration;
  }

  public String toString(){
    return title;
  }
}
