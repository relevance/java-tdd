package examples;

public class CatalogItem {
  private String id;
  private String description;

  public boolean equals(Object o) {
    if (o.getClass() != this.getClass()) return false;
    CatalogItem other = (CatalogItem) o;
    return (this.id.equals(other.id)) && (this.description.equals(other.description));
  }

  public int hashCode() {
    return id.hashCode();
  }
}
