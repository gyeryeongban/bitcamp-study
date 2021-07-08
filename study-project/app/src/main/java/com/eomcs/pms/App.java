package com.eomcs.pms;

import java.util.Date;
import java.util.Scanner;

//1) 배열 사용 전
//2) 배열 사용 후
//3) 반복문 적용: while 문
//4) 반복문 적용: for 문
//5) 여러 문장에서 반복해서 사용하는 값을 변수에 담아서 사용한다.
//6) 조회용으로만 사용할 변수라면 상수로 선언한다.
//7) 특정 조건에 따라 반복을 멈춘다.
//8) 날짜의 출력 형식을 "yyyy-MM-dd"로 변경한다.

public class App {

  public static void main(String[] args) {
    System.out.println("[회원]");

    // Scanner?
    // 키보드에서 사용자가 입력한 값을 읽어서
    // 문자열이나 정수, 부동소수점 등으로 리턴하는 역할
    Scanner keyboardScan = new Scanner(System.in);

    final int MAX = 3;

    int[] no = new int[MAX];
    String[] name = new String[MAX];
    String[] email = new String[MAX];
    String[] password = new String[MAX];
    String[] photo = new String[MAX];
    String[] tel = new String[MAX];
    Date[] registeredDate = new Date[MAX];

    for (int i = 0; i < MAX; i++) {
      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());
      System.out.print("이름? ");
      name[i] = keyboardScan.nextLine();
      System.out.print("이메일? ");
      email[i] = keyboardScan.nextLine();
      System.out.print("암호? ");
      password[i] = keyboardScan.nextLine();
      System.out.print("사진? ");
      photo[i] = keyboardScan.nextLine();
      System.out.print("전화? ");
      tel[i] = keyboardScan.nextLine();
      registeredDate[i] = new Date();
      System.out.println();

      System.out.print("계속 입력하시겠습니까? (y/N)");
      String answer = keyboardScan.nextLine();
      if (answer.equalsIgnoreCase("N") || answer.equals("")) {
        break;
      }
    }

    // 현재 일시 알아내기
    // System.currentTimeMillis()
    //   - 1970년 1월 1일 0시 0분 0초부터 현재까지 경과된 시간을 밀리초로 리턴한다.
    // new java.sql.Date(밀리초)
    //  - 넘겨 받은 밀리초를 가지고 년,월,일,시,분,초를 계산한다.

    keyboardScan.close(); // 데이터 입출력이 끝났으면 도구를 닫는다.

    System.out.println("--------------------------------");

    //    for (int i = 0; i < MAX; i++) {
    //      System.out.println("번호: " + no[i]);
    //      System.out.println("이름: " + name[i]);
    //      System.out.println("이메일: " + email[i]);
    //      System.out.printf("암호: %s\n", password[i]);
    //      System.out.printf("사진: %s\n", photo[i]);
    //      System.out.printf("전화: %s\n", tel[i]);
    //      System.out.printf("가입일: %s\n", registeredDate);
    //      System.out.println();

    for (int i = 0; i < MAX; i++) {
      System.out.printf("%d, %s, %s, %s, %tY-%5$tm-%5$td\n", 
          no[i],
          name[i],
          email[i],
          tel[i],
          registeredDate[i]);
    }

  }

}
