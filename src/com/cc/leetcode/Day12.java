package com.cc.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

// Last Stone Weight
public class Day12 {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(stones.length, Collections.reverseOrder());

    for (int i : stones) {
      maxHeap.add(i);
    }

    while (maxHeap.size() > 1) {
      int stone1 = maxHeap.remove();
      int stone2 = maxHeap.remove();
      if (stone1 != stone2) {
        maxHeap.add(stone1 - stone2);
      }
    }

    return maxHeap.isEmpty() ? 0 : maxHeap.remove();
  }
}
