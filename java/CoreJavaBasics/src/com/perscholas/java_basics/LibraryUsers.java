package com.perscholas.java_basics;

public class LibraryUsers {
  public static void main(String[] args) {
    KidUser k = new KidUser();

    k.setAge(10);
    k.registerAccount();
    k.setAge(18);
    k.registerAccount();

    k.setBookType("Kids");
    k.requestBook();
    k.setBookType("Fiction");
    k.requestBook();

    AdultUser a = new AdultUser();

    a.setAge(5);
    a.registerAccount();
    a.setAge(23);
    a.registerAccount();

    a.setBookType("Kids");
    a.requestBook();
    a.setBookType("Fiction");
    a.requestBook();
  }
}

interface LibraryUser {
  void registerAccount();
  void requestBook();
}

class KidUser implements LibraryUser {
  protected int age;
  protected String bookType;

  public KidUser() {}

  public KidUser(int age, String bookType) {
    this.age = age;
    this.bookType = bookType;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setBookType(String bookType) {
    this.bookType = bookType;
  }

  public int getAge() {
    return age;
  }

  public String getBookType() {
    return bookType;
  }

  @Override
  public void registerAccount() {
    if (age < 12) {
      System.out.println("You have successfully registered under a Kids Account.");
    }
    else {
      System.out.println("Sorry, age must be less than 12 to register as kid.");
    }
  }

  @Override
  public void requestBook() {
    if (this.bookType.equals("Kids")) {
      System.out.println("Book issued successfully, please return the book within 10 days");
    }
    else {
      System.out.println("Oops, you are allowed to take only kids books");
    }
  }
}

class AdultUser implements LibraryUser {
  protected int age;
  protected String bookType;

  public void setAge(int age) {
    this.age = age;
  }

  public void setBookType(String bookType) {
    this.bookType = bookType;
  }

  public int getAge() {
    return age;
  }

  public String getBookType() {
    return bookType;
  }

  public AdultUser() {}

  public AdultUser(int age, String bookType) {
    this.age = age;
    this.bookType = bookType;
  }

  @Override
  public void registerAccount() {
    if (age > 12) {
      System.out.println("You have successfully registered under an Adult Account");
    }
    else {
      System.out.println("Sorry, age must be greater than 12 to register as an adult");
    }
  }

  @Override
  public void requestBook() {
    if(this.bookType.equals("Fiction")) {
      System.out.println("Book issued successfully, please return the book within 7 days");
    }
    else {
      System.out.println("Oops, you are allowed to take only adult fiction books");
    }
  }
}
