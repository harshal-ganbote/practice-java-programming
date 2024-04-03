package modules.M7_Advanced_DSA_3.Advanced_DSA.L7_Trees_1_Structure_and_Traversal.Lecture;

import modules.M7_Advanced_DSA_3.Advanced_DSA.TreeNode;

public class NumbersOfNodes {

  static int calculateNumberOfNodes(TreeNode A) {

    if (A == null) {
      return 0;
    }

    return calculateNumberOfNodes(A.left) + calculateNumberOfNodes(A.right) + 1;
  }

  public static void main(String[] args) {
    int[] arr1 = { 6, 4, 7, 2, 5, 1, 10, 3, 12, 11, 13 };
    int[] arr2 = { 6, 7, 4, 5, 2, 10, 12, 13, 11, 3, 1 };
    TreeNode t1 = TreeNode.create(arr1, arr2);

    System.out.println();
    System.out.println("Q Find the number of nodes in a tree you will be given the root.");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Tree ->");
    TreeNode.print(t1);
    System.out.println("Output ->");
    System.out.println(calculateNumberOfNodes(t1));
    System.out.println("----------------------");
    System.out.println();
  }
}
