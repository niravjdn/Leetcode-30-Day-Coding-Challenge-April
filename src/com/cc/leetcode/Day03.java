package com.cc.leetcode;

// Maximum Subarray
public class Day03 {
  public int maxSubArray(int[] nums) {
    int sum = nums[0];
    int maxsum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (sum < 0 && nums[i] > sum) {
        sum = nums[i];
      } else {
        sum += nums[i];
      }
      maxsum = Math.max(maxsum, sum);
    }

    return maxsum;
  }
}
