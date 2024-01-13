package modules.M8_Advanced_DSA_4.Advanced_DSA.L1_Heaps_1_Introduction.Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyMinHeap {

  public static void insert(int value, ArrayList<Integer> heaps) {
    heaps.add(value);
    int index = heaps.size() - 1;

    while (index > 0) {
      int parentIndex = (index - 1) / 2;
      int parentEle = heaps.get(parentIndex);
      int childEle = heaps.get(index);

      if (childEle < parentEle) {
        Collections.swap(heaps, index, parentIndex);
        index = parentIndex;
      } else {
        break;
      }

    }
  }

  public static void insert(int value, int[] heaps) {
    int N = heaps.length;
    heaps = Arrays.copyOf(heaps, N + 1);
    heaps[N] = value;
    int index = N;

    while (index > 0) {
      int parentIndex = (index - 1) / 2;
      int parentEle = heaps[parentIndex];
      int childEle = heaps[index];

      if (childEle < parentEle) {
        heaps[parentIndex] = childEle;
        heaps[index] = parentEle;
        index = parentIndex;
      } else {
        break;
      }

    }
  }

  public static void heapify(ArrayList<Integer> heaps) {
    int index = 0;
    int N = heaps.size();

    while (2 * index + 1 < N) {
      int parentEle = heaps.get(index), leftIndex = 2 * index + 1, rightIndex = 2 * index + 2;
      int leftChild = heaps.get(leftIndex);
      int rightChild = heaps.get(rightIndex);

      int minElement = Math.min(parentEle, Math.min(leftChild, rightChild));

      if (minElement == parentEle) {
        break;
      } else if (minElement == leftChild) {
        heaps.set(index, leftChild);
        heaps.set(leftIndex, parentEle);
        index = leftIndex;
      } else if (minElement == rightChild) {
        heaps.set(index, rightChild);
        heaps.set(rightIndex, parentEle);
        index = rightIndex;
      }

    }
  }

  public static void heapify(ArrayList<Integer> heaps, int index) {
    int N = heaps.size();

    while (2 * index + 1 < N) {
      int parentEle = heaps.get(index), leftIndex = 2 * index + 1, rightIndex = 2 * index + 2;
      int leftChild = heaps.get(leftIndex);
      int rightChild = heaps.get(rightIndex);

      int minElement = Math.min(parentEle, Math.min(leftChild, rightChild));

      if (minElement == parentEle) {
        break;
      } else if (minElement == leftChild) {
        heaps.set(index, leftChild);
        heaps.set(leftIndex, parentEle);
        index = leftIndex;
      } else if (minElement == rightChild) {
        heaps.set(index, rightChild);
        heaps.set(rightIndex, parentEle);
        index = rightIndex;
      }

    }
  }

  public static void extractMin(ArrayList<Integer> heaps) {
    int lastIndex = heaps.size() - 1;

    Collections.swap(heaps, 0, lastIndex);
    heaps.remove(lastIndex);

    heapify(heaps);
  }

  public static void buildHeap(ArrayList<Integer> heaps) {
    int N = heaps.size();

    for (int index = (N - 2) / 2; index >= 0; index--) {
      heapify(heaps, index);
    }

  }
}
