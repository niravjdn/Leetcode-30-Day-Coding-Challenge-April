package com.cc.leetcode;

// Best Time to Buy and Sell Stock II
public class Day05 {
  public int maxProfit(int[] prices) {
    if (prices.length == 0) {
      return 0;
    }

    int maxProfit = 0;

    int min = prices[0];
    for (int i = 1; i < prices.length; i++) {
      maxProfit += Math.max(prices[i] - prices[i - 1], 0);
    }

    return maxProfit;
  }
}
