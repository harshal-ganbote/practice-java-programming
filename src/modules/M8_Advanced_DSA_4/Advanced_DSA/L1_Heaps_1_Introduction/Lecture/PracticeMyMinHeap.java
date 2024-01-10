package modules.M8_Advanced_DSA_4.Advanced_DSA.L1_Heaps_1_Introduction.Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeMyMinHeap {

  public static void main(String[] args) {
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();
    ArrayList<Integer> arr3 = new ArrayList<>();

    List<Integer> arr1Add = Arrays.asList(3, 5, 20, 12, 10, 24, 22, 35, 25, 13);
    List<Integer> arr2Add = Arrays.asList(13, 4, 20, 12, 5, 24, 22, 35, 25, 14, 10);
    List<Integer> arr3Add = Arrays.asList(4, 5, 20, 12, 10, 24, 22, 35, 25, 13, 10);
    arr1.addAll(arr1Add);
    arr2.addAll(arr2Add);
    arr3.addAll(arr3Add);

    System.out.println(arr1);
    System.out.println("-----------------");
    MyMinHeap.insert(4, arr1);
    System.out.println(arr1);
    System.out.println("-------------------");
    System.out.println(arr2);
    MyMinHeap.heapify(arr2);
    System.out.println("-------------");
    System.out.println(arr2);
    System.out.println("-------------");
    System.out.println(arr3);
    System.out.println("-----");
    MyMinHeap.extractMin(arr3);
    System.out.println(arr3);
  }
}
