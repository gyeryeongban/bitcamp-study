package com.eomcs.pms.handler;

import java.sql.Date;

import com.eomcs.pms.domain.Member;
import com.eomcs.pms.util.Prompt;

public class MemberHandler {
	
	  static final int MAX_LENGTH = 5;
	  
	  // 입력 값을 배열에 담기 위해 선언
	  static Member[] members = new Member[MAX_LENGTH];

	  
	  static int size = 0;
	  
	  public static void add() {
		    System.out.println("[회원 등록]");

		    // 주소 생성
		    Member member = new Member();
		    //    String input = prompt("번호? ");
		    //    no[size] = Integer.parseInt(input);

		    member.no = Prompt.inputInt("번호? ");
		    member.name = Prompt.inputString("이름? ");
		    member.email = Prompt.inputString("이메일? ");
		    member.password = Prompt.inputString("암호? ");
		    member.photo = Prompt.inputString("사진? ");
		    member.tel = Prompt.inputString("전화? ");
		    member.registeredDate = new Date(System.currentTimeMillis());

		    members[size++] = member;
		  }

	  public static void list() {
		    System.out.println("[회원 목록]");
		    for (int i = 0; i < size; i++) {
		      // 번호, 이름, 이메일, 전화, 가입일
		      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
		    		  members[i].no,
		    		  members[i].name,
		    		  members[i].email,
		    		  members[i].tel,
		    		  members[i].registeredDate);
		    }
		  }
}
