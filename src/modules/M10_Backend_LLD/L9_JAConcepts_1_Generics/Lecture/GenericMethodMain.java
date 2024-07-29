package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Lecture;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodMain {

  public static <T> void printArray(T[] arr) {
    for (T data : arr) {
      System.out.println(data);
    }
  }

  public static <T> void doSomething(List<T> obj) {
    for (T item : obj) {
      System.out.println(item);
    }
  }

  public static void main(String[] args) {
    Integer[] arr = { 1, 2, 3, 4 };
    String[] s = { "Apple", "Mango", "Guava" };
    List<Integer> list1 = new ArrayList<>();
    list1.add(10);
    list1.add(20);
    list1.add(30);
    doSomething(list1);

    List<String> list2 = new ArrayList<>();
    list2.add("Hello");
    list2.add("Apple");
    list2.add("Guava");
    doSomething(list2);

    List<Object> list3 = new ArrayList<>();
    list3.add(1);
    list3.add("Guava");
    list3.add(new User("Harshal", "harshal70007@gmail.com"));
    doSomething(list3);

    printArray(arr);
    printArray(s);
  }
}
