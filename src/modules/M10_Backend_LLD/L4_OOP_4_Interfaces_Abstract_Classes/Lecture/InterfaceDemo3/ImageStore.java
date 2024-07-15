package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo3;

public class ImageStore {

  public void store(String fileName, Compressor compressor) {
    compressor.compress(fileName);
    System.out.println("Uploading to blob storage");
  }

}
