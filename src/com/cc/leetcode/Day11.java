package com.cc.leetcode;

// Diameter of Binary Tree
public class Day11 {
  public int diameterOfBinaryTree(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int lh = height(root.left);
    int rh = height(root.right);

    int ld = diameterOfBinaryTree(root.left);
    int rd = diameterOfBinaryTree(root.right);

    return Math.max(Math.max(ld, rd), lh + rh);
  }

  int height(TreeNode n) {
    if (n == null)
      return 0;
    return (1 + Math.max(height(n.left), height(n.right)));
  }
}
