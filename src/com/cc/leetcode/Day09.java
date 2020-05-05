package com.cc.leetcode;

import java.util.Stack;

//Backspace String Compare
public class Day09 {
  public boolean backspaceCompare(String S, String T) {
    Stack<Character> stack = new Stack<Character>();

    for (char c : S.toCharArray()) {
      if (c != '#') {
        stack.push(c);
      } else if (!stack.isEmpty()) {
        stack.pop();
      }
    }

    String str1 = String.valueOf(stack);
    stack = new Stack<Character>();

    for (char c : T.toCharArray()) {
      if (c != '#') {
        stack.push(c);
      } else if (!stack.isEmpty()) {
        stack.pop();
      }
    }

    return str1.equals(String.valueOf(stack));


  }
}
