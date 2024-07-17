package modules.M10_Backend_LLD.L5_Concurrency_1_Introduction_to_Processes_and_Threads.Lecture.ThreadDemo2;

public class UploadPhotos implements Runnable {

  @Override
  public void run() {
    System.out.println("Uploading photos to cloud!");
  }
}
