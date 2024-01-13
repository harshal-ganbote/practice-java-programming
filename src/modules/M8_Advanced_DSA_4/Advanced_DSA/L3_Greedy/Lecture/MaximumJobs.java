package modules.M8_Advanced_DSA_4.Advanced_DSA.L3_Greedy.Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumJobs {

  /*
   * Maximum jobs
   * 
   * Given N jobs with their start and end times. find max number of
   * jobs that can be completed if only 1 job can be done at an time.
   */
  static int computeMaximumJobs(int[] A, int[] B) {
    int N = A.length;
    ArrayList<JobPair> jobPairs = new ArrayList<>();

    for (int index = 0; index < N; index++) {
      jobPairs.add(new JobPair(A[index], B[index]));
    }

    Collections.sort(jobPairs, (j1, j2) -> j1.endTime - j2.endTime);

    int ans = 1;
    int lastEndTime = jobPairs.get(0).endTime;

    for (int index = 1; index < N; index++) {

      if (jobPairs.get(index).startTime >= lastEndTime) {
        ans++;
        lastEndTime = jobPairs.get(index).endTime;
      }

    }

    return ans;
  }

  public static void main(String[] args) {
    int[] A1 = { 1, 5, 8, 7, 12, 13 };
    int[] B1 = { 2, 10, 10, 11, 20, 19 };
    int[] A2 = { 9, 2, 7, 10, 4, 7, 10, 8 };
    int[] B2 = { 11, 4, 9, 1, 6, 8, 3, 10 };

    System.out.println();
    System.out.println("""
        Maximum jobs
        Given N jobs with their start and end times. find max number of
        jobs that can be completed if only 1 job can be done at an  time.""");
    System.out.println("----------------------------------------------");
    System.out.println("Time Complexity -> O(N * logN)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(A1));
    System.out.println(Arrays.toString(B1));
    System.out.println("Output ->");
    System.out.println(computeMaximumJobs(A1, B1));
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(A2));
    System.out.println(Arrays.toString(B2));
    System.out.println("Output ->");
    System.out.println(computeMaximumJobs(A2, B2));
    System.out.println("----------------------------------------------");
    System.out.println();
  }
}
