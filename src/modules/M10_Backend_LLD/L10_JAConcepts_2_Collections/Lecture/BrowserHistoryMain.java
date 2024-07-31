package modules.M10_Backend_LLD.L10_JAConcepts_2_Collections.Lecture;

public class BrowserHistoryMain {

  public static void main(String[] args) {
    BrowserHistory browserHistory = new BrowserHistory();
    browserHistory.push("instagram.com");
    browserHistory.push("Linkedin.com");
    browserHistory.push("google.com");
    browserHistory.pop();
    browserHistory.push("chat.openai.com");

    MyIterator it = browserHistory.iterator();

    while (it.hasNext()) {
      it.next();
      System.out.println(it.current());
    }
  }
}
