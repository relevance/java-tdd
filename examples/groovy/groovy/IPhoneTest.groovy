package groovy;

import examples.iphone.*;

class IPhoneTest extends GroovyTestCase{
  public static final String SIMPLE_XML = """
     <contact name="Jane Smith">
        <phoneNumber label="home">212-555-6666</phoneNumber>
     </contact>
  """

  public static final String TWO_PHONE_NUMBER_XML = """
     <contact name="Jane Smith">
        <phoneNumber label="home">212-555-6666</phoneNumber>
        <phoneNumber label="work">212-888-9999</phoneNumber>      
     </contact>
  """

  public static final String XML_WITH_PHONE_AND_ADDRESS = """
     <contact name="Jane Smith">
        <phoneNumber label="home">212-555-6666</phoneNumber>
        <address label="home">
          <street>123 Main St</street>
          <city>Denver</city>
          <state>CO</state>
          <zipcode>80020</zipcode>
        </address>
     </contact>
  """

   void testTwoPhoneNumbers(){
    IPhone iPhone = new IPhone()
    iPhone.loadContact(TWO_PHONE_NUMBER_XML)
    assertEquals(1, iPhone.getNumberOfContacts())

     List contacts = iPhone.getContacts()
    Contact contact = (Contact) contacts.get(0)
    assertEquals(2, contact.getPhoneNumbers().size())
  }

   void testLoadContactWithAddress(){
    IPhone iPhone = new IPhone()
    iPhone.loadContact(XML_WITH_PHONE_AND_ADDRESS) 
    assertEquals(1, iPhone.getNumberOfContacts());

    List contacts = iPhone.getContacts();
    Contact contact = (Contact) contacts.get(0);
    assertEquals(1, contact.getAddresses().size());
  }

  void testParsingXmlWithGroovy(){
    def contact = new XmlSlurper().parseText(SIMPLE_XML)
    String actual =  contact.@name
    assertEquals("Jane Smith", actual)

    String phoneNumber = contact.phoneNumber
    assertEquals("212-555-6666", phoneNumber)

    String label =  contact.phoneNumber.@label
    assertEquals "home", label 
  }

}