package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.InterfaceDemo3;

public class ImageStore implements CompressFiles {

  public void store(String fileName) {
    compress();
    System.out.println("storing the final image");
  }

  @Override
  public void compress() {
    System.out.println("compressing the image");
  }
}
