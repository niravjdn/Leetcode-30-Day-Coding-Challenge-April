package com.cc.leetcode;

import java.util.HashMap;

// Subarray Sum Equals K
public class Day22 {
  public int subarraySum(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    // sum and counts
    map.put(0, 1);

    int total = 0;
    int consSum = 0;
    for (int i = 0; i < nums.length; i++) {
      consSum += nums[i];
      if (map.containsKey(consSum - k)) {
        total += map.get(consSum - k);
      }
      map.put(consSum, map.getOrDefault(consSum, 0) + 1);
    }

    return total;
  }
}
