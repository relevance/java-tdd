package examples.family;

public class Person {
  private String lastName;
  private String firstName;

  public Person() {
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }
}
