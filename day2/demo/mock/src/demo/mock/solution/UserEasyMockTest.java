package demo.mock.solution;

import junit.framework.TestCase;
import org.easymock.MockControl;

public class UserEasyMockTest extends TestCase {
  private User joe;
  private MockControl mockControl;
  private Player fakePlayer;

  protected void setUp() throws Exception {
    super.setUp();
    joe = new User();
    mockControl = MockControl.createControl(Player.class);
    fakePlayer = (Player) mockControl.getMock();
  }

  public void testPlayIpod() {
    Player iPod = new Ipod();
    joe.setPlayer(iPod);
    int actual = joe.listenToSomeTunes();
    assertEquals(3, actual);
  }

  public void testPlayIPhone() {
    Player iPhone = new IPhone();
    joe.setPlayer(iPhone);
    int actual = joe.listenToSomeTunes();
    assertEquals(12, actual);
  }

  public void testMockPlayer() {
    //setup the mock
    MockControl mockControl = MockControl.createControl(Player.class);
    Player fakePlayer = (Player) mockControl.getMock();

    //record behavior
    fakePlayer.play();
    mockControl.setReturnValue(1000);

    //activate the mock
    mockControl.replay();

    //now do your test
    joe.setPlayer(fakePlayer);
    int actual = joe.listenToSomeTunes();
    assertEquals(1000, actual);
  }


  public void testOnlyPlayPartialList() {

    //record behavior
    fakePlayer.loadSongs();
    mockControl.setReturnValue(1500);
    fakePlayer.play();
    mockControl.setReturnValue(4);

    //activate the mock
    mockControl.replay();

    //now do your test
    joe.setPlayer(fakePlayer);
    int actual = joe.listenToSomeTunes();
    assertEquals(4, actual);
    fakePlayer.loadSongs();

    //did all of our mock methods get called?
    mockControl.verify();
    //yes... but they got called out of order
  }


  public void testDidMyMockMethodsGetCalledInTheRightOrder() {
    //setup the mock
    //mockControl = MockControl.createControl(Player.class);
    mockControl = MockControl.createStrictControl(Player.class);
    fakePlayer = (Player) mockControl.getMock();

    //record behavior
    fakePlayer.loadSongs();
    mockControl.setReturnValue(1500);
    fakePlayer.play();
    mockControl.setReturnValue(4);

    //activate the mock
    mockControl.replay();

    //now do your test
    fakePlayer.loadSongs();
    joe.setPlayer(fakePlayer);
    int actual = joe.listenToSomeTunes();
    assertEquals(4, actual);
    //fakePlayer.loadSongs();

    //did all of our mock methods get called?
    mockControl.verify();
  }


  public void testThrowingAnException() {
    //record behavior
    fakePlayer.loadSongs();
    //mockControl.setReturnValue(99);
    mockControl.setThrowable(new RuntimeException("Cannot find song list"));

    //activate the mock
    mockControl.replay();

    //now do your test
    try{
      fakePlayer.loadSongs();
      fail("RuntimeException was not thrown");
    }
    catch(RuntimeException re){
      System.out.println("The expected RuntimeException was thrown.");      
    }

    //did all of our mock methods get called?
    mockControl.verify();
  }




  public void testMultipleCalls() {
    //record behavior
    fakePlayer.loadSongs();
    mockControl.setReturnValue(99);
    fakePlayer.play();
    //exactly once
    mockControl.setReturnValue(99);

    //exactly three times
    //mockControl.setReturnValue(99, 3);

    //between 1 and 3 times
    //mockControl.setReturnValue(99, 1, 3);

    //open ended calls
    //mockControl.setReturnValue(99, MockControl.ONE );
    //mockControl.setReturnValue(99, MockControl.ONE_OR_MORE );
    //mockControl.setReturnValue(99, MockControl.ZERO_OR_MORE );


    //activate the mock
    mockControl.replay();

    //now do your test
    fakePlayer.loadSongs();
    joe.setPlayer(fakePlayer);
    joe.listenToSomeTunes();

    //did all of our mock methods get called?
    mockControl.verify();
  }


  public void testFailAfterThreePlays() {
    //record behavior
    fakePlayer.loadSongs();
    mockControl.setReturnValue(99);
    fakePlayer.play();
    //exactly once
    mockControl.setReturnValue(99, 3);
    mockControl.setThrowable(new RuntimeException("Three complimentary plays used up. Now you have to pay!"));


    //activate the mock
    mockControl.replay();

    //now do your test
    fakePlayer.loadSongs();
    joe.setPlayer(fakePlayer);
    joe.listenToSomeTunes();
    joe.listenToSomeTunes();
    joe.listenToSomeTunes();
    try{
      joe.listenToSomeTunes();
      fail("RuntimeException was not thrown");
    }
    catch(RuntimeException re){
      System.out.println("The expected RuntimeException was thrown.");
    }

    //did all of our mock methods get called?
    mockControl.verify();
  }


}
