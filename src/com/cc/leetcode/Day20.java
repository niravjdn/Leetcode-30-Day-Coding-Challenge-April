package com.cc.leetcode;

// Construct Binary Search Tree from Preorder Traversal
public class Day20 {
  public TreeNode bstFromPreorder(int[] preorder) {

    if (preorder.length == 0) {
      return null;
    }

    return formTree(preorder, 0, preorder.length - 1);
  }

  private TreeNode formTree(int[] preorder, int start, int end) {
    if (start > end) {
      return null;
    }

    TreeNode root = new TreeNode(preorder[start]);

    int index = start;

    for (; index <= end; index++) {
      if (root.val < preorder[index]) {
        break;
      }
    }

    root.left = formTree(preorder, start + 1, index - 1);
    root.right = formTree(preorder, index, end);
    return root;
  }
}
