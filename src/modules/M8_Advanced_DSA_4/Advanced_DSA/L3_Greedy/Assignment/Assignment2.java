package modules.M8_Advanced_DSA_4.Advanced_DSA.L3_Greedy.Assignment;

import java.util.ArrayList;
import java.util.Collections;

import modules.M8_Advanced_DSA_4.Advanced_DSA.L3_Greedy.Lecture.JobPair;

public class Assignment2 {

  /*
   * Problem Description
   * There are N jobs to be done, but you can do only one job at a time.
   * 
   * Given an array A denoting the start time of the jobs and an array B denoting
   * the finish time of the jobs.
   * 
   * Your aim is to select jobs in such a way so that you can finish the maximum
   * number of jobs.
   * 
   * Return the maximum number of jobs you can finish.
   * 
   * Problem Constraints
   * 1 <= N <= 10^5
   * 1 <= A[i] < B[i] <= 10^9
   */
  static int solve(int[] A, int[] B) {
    ArrayList<JobPair> jobPairs = new ArrayList<>();
    int N = A.length;

    for (int index = 0; index < N; index++) {
      jobPairs.add(new JobPair(A[index], B[index]));
    }

    Collections.sort(jobPairs, (j1, j2) -> j1.endTime - j2.endTime);

    int ans = 1;
    int lastEndTime = jobPairs.get(0).endTime;

    for (int index = 1; index < N; index++) {
      JobPair jobPair = jobPairs.get(index);

      if (jobPair.startTime >= lastEndTime) {
        ans++;
        lastEndTime = jobPair.endTime;
      }
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] A1 = { 1, 5, 7, 1 };
    int[] B1 = { 7, 8, 8, 8 };
    int[] A2 = { 3, 2, 6 };
    int[] B2 = { 9, 8, 9 };

    System.out.println();
    System.out.println(solve(A1, B1));
    System.out.println("-------");
    System.out.println(solve(A2, B2));
    System.out.println();
  }
}
