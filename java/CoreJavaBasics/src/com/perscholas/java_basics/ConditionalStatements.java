package com.perscholas.java_basics;

import java.util.Scanner;

public class ConditionalStatements {
  public static void main(String[] args) {
    problemOne();
    problemTwo();
    problemThree();
    problemFour();
    problemFive();
    problemSix();
  }

  static void problemOne() {
    int x = 15;
    if (x < 10) {
      System.out.println("Less than 10");
    }
  }

  static void problemTwo() {
    int x = 7;
    if (x < 10) {
      System.out.println("Less than 10");
    } else if (x > 10) {
      System.out.println("Greater than 10");
    }
  }

  static void problemThree() {
    int x = 50;
    if (x < 10) {
      System.out.println("Less than 10");
    } else if (x < 20) {
      System.out.println("Between 10 and 20");
    } else {
      System.out.println("Greater than or equal to 20");
    }
  }

  static void problemFour() {
    int x = 5;
    if (x < 10 || x > 20) {
      System.out.println("Out of range");
    } else {
      System.out.println("In range");
    }
  }

  static void problemFive() {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter score:");
    int score = myScanner.nextInt();

    if (score < 0 || score > 100) {
      System.out.println("Score out of range");
    } else if (score < 60) {
      System.out.println("F");
    } else if (score < 70) {
      System.out.println("D");
    } else if (score < 80) {
      System.out.println("C");
    } else if (score < 90) {
      System.out.println("B");
    } else {
      System.out.println("A");
    }
  }

  static void problemSix() {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter number 1-7:");
    int day = myScanner.nextInt();

    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Out of range");
        break;
    }
  }
}
