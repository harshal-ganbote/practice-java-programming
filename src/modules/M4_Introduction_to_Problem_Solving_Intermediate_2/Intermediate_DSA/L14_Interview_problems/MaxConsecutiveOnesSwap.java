package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L14_Interview_problems;

import java.util.Arrays;

public class MaxConsecutiveOnesSwap {
  
  // ? Max consecutive 1’s (Swap)
  static int findMaxConsecutiveOnesSwap(int[] A) {
    int N = A.length;
    int onesCount = 0;
    int ans = 0;

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

      for (int jIndex = index -1; jIndex >=0; jIndex--) {
        if (A[jIndex]== 1) {
          leftCount++;
        } else {
          break;
        }
      }

      for (int jIndex = index + 1; jIndex < N; jIndex++) {
        if (A[jIndex]== 1) {
          rightCount++;
        } else {
          break;
        }
      }

      int count = rightCount + leftCount;

      if (count != onesCount) {
        count += 1;
      }

      ans = Math.max(ans, count);
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr1 = {1, 1, 0, 1, 1, 1, 0, 1};
    int[] arr2 = {0, 1, 1, 1, 0, 1, 1, 0, 0};
    int[] arr3 = {1, 1, 1, 0, 1, 1, 1};

        System.out.println(
        """
          Given a binary arr[], we can at most swap a single 0 with 1.
          Find the max consecutive 1's we can get in the arr[].Example 2
        """);
    System.out.println("------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    System.out.println(findMaxConsecutiveOnesSwap(arr1));
    System.out.println("-------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    System.out.println(findMaxConsecutiveOnesSwap(arr2));
    System.out.println("-------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr3));
    System.out.println("Output ->");
    System.out.println(findMaxConsecutiveOnesSwap(arr3));
    System.out.println("-------------------------------");
  }
}
