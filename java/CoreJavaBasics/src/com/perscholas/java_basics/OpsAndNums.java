package com.perscholas.java_basics;

public class OpsAndNums {
  public static void main(String[] args) {
    // #1
    // 0001
    // 1000
    // 0010 0001
    // 0100 1110
    // 0011 0001 0011
    // 1000 0100 1100 0011

    // #2
    // 2
    // 9
    // 52
    // 114
    // 543
    // 11367

    // #3
    int x = 88;
    System.out.println(Integer.toBinaryString(x));
    x = x << 1; // this is equivalent to multiplying by 2
    // 4 18 34 176
    System.out.println(x);

    // #4
    x = 32456;
    System.out.println("10010110");
    x = x >> 2;
    // 37 56 388 8114
    System.out.println(x);

    // #5
    x = 7;
    int y = 17;
    // 1
    int z = x & y;
    System.out.println(z);
    // 23
    z = x | y;
    System.out.println(z);

    // #6
    int x1 = 1;
    // 1
    x1++;
    // 2

    // #7
    int num = 1;
    num++;
    System.out.println(num);
    num += 1;
    System.out.println(num);
    ++num;
    System.out.println(num);

    // #8
    x = 5;
    y = 8;
    int sum = x++ + y;
    System.out.println(sum);
  }
}
