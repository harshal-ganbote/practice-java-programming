package modules.M11_Backend_LLD.L1_SOLID_1_SRP_and_OCP.BirdV0;

class Bird {
  String name;
  String color;
  int wings;
  String type;
  float weight;

  public void eat() {
    System.out.println("bird is eating.");
  }

  public void makeSound() {
    if (this.type.equals("sparrow")) {
      System.out.println("sparrow makes sound");
    } else if (this.type.equals("crow")) {
      System.out.println("crow makes sound");
    } else if (this.type.equals("Owe")) {
      System.out.println("owe makes sound");
    } else {
      System.out.println("bird makes sound.");
    }
  }

  public void fly() {
    System.out.println("bird is flying.");
  }
}
