package test.model;

import java.util.Arrays;

import app.model.Author;
import app.model.Book;
import test.interfaces.ITest;

public class BookTest implements ITest{

  @Override
  public void test() {
    System.out.println("#### Starting BookTest ####");
    Author[] authors = new Author[2];
    authors[0] = new Author(
      "Gabriel"
      , "gabriel.s.santana00@gmail.com"
      , 'm'
    );
    authors[1] = new Author(
      "Gabriela"
      , "gabriela@gmail.com"
      , 'f'
    );
    Book book = new Book(
        "Java Programming"
        , authors
        , 10
        , 1
    );
    System.out.println(String.format("toString(): %s", book.toString()));
    book.setPrice(29.99);
    book.setQty(3);
    for (int i = 0; i < authors.length; i++) {
      System.out.println(String.format("Book.authors[%d].toString(): %s", i, authors[i].toString()));
    }

    System.out.println(String.format("getAuthorNames(): %s", book.getAuthorNames()));
    System.out.println(String.format("getName(): %s", book.getName()));
    System.out.println(String.format("getPrice(): %s", book.getPrice()));
    System.out.println(String.format("getQty(): %s", book.getQty()));
    System.out.println("#### Finishing BookTest ####");
    System.out.println();
  }

}