package demo.mock.live;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;

import java.io.IOException;

public class UserTest {

  @Test
  public void play(){
    Player player = new PlayerMock();
    User jane = new User(player);

    assertEquals(0, jane.listenToSomeTunes());
    player.loadSongs();
    assertEquals(3, jane.listenToSomeTunes());
  }

  @Test
  public void testAVirtualMock(){
    //instantiate the interface
    Player player = createMock(Player.class);
    User john = new User(player);

    //push behavior onto the stack
    expect(player.play()).andReturn(0);
    expect(player.loadSongs()).andReturn(3);
    expect(player.play()).andReturn(3);
    expectLastCall().anyTimes();
   
    //ready to go??
    replay(player);

    //it's go time!
    assertEquals(0, john.listenToSomeTunes());
    assertEquals(3, player.loadSongs());
    assertEquals(3, john.listenToSomeTunes());



    assertEquals(3, john.listenToSomeTunes());
    assertEquals(3, john.listenToSomeTunes());
    assertEquals(3, john.listenToSomeTunes());

    verify(player);
  }


  @Test
  public void testException() throws IOException{
    Player player = createMock(Player.class);
    User john = new User(player);
    String expectedError = "Network connection down";
    expect(player.connectToITunes()).andThrow(new IOException(expectedError));

    replay(player);

    try {
      player.connectToITunes();
      fail("The exception didn't get thrown...");
    } catch (IOException e) {
      assertEquals(expectedError, e.getMessage());
    }
  }




  
  @Test(expected = IOException.class)
  public void testExceptionAgain() throws IOException{
    Player player = createMock(Player.class);
    User john = new User(player);
    String expectedError = "Network connection down";
    expect(player.connectToITunes()).andThrow(new IOException(expectedError));
    //expect(player.connectToITunes()).andReturn(true);

    replay(player);

    player.connectToITunes();
    fail("The exception didn't get thrown...");
  }


}
