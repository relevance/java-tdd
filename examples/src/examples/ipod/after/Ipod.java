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

  public static String prettyTime(int value) {
    return String.format("%02d:%02d", (value / 60), (value % 60));
  }
  
  public void play() {
    int timeRemaining = totalDuration();

    System.out.println(songs.size() + " songs loaded.");
    System.out.println(Ipod.prettyTime(timeRemaining) + " total playing time.");

    for (Iterator<Song> it = songs.iterator(); it.hasNext();) {
      Song song = it.next();
      System.out.println("Now playing: " + song.getName());
      System.out.println("\tTime remaining:" + Ipod.prettyTime(timeRemaining));
      timeRemaining -= song.getDuration();
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
