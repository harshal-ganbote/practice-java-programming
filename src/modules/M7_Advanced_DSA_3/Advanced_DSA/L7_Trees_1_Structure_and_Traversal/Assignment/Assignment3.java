package modules.M7_Advanced_DSA_3.Advanced_DSA.L7_Trees_1_Structure_and_Traversal.Assignment;

import java.util.ArrayList;

import modules.M7_Advanced_DSA_3.Advanced_DSA.TreeNode;

public class Assignment3 {

  /*
   * Problem Description
   * Given a binary tree, return the preorder traversal of its nodes values.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= number of nodes <= 10^5
   */
  static ArrayList<Integer> preorderTraversal(TreeNode A) {
    ArrayList<Integer> ans = new ArrayList<>();
    preOrder(A, ans);
    return ans;
  }

  static void preOrder(TreeNode A, ArrayList<Integer> ans) {

    if (A == null) {
      return;
    }

    ans.add(A.val);
    preOrder(A.left, ans);
    preOrder(A.right, ans);
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 3, 2 };
    int[] arr2 = { 3, 2, 1 };
    int[] arr3 = { 6, 1, 3, 2 };
    int[] arr4 = { 6, 3, 2, 1 };
    TreeNode t1 = TreeNode.create(arr1, arr2);
    TreeNode t2 = TreeNode.create(arr3, arr4);

    System.out.println();
    System.out.println(preorderTraversal(t1));
    System.out.println("----------");
    System.out.println(preorderTraversal(t2));
    System.out.println();
  }
}
