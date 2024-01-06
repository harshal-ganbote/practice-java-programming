package modules.M5_Advanced_DSA_1.Advanced_DSA.L24_Arrays_3_Interview_Problems.Lecture;

import java.util.ArrayList;

public class MergeInterval {

  static ArrayList<Interval> mergeInterval(ArrayList<Interval> A, Interval newInterval) {
    int N = A.size();
    ArrayList<Interval> ans = new ArrayList<>();

    for (int index = 0; index < N; index++) {

      if (A.get(index).end < newInterval.start) {
        ans.add(A.get(index));
      } else if (A.get(index).start > newInterval.end) {
        ans.add(newInterval);

        for (int jIndex = index; jIndex < N; jIndex++) {
          ans.add(A.get(jIndex));
        }

        return ans;
      } else {
        newInterval.start = Math.min(newInterval.start, A.get(index).start);
        newInterval.end = Math.max(newInterval.end, A.get(index).end);
      }
    }

    ans.add(newInterval);
    return ans;
  }

  public static void main(String[] args) {
    ArrayList<Interval> arr = new ArrayList<>();
    arr.add(new Interval(1, 3));
    arr.add(new Interval(4, 7));
    arr.add(new Interval(10, 14));
    arr.add(new Interval(16, 19));
    arr.add(new Interval(21, 24));
    arr.add(new Interval(27, 30));
    arr.add(new Interval(32, 35));
    Interval I = new Interval(10, 22);

    System.out.println();
    System.out.println(mergeInterval(arr, I));
  }
}
