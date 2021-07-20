package com.eomcs.oop.ex00;

public class Exam0501 {

  static class Calculator {
    int result = 0;


    static void plus(Calculator obj, int value) {
      result += value;
    }

    static void minus(Calculator obj, int value) {
      result -= value;
    }

    static void multiple(Calculator obj, int value) {
      result *= value;
    }

    static void divide(Calculator obj, int value) {
      result /= value;
    }

  }

  public static void main(String[] args) {
    // 다음 식을 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 식1) 2 + 3 - 1 * 7 / 3 = ?
    // 식2) 3 * 2 + 7 / 4 - 5 = ?

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    // 계산 결과를 담을 변수를 준비한다.

    // 메서드를 호출하여 작업을 수행하고,
    // 리턴 결과는 로컬 변수에 저장한다.
    Calculator.plus(c1, 2);
    Calculator.plus(c2, 3);

    Calculator.plus(c1, 3);
    Calculator.multiple(c2, 2);

    Calculator.minus(c1, 1);
    Calculator.plus(c2, 7);

    Calculator.multiple(c1, 7);
    Calculator.divide(c2, 4);

    Calculator.divide(c1, 3);
    Calculator.minus(c2, 5);


    System.out.printf("result = %d\n", Calculator.result);
  }

}
