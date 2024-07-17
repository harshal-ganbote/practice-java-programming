package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Lecture.ThreadDemo2;

public class LightRoom {

  public static void main(String[] args) {
    System.out.println("I am the main thread");

    Thread imgProcessorThread = new Thread(new ProcessImage());
    Thread imgUploaderThread = new Thread(new UploadPhotos());

    imgProcessorThread.start();
    imgUploaderThread.start();

    System.out.println("Doing some work in main thread");
  }
}
