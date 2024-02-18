package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.Lecture;

import java.util.LinkedList;
import java.util.Queue;

import modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L25_Trees_Basics.TreeNode;

public class CreateBinaryTree {

  public static TreeNode buildTreeFromArray(Integer[] arr) {

    if (arr == null || arr.length == 0 || arr[0] == null) {
      return null;
    }

    TreeNode root = new TreeNode(arr[0]);
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    for (int i = 1; i < arr.length; i++) {
      TreeNode parent = queue.peek();

      if (parent != null) {
        TreeNode newNode = arr[i] == null ? null : new TreeNode(arr[i]);
        if (i % 2 == 1) {
          parent.left = newNode;
        } else {
          parent.right = newNode;
          queue.poll(); // Current parent has both children, so remove it from queue
        }
        queue.add(newNode); // Add the new node to the queue
      } else {
        queue.poll(); // Remove null parent node
        i--; // Adjust i since we're skipping a null parent
      }
    }

    return root;
  }
}
