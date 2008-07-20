package groovy.family

class FamilyTest extends GroovyTestCase {
  public void testChildren() {
    def builder = new ObjectGraphBuilder();
    builder.classNameResolver = {name ->
      //switch is not an expession. Grr.
      switch (name) {
        case "parent":
        case "child":
          return "examples.family.Person"
        case "family":
          return "examples.family.Family"
      }
    }
    builder.childPropertySetter = { owner, value, ownerName, valueName ->
      if( valueName == "parents" ){  
         owner.parents << value
      }
    }
    def family = builder.family {
      parent(firstName: "John", lastName: "Doe")
      parent(firstName: "Jane", lastName: "Doe")
    }
    assertEquals(2, family.parents.size)
    assertEquals("Doe", family.parents[0].lastName);
    // TODO: some set-based assertions
  }
}