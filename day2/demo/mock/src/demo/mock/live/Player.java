package demo.mock.live;

import java.io.IOException;

public interface Player {
  public int play();
  public int loadSongs();
  public boolean connectToITunes() throws IOException;
}
