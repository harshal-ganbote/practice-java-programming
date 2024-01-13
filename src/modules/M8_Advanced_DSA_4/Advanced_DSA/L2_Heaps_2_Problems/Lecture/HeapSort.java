package modules.M8_Advanced_DSA_4.Advanced_DSA.L2_Heaps_2_Problems.Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HeapSort {

  static void heapSort(ArrayList<Integer> heaps) {
    MyMaxHeap.buildHeap(heaps);
    int size = heaps.size();

    while (size > 0) {
      int lastIndex = size - 1;
      Collections.swap(heaps, 0, lastIndex);
      size--;
      MyMaxHeap.heapify(heaps, 0, size);
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3, 1, 9, 4, 6, 2, 10, 5));
    ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(13, 7, 10, 4, 6, 8, 5, 2, 1, 3));

    System.out.println();
    System.out.println("Q Sort the array using heap");
    System.out.println("----------------------------------------------");
    System.out.println("Time Complexity -> O(N * logN)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(arr1);
    System.out.println("Output ->");
    heapSort(arr1);
    System.out.println(arr1);
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(arr2);
    System.out.println("Output ->");
    heapSort(arr2);
    System.out.println(arr2);
    System.out.println("----------------------------------------------");
    System.out.println();
  }
}
