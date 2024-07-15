package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo3;

public interface Compressor {
  // void compress(String img);

  default void compress(String img) {
    System.out.println("Compressing img");
  }
}