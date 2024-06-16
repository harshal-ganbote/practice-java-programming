package modules.M11_Backend_LLD.L4_Design_Patterns_Builder;

class Main {
  public static void main(String[] args) {
    Student student = Student.getBuilder()
            .setName("Harshal")
            .setRollNo(11)
            .setAge(25)
            .setBatch("Java Refresher")
            .setMarks(97)
            .build();

    System.out.println(student);
  }
}
