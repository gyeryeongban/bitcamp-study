package com.eomcs.pms;

public class App3 {

  public static void main (String[] args) {

    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.println("[작업]");

    System.out.print("프로젝트? ");
    String n1 = sc.nextLine();

    System.out.print("번호? ");
    String n2 = sc.nextLine();

    System.out.print("내용? ");
    String n3 = sc.nextLine();

    System.out.print("완료일? ");
    String n4 = sc.nextLine();

    System.out.print("상태? ");
    String n5 = sc.nextLine();

    System.out.println("0: 신규");

    System.out.println("1: 진행중");

    System.out.println("2: 완료");

    System.out.print("담당자? ");
    String n6 = sc.nextLine();

    System.out.println("--------------------");

    System.out.printf("프로젝트: %s\n", n1);

    System.out.printf("번호: %s\n", n2);

    System.out.printf("내용: %s\n", n3);

    System.out.printf("완료일: %s\n", n4);

    System.out.printf("상태: %s\n", n5);

    System.out.printf("담당자: %s\n", n6);
  }
}
