
package demo.live
class Store {
  List books;

  Store(){
    books = new ArrayList()
    books.add(new Book("Groovy Recipes"))
    books.add(new Book("Pragmatic Unit Testing"))

  }

  void print(){
    books.each{book ->
      println book
    }

  }


}