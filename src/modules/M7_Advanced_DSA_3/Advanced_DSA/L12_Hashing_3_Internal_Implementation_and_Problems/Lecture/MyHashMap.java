package modules.M7_Advanced_DSA_3.Advanced_DSA.L12_Hashing_3_Internal_Implementation_and_Problems.Lecture;

import java.util.ArrayList;

public class MyHashMap<K, V> {

  private class MyHashMapNode {
    K key;
    V value;
  }

  private ArrayList<MyHashMapNode>[] buckets;
  private int size = 0;

  @SuppressWarnings("unchecked")
  public MyHashMap() {
    buckets = new ArrayList[7];

    for (int index = 0; index < buckets.length; index++) {
      buckets[index] = new ArrayList<>();
    }
  }

  private int hashFunction(K key) {

    int index = key.hashCode();
    index = Math.abs(index);
    index = index % buckets.length;

    return index;
  }

  private int foundAt(ArrayList<MyHashMapNode> list, K key) {

    for (int index = 0; index < list.size(); index++) {
      MyHashMapNode myHashMapNode = list.get(index);

      if (myHashMapNode.key.equals(key)) {
        return index;
      }
    }

    return -1;
  }

  public int size() {
    return size;
  }

  public boolean containsKey(K key) {
    int bno = hashFunction(key);
    int listIndex = foundAt(buckets[bno], key);

    return listIndex != -1;
  }

  public V get(K key) {
    int bno = hashFunction(key);
    int listIndex = foundAt(buckets[bno], key);

    if (listIndex == -1) {
      return null;
    }

    MyHashMapNode myHashMapNode = buckets[bno].get(listIndex);

    return myHashMapNode.value;
  }

  private MyHashMapNode getMyHashMapNode(K key) {
    int bno = hashFunction(key);
    int listIndex = foundAt(buckets[bno], key);

    if (listIndex == -1) {
      return null;
    }

    MyHashMapNode myHashMapNode = buckets[bno].get(listIndex);

    return myHashMapNode;
  }

  public void put(K key, V value) {
    int bno = hashFunction(key);
    int listIndex = foundAt(buckets[bno], key);

    if (listIndex == -1) {
      MyHashMapNode myHashMapNode = new MyHashMapNode();

      myHashMapNode.key = key;
      myHashMapNode.value = value;

      buckets[bno].add(myHashMapNode);
      size++;
    } else {
      MyHashMapNode myHashMapNode = getMyHashMapNode(key);
      myHashMapNode.value = value;
    }

    double lambda = (size * 1.0) / buckets.length;

    if (lambda > 0.75) {
      reHashing();
    }
  }

  public V remove(K key) {
    int bno = hashFunction(key);
    int listIndex = foundAt(buckets[0], key);

    if (listIndex == -1) {
      return null;
    }

    buckets[bno].remove(listIndex);

    return get(key);
  }

  @SuppressWarnings("unchecked")
  private void reHashing() {
    ArrayList<MyHashMapNode>[] oldBuckets = buckets;

    buckets = new ArrayList[2 * oldBuckets.length];

    for (int index = 0; index < buckets.length; index++) {
      buckets[index] = new ArrayList<>();
    }

    size = 0;

    for (int index = 0; index < oldBuckets.length; index++) {
      for (int jIndex = 0; jIndex < oldBuckets[index].size(); jIndex++) {

        MyHashMapNode myHashMapNode = oldBuckets[index].get(jIndex);

        put(myHashMapNode.key, myHashMapNode.value);
      }
    }
  }

  private String print() {

    String ans = "";

    for (int index = 0; index < buckets.length; index++) {
      for (int jIndex = 0; jIndex < buckets[index].size(); jIndex++) {
        MyHashMapNode myHashMapNode = buckets[index].get(jIndex);

        ans += myHashMapNode.key.toString() + ": " + myHashMapNode.value.toString();

      }

      ans += "\n";
    }

    return ans;
  }

  @Override
  public String toString() {
    return print();
  }
}
