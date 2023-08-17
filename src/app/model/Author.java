package app.model;

import java.security.InvalidParameterException;

public class Author {

  private String name;

  private String email;

  private char gender;

public Author(
  String name
, String email
, char gender
) {
  this.name = name;
  this.email = email;
  if (gender != 'm' && gender != 'f') {
    throw new InvalidParameterException("Gender must be 'm' for male or 'f' for female.");
  }

  this.gender = gender;
}
  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public char getGender() {
    return gender;
  }

  public String toString() {
    return String.format("Author[name=%s,email=%s,gender=%c]", name, email, gender);
  }

}