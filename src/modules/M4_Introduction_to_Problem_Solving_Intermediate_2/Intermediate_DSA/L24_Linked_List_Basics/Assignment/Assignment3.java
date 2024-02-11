package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L20_Linked_List_Basics.Assignment;

/*
 * Problem Description
 * Construct a class Circle that represents a Circle.
 * 
 * The class should support the following functionalities:-
 * perimeter() -> returns the perimeter of the circle
 * area() -> returns the area of the circle
 * 
 * Note: Assume Π (pi) = 3.14 for calculations.
 */

class Circle {
  int radius = 0;
  float pi = 3.14f;

  Circle(int r) {
    radius = r;
  }

  float perimeter() {
    return 2 * pi * radius;
  }

  float area() {
    return pi * radius * radius;
  }
}

public class Assignment3 {

  public static void main(String[] args) {
    Circle a1 = new Circle(1);
    Circle a2 = new Circle(2);

    System.out.println();
    System.out.println(a1.perimeter());
    System.out.println(a1.area());
    System.out.println("---------");
    System.out.println(a2.perimeter());
    System.out.println(a2.area());
  }
}
