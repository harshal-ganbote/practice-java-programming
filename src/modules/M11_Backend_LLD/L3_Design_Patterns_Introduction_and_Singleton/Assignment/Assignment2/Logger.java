package modules.M11_Backend_LLD.L3_Design_Patterns_Introduction_and_Singleton.Assignment.Assignment2;

interface Logger {
  void log(LogLevel level, String message);

  void setLogFile(String filePath);

  String getLogFile();

  // Flush the log entries to the file
  void flush();

  // Close the logger and release any resources
  void close();
}
