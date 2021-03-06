//# 콘솔로 출력하기 II - 특정 형식을 갖춘 문자열 안에 값을 삽입하여 출력하기
//System.out.printf

<1>
//Q:  형식을 지정하지 않으면 print()와 같다. (줄바꿈 이스케이프 문자 넣기) 
//	result: Welcome to hell!

A: System.out.printf("Welcome to hell!\n");

<2>
//Q:  ?? : 지정한 자리에 문자열을 삽입한다. ??의 답과 출력될 값을 입력하세요.
//       (??, 줄바꿈 이스케이프 문자 넣기)
//	result: 파워레인저 오렌지: 송다예
//	        안녕하세요! 오렌지입니다.

A: %s
   System.out.print("파워레인저 %s: 송다예\n");
   System.out.print("안녕하세요! "%s"입니다.");

<3>
// ?1 : 정수 값을 10진수 문자열로 만들어 삽입한다.
// ?2 : 정수 값을 16진수 문자열로 만들어 삽입한다.
// ?3 : 정수 값을 문자로 만들어 삽입한다.
// ?4 : true/false 값을 문자열로 만들어 삽입한다.
// Q: System.out.printf("?1 ?2 ?3 ?4", 87, 86, 73, false); 	
// ?1~4에 들어갈 이스케이프 문자(줄바꿈 포함)와 출력될 값을 입력하세요.	

A: System.out.printf("%d %x %c %b\n", 87, 86, 73, false);
   87 56 I false

<4>
// 한 개의 값을 여러 곳에 삽입할 수 있다.
// ?[??]? 제어문
// Q:  System.out.printf("?? ??", 96, 71);
//	result: 71, 60
	?? ??의 답을 입력하세요!

A: System.out.printf("%2$d %1$x", 96, 71);

<5>
// 값을 삽입할 때 사용할 공간을 지정할 수 있다.
// 문자열을 삽입할 때: 
//   %[-][사용할공간너비]? : -는 왼쪽 정렬이다. 안 붙이면 기본 오른쪽 정렬이다.
//   Q: 사용할 공간 너비는 12다. ?1~4에 들어갈 문자(줄바꿈 문자 포함)와 출력될 값을 입력하세요.
	System.out.printf("'?3' '?4", 54321, 54321);
	System.out.printf("'?1' '?2'", "하선영", "김진현");

A: System.out.printf("'%-12s' '%12s'\n", 54321, 54321);
   System.out.printf("'%-12s' '%12s'\n", "하선영", "김진현");

<6>
// 정수를 삽입할 때:
//   %[0][사용할공간너비]? : 앞의 빈자리는 0으로 채운다.
//   %[+][0][사용할공간너비]? : +는 숫자 앞에 부호를 붙인다.
//   Q: 사용할 공간 너비는 11이다. ?1~4에 들어갈 문자(줄바꿈 문자 포함)와 출력될 값을 입력하세요.
	 System.out.printf("'?1' '?2", 384, 482);
    	 System.out.printf("'?3' '?4'", 546, -12345);

A: System.out.printf("'%011d' '%+011d'\n", 384, 482);
   System.out.printf("'%011d' '%+011d'\n", 546, -12345);