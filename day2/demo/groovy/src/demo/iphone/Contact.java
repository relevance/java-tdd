package demo.iphone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Contact {
  private String name;
  private List phoneNumbers;
  private List addresses;

  public Contact(String name){
    this.name = name;
    phoneNumbers = new ArrayList();
    addresses = new ArrayList();
  }

  public String getName() {
    return name;
  }

  public List getPhoneNumbers() {
    return Collections.unmodifiableList(phoneNumbers);
  }

  public Contact addPhoneNumber(String label, String digits){    
    phoneNumbers.add(new PhoneNumber(label, digits));
    return this;
  }

  public List getAddresses() {
    return Collections.unmodifiableList(addresses);
  }

  public Contact addAddress(String label, String street, String city, String state, String zipcode){
    Address address = new Address();
    address.setLabel(label);
    address.setStreet(street);
    address.setCity(city);
    address.setState(state);
    address.setZipcode(zipcode);    
    addresses.add(address);
    return this;
  }
}
