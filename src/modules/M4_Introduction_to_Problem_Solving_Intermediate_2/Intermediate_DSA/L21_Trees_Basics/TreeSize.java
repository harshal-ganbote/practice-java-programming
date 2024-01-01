package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L21_Trees_Basics;

public class TreeSize {

  static int size(Node root) {

    if (root == null) {
      return 0;
    }

    int left = size(root.left);
    int right = size(root.right);
    return left + right + 1;
  }

}
