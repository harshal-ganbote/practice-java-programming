package modules.M7_Advanced_DSA_3.Advanced_DSA.L4_Stacks_1_Implementation_and_Basic_Problems.Lecture;

public class StacksArray {

  int capacity = 0;
  int top = -1;
  int[] data;

  StacksArray(int capacity) {
    this.capacity = capacity;
    data = new int[capacity];
  }

  void push(int val) {

    if (top == capacity - 1) {
      System.out.println("capacity is full.");
      return;
    }

    top++;
    data[top] = val;
  }

  void pop() {
    if (isEmpty()) {
      System.out.println("stack is empty.");
      return;
    }
    top--;
  }

  int peek() {

    if (isEmpty()) {
      System.out.println("stack is empty.");
      return -1;
    }

    return data[top];
  }

  boolean isEmpty() {
    return top == -1;
  }

  void print() {
    for (int index = 0; index <= top; index++) {
      System.out.print(data[index] + " ");
    }

    System.out.println();
  }
}
