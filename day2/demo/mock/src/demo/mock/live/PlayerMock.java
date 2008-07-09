package demo.mock.live;

import java.util.List;
import java.util.ArrayList;
import java.io.IOException;

public class PlayerMock implements Player{
  int songCount = 0;
  List songs;

  public PlayerMock(){
    songCount = 0;
    songs = new ArrayList();
  }

  public int play() {
    return songCount;
  }

  public int loadSongs() {
    return songCount = 3;
  }

  public boolean connectToITunes() throws IOException {
    return false;  //To change body of implemented methods use File | Settings | File Templates.
  }


  public List getSongs(){
    for(int i = 0; i < songCount; i++){
      songs.add("Song" + i);
    }
    return songs;
  }

}
