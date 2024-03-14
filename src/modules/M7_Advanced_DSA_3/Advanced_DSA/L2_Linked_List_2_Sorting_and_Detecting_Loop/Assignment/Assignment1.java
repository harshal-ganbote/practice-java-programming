package modules.M7_Advanced_DSA_3.Advanced_DSA.L2_Linked_List_2_Sorting_and_Detecting_Loop.Assignment;

import modules.M7_Advanced_DSA_3.Advanced_DSA.ListNode;

public class Assignment1 {

  /*
   * Problem Description
   * You are using Google Maps to help you find your way around a new place. But,
   * you get lost and end up walking in a circle. Google Maps has a way to keep
   * track of where you've been with the help of special sensors.These sensors
   * notice that you're walking in a loop, and now, Google wants to create a new
   * feature to help you figure out exactly where you started going in circles.
   * 
   * Here's how we can describe the challenge in simpler terms: You have a Linked
   * List A that shows each step of your journey, like a chain of events. Some of
   * these steps have accidentally led you back to a place you've already been,
   * making you walk in a loop. The goal is to find out the exact point where you
   * first started walking in this loop, and then you want to break the loop by
   * not going in the circle just before this point.
   * 
   * 
   * Problem Constraints
   * 1 <= number of nodes <= 1000
   */
  static ListNode solve(ListNode A) {

    ListNode slowP = A, fastP = A;

    while (fastP.next != null && fastP.next.next != null) {
      slowP = slowP.next;
      fastP = fastP.next.next;

      if (slowP == fastP) {
        break;
      }
    }

    if (slowP == fastP) {
      ListNode p1 = A, p2 = fastP;

      while (p1.next != p2.next) {
        p1 = p1.next;
        p2 = p2.next;
      }

      p2.next = null;
    }

    return A;
  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2 };
    int[] arr2 = { 3, 2, 4, 5, 6 };
    ListNode h1 = ListNode.create(arr1, 1);
    ListNode h2 = ListNode.create(arr2, 3);

    System.out.println();
    ListNode.print(solve(h1));
    System.out.println("------------");
    ListNode.print(solve(h2));
    System.out.println();
  }
}
