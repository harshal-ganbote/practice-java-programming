package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo3;

public class Main {
  public static void main(String[] args) {
    ImageStore store = new ImageStore();
    store.store("myFile.xyz", new JPEGCompressor());
    store.store("someFile.xyz", new PNGCompressor());
    store.store("someFile.xyz", new FastCompressor());
  }
}
