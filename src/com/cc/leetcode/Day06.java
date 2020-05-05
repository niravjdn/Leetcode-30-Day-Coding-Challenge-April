package com.cc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

// Group Anagrams
public class Day06 {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();

    for (String s : strs) {
      char[] charArray = s.toCharArray();
      Arrays.sort(charArray);
      String s2 = new String(charArray);
      if (!map.containsKey(s2)) {
        map.put(s2, new LinkedList<String>());
      }
      List<String> list = map.get(s2);
      list.add(s);
    }

    List<List<String>> result = new ArrayList<>();
    for (List<String> s : map.values()) {
      result.add(s);
    }

    return result;
  }
}
