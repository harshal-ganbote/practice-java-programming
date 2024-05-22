package modules.M10_Backend_LLD.L1_OOP_1_Intro_to_LLD_and_OOP.Lecture;

class Player {
  String name;
  // default access modifier - access is allowed inside the class,
  // outside the class but in the same package
  private int number;
  private int age;

  private int generateNumber(int limit) {
    return (int)(Math.random() * limit);
  }

  void setAge(int age) {
    this.age = Math.max(age, 18);
  }

  int getAge() {
    return this.age;
  }

  void makeGuess(int limit) {
    this.number = generateNumber(limit);
    System.out.println(this.name + " guessed: " + this.number);
  }

  int getNumber() {
    return this.number;
  }
}
