package com.eomcs.basic.ex10;

public class Exam0110 {
  public static void main(String[] args) {
    long millis = System.currentTimeMillis();
    System.out.println(millis);

    java.sql.Date d = new java.sql.Date(millis);
    // 연-월-일을 문자열로 출력
    System.out.println(d.toString());
    System.out.printf("%tY-%tm-%td\n", d, d, d);
    System.out.printf("%tY-%1$tm-%1$td\n", d);
  }
}
