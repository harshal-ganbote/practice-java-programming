package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Additional_Problems.Problem1;

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  Node(Node node) {
    this.data = node.data;
    if (node.next == null) {
      this.next = null;
    } else {
      this.next = new Node(node.next.data);
    }
  }
}
