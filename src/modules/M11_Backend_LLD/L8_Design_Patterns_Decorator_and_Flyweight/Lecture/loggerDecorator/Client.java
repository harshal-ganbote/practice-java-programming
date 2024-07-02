package modules.M11_Backend_LLD.L8_Design_Patterns_Decorator_and_Flyweight.Lecture.loggerDecorator;

public class Client {

  public static void main(String[] args) {
    Logger logger = new BasicLogger();
    logger = new InfoLogger(logger);
    logger = new ErrorLogger(logger);
    logger.log("This is a logged message");
    System.out.println();
  }
}
