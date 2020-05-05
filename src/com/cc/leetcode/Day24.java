package com.cc.leetcode;

import java.util.HashMap;

// LRU Cache
class LRUCache {
  HashMap<Integer, Node> map;
  Node head = new Node();
  Node tail = new Node();
  int cap;

  public LRUCache(int capacity) {
    map = new HashMap<>(capacity);
    cap = capacity;
    head.next = tail;
    tail.prev = head;
  }

  public void add(Node node) {
    Node head_next = head.next;
    head.next = node;
    node.prev = head;
    node.next = head_next;
    head_next.prev = node;
  }

  public void remove(Node node) {
    Node next_node = node.next;
    Node prev_node = node.prev;
    prev_node.next = next_node;
    next_node.prev = prev_node;
  }

  public int get(int key) {
    Node n = map.get(key);
    int result = -1;
    if (n != null) {
      result = n.val;
      remove(n);
      add(n);
    }
    return result;
  }

  public void put(int key, int value) {
    Node new_node = map.get(key);
    if (new_node != null) {
      remove(new_node);
      new_node.val = value;
      add(new_node);
    } else {
      if (map.size() == cap) {
        map.remove(tail.prev.key);
        remove(tail.prev);
      }
      new_node = new Node(key, value);
      map.put(key, new_node);
      add(new_node);
    }
  }
}


class Node {
  int key;
  int val;
  Node next;
  Node prev;

  public Node() {

  }

  public Node(int key, int val) {
    this.key = key;
    this.val = val;
  }
}

/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj = new
 * LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */
