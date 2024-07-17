package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Lecture.ThreadDemo2;

public class ProcessImage implements Runnable {

  void brighten() {
    System.out.println("Brightening the image");
  }

  void sharpen() {
    System.out.println("Sharpening the image");
  }

  @Override
  public void run() {
    System.out.println("Processing the image");
    brighten();
    sharpen();
  }

}
