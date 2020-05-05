package com.cc.leetcode;

// Maximal Square
public class Day27 {
  public int maximalSquare(char[][] matrix) {
    int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
    int[][] dp = new int[rows + 1][cols + 1];
    int maxLen = 0;
    for (int i = 1; i <= matrix.length; i++) {
      for (int j = 1; j <= cols; j++) {
        if (matrix[i - 1][j - 1] == '1') {
          dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
          maxLen = Math.max(maxLen, dp[i][j]);
        }
      }
    }
    return maxLen * maxLen;
  }
}
