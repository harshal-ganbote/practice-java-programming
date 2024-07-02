package modules.M11_Backend_LLD.L8_Design_Patterns_Decorator_and_Flyweight.Lecture.loggerDecorator;

public class BasicLogger implements Logger {

  @Override
  public void log(String message) {
    System.out.print(message);
  }

}

// INFO Logger
// ERROR Logger
// Timestamp Logger