package modules.M7_Advanced_DSA_3.Advanced_DSA;

import java.util.HashMap;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int val) {
    this.val = val;
    left = null;
    right = null;
  }

  /*
   * CreateTreeNode
   */
  static class CreateTreeNode {
    int[] inOrder;
    int[] postOrder;
    HashMap<Integer, Integer> hMap = new HashMap<>();

    CreateTreeNode(int[] inOrder, int[] postOrder) {
      this.inOrder = inOrder;
      this.postOrder = postOrder;
      for (int index = 0; index < inOrder.length; index++) {
        hMap.put(inOrder[index], index);
      }
    }

    TreeNode constructTree(int s, int e, int pos) {

      if (s == e) {
        TreeNode rNode = new TreeNode(inOrder[s]);
        return rNode;
      }
      if (s > e) {
        return null;
      }

      int val = postOrder[pos];
      TreeNode root = new TreeNode(val);
      int index = hMap.get(val);

      root.left = constructTree(s, index - 1, pos - (e - index) - 1);
      root.right = constructTree(index + 1, e, pos - 1);

      return root;
    }
  }

  public static TreeNode create(int[] inOrder, int[] postOrder) {
    CreateTreeNode cTreeNode = new CreateTreeNode(inOrder, postOrder);
    int N = postOrder.length;
    return cTreeNode.constructTree(0, N - 1, N - 1);
  }

  static void inOrder(TreeNode root) {

    if (root == null) {
      return;
    }

    inOrder(root.left);
    System.out.print(root.val + " ");
    inOrder(root.right);
  }

  public static void print(TreeNode root) {
    inOrder(root);
    System.out.println();
  }

}
