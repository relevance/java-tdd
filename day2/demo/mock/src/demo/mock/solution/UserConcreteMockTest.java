package demo.mock.solution;

import junit.framework.TestCase;

public class UserConcreteMockTest extends TestCase {
  private User joe;

  protected void setUp() throws Exception {
    super.setUp();
    joe = new User();
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

  public void testConcreteMockPhone(){
    Player concreteMock = new PlayerMock(0,15,15);
    joe.setPlayer(concreteMock);
    int actual = joe.listenToSomeTunes();
    assertEquals(15, actual);
  }

  public void testConcreteMockPhoneWithDefaultValues(){
    Player concreteMock = new PlayerMock();
    joe.setPlayer(concreteMock);
    int actual = joe.listenToSomeTunes();
    assertEquals(99, actual);
  }


  public void testConcreteMockPhoneChangingValuesOnTheFly(){
    PlayerMock concreteMock = new PlayerMock();
    joe.setPlayer(concreteMock);
    int actual = joe.listenToSomeTunes();
    assertEquals(99, actual);

    concreteMock.setValue("playResult", 3);
    actual = joe.listenToSomeTunes();
    assertEquals(3, actual);

    concreteMock.reset();
    actual = joe.listenToSomeTunes();
    assertEquals(99, actual);
  }
}
