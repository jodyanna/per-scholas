package com.perscholas.banking_app;

import java.util.Scanner;

public class App {
  private static final Scanner scanner = new Scanner(System.in);
  private static final String appMenu = "0: Log out\n" +
      "1: Checking Account\n" +
      "2: Credit Card\n" +
      "3: Privileges Account\n" +
      "4: Saving Account";
  private static final String accountMenu = "0: Log out of account\n" +
      "1: Deposit\n" +
      "2: Withdraw\n" +
      "3: Show balance";
  private static Banking account;
  private static String userName;
  private static String password;
  private static long ssn = 1234567890;
  private static String userAddress = "321 Fake Street";

  private static long routingNumber;
  private static long accountNumber;
  private static double balance;

  public static void main(String[] args) {
    System.out.println("Welcome to Joe's Banking Application!");
    logIn();
    boolean isLoop = true;

    // infinite loop for app main menu
    while (isLoop) {
      int userChoice = processUserChoice(4, appMenu);

      switch (userChoice) {
        case 0:
          System.out.println("Bye bye!");
          isLoop = false;
          break;
        case 1:
          logInAccount();
          account = new CheckingAccount(routingNumber, accountNumber, balance);
          loopAccount(account);
          break;
        case 2:
          logInAccount();
          account = new CreditCard(routingNumber, accountNumber, balance);
          loopAccount(account);
          break;
        case 3:
          logInAccount();
          account = new PrivilegesAccount(routingNumber, accountNumber, balance);
          loopAccount(account);
          break;
        case 4:
          logInAccount();
          account = new SavingAccount(routingNumber, accountNumber, balance);
          loopAccount(account);
          break;
      }
    }
  }

  private static int processUserChoice(int limit, String menu) {
    int choice = -1;

    while (choice < 0 || choice > limit) {
      System.out.println(menu);
      System.out.println("Enter a number to select option:");
      choice = scanner.nextInt();
      scanner.nextLine();
      if (choice < 0 || choice > limit) System.out.println("Error: Number out of bounds.");
    }

    return choice;
  }

  private static void logIn() {
    System.out.println("Please log in to get started.");
    // Username
    System.out.print("Username: ");
    userName = scanner.nextLine();
    // Password
    System.out.print("Password: ");
    password = scanner.nextLine();
  }

  private static void logInAccount() {
    System.out.println("Please enter account information.");
    // routing number
    System.out.print("Routing number: ");
    routingNumber = scanner.nextLong();
    scanner.nextLine();
    // account number
    System.out.print("Account number: ");
    accountNumber = scanner.nextLong();
    scanner.nextLine();
    // account balance
    System.out.print("Account balance: ");
    balance = scanner.nextDouble();
    scanner.nextLine();
  }

  private static void loopAccount(Banking account) {
    boolean isLoop = true;

    while (isLoop) {
      int userChoice = processUserChoice(3, accountMenu);
      double amount;

      switch (userChoice) {
        case 0:
          isLoop = false;
          break;
        case 1:
          System.out.print("Enter amount to deposit: ");
          amount = scanner.nextDouble();
          scanner.nextLine();
          account.deposit(amount);
          break;
        case 2:
          System.out.print("Enter amount to withdraw: ");
          amount = scanner.nextDouble();
          scanner.nextLine();
          account.withdraw(amount);
          break;
        case 3:
          System.out.println("Current balance: $" + account.getBalance());
          break;
      }
    }
  }
}
