package com.eomcs.pms.handler;

public class Stack {
  public Object pop() {
    return this.remove(this.size() - 1);
  }
}
