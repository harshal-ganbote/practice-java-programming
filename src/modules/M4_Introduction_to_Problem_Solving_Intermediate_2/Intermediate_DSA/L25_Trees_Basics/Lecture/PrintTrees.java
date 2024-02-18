package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Lecture;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.TreeNode;

public class PrintTrees {

  /*
   * In Order Printing (L D R)
   * Q Given a tree print In Order.
   */
  static void inOrderPrint(TreeNode root) {

    if (root == null) {
      return;
    }

    inOrderPrint(root.left);
    System.out.print(root.val + " ");
    inOrderPrint(root.right);
  }

  /*
   * Pre Order Printing (D L R)
   * Q Given tree print Pre Order.
   */
  static void preOrderPrint(TreeNode root) {

    if (root == null) {
      return;
    }

    System.out.print(root.val + " ");
    preOrderPrint(root.left);
    preOrderPrint(root.right);
  }

  /*
   * Post order Printing (L R D)
   * Q Given tree print Post Order.
   */
  static void postOrder(TreeNode root) {

    if (root == null) {
      return;
    }

    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.val + " ");
  }

  public static void main(String[] args) {
    Integer[] arr1 = { 14, 18, 19, 7, 3, 10, null, null, null, 8, 4, 15, null, null };
    Integer[] arr2 = { 9, 6, 10, 4, 3, 14, 20 };
    TreeNode t1 = CreateBinaryTree.buildTreeFromArray(arr1);
    TreeNode t2 = CreateBinaryTree.buildTreeFromArray(arr2);

    System.out.println();
    System.out.println("Q Given a tree print In Order.");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Output ->");
    inOrderPrint(t1);
    System.out.println();
    System.out.println("-----------------------------------");
    System.out.println("Output ->");
    inOrderPrint(t2);
    System.out.println();
    System.out.println("-------------------------------------");
    System.out.println("Q Given tree print Pre Order.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Output ->");
    preOrderPrint(t1);
    System.out.println();
    System.out.println("-----------------------------------");
    System.out.println("Output ->");
    preOrderPrint(t2);
    System.out.println();
    System.out.println("-------------------------------------");
    System.out.println("Q Given tree print Post Order.");
    System.out.println("--------------------------------------------------");
    System.out.println("Time Complexity -> O(N)");
    System.out.println("Space Complexity -> O(N)");
    System.out.println("-----------------------------------");
    System.out.println("Output ->");
    postOrder(t1);
    System.out.println();
    System.out.println("-----------------------------------");
    System.out.println("Output ->");
    postOrder(t2);
    System.out.println();
    System.out.println("-------------------------------------");
    System.out.println();
  }
}
