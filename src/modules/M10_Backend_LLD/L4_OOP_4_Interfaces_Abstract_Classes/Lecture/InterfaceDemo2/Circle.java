package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo2;

public class Circle extends Shape implements Drawable {
  int radius;

  Circle(int radius) {
    this.radius = radius;
  }

  float getArea() {
    return (float) Math.PI * radius * radius;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a circle with  radius " + radius);
  }
}
