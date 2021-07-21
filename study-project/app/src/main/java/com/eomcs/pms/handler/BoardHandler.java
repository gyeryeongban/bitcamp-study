package com.eomcs.pms.handler;

import java.sql.Date;
import com.eomcs.pms.domain.Board;
import com.eomcs.util.Prompt;

public class BoardHandler {
  static final int MAX_LENGTH = 5;
  Board[] boards = new Board[MAX_LENGTH];
  int size = 0;

  //다른 패키지에 있는 App 클래스가 다음 메서드를 호출할 수 있도록 공개한다.
  public static void add(BoardHandler that) {
    System.out.println("[새 게시물]");

    Board board = new Board();

    board.no = Prompt.inputInt("번호? ");
    board.title = Prompt.inputString("제목? ");
    board.content = Prompt.inputString("내용? ");
    board.owner = Prompt.inputString("작성자? ");
    board.registeredDate = new Date(System.currentTimeMillis());

    that.boards[that.size++] = board;
  }
  public static void list(BoardHandler that) {
    System.out.println("[게시물 목록]");
    for (int i = 0; i < that.size; i++) {
      System.out.printf("%d, %s, %s, %s, %d\n",
          that.boards[i].no, 
          that.boards[i].title,  
          that.boards[i].owner,
          that.boards[i].registeredDate,
          that.boards[i].viewCount);
    }
  }
}
