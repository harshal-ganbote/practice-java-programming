package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Assignent;

import java.util.ArrayList;

public class Assignment3 {

  /*
   * Problem Description
   * Given a binary tree, return the Post-order traversal of its nodes values.
   * 
   * Problem Constraints
   * 1 <= number of nodes <= 10^5
   */
  static ArrayList<Integer> postOrderTraversal(TreeNode A) {
    ArrayList<Integer> ans = new ArrayList<>();
    postOrder(A, ans);
    return ans;
  }

  static void postOrder(TreeNode root, ArrayList<Integer> B) {

    if (root == null) {
      return;
    }

    postOrder(root.left, B);
    postOrder(root.right, B);
    B.add(root.val);
  }

  public static void main(String[] args) {

  }
}
