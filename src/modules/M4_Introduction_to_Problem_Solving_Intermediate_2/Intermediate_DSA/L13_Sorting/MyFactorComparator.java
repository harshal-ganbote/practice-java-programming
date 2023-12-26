package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L13_Sorting;

import java.util.Comparator;

public class MyFactorComparator implements Comparator<Integer> {

  int countFactors(int A) {
    int count = 0;

    for (int number = 1; number * number <= A; number++) {
      if (A % number == 0) {
        count += (number * number) == A ? 1 : 2;
      }
    }

    return count;
  }

  public int compare(Integer a, Integer b) {
    int aFactors = countFactors(a);
    int bFactors = countFactors(b);

    return aFactors == bFactors ? a - b : aFactors - bFactors;
  }
}
