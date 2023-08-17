package app;

import test.model.AuthorTest;
import test.model.BookTest;
import test.model.StaffTest;
import test.model.StudentTest;

public class App {
  public static void main(String[] args) {
    new AuthorTest().test();
    new BookTest().test();
    new StaffTest().test();
    new StudentTest().test();
  }
}