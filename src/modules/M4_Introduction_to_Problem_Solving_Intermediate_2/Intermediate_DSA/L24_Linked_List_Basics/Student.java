package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L20_Linked_List_Basics;

public class Student {

  String name = "";
  int age = 0;
  int marks = 0;

  Student(String n, int a, int m) {
    name = n;
    age = a;
    marks = m;
  }

  void setAge(int a) {
    if (a <= 0 || a >= 150) {
      System.out.println("Invalid age");
    } else {
      age = a;
    }
  }

}
