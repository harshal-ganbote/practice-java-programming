package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics;

public class PrintTrees {

  // * In Order Printing (L D R)
  static void inOrderPrint(Node root) {

    if (root == null) {
      return;
    }

    inOrderPrint(root.left);
    System.out.print(root.data + " ");
    inOrderPrint(root.right);
  }

  // * Pre Order Printing (D L R)
  static void preOrderPrint(Node root) {

    if (root == null) {
      return;
    }

    System.out.print(root.data + " ");
    preOrderPrint(root.left);
    preOrderPrint(root.right);
  }

  // * Post order Printing (L R D)
  static void postOrder(Node root) {

    if (root == null) {
      return;
    }

    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.data + " ");
  }

}
