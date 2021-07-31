package com.perscholas.java_basics;

import java.util.Arrays;

public class Arrayz {
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
    problemTen();
  }

  static void problemOne() {
    int[] array = {1, 2, 3};

    for (int num : array) System.out.println(num);
  }

  static void problemTwo() {
    int[] array = {13, 5, 7, 68, 2};
    int middleIndex = array.length / 2;

    System.out.println(array[middleIndex]);
  }

  static void problemThree() {
    String[] colors = {"red", "green", "blue", "yellow"};
    System.out.println(colors.length);

    String[] colorsClone = colors.clone();
    System.out.println(Arrays.toString(colorsClone));
  }

  static void problemFour() {
    int[] array = {1, 2, 3, 4, 5};
    System.out.println(array[0]);
    System.out.println(array[array.length - 1]);
    System.out.println(array[array.length]); // ArrayIndexOutOfBoundsException
    System.out.println(array[5]); // ArrayIndexOutOfBoundsException
  }

  static void problemFive() {
    int[] array = new int[5];

    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }

    System.out.println(Arrays.toString(array));
  }

  static void problemSix() {
    int[] array = new int[5];

    for (int i = 0; i < array.length; i++) {
      array[i] = i * 2;
    }

    System.out.println(Arrays.toString(array));
  }

  static void problemSeven() {
    int[] array = {1, 2, 3, 4, 5};

    for (int i = 0; i < array.length; i++) {
      if (i == array.length / 2) continue;
      else System.out.println(array[i]);
    }
  }

  static void problemEight() {
    String[] array = {"blah", "bloo", "blee", "bli", "blargh"};

    // store first element in temp
    String temp = array[0];
    // Perform swap
    array[0] = array[4];
    array[4] = temp;

    System.out.println(Arrays.toString(array));
  }

  static void problemNine() {
    int[] array = {4, 2, 9, 13, 1, 0};
    Arrays.sort(array);

    System.out.println(Arrays.toString(array));
    System.out.println(array[0]);
    System.out.println(array[array.length - 1]);
  }

  static void problemTen() {
    Object[] obj = {1, "Blah", "Bloo", "Blee", 3444.44};

    System.out.println(Arrays.toString(obj));
  }
}
