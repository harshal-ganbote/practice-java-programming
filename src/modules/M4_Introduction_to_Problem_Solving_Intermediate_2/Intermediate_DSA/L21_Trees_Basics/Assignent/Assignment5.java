package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L21_Trees_Basics.Assignent;

public class Assignment5 {

  /*
   * Problem Description
   * You are given the root node of a binary tree A. You have to find the number
   * of nodes in this tree.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= Number of nodes in the tree <= 10^5
   * 0 <= Value of each node <= 10^7
   */
  static int solve(TreeNode A) {

    if (A == null) {
      return 0;
    }

    int left = solve(A.left);
    int right = solve(A.right);
    return left + right + 1;
  }

  public static void main(String[] args) {

  }
}
