package demo.refactor.solution;

import junit.framework.TestCase;

public class IpodTest extends TestCase {
  Ipod iPod;

  public void setUp(){
    iPod = new Ipod();
  }

  public void testPlay(){
    int test = iPod.play();
    assertEquals("timeRemaining should be zero", 0, test);
  }

  public void testLoadSongs(){
    int test = iPod.loadSongs();
    assertEquals("expecting 714 seconds", 714, test);    
  }

  public void testPrettyDuration(){
    String test = iPod.prettyDuration(60);
    assertEquals("expecting 1:00", "1:00", test);
  }

  public void testShortPrettyDuration(){
    String test = iPod.prettyDuration(1);
    assertEquals("expecting 0:01", "0:01", test);
  }

  public void testLongPrettyDuration(){
    String test = iPod.prettyDuration(61);
    assertEquals("expecting 1:01", "1:01", test);
  }
}
