package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L17_Hashing_2.Assignment;

import java.util.HashMap;

public class Assignment2 {
  /*
   * Given an Array of integers B, and a target sum A.
   * Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
   * 
   * 
   * Problem Constraints
   * 1<= Length of array B <= 10^3
   * 0<= Bi <=10^9
   * 0<= A <=10^9
   */
  static int solve(int A, int[] B) {
    HashMap<Integer, Integer> hMap = new HashMap<>();

    for (int ele : B) {

      if (hMap.containsKey(ele)) {
        int value = hMap.get(ele);
        hMap.put(ele, value + 1);
      } else {
        hMap.put(ele, 1);
      }

    }

    for (int ele : B) {

      if (ele != A - ele) {
        int value = hMap.getOrDefault(A - ele, 0);
        if (value > 0) {
          return 1;
        }
      } else if (ele == A - ele) {
        int value = hMap.get(ele);
        if (value > 1) {
          return 1;
        }
      }

    }

    return 0;
  }

  public static void main(String[] args) {
    int[] arr1 = { 3, 5, 1, 2, 1, 2 };
    int[] arr2 = { 9, 10, 7, 10, 9, 1, 5, 1, 5 };

    System.out.println(solve(8, arr1));
    System.out.println("--------------");
    System.out.println(solve(21, arr2));
  }
}
