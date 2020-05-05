package com.cc.leetcode;

public class Day25 {

  Index[] memo;
  public boolean canJump(int[] nums) {
      // memo = new Index[nums.length];
      // memo[memo.length-1] = Index.GOOD;
      //  for (int i = 0; i < memo.length; i++) {
      //     memo[i] = Index.UNKNOWN;
      // }
      // memo[memo.length - 1] = Index.GOOD;
      // return canItJump(nums, 0);
      
      int lastGoodPosition = nums.length-1;
      
      for(int i=lastGoodPosition; i >=0; i--){
          if(i+nums[i] >= lastGoodPosition){
              lastGoodPosition = i;
          }
      }
      
      return lastGoodPosition == 0;
  }
  
  boolean canItJump(int[] nums, int position){
      if (memo[position] != Index.UNKNOWN) {
          return memo[position] == Index.GOOD ? true : false;
      }
      
       int furthestJump = Math.min(position + nums[position], nums.length - 1);
      for (int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
          if (canItJump(nums, nextPosition)) {
              memo[position] = Index.GOOD;
              return true;
          }
      }

      memo[position] = Index.BAD;
      return false;
  }
}

enum Index {
 GOOD, BAD, UNKNOWN
}
