package com.perscholas.java_basics;

public class Loops {
  public static void main(String[] args) {
    problemOne();
    problemTwo();
    problemThree();
    problemFour();
    problemFive();
    problemSix();
    problemSeven();
    problemEight();
    problemNine();
  }

  static void problemOne() {
    for (int i = 1; i < 11; i++) {
      System.out.println(i);
    }
  }

  static void problemTwo() {
    int i = 0;
    while (i < 101) {
      System.out.println(i);
      i += 10;
    }
  }

  static void problemThree() {
    int i = 1;
    do {
      System.out.println(i);
      i++;
    } while (i < 11);
  }

  static void problemFour() {
    for (int i = 1; i < 101; i++) {
      if (i == 25) continue;
      if (i == 75) continue;
      if (i % 5 == 0) System.out.println(i);
    }
  }

  static void problemFive() {
    for (int i = 1; i < 101; i++) {
      if (i % 5 == 0) System.out.println(i);
      if (i > 50) break;
    }
  }

  static void problemSix() {
    for (int i = 1; i < 3; i++) {
      System.out.println("Week " + i + ":");
      for (int j = 1; j < 6; j++) {
        System.out.println("Day " + j);
      }
    }
  }

  static void problemSeven() {
    for (int i = 10; i < 201; i++) {
      String num = Integer.toString(i);
      boolean isPalindrome = true;

      int j = 0;
      for (int k = num.length() - 1; k > 0; k--) {
        if (num.charAt(k) != num.charAt(j)) {
          isPalindrome = false;
          break;
        }
        j++;
      }

      if (isPalindrome) System.out.println(i);
    }
  }

  static void problemEight() {
    // it's a little janky, but it works!
    int i = 0;
    int prevNum = 1;
    System.out.println(i);
    while (i < 50) {
      int temp = i + prevNum;
      if (temp < 50) System.out.println(temp);
      prevNum = i;
      i = temp;
    }
  }

  static void problemNine() {
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.println("Inner loop: i: " + i + ", j: " + j);
      }
    }
  }
}
