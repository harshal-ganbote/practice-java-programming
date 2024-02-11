package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics;

public class HeightTree {

  static int height(Node root) {

    if (root == null) {
      return -1;
    }

    int left = height(root.left);
    int right = height(root.right);
    return 1 + Math.max(left, right);
  }

}
