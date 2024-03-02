package modules.M5_Advanced_DSA_1.Advanced_DSA.L29_Arrays_3_Interview_Problems.Assignment;

import java.util.ArrayList;
import java.util.Collections;

import modules.M5_Advanced_DSA_1.Advanced_DSA.L29_Arrays_3_Interview_Problems.Lecture.Interval;

public class Assignment2 {

  /*
   * Problem Description
   * Given a collection of intervals, merge all overlapping intervals.
   * 
   * 
   * Problem Constraints
   * 1 <= Total number of intervals <= 100000.
   */
  static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
    ArrayList<Interval> ans = new ArrayList<>();
    int N = intervals.size();

    Collections.sort(intervals, (i1, i2) -> i1.start == i2.start ? i1.end - i2.end : i1.start - i2.start);

    Interval curInterval = intervals.get(0);

    for (int index = 1; index < N; index++) {
      if (intervals.get(index).start <= curInterval.end) {
        curInterval.start = Math.min(curInterval.start, intervals.get(index).start);
        curInterval.end = Math.max(curInterval.end, intervals.get(index).end);
      } else {
        ans.add(curInterval);
        curInterval = intervals.get(index);
      }
    }

    ans.add(curInterval);

    return ans;
  }

  public static void main(String[] args) {
    ArrayList<Interval> arr = new ArrayList<>();
    arr.add(new Interval(1, 3));
    arr.add(new Interval(2, 6));
    arr.add(new Interval(8, 10));
    arr.add(new Interval(15, 18));

    System.out.println();
    System.out.println(merge(arr));
    System.out.println();
  }
}
