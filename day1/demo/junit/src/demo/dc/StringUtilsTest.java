package demo.dc;

import junit.framework.TestCase;
import org.apache.commons.lang.StringUtils;

public class StringUtilsTest extends TestCase{

  public void testAbbreviate(){
    String s = "I'm getting hungry";
    //note to self: this includes the ...
    int num = 10;
    String expected = "I'm get...";
    assertEquals(expected, StringUtils.abbreviate(s,num));

  }

}
