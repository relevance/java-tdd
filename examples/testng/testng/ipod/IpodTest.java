package testng.ipod;

import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import static org.junit.Assert.assertEquals;

import java.io.PrintStream;
import java.io.File;
import java.io.IOException;

import examples.ipod.after.Ipod;

/**
 * This class differs from a JUnit4 test only in the metadata,
 * using JUnit for the assertions. 
 */
public class IpodTest {
  @Test(groups = {"characterization"})
  public void consoleOutput() throws IOException {
    PrintStream originalOut = System.out;
    try {
      System.setOut(new PrintStream("fixtures/ipod.out.actual"));
      Ipod.main(new String[]{});
      System.out.flush();
    } finally {
      System.setOut(originalOut);
    }
    String actual = FileUtils.readFileToString(new File("fixtures/ipod.out.actual"));
    String expected = FileUtils.readFileToString(new File("fixtures/ipod.out.expected"));
    assertEquals(expected, actual);
  }

  @Test(groups = {"checkintest"})
  public void totalDuration() {
    Ipod ipod = new Ipod();
    assertEquals(714, ipod.totalDuration());
  }

  @Test(groups = {"checkintest"})
  public void testPrettyTimeShort() {
    assertEquals("00:01", Ipod.prettyTime(1));
  }

  @Test(groups = {"checkintest"})
  public void testPrettyTimeLong() {
    assertEquals("01:01", Ipod.prettyTime(61));
  }

}
