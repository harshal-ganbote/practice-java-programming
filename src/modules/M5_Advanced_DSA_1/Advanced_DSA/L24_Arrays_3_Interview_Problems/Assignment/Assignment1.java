package modules.M5_Advanced_DSA_1.Advanced_DSA.L24_Arrays_3_Interview_Problems.Assignment;

import java.util.ArrayList;

import modules.M5_Advanced_DSA_1.Advanced_DSA.L24_Arrays_3_Interview_Problems.Lecture.Interval;

public class Assignment1 {

  /*
   * Problem Description
   * You have a set of non-overlapping intervals. You are given a new interval
   * [start, end], insert this new interval into the set of intervals (merge if
   * necessary).
   * 
   * You may assume that the intervals were initially sorted according to their
   * start times.
   * 
   * Problem Constraints
   * 0 <= |intervals| <= 10^5
   */
  static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
    int N = intervals.size();
    ArrayList<Interval> ans = new ArrayList<>();

    for (int index = 0; index < N; index++) {

      if (intervals.get(index).end < newInterval.start) {
        ans.add(intervals.get(index));
      } else if (intervals.get(index).start > newInterval.end) {
        ans.add(newInterval);

        for (int jIndex = index; jIndex < N; jIndex++) {
          ans.add(intervals.get(jIndex));
        }

        return ans;
      } else {
        newInterval.start = Math.min(newInterval.start, intervals.get(index).start);
        newInterval.end = Math.max(newInterval.end, intervals.get(index).end);
      }
    }

    ans.add(newInterval);
    return ans;
  }

  public static void main(String[] args) {
    ArrayList<Interval> arr = new ArrayList<>();
    arr.add(new Interval(1, 3));
    arr.add(new Interval(6, 9));
    Interval I1 = new Interval(2, 5);
    Interval I2 = new Interval(2, 6);

    System.out.println();
    System.out.println(insert(arr, I1));
    System.out.println("--------------");
    System.out.println(insert(arr, I2));
    System.out.println();
  }
}
