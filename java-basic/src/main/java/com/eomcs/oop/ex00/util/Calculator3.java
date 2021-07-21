package com.eomcs.oop.ex00.util;

public class Calculator3 {
  static class Calculator {
    int result = 0;

    void plus(int value) {
      this.result += value;
    }

    void minus(int value) {
      this.result -= value;
    }

    void multiple(int value) {
      this.result *= value;
    }

    void divide(int value) {
      this.result /= value;
    }
  }
}
