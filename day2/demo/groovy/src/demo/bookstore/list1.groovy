def booklist = new groovy.util.XmlSlurper().parse("books.xml")
booklist.book.each{book->
  println book.@title
}  