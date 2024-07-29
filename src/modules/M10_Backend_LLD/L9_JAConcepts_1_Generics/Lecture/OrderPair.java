package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Lecture;

public class OrderPair<K, V> implements Pair<K, V> {
  private K key;
  private V value;

  OrderPair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  @Override
  public K getKey() {
    return key;
  }

  @Override
  public V getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "OrderPair { key = " + key + ", value = " + value + "}";
  }
}
