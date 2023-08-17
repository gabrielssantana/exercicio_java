package app.model;

public class Book {

  private String name;

  private Author[] authors;

  private double price;

  private int qty;

  public Book(String name, Author[] authors, double price) {
    this.name = name;
    this.authors = authors;
    this.price = price;
  }

  public Book(String name, Author[] authors, double price, int qty) {
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public Author[] getAuthors() {
    return authors;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String getAuthorNames() {
    String authorNames = "";
    for (int i = 0; i < authors.length; i++) {
      if (i == authors.length - 1) {
        authorNames += String.format("%s", authors[i].getName());
        break;
      }

      authorNames += String.format("%s,", authors[i].getName());
    }

    return authorNames;
  }

  public String toString() {
    String authorsStr = "";
    for (int i = 0; i < authors.length; i++) {
      if (i == authors.length - 1) {
        authorsStr += String.format("%s", authors[i].toString());
        break;
      }

      authorsStr += String.format("%s,", authors[i].toString());
    }

    return String.format("Book[name=%s,authors=(%s),price=%.2f,qty=%d]", name, authorsStr, price, qty);
  }
}