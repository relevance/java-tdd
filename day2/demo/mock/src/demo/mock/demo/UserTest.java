package demo.mock.demo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.easymock.EasyMock.*;


public class UserTest {

  @Test
  public void testListenToTunes(){
    Player ipod = createMock(Player.class);
    User joe = new User(ipod);

    expect(ipod.play()).andReturn(3);
    replay(ipod);


    assertEquals(4,joe.listenToSomeTunes());
  }

}
