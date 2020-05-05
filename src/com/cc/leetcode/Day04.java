package com.cc.leetcode;

// Move zeroes to end
public class Day04 {
  public void moveZeroes(int[] nums) {
    int count = 0;
    int start = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        count++;
      } else {
        nums[start++] = nums[i];
      }
    }

    int end = nums.length - 1;
    while (count-- > 0) {
      nums[end--] = 0;
    }
  }
}
