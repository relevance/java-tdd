package demo.live.refactor;

import junit.framework.TestCase;

public class IpodTest extends TestCase {

  public void testPlay(){
    Ipod ipod = new Ipod();

    assertEquals(ipod.getSongCount(), ipod.play());
  }

}
