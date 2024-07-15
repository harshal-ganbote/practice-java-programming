package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo2;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.println(circle.getArea());

    Rectangle rectangle = new Rectangle(10, 2);
    System.out.println(rectangle.getArea());

    List<Shape> shapes = new ArrayList<>();
    shapes.add(circle);
    shapes.add(rectangle);

    for (Shape shape : shapes) {
      System.out.println(shape.getArea());
    }

    Picture picture = new Picture("Monkey");

    List<Drawable> drawableList = new ArrayList<>();
    drawableList.add(rectangle);
    drawableList.add(circle);
    drawableList.add(picture);

    for (Drawable drawable : drawableList) {
      drawable.draw();
    }
  }
}
