package demo.iphone;

import junit.framework.TestCase;

import java.util.List;

public class IPhoneTest extends TestCase {
  private IPhone iPhone;

  protected void setUp() throws Exception {
    super.setUp();
    iPhone = new IPhone();
  }

  public void testEmptyPhone(){
    assertEquals(0, iPhone.getNumberOfContacts());
  }

  public void testLoadContact(){
    int expected = 1;
    int actual = iPhone.loadContact(IPhoneHelperTest.SIMPLE_XML);
    assertEquals(expected,actual);

    List contacts = iPhone.getContacts();
    Contact contact = (Contact) contacts.get(0);
    assertEquals(1, contact.getPhoneNumbers().size());
  }


}
