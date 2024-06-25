package modules.M11_Backend_LLD.L2_SOLID_Liskov_Interface_Segregation_Dependency_Inversion.Lecture.BirdV4;

class Main {
  public static void main(String[] args) {
    Owl owl = new Owl(new FlyLow());
    owl.eat();
    owl.makeSound();
    owl.fly();

    System.out.println("-----------------------");

    Peacock peacock = new Peacock(new FlyLow());
    peacock.eat();
    peacock.makeSound();
    peacock.fly();

    System.out.println("-----------------------");

    Bird penguin = new Penguin();
    penguin.eat();
    penguin.makeSound();

    System.out.println("-----------------------");

    Eagle eagle = new Eagle(new FlyHigh());
    eagle.eat();
    eagle.makeSound();
    eagle.fly();

    System.out.println("-----------------------");

    Vulture vulture = new Vulture(new FlyHigh());
    vulture.eat();
    vulture.makeSound();
    vulture.fly();

  }
}
