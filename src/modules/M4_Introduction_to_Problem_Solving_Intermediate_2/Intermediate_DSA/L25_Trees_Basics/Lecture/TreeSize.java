package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Lecture;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.TreeNode;

public class TreeSize {

  static int size(TreeNode root) {

    if (root == null) {
      return 0;
    }

    int left = size(root.left);
    int right = size(root.right);
    return left + right + 1;
  }

  public static void main(String[] args) {
    Integer[] arr1 = { 14, 18, 19, 7, 3, 10, null, null, null, 8, 4, 15, null, null };
    Integer[] arr2 = { 9, 6, 10, 4, 3, 14, 20 };
    TreeNode t1 = CreateBinaryTree.buildTreeFromArray(arr1);
    TreeNode t2 = CreateBinaryTree.buildTreeFromArray(arr2);

    System.out.println();
    System.out.println("Q Given tree print it's size.");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Input Tree ->");
    PrintTrees.inOrderPrint(CreateBinaryTree.buildTreeFromArray(arr1));
    System.out.println();
    System.out.println("Output ->");
    System.out.println(size(t1));
    System.out.println("-------------------------------------");
    System.out.println("Input Tree ->");
    PrintTrees.inOrderPrint(CreateBinaryTree.buildTreeFromArray(arr1));
    System.out.println();
    System.out.println("Output ->");
    System.out.println(size(t2));
    System.out.println("-------------------------------------");
    System.out.println();
  }
}
