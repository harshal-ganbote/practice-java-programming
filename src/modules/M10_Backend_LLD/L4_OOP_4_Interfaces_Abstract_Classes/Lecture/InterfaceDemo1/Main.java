package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo1;

public class Main {

  public static void main(String[] args) {
    Bird bird = new Bird();
    bird.fly();
    bird.eat();
    bird.transform();

    Drone drone = new Drone();
    drone.fly();
    drone.clickPicture();

    DJMiniDrone djMiniDrone = new DJMiniDrone();
    djMiniDrone.fly();
  }
}
