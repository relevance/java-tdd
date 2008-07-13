package testng.learning;

import static org.junit.Assert.*;
import org.apache.commons.lang.StringUtils;
import org.testng.annotations.Test;

/**
 * Uses the @Test annotation at the class level, instead of per-method.
 */
@Test
public class StringUtilsTest {
  public void testIdenticalStringDistance() {
    assertEquals(0, StringUtils.getLevenshteinDistance("foo", "foo"));
  }

  public void testSingleChararcterSubstitutionDistance() {
    assertEquals(1, StringUtils.getLevenshteinDistance("fire", "fine"));
  }

  public void testPairInversionDistance() {
    assertEquals(2, StringUtils.getLevenshteinDistance("the", "hte"));
  }
}
