package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Assignment;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.TreeNode;
import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Lecture.CreateBinaryTree;

public class Assignment4 {

  /*
   * Problem Description
   * You are given the root node of a binary tree A. You have to find the height
   * of the given tree.
   * 
   * A binary tree's height is the number of nodes along the longest path from the
   * root node down to the farthest leaf node.
   * 
   * Problem Constraints
   * 1 <= Number of nodes in the tree <= 10^5
   * 0 <= Value of each node <= 10^9
   */
  static int solve(TreeNode A) {

    if (A == null) {
      return 0;
    }

    int left = solve(A.left);
    int right = solve(A.right);
    return 1 + Math.max(left, right);
  }

  public static void main(String[] args) {
    Integer[] arr1 = { 1, 4, 3 };
    Integer[] arr2 = { 1, 4, 2, 3 };
    TreeNode t1 = CreateBinaryTree.buildTreeFromArray(arr1);
    TreeNode t2 = CreateBinaryTree.buildTreeFromArray(arr2);

    System.out.println();
    System.out.println(solve(t1));
    System.out.println("------------");
    System.out.println(solve(t2));
    System.out.println();
  }
}
