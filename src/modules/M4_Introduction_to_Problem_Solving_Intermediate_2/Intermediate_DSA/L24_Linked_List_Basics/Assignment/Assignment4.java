package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.Assignment;

/* 
 * Problem Description
 * Constructs a class Rectangle that represents a rectangle.
 * The class should support the following functionalities:-

 * perimeter() -> returns the perimeter of the rectangle
 * area() -> returns the area of the rectangle
*/
class Rectangle {
  int length = 0, breadth = 0;

  Rectangle(int l, int r) {
    length = l;
    breadth = r;
  }

  int perimeter() {
    return 2 * (length + breadth);
  }

  int area() {
    return length * breadth;
  }

}

public class Assignment4 {

  public static void main(String[] args) {
    Rectangle rec1 = new Rectangle(1, 2);

    System.out.println();
    System.out.println(rec1.perimeter());
    System.out.println(rec1.area());
    System.out.println();
  }
}
