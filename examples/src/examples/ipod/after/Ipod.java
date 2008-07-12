package examples.ipod.after;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;

public class Ipod {

  public static void main(String[] args) {
    Ipod iPod = new Ipod();
    iPod.play();
  }

  public void play() {
    Map songs = new LinkedHashMap();
    songs.put("All you need is love", new Integer(229));
    songs.put("I am the walrus", new Integer(275));
    songs.put("Hello, goodbye", new Integer(210));

    int totalDuration = 0;
    for (Iterator iterator = songs.values().iterator(); iterator.hasNext();) {
      Integer duration = (Integer) iterator.next();
      totalDuration += duration.intValue();
    }

    String prettyDuration = (totalDuration / 60) + ":" + (totalDuration % 60);
    System.out.println(songs.size() + " songs loaded.");
    System.out.println(prettyDuration + " total playing time.");

    int timeRemaining = totalDuration;
    String prettyTimeRemaining = (timeRemaining / 60) + ":" + (timeRemaining % 60);

    for (Iterator iterator = songs.keySet().iterator(); iterator.hasNext();) {
      String song = (String) iterator.next();
      System.out.println("Now playing: " + song);
      System.out.println("\tTime remaining:" + prettyTimeRemaining);
      timeRemaining -= ((Integer)songs.get(song)).intValue();
      prettyTimeRemaining = (timeRemaining / 60) + ":" + (timeRemaining % 60);
    }

    System.out.println("Playlist complete.");
  }
}
