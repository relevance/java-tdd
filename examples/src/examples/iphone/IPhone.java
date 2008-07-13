package examples.iphone;


import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IPhone {
  List contacts;

  public IPhone() {
    contacts = new ArrayList();
  }

  public List getContacts(){
    return Collections.unmodifiableList(contacts);
  }

  public int getNumberOfContacts() {
    return contacts.size();
  }

  public int loadContact(String xml) {
    try {
      SAXBuilder builder = new SAXBuilder();
      Document doc = builder.build(new StringReader(xml));
      Element contactElement = doc.getRootElement();
      List phoneNumbers = contactElement.getChildren("phoneNumber");
      List addresses = contactElement.getChildren("address");

      Contact contact = new Contact(contactElement.getAttributeValue("name"));
      for (Iterator iterator = phoneNumbers.iterator(); iterator.hasNext();) {
        Element phoneElement = (Element) iterator.next();
        contact.addPhoneNumber(phoneElement.getAttributeValue("label"), phoneElement.getText());
      }

      for (Iterator iterator = addresses.iterator(); iterator.hasNext();) {
        Element addressElement = (Element) iterator.next();
        String label = addressElement.getAttributeValue("label");
        String street = addressElement.getChild("street").getText();
        String city = addressElement.getChild("city").getText();
        String state = addressElement.getChild("state").getText();
        String zipcode = addressElement.getChild("zipcode").getText();
        contact.addAddress(label, street, city, state, zipcode);
      }

      contacts.add(contact);

    } catch (JDOMException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return getNumberOfContacts();
  }
}
