package com.eomcs.pms;

import com.eomcs.pms.handler.BoardHandler;

public class BoardAddMenu extends Menu {
    BoardHandler boardHandler;

    public BoardAddMenu(BoardHandler boardHandler) {
        super("등록");
        this.boardHandler = boardHandler;
    }

    @Override
    public void execute() {
        boardHandler.add();
    }
}
