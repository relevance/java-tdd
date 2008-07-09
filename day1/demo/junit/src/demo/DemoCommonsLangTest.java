package demo;

import junit.framework.TestCase;
import junit.framework.Assert;
import org.apache.commons.lang.StringUtils;


public class DemoCommonsLangTest extends TestCase {

  public void testAbbreviate(){

    String test = "Hi there";
    String expected = "Hi...";
    Assert.assertEquals(expected, StringUtils.abbreviate(test, 4));


  }

}
