package demo;

import junit.framework.TestCase;
import org.apache.commons.lang.StringUtils;

public class CommonsLangTest extends TestCase {

  public void testAbbreviate(){
    String full = "I'm learning TDD";
    String actual = StringUtils.abbreviate(full, 8);
    String expected = "I'm l...";
    assertEquals(expected, actual);
  }

}
