package demo.iphone;

import junit.framework.TestCase;

public class ContactTest extends TestCase {
  private Contact contact;

  protected void setUp() throws Exception {
    super.setUp();
    contact = new Contact("John Doe");
  }

  public void testContact(){
    String expected = "John Doe";
    assertEquals(expected, contact.getName());
  }

  public void testAddPhoneNumber(){
    contact.addPhoneNumber("home", "303-555-1212");
    assertEquals(1, contact.getPhoneNumbers().size());
  }

}
