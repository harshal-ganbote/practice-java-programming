package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo3;

public class JPEGCompressor implements Compressor {

  public void compress(String img) {
    System.out.println("Compressing using JPG :" + img);
  }
}
