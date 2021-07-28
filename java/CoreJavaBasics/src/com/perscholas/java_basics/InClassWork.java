package com.perscholas.java_basics;

import java.util.Scanner;

// In class work on 7/28
public class InClassWork {
  public static void main(String[] args) {
    makePyramid(5);
    validatePrime();
    checkPalindrome();
  }

  static void makePyramid(int limit) {
    for (int i = 1; i <= limit; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void validatePrime() {
    // Setup
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int num = myScanner.nextInt();
    boolean isPrime = true;

    // Trial division
    for (int i = 2; i <= (int)Math.sqrt(num); i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }

    // Gate numbers lower than 2
    if (num < 2) isPrime = false;

    // 'Return' results
    if (isPrime) {
      System.out.println("It's prime! :)");
    } else {
      System.out.println("Not prime :(");
    }
  }

  static void checkPalindrome() {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter a string:");
    String userInput = myScanner.nextLine();
    boolean isPalindrome = true;

    int j = 0;
    for (int i = userInput.length() - 1; i > 0; i--) {
      if (userInput.charAt(i) != userInput.charAt(j)) {
        isPalindrome = false;
        break;
      }
      j++;
    }

    if (isPalindrome) {
      System.out.println("It is a palindrome! :)");
    } else {
      System.out.println("It is not a palindrome :(");
    }
  }
}
