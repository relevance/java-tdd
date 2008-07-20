package examples.family;

import java.util.List;
import java.util.ArrayList;

public class Family {
  private List<Person> parents;
  private List<Person> children;

  public Family() {
    parents = new ArrayList<Person>();
    children = new ArrayList<Person>();
  }

  public Person getParent(int index) {
    return parents.get(index);
  }
	public void setParent(int index, Person element) {
    parents.set(index, element);
  }
  public List<Person> getParents() {
    return parents;
  }

  public List<Person> getChildren() {
    return children;
  }

}
