package modules.M11_Backend_LLD.L5_Design_Patterns_Prototype_and_Registry.Lecture;

import java.util.HashMap;

class StudentRegistry {
  private static final HashMap<String, Student> studentHashMap = new HashMap<>();

  public static void register(String key, Student student) {
    studentHashMap.put(key, student);
  }

  public static Student get(String key) {
    return studentHashMap.get(key).copy();
  }

  public static void fillRegistry() {
    Student academyStudent = new Student();
    academyStudent.type = "Academy";

    Student SSTStudent = new Student();
    SSTStudent.type = "SST";

    Student SSBStudent = new Student();
    SSBStudent.type = "SSB";

    register(academyStudent.type, academyStudent);
    register(SSTStudent.type, SSTStudent);
    register(SSBStudent.type, SSBStudent);
  }
}
