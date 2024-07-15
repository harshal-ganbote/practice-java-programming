package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo1;

public class Bird implements Fly, Transform {

  @Override
  public void transform() {
    System.out.println("Bird is getting transformed!");
  }

  @Override
  public void fly() {
    System.out.println("Bird is flying");
  }

  public void eat() {
    System.out.println("Bird is eating");
  }

}
