package com.cc.leetcode;

import java.util.HashSet;
import java.util.Set;

// Happy Number
public class Day02 {
  Set<Integer> set = new HashSet<>();

  public boolean isHappy(int num) {
    set.add(num);
    int ans = cal(num);

    if (ans != 1) {
      if (set.contains(ans)) {
        return false;
      }
      return isHappy(ans);
    }
    System.out.println(ans);
    return ans == 1;
  }

  public int cal(int num) {
    if (num < 10) {
      return num * num;
    }

    return cal(num % 10) + cal(num / 10);
  }
}
