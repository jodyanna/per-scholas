package com.perscholas.banking_app;

import java.time.LocalDateTime;

public class Banking {
  protected String bankName = "Joe's Bank";
  protected String bankAddress = "123 Fake Street";

  protected long routingNumber;
  protected long accountNumber;
  protected double balance;

  protected double annualFees = 50.00;
  protected static double interestRate = 0.04;
  protected static final double tax = 0.07; // percent value
  protected static final LocalDateTime dateCreated = LocalDateTime.now();

  public Banking() {}

  public Banking(long routingNumber, long accountNumber, double balance) {
    this.routingNumber = routingNumber;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return this.balance;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    this.balance -= amount;
  }

  @Override
  public String toString() {
    return "";
  }
}
