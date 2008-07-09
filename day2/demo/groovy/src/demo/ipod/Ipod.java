package demo.ipod;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ipod {
  private List songs;
  private int timeRemaining;
  private int totalDuration;
  private int totalSongs;

  public Ipod(){
    loadSongs();
  }

  public static void main(String[] args) {
    Ipod iPod = new Ipod();
  }

  public List getSongs() {
    return songs;
  }

  public int getTimeRemaining() {
    return timeRemaining;
  }

  public int getTotalDuration() {
    return totalDuration;
  }

  public int getTotalSongs() {
    return totalSongs;
  }

  public int play() {    
    for (Iterator iterator = songs.iterator(); iterator.hasNext();) {
      Song song = (Song) iterator.next();
      playSong(song);
    }
    System.out.println("Playlist complete.");
    return getTimeRemaining();
  }

  protected int playSong(Song song) {
    System.out.println("Now playing: " + song.getTitle());
    System.out.println("\tTime remaining: " + prettyDuration(timeRemaining));
    timeRemaining -= song.getDuration();
    return timeRemaining;
  }

  protected String prettyDuration(int duration) {
    int minutes = duration / 60;
    int seconds = duration % 60;
    String prettySeconds = (seconds < 10) ? "0" + seconds : "" + seconds;
    return minutes + ":" + prettySeconds;
  }

  public int loadSongs() {
    songs = new ArrayList();
    songs.add(new Song("All you need is love", 229));
    songs.add(new Song("I am the walrus", 275));
    songs.add(new Song("Hello, goodbye", 210));

    totalSongs = songs.size();

    totalDuration = 0;
    for (Iterator iterator = songs.iterator(); iterator.hasNext();) {
      Song song = (Song) iterator.next();
      totalDuration += song.getDuration();
    }

    timeRemaining = totalDuration;

    System.out.println(totalSongs + " songs loaded.");
    System.out.println(prettyDuration(totalDuration) + " total playing time.");
    
    return totalDuration;
  }
}

