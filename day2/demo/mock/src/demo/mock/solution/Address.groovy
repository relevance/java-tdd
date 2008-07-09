package demo.mock.solution

class Address {
  String label
  String street
  String city
  String state
  String zipcode

  String toString(){
    label + ": " + street
  }
}