package com.eomcs.quiz;

public class Test {

  public static int divisorsPairs(int[] sequence) {

    int size = 0;

    for (int i = 0; i < sequence.length; i++) {
      for (int j = i; j < sequence.length; j++) {
        if (sequence[i] % sequence[j] == 0 || sequence[j] % sequence[i] == 0) {
          System.out.printf("%d <--> %d\n", sequence[i], sequence[j]);
          size++;
        }
      }
    }
    return size;
  }

  public static void main(String[] args) {
    int[] values = {8, 4, 2, 3, 6, 10, 5};
    System.out.println(divisorsPairs(values));

  }

}
