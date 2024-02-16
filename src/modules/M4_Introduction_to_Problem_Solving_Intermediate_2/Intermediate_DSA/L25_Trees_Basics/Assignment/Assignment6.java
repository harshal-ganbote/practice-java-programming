package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Assignment;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.TreeNode;

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

  }
}
