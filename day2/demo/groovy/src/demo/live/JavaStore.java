package demo.live;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class JavaStore {
  List<Book> books;

  public JavaStore(){
    books = new ArrayList<Book>();
    books.add(new Book("Groovy Recipes"));
    books.add(new Book("Groovy in Action"));
  }


  public void print(){
    for (Book book : books) {
      System.out.println(book);
    }

  }

}
