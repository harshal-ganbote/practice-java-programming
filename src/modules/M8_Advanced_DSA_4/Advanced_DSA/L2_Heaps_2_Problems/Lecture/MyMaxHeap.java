package modules.M8_Advanced_DSA_4.Advanced_DSA.L2_Heaps_2_Problems.Lecture;

import java.util.ArrayList;

public class MyMaxHeap {

  static void heapify(ArrayList<Integer> heaps, int index, int size) {
    int N = size;

    while (2 * index + 1 < N) {
      int parentEle = heaps.get(index);
      int leftIndex = 2 * index + 1, rightIndex = 2 * index + 2;
      int leftChild = heaps.get(leftIndex), rightChild = heaps.get(rightIndex >= size ? leftIndex : rightIndex);

      int maxEle = Math.max(parentEle, Math.max(leftChild, rightChild));

      if (maxEle == leftChild) {
        heaps.set(index, leftChild);
        heaps.set(leftIndex, parentEle);
        index = leftIndex;
      } else if (maxEle == rightChild) {
        heaps.set(index, rightChild);
        heaps.set(rightIndex, parentEle);
        index = rightIndex;
      } else {
        break;
      }
    }

  }

  static void buildHeap(ArrayList<Integer> heaps) {
    int N = heaps.size();

    for (int index = (N - 2) / 2; index >= 0; index--) {
      heapify(heaps, index, N);
    }
  }

}
