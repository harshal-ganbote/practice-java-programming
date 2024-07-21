package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Download_Manager;

import java.util.List;

public class DownloadManagerApp {

  public static void main(String[] args) {
    DownloadManager downloadManager = new DownloadManager(3);

    List<String> filesToDownload = List.of("file1", "file2", "file3", "file4", "file5");

    downloadManager.downloadFiles(filesToDownload);

    for (int index = 0; index < 10; index++) {
      System.out.println("Main thread is doing some work...");

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }

    downloadManager.shutdown();
  }
}
