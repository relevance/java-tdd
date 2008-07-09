package demo.mock.live;

import java.io.IOException;

public class Ipod implements Player{

  public int play(){
    return 100;
  }

  public int loadSongs(){
    return 100;
  }

  public boolean connectToITunes() throws IOException {
    return false;  //To change body of implemented methods use File | Settings | File Templates.
  }

}
