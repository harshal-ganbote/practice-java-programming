package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Executors;

public class ProcessImage implements Runnable {

  void brighten() {
    System.out.println("Brightening the image");
  }

  void sharpen() {
    System.out.println("Sharpening the image");
  }

  @Override
  public void run() {
    System.out.println("Processing the Image.");

    brighten();
    sharpen();
  }

}
