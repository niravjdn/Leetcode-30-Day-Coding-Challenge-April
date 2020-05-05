package com.cc.leetcode;

// Search in a rotated array
public class Day19 {
  public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    if (nums.length == 0) {
      return -1;
    }
    while (left < right) {
      int mid = (left + right) / 2;
      if (nums[mid] > nums[right]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    int pivot = left;
    left = 0;
    right = nums.length - 1;

    if (nums[pivot] <= target && target <= nums[right]) {
      left = pivot;
    } else {
      right = pivot - 1;
    }

    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (target > nums[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }
}
