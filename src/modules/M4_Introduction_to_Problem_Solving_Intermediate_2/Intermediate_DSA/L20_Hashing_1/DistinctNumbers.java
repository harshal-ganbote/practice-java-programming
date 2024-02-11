package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L16_Hashing_1;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctNumbers {

  static int countDistinctNumbers(int[] A) {
    HashSet<Integer> hSet = new HashSet<>();

    for (int ele : A) {
      hSet.add(ele);
    }

    return hSet.size();
  }

  public static void main(String[] args) {
    int[] arr1 = { 3, 5, 6, 5, 4 };
    int[] arr2 = { 1, 1, 1, 2, 2 };
    int[] arr3 = { 3, 3, 3 };

    System.out.println();
    System.out.println("""
        Q Given arr[N] elements, check if there exists a sub array
        with sum = 0.
        """);

    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(countDistinctNumbers(arr1));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(countDistinctNumbers(arr2));
    System.out.println("----------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(countDistinctNumbers(arr3));
    System.out.println("----------------------");
  }
}
