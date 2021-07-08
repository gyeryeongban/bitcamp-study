package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    System.out.println("[작업]");

    Scanner keyboardScan = new Scanner(System.in);

    final int MAX = 3;

    String[] project = new String[MAX];
    int[] no =new int[MAX];
    String[] content = new String[MAX];
    Date[] deadline = new Date[MAX];
    int[] status = new int[MAX];
    String[] owner = new String[MAX];

    int size = 0;

    for (int i = 0; i < MAX; i++) {
      System.out.print("프로젝트? ");
      project[i] = keyboardScan.nextLine();

      System.out.print("번호? ");
      no[i] = Integer.parseInt(keyboardScan.nextLine());

      System.out.print("내용? ");
      content[i] = keyboardScan.nextLine();

      System.out.print("마감일? ");
      deadline[i] = Date.valueOf(keyboardScan.nextLine());

      System.out.println("상태?");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print("> ");
      status[i] = Integer.valueOf(keyboardScan.nextLine());

      System.out.print("담당자? ");
      owner[i] = keyboardScan.nextLine();

      size++;
      System.out.println();

      System.out.print("계속 입력하시겠습니까? (Y/n) ");
      String input = keyboardScan.nextLine();
      if (!input.equalsIgnoreCase("Y")) {
        break;
      }
    }

    keyboardScan.close();

    System.out.println("--------------------------------");

    for (int i = 0; i < size; i++) {
      System.out.printf("%s, %d, %s, %s",
          project[i], no[i], content[i], deadline[i]);

      String statusInput = null;
      switch (status[i]) {
        case 1:
          statusInput = "진행중";
          break;
        case 2:
          statusInput = "완료";
          break;
        default:
          statusInput = "신규";
          break;
      }
      System.out.printf(", %s, %s", statusInput, owner[i]);
    }

  }

}
