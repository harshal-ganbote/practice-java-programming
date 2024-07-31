package modules.M10_Backend_LLD.L10_JAConcepts_2_Collections.Lecture;

public class BrowserHistory {
  private String[] webUrls;
  private int count;

  BrowserHistory() {
    webUrls = new String[10];
    count = 0;
  }

  public void push(String url) {
    webUrls[count++] = url;
  }

  public String pop() {
    return webUrls[--count];
  }

  public int getCount() {
    return count;
  }

  public MyIterator iterator() {
    return new ArrayIterator(this);
  }

  /**
   * ArrayIterator
   */
  static class ArrayIterator implements MyIterator {
    private BrowserHistory history;
    private int index;

    ArrayIterator(BrowserHistory history) {
      this.history = history;
      this.index = 0;
    }

    @Override
    public boolean hasNext() {
      if (index < history.count) {
        return true;
      }
      return false;
    }

    @Override
    public void next() {
      index++;
    }

    @Override
    public String current() {
      return history.webUrls[index];
    }
  }
}
