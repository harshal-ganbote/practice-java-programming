package modules.M10_Backend_LLD.L9_Java_Advanced_Concepts_1_Generics.Assignment;


class Point {
  private int x;
  private int y;


  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) {
    // complete the code here
    if (obj instanceof Point) {
      Point p = (Point) obj;
      return this.x == p.x && this.y == p.y;
    }
    return false;
  }

  @Override
  public int hashCode() {
    // complete the code here
    return 37 * 7 + this.x + this.y;
  }
}
