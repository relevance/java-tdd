package demo.bookstore;

import java.util.List;
import java.util.ArrayList;

public class JavaStore {
  List<Book> books;

  public JavaStore(){
    books = new ArrayList<Book>();
    books.add(new Book("Groovy Recipes"));
    books.add(new Book("Groovy in Action"));
  }

  public String list(){
    StringBuffer out = new StringBuffer();
    for (Book book : books) {
      out.append(book.getTitle() + ", ");
    }

    return out.toString().substring(0,out.length()-1);
  }
}
