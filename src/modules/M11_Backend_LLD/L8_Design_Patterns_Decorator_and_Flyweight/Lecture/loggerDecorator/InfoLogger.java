package modules.M11_Backend_LLD.L8_Design_Patterns_Decorator_and_Flyweight.Lecture.loggerDecorator;

public class InfoLogger implements LoggerDecorator {
  Logger logger;

  public InfoLogger(Logger logger) {
    this.logger = logger;
  }

  @Override
  public void log(String message) {
    System.out.print("[INFO] ");
    logger.log(message);
  }
}
