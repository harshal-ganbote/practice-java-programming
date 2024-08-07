package modules.M10_Backend_LLD.L11_JAConcepts_3_Streams_and_Lambdas.Lecture.Lambdas;

public class ThreadCreationMain {

  public static void main(String[] args) {
    Runnable runnable = new Task();
    Thread thread = new Thread(runnable);
    thread.start();

    Runnable runnableLambdas = () -> {
      System.out.println("Clicking photos!");
      System.out.println("Making reels!");
    };

    Thread threadLambda = new Thread(runnableLambdas);
    threadLambda.start();
  }
}
