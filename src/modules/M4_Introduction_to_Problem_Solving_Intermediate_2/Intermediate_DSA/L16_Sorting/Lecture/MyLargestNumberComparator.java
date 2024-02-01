package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L16_Sorting.Lecture;

import java.util.Comparator;

public class MyLargestNumberComparator implements Comparator<Integer> {

  public int compare(Integer a, Integer b) {
    String s1 = Integer.toString(a) + Integer.toString(b);
    String s2 = Integer.toString(b) + Integer.toString(a);

    return s2.compareTo(s1);
  }
}
