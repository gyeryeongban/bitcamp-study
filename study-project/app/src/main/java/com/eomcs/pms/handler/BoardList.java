package com.eomcs.pms.handler;

import com.eomcs.pms.domain.Board;

public class BoardList extends ArrayList {

  public Board findByNo(int no) {
    for (int i = 0; i < this.size; i++) {
      Board board = (Board) list[i];
      if (board.no == no) {
        return board;
      }
    }
    return null;
  }
}








