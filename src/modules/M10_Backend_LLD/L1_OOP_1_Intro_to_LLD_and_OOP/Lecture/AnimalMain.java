package modules.M10_Backend_LLD.L1_OOP_1_Intro_to_LLD_and_OOP.Lecture;

class AnimalMain {

  public static void makeNoise(Animal animal) {
    for (int i = 0; i < 10; i++) {
      animal.speak();
    }
  }

  public static void main(String[] args) {
    Dog d = new Dog();
    d.name = "Cody";

    Cat c = new Cat();
    c.name = "Mano";

    d.sleep();
    d.speak();
    c.sleep();
    d.speak();

    makeNoise(c);

    Animal animal = new Animal();
    animal.name = "Random Animal";
    System.out.println(animal.name);
    makeNoise(animal);
  }
}
