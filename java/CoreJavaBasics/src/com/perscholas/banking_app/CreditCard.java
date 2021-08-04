package com.perscholas.banking_app;

public class CreditCard extends Banking {
  public CreditCard(long routingNumber, long accountNumber, double balance) {
    super(routingNumber, accountNumber, balance);
  }

  public void payBalance(double amount) {
    double returnAmount;
    this.balance -= amount;
    if (this.balance < 0) {
      returnAmount = this.balance * -1;
      this.balance = returnAmount;
      System.out.printf("You have overpaid by $%f%n, returned to balance.", returnAmount);
    }
  }
}

