package demo.iphone

class AddressGroovyTest extends GroovyTestCase{
  void testToString(){
    Address address = new Address(label:"home", street:"123 Main St",
            city:"Denver", state:"CO", zipcode:"12345")

    println address
    assertEquals("home: 123 Main St", address.toString())            
  }

}