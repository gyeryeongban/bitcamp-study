package com.eomcs.pms.handler;

import java.util.List;
import com.eomcs.menu.Menu;
import com.eomcs.pms.domain.Member;
import com.eomcs.util.Prompt;

public class AuthLoginHandler implements Command {

  List<Member> memberList;

  static Member loginUser;
  static int userAcessLevel = 0x01; // 처음에는 로그아웃 된 상태이다.

  public static Member getLoginUser() {
    return loginUser;
  }

  public static int getUserAcessLevel() {
    return userAcessLevel;
  }

  public AuthLoginHandler(List<Member> memberList) {
    this.memberList = memberList;
  }

  @Override
  public void execute() {
    System.out.println("[로그인]");

    String email = Prompt.inputString("이메일? ");
    String password = Prompt.inputString("암호? ");

    if (email.equals("root") && password.equals("0000")) {
      Member root = new Member();
      root.setName("관리자");
      root.setEmail("admin@test.com");
      loginUser = root;
      userAcessLevel = Menu.ACCESS_ADMIN | Menu.ACCESS_GENERAL;
      return;
    }

    Member member = findByEmailPassword(email, password);

    if (member == null) {
      System.out.println("이메일과 암호가 일치하는 회원을 찾을 수 없습니다.");
    } else {
      System.out.printf("%s님 환영합니다!\n", member.getName());
      loginUser = member;
      userAcessLevel = Menu.ACCESS_GENERAL;
    }
  }

  private Member findByEmailPassword(String email, String password) {
    for (Member member : memberList) {
      if (member.getEmail().equalsIgnoreCase(email) &&
          member.getPassword().equals(password)) {
        return member;
      }
    }
    return null;
  }

}







