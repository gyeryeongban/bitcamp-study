package com.eomcs.pms;

public class App {
  public static void main(String[] args) {

    java.util.Scanner sc = new java.util.Scanner(System.in);
    java.util.Date registeredDate = new java.util.Date();

    System.out.println("[회원]");

    System.out.print("번호? ");
    String no = sc.nextLine(); // 키보드에 남아 있는 찌꺼기 엔터 코드 제거

    System.out.print("이름? ");
    String name = sc.nextLine();

    System.out.print("이메일? ");
    String email = sc.nextLine();

    System.out.print("암호? ");
    String password = sc.nextLine();

    System.out.print("사진? ");
    String photo = sc.nextLine();

    System.out.print("전화? ");
    String tel = sc.nextLine();

    // 현재 시간 출력
    // new java.sql.Date(System.currentTimeMillis());

    System.out.println("--------------------");

    System.out.printf("번호: %s\n", no);

    System.out.printf("이름: %s\n", name);

    System.out.printf("이메일: %s\n", email);

    System.out.printf("암호: %s\n", password);

    System.out.printf("사진: %s\n", photo);

    System.out.printf("전화: %s\n", tel);

    System.out.printf("가입일: %1$tY-%1$tm-%1$td\n", registeredDate);
  }
}
