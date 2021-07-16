0706 막간 테스트
[부동소수점]+[문자 리터럴]

Q1: 32bit IEEE 754 부동소수점은 크게 1,B,C 3부분으로 나눠져 있다.
각 부분의 크기는 A = 1bit, B = 8bit, C = 23bit다. 
A, B, C 각 부분을 기술하세요.

A1: A=부호 비트
    B=지수부
    C=가수부


Q2 (Q1 cont.): 2진수 정규화로 표현한 [ 1.100011 * 2^3 ]에서 
    B와 C 부분은 어디인지 기술하세요.

A2: B=3
    C=0.100011

Q3 (Q1 cont.): 부동소수점 정규화 과정에서 C에 적용되는 규칙과 
    B에 적용되는 방식을 기술하세요.
    (B에 적용되는 방식은 영어/한글 모두 입력)

A3: C= sign-magnitude/부호 절대값
    B= Excess-K

Q4: 정규화 예시) 다음의 값을 정규화하여 
    소수점 왼쪽에 숫자 하나만 남도록 표현해보세요.
    1) 384.4698
    2) 0.007965

A4: 1) 3.844698*10^2
    2) 0.007965*10^-3

Q5: 부동소수점은 IEEE 754 규칙에 따라 2진수로 변환하기 때문에
    소수점 이상/이하 자릿수를 명시할 수 있다. (True/False)

A5: False


Q6: EUC-KR과 MS949(CP949)는 국제표준이 아니다. (True/False)


A6: False

Q7: 문자를 2진수로 바꾸는 규칙, 문자 집합을 의미하는 용어는?
    1) Instruction set
    2) Character set
    3) Character code
    4) Universal code
    5) Juri code

A8: 2


Q8: 명령어에 따라 그림을 그려 크기를 늘려도 계단 현상이 
    발생하지 않는 폰트 유형은?

A7: Vector Font



Q9: 부동소수점 (floating point)은 
    A의 위치를 움직인다고 해서 지어진 명칭이다.
    A는 무엇인가?

A9: 소수점


Q10: 모든 값이 3.14로 출력되도록 System.out.println 문장을 완성하라.
    Exponential 기호는 모두 e로 통일한다. A~D의 답을 쓰세요.

    1) 10진수 표기법 : System.out.println(A);
    2) System.out.println(0.00314B);
    3) System.out.println(0.314C);
    4) System.out.println(314D);


A10:1) 3.14
    2) e3
    3) e1
    4) e-2

Q11: 모든 값이 3.14로 출력되도록 System.out.println 문장을 완성하라.
    Exponential 기호는 모두 e로 통일하고 
    메모리 크기별 표기법은 주로 사용되는 소문자로 완성한다.
    (8 바이트 표기법 생략하지 말것)
    @와 #의 답을 쓰세요. 

    1) 4 바이트 크기 부동 소수점 - System.out.println(3.14@);
    2) 8 바이트 크기 부동 소수점 - System.out.println(31.4#);

A11:1) f
    2) e-1d


Q.12: 부동소수점은 정수와 다르게 정확하게 2진수로 변환할 수 없는 경우가 있다. (True/False)


A12: True


[문자의 리터럴]

Q13: 자바는 문자를 메모리에 저장할 때 Unicode 규칙에 따라 * byte 코드로 저장한다.
    * 값은?

A13: 2


Q14: 문자 집합과 문자 코드의 차이를 서술하시오.


A14: 문자 집합 (Character set)은 문자를 2진수로 바꾸는 규칙이며,
문자 코드 (Character code)는 문자에 대해 부여된 값을 의미한다.


Q15: 문자에 부여된 코드 값을 16진수로 적을 때 쓰는 이스케이프 문자는?
        1) \d
        2) \c 
        3) \u 
        4) \U

A15: 3

Q16: 자바는 메모리에 문자를 저장할 때는 'A'를 사용하고, 
        외부로 입출력 할 때는 'B'를 사용한다.
    A와 B의 답을 기술하세요.

A16: A) UCS (국제 문자 집합)
     B) UTF


Q17: 65를 정수가 아닌 문자 코드임을 지정하려 할 때 알맞는
    System.out.println 문장을 기술하세요. (single quotation 제외)

A17: System.out.println((char)65);


Q18: 한글 '가'의 문자코드는 0xAC00이다. '가' 다음 문자 '각'을 출력하는
    System.out.println 문장을 기술하세요.

A18: System.out.println((char)(0xAC00 + 1));


Q19: 문자 코드에 정수 값을 연산하면 일반적인 정수가 된다.
    다음 문장이 '낙'으로 출력될 수 있도록 올바르게 수정하라.
    System.out.println('나' + 1));

A19: System.out.println(char('나') + 1));


Q20: 14.625를 정규화하라. (과정까지 서술할 것)

A20: 14 > 1110
     
     625 * 2 > 1.250 = 1
     1.250 * 2 > 0.500 = 0
     0.500 * 2 > 1.000 = 1

    0.625 > 101

    => 1110.101
    
    2진수 정규화 표현
    1.110101 * 2^3

    Excess-K: 3+127
    가수부 110101 > sign-magnitude

    0(부호비트) + 지수부 + 가수부
    : 0100000101101010 0000000000000000

    >간단하게 표현
    0100 0001 0110 1010 0000 0000 0000 0000

    >0x416A0000





