package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;
import com.eomcs.pms.handler.MemberHandler;
import com.eomcs.pms.handler.ProjectHandler;
import com.eomcs.pms.handler.TaskHandler;
import com.eomcs.util.Prompt;

public class App {

  public static void main(String[] args) {

    // 각 게시판의 게시글을 담을 메모리(boards 레퍼런스 배열과 size)를 준비한다.
    // new BoardHandler()
    // - BoardHandler가 작업할 때 사용할 변수를 준비한다.
    // - BoardHandler는 게시글을 다루는 작업을 한다.
    MemberHandler memberHandler = new MemberHandler();
    ProjectHandler projectHandler = new ProjectHandler();
    TaskHandler taskHandler = new TaskHandler();
    BoardHandler boardHandler = new BoardHandler();

    while (true) {
      String input = Prompt.inputString("명령> ");

      if (input.equals("exit") || input.equals("quit")) {
        System.out.println("안녕!");
        break;
      } else if (input.equals("/member/add")) {
        memberHandler.add();

      } else if (input.equals("/member/list")) {
        memberHandler.list();

      } else if (input.equals("/project/add")) {
        projectHandler.add(memberHandler);

      } else if (input.equals("/project/list")) {
        projectHandler.list();

      } else if (input.equals("/task/add")) {
        taskHandler.add(memberHandler);

      } else if (input.equals("/task/list")) {
        taskHandler.list();

      } else if (input.equals("/board/add")) {
        // BoardHandler의 add()를 실행할 때
        // add()에서 사용할 게시글 배열이 있는 인스턴스 주소를 넘겨준다.
        boardHandler.add();

      } else if (input.equals("/board/list")) {
        // BoardHandler의 list()를 실행할 때
        // list()에서 사용할 게시글 배열이 있는 인스턴스 주소를 넘겨준다.
        boardHandler.list();

      } else {
        System.out.println("실행할 수 없는 명령입니다.");
      }
      System.out.println();
    }

    // Prompt 가 소유하고 관리하고 있는 자원을 닫으라고 명령한다.
    Prompt.close();
  }
}
