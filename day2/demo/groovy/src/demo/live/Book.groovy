package demo.live
class Book {
  String title;
  String author
  Integer pages

  Book(String title){
    this.title = title
  }

  String toString(){
    "${title} by ${author}"
  }

}