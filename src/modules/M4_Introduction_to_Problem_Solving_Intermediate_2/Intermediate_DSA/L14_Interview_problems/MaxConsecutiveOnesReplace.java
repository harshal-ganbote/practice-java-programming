package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L14_Interview_problems;

import java.util.Arrays;

public class MaxConsecutiveOnesReplace {
  

  // ? Max consecutive 1’s (Replace)
  static int findMaxConsecutiveOnesReplace(int[] A) {
    int N = A.length;
    int ans = 0;
    int onesCount = 0;

    for (int ele: A) {
      onesCount += ele;
    }

    if (onesCount == N) {
      return N;
    }

    for (int index = 0; index < N; index++) {
      int leftCount = 0, rightCount = 0;

      if (A[index] == 1) {
        continue;
      }

      for (int jIndex = index-1; jIndex >= 0; jIndex--) {
        
        if (A[jIndex] == 1) {
          leftCount++;
        } else {
          break;
        }

      }

      for (int jIndex = index + 1; jIndex < N; jIndex++) {

        if (A[jIndex] == 1) {
          rightCount++;
        } else {
          break;
        }

        int count = leftCount + rightCount + 1;
        ans = Math.max(ans, count);
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = {0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0};
    int[] arr2 = {1, 1, 1, 1, 1, 1};
    int[] arr3 = {1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1};


    System.out.println(
        """
        Q Given a binary arr[], we can at most replace a single 0 with 1.
        Find the max consecutive 1's we can get in the arr[].Max consecutive 1's (Replace)
        """);
    System.out.println("------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMaxConsecutiveOnesReplace(arr1));
    System.out.println("-------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMaxConsecutiveOnesReplace(arr2));
    System.out.println("-------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(findMaxConsecutiveOnesReplace(arr3));
    System.out.println("-------------------------------");
  }
}
