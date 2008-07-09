package demo.iphone;

import junit.framework.TestCase;

public class PhoneNumberTest extends TestCase {
  private PhoneNumber phoneNumber;

  protected void setUp() throws Exception {
    super.setUp();
    phoneNumber = new PhoneNumber("home", "303-555-1212");
  }


  public void testGetLabel(){
    assertEquals("home", phoneNumber.getLabel());
  }

  public void testGetDigits(){
    assertEquals("303-555-1212", phoneNumber.getDigits());
  }

}
