package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo2;

public class Rectangle extends Shape implements Drawable {
  int length;
  int breadth;

  Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  float getArea() {
    return (float) length * breadth;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Rectangle of size " + length + " ," + breadth);
  }
}
