package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics.Lecture;

public class PracticeRectangle {

  /*
   * The main method demonstrates creating Rectangle objects and accessing their
   * length, breadth, area and perimeter.
   * Two Rectangle objects are created - one using the default constructor and
   * then setting length and breadth,
   * and one using the constructor that takes length and breadth.
   * The area() and perimeter() methods are called on one Rectangle to print its
   * area and perimeter.
   */
  public static void main(String[] args) {
    Rectangle rec1 = new Rectangle();
    Rectangle rec2 = new Rectangle();
    Rectangle rec3 = new Rectangle(30, 22);

    rec1.length = 20;
    rec1.breadth = 10;

    System.out.println();
    System.out.println(rec1.area());
    System.out.println(rec1.perimeter());

    System.out.println("------------------");

    rec2.length = 40;
    rec2.breadth = 100;

    System.out.println(rec2.area());
    System.out.println(rec2.perimeter());

    System.out.println("------------------");

    System.out.println(rec3.area());
    System.out.println(rec3.perimeter());

    System.out.println();
  }
}
