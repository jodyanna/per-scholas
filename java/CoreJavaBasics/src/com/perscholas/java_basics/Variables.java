package com.perscholas.java_basics;

public class Variables {
  public static void main(String[] args) {
    // 1
    int num1 = 1;
    int num2 = 392;
    int s = num1 + num2;
    System.out.println(s);

    // 2
    double d1 = 34.444;
    double d2 = 9999.9999;
    double s2 = d1 + d2;
    System.out.println(s2);

    // 3
    int num3 = 2;
    double d3 = 444.44444;
    double s3 = num3 + d3;
    System.out.println(s3);

    // 4
    int num4 = 4;
    float num5 = 6.0f;
    float q4 = num5 / num4;
    System.out.println(q4);

    // 5
    double d4 = 345.543;
    double d5 = 12121.12121;
    double q5 = d5 / d4;
    System.out.println(q5);
    int q6 = (int) q5;
    System.out.println(q6);

    // 6
    int x = 5;
    int y = 6;
    double q = y / x; // non-floating point division
    System.out.println(q);
    q = (double) y; // the double casting here is redundant
    System.out.println(q);

    // 7
    final float PI = 3.14f;
    int r = 2;
    double area = r * r * PI;
    System.out.println(area);

    // 8
    final float SALES_TAX = 0.07f;
    float coffee = 4.99f;
    float tea = 2.99f;
    float water = 0.00f;
    double subtotal = 3 * coffee + 4 * tea + 2 * water;
    double totalSale = subtotal + subtotal * SALES_TAX;
    System.out.printf("%.2f%n", totalSale);
  }
}
