package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Assignment;

import java.util.ArrayList;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.TreeNode;

public class Assignment2 {

  /*
   * Problem Description
   * Given a binary tree, return the pre-order traversal of its nodes values.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= number of nodes <= 10^5
   */
  static ArrayList<Integer> preOrderTraversal(TreeNode A) {
    ArrayList<Integer> ans = new ArrayList<>();
    preOrder(A, ans);
    return ans;
  }

  static void preOrder(TreeNode root, ArrayList<Integer> B) {

    if (root == null) {
      return;
    }

    B.add(root.val);
    preOrder(root.left, B);
    preOrder(root.right, B);
  }

  public static void main(String[] args) {

  }
}
