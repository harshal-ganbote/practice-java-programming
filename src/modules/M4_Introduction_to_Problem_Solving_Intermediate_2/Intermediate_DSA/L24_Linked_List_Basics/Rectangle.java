package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L20_Linked_List_Basics;

public class Rectangle {

  int length = 0;
  int breadth = 0;

  Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public Rectangle() {
  }

  int area() {
    return length * breadth;
  }

  int perimeter() {
    return 2 * (length * breadth);
  }

}
