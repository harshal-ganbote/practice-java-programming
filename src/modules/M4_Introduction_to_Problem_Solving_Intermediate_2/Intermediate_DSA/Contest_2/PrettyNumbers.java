package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.Contest_2;

import java.util.ArrayList;

public class PrettyNumbers {
  
  static ArrayList<Integer> solve(ArrayList<Integer> A) {
    int firstMin = A.get(0), secondMin = Integer.MAX_VALUE;
    int firstMinIndex = 0;
    int N = A.size();
    ArrayList<Integer> ans = new ArrayList<>();

    for (int index = 0; index < N; index++) {
      if (A.get(index) < firstMin) {
        firstMin = A.get(index);
        firstMinIndex = index;
      }
    }

    for (int index = 0; index < N; index++) {
      if (index == firstMinIndex) {
        continue;
      }

      if (A.get(index) < secondMin) {
        secondMin = A.get(index);
      }
    }

    for (int index = 0; index < N; index++) {
      if (A.get(index) > secondMin) {
        ans.add(A.get(index));
      }
    }

    return ans;
  }


  public static void main(String[] args) {
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();

    arr1.add(3);
    arr1.add(3);
    arr1.add(6);
    arr1.add(3);
    arr2.add(1);
    arr2.add(2);
    arr2.add(2);
    arr2.add(4);
    arr2.add(3);

    System.out.println(solve(arr1));
    System.out.println("------------");
    System.out.println(solve(arr2));
  }
}
