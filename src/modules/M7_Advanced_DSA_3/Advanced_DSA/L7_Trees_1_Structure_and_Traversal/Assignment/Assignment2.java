package modules.M7_Advanced_DSA_3.Advanced_DSA.L7_Trees_1_Structure_and_Traversal.Assignment;

import java.util.HashMap;

import modules.M7_Advanced_DSA_3.Advanced_DSA.TreeNode;

public class Assignment2 {

  /*
   * Problem Description
   * Given the in order and post order traversal of a tree, construct the binary
   * tree.
   * 
   * NOTE: You may assume that duplicates do not exist in the tree.
   * 
   * 
   * 
   * Problem Constraints
   * 1 <= number of nodes <= 10^5
   */
  static TreeNode buildTree(int[] A, int[] B) {
    HashMap<Integer, Integer> hMap = new HashMap<>();
    int N = A.length;

    for (int index = 0; index < N; index++) {
      hMap.put(A[index], index);
    }

    return createTreeNode(A, B, 0, N - 1, N - 1, hMap);
  }

  static TreeNode createTreeNode(int[] A, int[] B, int s, int e, int pos, HashMap<Integer, Integer> hMap) {

    if (s == e) {
      return new TreeNode(A[s]);
    }

    if (s > e) {
      return null;
    }

    int rootVal = B[pos];
    TreeNode root = new TreeNode(rootVal);
    int index = hMap.get(rootVal);

    root.left = createTreeNode(A, B, s, index - 1, pos - (e - index) - 1, hMap);
    root.right = createTreeNode(A, B, index + 1, e, pos - 1, hMap);

    return root;
  }

  public static void main(String[] args) {
    int[] arr1 = { 6, 4, 7, 2, 5, 1, 10, 3, 12, 11, 13 };
    int[] arr2 = { 6, 7, 4, 5, 2, 10, 12, 13, 11, 3, 1 };
    int[] arr3 = { 6, 1, 3, 2 };
    int[] arr4 = { 6, 3, 2, 1 };
    TreeNode t1 = buildTree(arr1, arr2);
    TreeNode t2 = buildTree(arr3, arr4);

    System.out.println();
    TreeNode.print(t1);
    System.out.println("----------");
    TreeNode.print(t2);
    System.out.println();
  }
}
