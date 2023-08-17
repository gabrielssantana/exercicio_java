package test.model;

import app.model.Author;
import test.interfaces.ITest;

public class AuthorTest implements ITest {

  @Override
  public void test() {
    System.out.println("#### Starting AuthorTest ####");
    Author author = new Author(
      "Gabriel"
      , "gabriel.s.santana00@gmail.com"
      , 'm'
    );

    System.out.println(String.format("toString(): %s", author.toString()));
    author.setEmail("gabs@gmail.com");
    System.out.println(String.format("getName(): %s", author.getName()));
    System.out.println(String.format("getEmail(): %s", author.getEmail()));
    System.out.println(String.format("getGender(): %s", author.getGender()));
    System.out.println("#### Finishing AuthorTest ####");
    System.out.println();
    }
}