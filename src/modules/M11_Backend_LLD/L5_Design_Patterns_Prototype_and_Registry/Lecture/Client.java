package modules.M11_Backend_LLD.L5_Design_Patterns_Prototype_and_Registry.Lecture;

class Client {

  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = student1.copy();

    System.out.println(student1);
    System.out.println(student2);

    System.out.println();

    Student student3 = new IntelligentStudent();
    Student student4 = student3.copy();

    System.out.println(student3);
    System.out.println(student4);

    System.out.println();

    StudentRegistry.fillRegistry();
    Student student5 = StudentRegistry.get("Academy");

    System.out.println(student5);
  }
}
