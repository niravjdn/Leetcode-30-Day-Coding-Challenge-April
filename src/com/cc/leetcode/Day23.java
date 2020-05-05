package com.cc.leetcode;

// Bitwise AND of Numbers Range
public class Day23 {
  public int rangeBitwiseAnd(int m, int n) {
    while (m < n) {
      n = n & (n - 1);
    }
    return n;
  }
}
