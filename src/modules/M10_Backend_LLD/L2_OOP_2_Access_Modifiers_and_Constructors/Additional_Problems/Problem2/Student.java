package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Additional_Problems.Problem2;

class Student {
  int age;
  String name;

  Student() {
    this(0, null);
  }

  Student(int age) {
    this(age, null);
  }

  Student(String name) {
    this(0, name);
  }

  Student(int age, String name) {
    this.age = age;
    this.name = name;
  }
}
