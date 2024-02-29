package modules.M3_Introduction_to_Problem_Solving_Intermediate_1.Intermediate_DSA.L1_Introduction_to_Problem_Solving.Lecture;

public class SquareRoot {

  /*
   * Q Given a number N, find its square root.
   */
  static int perfectSquareRoot(int A) {

    for (int index = 1; index * index <= A; index++) {
      if (index * index == A) {
        return index;
      }
    }

    return -1;
  }

  static int squareRootFloor(int A) {
    int ans = -1;

    for (int index = 1; index * index <= A; index++) {
      if (index * index <= A) {
        ans = index;
      }
    }

    return ans;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println("Q Given a number N, find its square root.");
    System.out.println("----------------------------------------------------------------");
    System.out.println("There are following approach");
    System.out.println("1 -> Number is Perfect Square");
    System.out.println("Time Complexity -> O(Sqrt(N))");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(25);
    System.out.println("Output ->");
    System.out.println(perfectSquareRoot(25));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(100);
    System.out.println("Output ->");
    System.out.println(perfectSquareRoot(100));
    System.out.println("----------------------");
    System.out.println();
    System.out.println("2 -> Number is not Perfect Square");
    System.out.println("Time Complexity -> O(Sqrt(N))");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Number ->");
    System.out.println(50);
    System.out.println("Output ->");
    System.out.println(squareRootFloor(50));
    System.out.println("----------------------");
    System.out.println("Input Number ->");
    System.out.println(30);
    System.out.println("Output ->");
    System.out.println(squareRootFloor(30));
    System.out.println("----------------------");
    System.out.println();
  }
}
