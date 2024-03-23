package modules.M7_Advanced_DSA_3.Advanced_DSA.L3_Linked_List_3_Problems_and_Doubly_Linked_List.Lecture;

import java.util.HashMap;

public class LURCache {

  /**
   * Node
   */
  class Node {
    int key;
    int value;
    Node next;
    Node prev;

    Node(int key, int value) {
      this.key = key;
      this.value = value;
      next = null;
      prev = null;
    }
  }

  Node head, tail;
  int totalCapacity, currentCapacity;
  HashMap<Integer, Node> hMap;

  public LURCache(int capacity) {
    hMap = new HashMap<>();
    totalCapacity = capacity;
    currentCapacity = 0;
    head = null;
    tail = null;
  }

  public int get(int key) {

    if (hMap.containsKey(key)) {
      Node valNode = hMap.get(key);
      deleteNode(valNode);
      addNodeToTail(valNode);
      return valNode.value;
    }

    return -1;
  }

  void deleteNode(Node A) {

    if (A.prev != null) {
      A.prev.next = A.next;
    }

    if (A.next != null) {
      A.next.prev = A.prev;
    }

    if (A == head) {
      head = A.next;
    }

    if (A == tail) {
      tail = A.prev;
    }

    A.next = null;
    A.prev = null;
  }

  void addNodeToTail(Node A) {

    if (head == null) {
      head = A;
      tail = head;
    } else {
      tail.next = A;
      A.prev = tail;
      tail = A;
    }
  }

  void addToTail(int key, int value) {
    Node newNode = new Node(key, value);
    addNodeToTail(newNode);
    hMap.put(key, newNode);
  }

  public void set(int key, int value) {
    if (hMap.containsKey(key)) {
      Node valNode = hMap.get(key);
      valNode.value = value;
      deleteNode(valNode);
      addNodeToTail(valNode);
    } else if (currentCapacity < totalCapacity) {
      addToTail(key, value);
      currentCapacity++;
    } else {
      Node temp = head;
      deleteNode(temp);
      hMap.remove(temp.key);
      addToTail(key, value);
    }
  }
}
