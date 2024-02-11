package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L24_Linked_List_Basics;

public class PracticeStudent {

  public static void main(String[] args) {
    Student st1 = new Student("Harsh", 30, 100);
    Student st2 = new Student("Shraddha", 26, 100);

    System.out.println(st1.name);
    System.out.println(st1.age);
    System.out.println(st1.marks);

    st1.setAge(-10);
    System.out.println(st1.age);

    System.out.println("------------------");

    System.out.println(st2.name);
    System.out.println(st2.age);
    System.out.println(st2.marks);

    st1.setAge(27);
    System.out.println(st1.age);
  }
}
