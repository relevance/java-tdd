package demo.commons;

import junit.framework.TestCase;
import org.apache.commons.lang.StringUtils;

public class StringUtilsTest extends TestCase {

  public void testAbbreviate(){
    String test = "You say Hello and I say Goodbye";
    String result = StringUtils.abbreviate(test, 10);
    assertEquals("did I count right?", "You say...", result);
  }
}
