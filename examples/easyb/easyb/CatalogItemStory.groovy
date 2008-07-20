import examples.CatalogItem;
import examples.ExpiringCatalogItem;

// Don't use this as a template for copy/paste reuse of equality testing.
// It is (1) incomplete, and (2) needs generalization.
scenario "CatalogItem equality comparison", {
  given "two catalog items with the same id and description", {
    item1 = new CatalogItem(id: "X01", description: "rice cereal")
    item2 = new CatalogItem(id: "X01", description: "rice cereal")
  }
  then "they are equal", {
    item1.shouldEqual(item2);
  }
  given "two catalog items with different ids", {
    item1 = new CatalogItem(id: "AAA")
    item2 = new CatalogItem(id: "BBB")
  }
  then "they are not equal", {
    item1.shouldNotEqual(item2);
  }
  given "a catalog item and anything else", {
    item1 = new CatalogItem()
    item2 = new ExpiringCatalogItem()
  }
  then "they are not equal", {
    item1.shouldNotEqual(item2)
  }
  given "two catalog items", {
    item1 = new CatalogItem()
    item2 = new CatalogItem()
  }
  when "their descriptions are equal but not identical", {
    item1.description = new String("foo")
    item2.description = new String("foo")
  }
  then "they are equal", {
    item1.shouldEqual(item2)
  }
}
