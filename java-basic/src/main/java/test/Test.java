package com.eomcs;

public class Test {
  public static void main(String[] args) {
    int no = 100;
    String name = "aaa";

    Member b = new Member();
    b.no = 100;
    b.name = "aaa";

    /*
    레퍼런스 변수 선언
    변수 타입으로 클래스 이름을 사용
    클래스 이름 => 변수 타입이 됨
    새로운 클래스 작성 => 새로운 참조형 추가
    객체를 생성하는 연산자 new의 결과 => 생성된 객체의 주소
    레퍼런스 변수를 통해 생성된 객체 사용 가능
     */

    Member[] arr = new Member[3];

    arr[0] = new Member();
    arr[0].no = 100;

    int n1, n2, n3;
    Member m1, m2, m3;

    m1 = new Member();
    m1.no = 100;

    Member m4 = new Member();
    m4.no = 200;
  }
}
