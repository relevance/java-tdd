package demo.mock;

public class Song {
  private String title;
  private int duration;

  public Song(String title, int duration){
    this.title = title;
    this.duration = duration;
  }

  public String getTitle() {
    return title;
  }

  public int getDuration() {
    return duration;
  }
}