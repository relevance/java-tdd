package groovy.family

import examples.family.Person

class PersonTest extends GroovyTestCase {
  public testFullName() {
    def john = new Person(firstName: "John", lastName: "Doe")
    assertEquals("John Doe", john.fullName)
  }
}