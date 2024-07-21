package modules.M10_Backend_LLD.L6_Concurrency_2_Executors_and_Callables.Lecture.Download_Manager;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownloadManager {
  private ExecutorService executorService;

  DownloadManager(int threadPoolSize) {
    executorService = Executors.newFixedThreadPool(threadPoolSize);
  }

  public void downloadFiles(List<String> fileUrls) {
    for (String fileUrl : fileUrls) {
      executorService.submit(new DownloadTask(fileUrl));
    }
  }

  public void shutdown() {
    executorService.shutdown();
  }
}
