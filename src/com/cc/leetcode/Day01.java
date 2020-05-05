package com.cc.leetcode;

// Single Number

public class Day01 {
  public int singleNumber(int[] nums) {
    int singleOne = 0;

    for (int i : nums) {
      singleOne ^= i;
    }

    return singleOne;
  }
}
