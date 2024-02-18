package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Assignment;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.TreeNode;
import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Lecture.CreateBinaryTree;

public class Assignment6 {

  /*
   * Problem Description
   * Given the root of a binary tree A. Return the sum of all the nodes of the
   * binary tree.
   * 
   * 
   * Problem Constraints
   * 1 <= Number of nodes in A <= 10^4
   * 1 <= value of each node <= 10^4
   */
  static int solve(TreeNode A) {

    if (A == null) {
      return 0;
    }

    int left = solve(A.left);
    int right = solve(A.right);

    return A.val + left + right;
  }

  public static void main(String[] args) {
    Integer[] arr1 = { 5, 1, 2, 4 };
    Integer[] arr2 = { 3, 6, 1, 2, 7 };
    TreeNode t1 = CreateBinaryTree.buildTreeFromArray(arr1);
    TreeNode t2 = CreateBinaryTree.buildTreeFromArray(arr2);

    System.out.println();
    System.out.println(solve(t1));
    System.out.println("------------");
    System.out.println(solve(t2));
    System.out.println();
  }
}
