package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L13_Bit_Manipulations_2.Lecture;

public class CountBits {

  /*
   * Q Given N and i, check if i bit position is set or not.
   */
  static boolean checkBit(int A, int i) {
    return (A & (1 << i)) != 0;
  }

  static int countBitsApproach1(int A) {
    int count = 0;

    for (int index = 0; index < 32; index++) {
      if (checkBit(A, index)) {
        count++;
      }
    }

    return count;
  }

  static int countBitsApproach2(int A) {
    int count = 0;

    while (A > 0) {
      if ((A & 1) == 1) {
        count++;
      }
      A = A >> 1;
    }

    return count;
  }

  public static void main(String[] args) {

    System.out.println();
    System.out.println("Q Given N and i, check if i bit position is set or not.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(1)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("1 -> Approach 1");
    System.out.println("-----------------------------------");
    System.out.println("Input ->");
    System.out.println(10);
    System.out.println("Output ->");
    System.out.println(countBitsApproach1(10));
    System.out.println("------------------");
    System.out.println("Input ->");
    System.out.println(27);
    System.out.println("Output ->");
    System.out.println(countBitsApproach1(27));
    System.out.println("------------------");
    System.out.println("Input ->");
    System.out.println(45);
    System.out.println("Output ->");
    System.out.println(countBitsApproach1(45));
    System.out.println("-----------------------------------");
    System.out.println("2 -> Approach 2");
    System.out.println("-----------------------------------");
    System.out.println("Input ->");
    System.out.println(10);
    System.out.println("Output ->");
    System.out.println(countBitsApproach2(10));
    System.out.println("------------------");
    System.out.println("Input ->");
    System.out.println(27);
    System.out.println("Output ->");
    System.out.println(countBitsApproach2(27));
    System.out.println("------------------");
    System.out.println("Input ->");
    System.out.println(45);
    System.out.println("Output ->");
    System.out.println(countBitsApproach2(45));
    System.out.println("-----------------------------------");
    System.out.println();
  }
}
