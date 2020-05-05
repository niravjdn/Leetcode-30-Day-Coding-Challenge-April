package com.cc.leetcode;

import java.util.Stack;


// Min Stack
class MinStack {
  private Stack<Integer> stack = new Stack<>();
  // bug - 1 => record mins till now;
  // could easily be generalized to getMax in O(1);
  private Stack<Integer> minStack = new Stack<>();

  public MinStack() {
      minStack.push(Integer.MAX_VALUE);
  }

  public void push(int x) {
    stack.push(x);
    // bug - 2 => ensure once number equal to min popped out, min can always be easily removed too;
    if (x <= minStack.peek())
      minStack.push(x);
  }

  public void pop() {
    // bug - 2 => using `equals()` instead of `==` as long as it's not primitive;
    if (stack.pop().equals(minStack.peek()))
      minStack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }
}
