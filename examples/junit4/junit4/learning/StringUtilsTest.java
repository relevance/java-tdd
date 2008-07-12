package junit4.learning;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang.StringUtils;

public class StringUtilsTest {
  @Test
  public void testIdenticalStringDistance() {
    assertEquals(0, StringUtils.getLevenshteinDistance("foo", "foo"));
  }

  @Test
  public void testSingleChararcterSubstitutionDistance() {
    assertEquals(1, StringUtils.getLevenshteinDistance("fire", "fine"));
  }

  @Test
  public void testPairInversionDistance() {
    assertEquals(2, StringUtils.getLevenshteinDistance("the", "hte"));
  }
}
