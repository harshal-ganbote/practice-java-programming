package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Download_Manager;

public class DownloadTask implements Runnable {
  private String fileUrl;

  public DownloadTask(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  @Override
  public void run() {
    System.out.println("Downloading file from: " + fileUrl);

    for (int progress = 0; progress <= 100; progress += 10) {
      System.out.println("Progress for " + fileUrl + ": " + progress + "%");

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }

    System.out.println("Download complete for: " + fileUrl);
  }
}
