package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L13_Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class MinCost {
  
    // ? Min cost to remove all elements
    static int findMinCost(Integer[] A) {
      int N = A.length;
      int cost = 0;
      Arrays.sort(A, Comparator.reverseOrder());

      for (int index = 0; index < N; index++) {
        cost += A[index] * (index + 1);
      }

      return cost;
    }

  public static void main(String[] args) {
    Integer[] arr1 = {2 ,1, 4};
    Integer[] arr2 = {4, 6, 1};
    Integer[] arr3 = {3, 5, 1, -3};

    System.out.println(""" 
        Q. Given N array elements, at every step remove an array element.
        Cost to remove element = Sum of array elements present in the array.
        Find the min cost to remove all elements.""");
    System.out.println("---------------------------------------");
    System.out.println("Time Complexity -> O(N*logN)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("---------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMinCost(arr1));
    System.out.println("---------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMinCost(arr2));
    System.out.println("---------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(findMinCost(arr3));
    System.out.println("---------------------------");
  }
}
