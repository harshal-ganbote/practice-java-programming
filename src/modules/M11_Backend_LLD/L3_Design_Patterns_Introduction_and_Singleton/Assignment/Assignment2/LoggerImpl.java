package modules.M11_Backend_LLD.L3_Design_Patterns_Introduction_and_Singleton.Assignment.Assignment2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class LoggerImpl implements Logger {
  private static LoggerImpl logger;
  private PrintWriter printWriter;
  private String filePath;

  private LoggerImpl() {}

  @Override
  public void log(java.util.logging.Logger level, String message) {
    if (this.printWriter == null) {
      throw new IllegalStateException();
    }

    this.printWriter.append(level.toString());
    this.printWriter.append(message);
  }

  @Override
  public void setLogFile(String filePath) {
    try {
      this.filePath = filePath;
      printWriter = new PrintWriter(filePath);
    } catch (FileNotFoundException ignored) {

    }
  }

  @Override
  public String getLogFile() {
    return this.filePath;
  }

  @Override
  public void flush() {
    this.printWriter.flush();
  }

  @Override
  public void close() {
    this.printWriter = null;
  }

  public static Logger getInstance() {
    if (logger != null) {
      return logger;
    }

    synchronized (LoggerImpl.class) {
      if (logger == null) {
        logger = new LoggerImpl();
      }
    }

    return logger;
  }
}
