package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo2;

public class Picture implements Drawable {
  String name;

  Picture(String name) {
    this.name = name;
  }

  @Override
  public void draw() {
    System.out.println("Drawing a pic of " + name);
  }
}
