package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Assignment;

import java.util.ArrayList;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.TreeNode;
import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Lecture.CreateBinaryTree;

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
    Integer[] arr1 = { 1, 3, 2 };
    Integer[] arr2 = { 6, 1, 2, 3 };
    TreeNode t1 = CreateBinaryTree.buildTreeFromArray(arr1);
    TreeNode t2 = CreateBinaryTree.buildTreeFromArray(arr2);

    System.out.println();
    System.out.println(postOrderTraversal(t1));
    System.out.println("------------");
    System.out.println(postOrderTraversal(t2));
    System.out.println();
  }
}
