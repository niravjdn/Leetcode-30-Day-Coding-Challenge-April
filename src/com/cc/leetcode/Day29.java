package com.cc.leetcode;

// Binary Tree Maximum Path Sum
public class Day29 {
  int maxVal = Integer.MIN_VALUE;

  public int maxPathSum(TreeNode root) {
    pathSum(root);
    return maxVal;
  }

  int pathSum(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = Math.max(0, pathSum(root.left));
    int right = Math.max(0, pathSum(root.right));
    maxVal = Math.max(maxVal, left + right + root.val);
    return Math.max(left, right) + root.val;
  }
}
