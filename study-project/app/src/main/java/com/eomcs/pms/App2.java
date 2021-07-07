package com.eomcs.pms;

public class App2 {

  public static void main(String[] args) {

    java.util.Scanner sc = new java.util.Scanner(System.in);

    System.out.println("[프로젝트]");

    System.out.print("번호? ");
    String n1 = sc.nextLine();

    System.out.print("프로젝트명? ");
    String n2 = sc.nextLine();

    System.out.print("내용? ");
    String n3 = sc.nextLine();

    System.out.print("시작일? ");
    String n4 = sc.nextLine();

    System.out.print("종료일? ");
    String n5 = sc.nextLine();

    System.out.print("만든이? ");
    String n6 = sc.nextLine();

    System.out.print("팀원? ");
    String n7 = sc.nextLine();

    System.out.println("--------------------");

    System.out.printf("번호: %s\n", n1);

    System.out.printf("프로젝트명: %s\n", n2);

    System.out.printf("내용: %s\n", n3);

    System.out.printf("시작일: %s\n", n4);

    System.out.printf("종료일: %s\n", n5);

    System.out.printf("만든이: %s\n", n6);

    System.out.printf("팀원: %s\n", n7);
  }
}