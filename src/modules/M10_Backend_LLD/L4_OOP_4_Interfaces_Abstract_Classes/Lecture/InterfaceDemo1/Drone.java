package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo1;

public class Drone implements Fly {

  @Override
  public void fly() {
    System.out.println("Drone is flying!");
  }

  public void clickPicture() {
    System.out.println("Drone is clicking pics");
  }
}
