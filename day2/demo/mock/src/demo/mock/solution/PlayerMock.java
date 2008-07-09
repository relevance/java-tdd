package demo.mock.solution;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class PlayerMock implements Player {
  public Map values;
  public Map initalValues;

  //constructor to seed the mock with default values
  //NOTE: constructors are independent of the Player interface
  public PlayerMock(){
    values = new HashMap();
    values.put("timeRemainingResult", new Integer(1000));
    values.put("playResult", new Integer(99));
    values.put("loadSongsResult", new Integer(99));

    fillInitialMap();
    debug("default constructor");
  }

  //constructor to seed the mock
  //NOTE: constructors are independent of the Player interface
  public PlayerMock(int timeRemainingResult, int playResult, int loadSongsResult){
    values = new HashMap();
    values.put("timeRemainingResult", new Integer(timeRemainingResult));
    values.put("playResult", new Integer(playResult));
    values.put("loadSongsResult", new Integer(loadSongsResult));

    fillInitialMap();    
    debug("seeded constructor");
  }

  //Player interface implementation
  public int getTimeRemaining() {
    return ((Integer)values.get("timeRemainingResult")).intValue();
  }

  public int play() {
    return ((Integer)values.get("playResult")).intValue();
  }

  public int loadSongs() {
    return ((Integer)values.get("loadSongsResult")).intValue();
  }

  //utility methods to manage the mock lifecycle
  public void fillInitialMap(){
    initalValues = new HashMap();

    for (Iterator iterator = values.keySet().iterator(); iterator.hasNext();) {
      String key = (String) iterator.next();
      initalValues.put(key, (Integer)values.get(key));
    }
  }

  public boolean reset(){
    debug("before reset");

    values = new HashMap();
    for (Iterator iterator = initalValues.keySet().iterator(); iterator.hasNext();) {
      String key = (String) iterator.next();
      values.put(key, (Integer)initalValues.get(key));
    }

    debug("after reset");
    return initalValues.size() == values.size();
  }

  public void debug(String message){
    System.out.println("=================");
    System.out.println(message);
    System.out.println("=================");
    System.out.println("values: " + values);
    System.out.println("initialValues: " + initalValues);
  }

  public void setValue(String key, int value){
    values.put(key, new Integer(value));
  }

}
