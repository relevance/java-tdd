package examples.ipod.after;

import java.util.*;

public class Ipod {
  private List<Song> songs;

  public static void main(String[] args) {
    Ipod iPod = new Ipod();
    iPod.play();
  }

  public Ipod() {
    songs = new ArrayList();
    songs.add(new Song("All you need is love", 229));
    songs.add(new Song("I am the walrus", 275));
    songs.add(new Song("Hello, goodbye", 210));
  }

  public void play() {
    int totalDuration = totalDuration();

    String prettyDuration = (totalDuration / 60) + ":" + (totalDuration % 60);
    System.out.println(songs.size() + " songs loaded.");
    System.out.println(prettyDuration + " total playing time.");

    int timeRemaining = totalDuration;
    String prettyTimeRemaining = (timeRemaining / 60) + ":" + (timeRemaining % 60);

    for (Iterator<Song> it = songs.iterator(); it.hasNext();) {
      Song song = it.next();
      System.out.println("Now playing: " + song.getName());
      System.out.println("\tTime remaining:" + prettyTimeRemaining);
      timeRemaining -= song.getDuration();
      prettyTimeRemaining = (timeRemaining / 60) + ":" + (timeRemaining % 60);
    }

    System.out.println("Playlist complete.");
  }

  public int totalDuration() {
    int totalDuration = 0;
    for (Iterator<Song> it = songs.iterator(); it.hasNext();) {
      totalDuration += it.next().getDuration();
    }
    return totalDuration;
  }
}
