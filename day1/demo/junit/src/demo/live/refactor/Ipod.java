package demo.live.refactor;

import java.util.*;

public class Ipod {
  List songs;

  public static void main(String[] args) {
    Ipod iPod = new Ipod();
    iPod.play();
  }

  public Ipod(){
    //putting songs in a list
    songs = new ArrayList();
    songs.add(new Song("All you need is love", new Integer(229)));
    songs.add(new Song("I am the walrus", new Integer(275)));
    songs.add(new Song("Hello, goodbye", new Integer(210)));
    songs.add(new Song("Heartbreak Hotel", new Integer(210)));
  }

  public int getSongCount(){
     return songs.size();
  }

  public int play() {

    //getting total duration
    int totalDuration = 0;
    for (Iterator iterator = songs.iterator(); iterator.hasNext();) {
      Song song = (Song) iterator.next();
      totalDuration += song.getDuration();
    }

    //printing out some metadata
    String prettyDuration = (totalDuration / 60) + ":" + (totalDuration % 60);
    System.out.println(songs.size() + " songs loaded.");
    System.out.println(prettyDuration + " total playing time.");

    //formatting the time
    int timeRemaining = totalDuration;
    String prettyTimeRemaining = (timeRemaining / 60) + ":" + (timeRemaining % 60);

    //playing all songs
    for (Iterator iterator = songs.iterator(); iterator.hasNext();) {
      Song song = (Song) iterator.next();
      System.out.println("Now playing: " + song);
      System.out.println("\tTime remaining:" + prettyTimeRemaining);
      timeRemaining -= song.getDuration();
      prettyTimeRemaining = (timeRemaining / 60) + ":" + (timeRemaining % 60);
    }

    System.out.println("Playlist complete.");

    return songs.size();
  }
}






