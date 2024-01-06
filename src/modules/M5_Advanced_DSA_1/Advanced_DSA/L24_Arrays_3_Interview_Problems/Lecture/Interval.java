package modules.M5_Advanced_DSA_1.Advanced_DSA.L24_Arrays_3_Interview_Problems.Lecture;

public class Interval {
  public int start;
  public int end;

  public Interval() {
    start = 0;
    end = 0;
  }

  public Interval(int s, int e) {
    start = s;
    end = e;
  }

  @Override
  public String toString() {
    return "[" + start + ", " + end + "]";
  }
}
