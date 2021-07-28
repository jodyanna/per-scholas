package com.perscholas.java_basics;

public class OpsAndNums {
  public static void main(String[] args) {
    // 1)
    // 0001
    // 1000
    // 0010 0001
    // 0100 1110
    // 0011 0001 0011
    // 1000 0100 1100 0011

    // 2)
    // 2
    // 9

    // 3)
    int x = 88;
    System.out.println(Integer.toBinaryString(x));
    x = x << 1; // this is equivalent to multiplying by 2
    // 4 18 34 176
    System.out.println(x);

    // 4)
    x = 32456;
    System.out.println("10010110");
    x = x >> 2;
    // 37 56 388 8114
    System.out.println(x);
  }
}
