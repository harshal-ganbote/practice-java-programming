package modules.M7_Advanced_DSA_3.Advanced_DSA.L4_Stacks_1_Implementation_and_Basic_Problems.Lecture;

public class PracticeStack {

  public static void main(String[] args) {
    StacksArray st1 = new StacksArray(7);
    StacksLinkedList st2 = new StacksLinkedList();

    System.out.println();
    System.out.println("Q Given an stack of array perform below operations.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(1)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    st1.push(3);
    st1.push(4);
    System.out.println(st1.peek());
    st1.push(5);
    st1.pop();
    st1.push(10);
    System.out.println("Output ->");
    st1.print();
    System.out.println("------------------------------------");
    System.out.println("Q Given an stack of array perform below operations.");
    System.out.println("---------------------------------------------------");
    System.out.println("Time Complexity -> O(1)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    st2.push(3);
    st2.push(4);
    System.out.println(st2.peek());
    st2.push(5);
    st2.pop();
    st2.push(10);
    System.out.println("Output ->");
    st2.print();
    System.out.println("----------------------");
    System.out.println();
  }
}
