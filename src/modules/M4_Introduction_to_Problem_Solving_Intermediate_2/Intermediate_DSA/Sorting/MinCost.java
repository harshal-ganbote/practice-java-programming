package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.Sorting;

import java.util.Arrays;

public class MinCost {
  


  /*
   */
    static int findMinCost(int[] A) {
      int N = A.length;
      int cost = 0;
      Arrays.sort(A);

      for (int index = 0; index < N; index++) {
        cost += A[index] * index + 1;
      }

      return cost;
    }

  public static void main(String[] args) {
    
  }
}
