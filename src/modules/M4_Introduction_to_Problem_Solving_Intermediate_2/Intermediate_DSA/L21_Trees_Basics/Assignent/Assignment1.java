package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L21_Trees_Basics.Assignent;

import java.util.ArrayList;

public class Assignment1 {
  /*
   * Problem Description
   * Given a binary tree, return the in-order traversal of its nodes' values.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= number of nodes <= 10^5
   */
  static ArrayList<Integer> inOrderTraversal(TreeNode A) {
    ArrayList<Integer> ans = new ArrayList<>();
    inOrder(A, ans);
    return ans;
  }

  static void inOrder(TreeNode root, ArrayList<Integer> B) {

    if (root == null) {
      return;
    }

    inOrder(root.left, B);
    B.add(root.val);
    inOrder(root.right, B);
  }

  public static void main(String[] args) {

  }
}
