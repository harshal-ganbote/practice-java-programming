package modules.M10_Backend_LLD.L1_OOP_1_Intro_to_LLD_and_OOP.Assignment.Assignment1;

class Student {
  int age;
  String name;

  void display() {
    System.out.println("My name is " + this.name +". I am " + this.age +" years old");
  }

  void sayHello(String name) {
    System.out.println(this.name + " says hello to " + name);
  }

  private static void swap(Student s1, Student s2) {
    Student temp = s1;
    s1 = s2;
    s2 = temp;
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.name = "Harshal";
    s.age = 31;
    String name = "Sharaddha";

    s.display();
    s.sayHello(name);

    Student s1 = new Student();
    s1.age = 10;
    s1.name = "A";

    Student s2 = new Student();
    s2.age = 20;
    s2.name = "B";

    swap(s1, s2);

    s1.display();
  }
}
