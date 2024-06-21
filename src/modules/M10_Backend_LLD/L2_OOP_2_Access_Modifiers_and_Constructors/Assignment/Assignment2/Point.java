package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Assignment.Assignment2;

class Point {
  int x, y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  Point(Point point) {
    this.x = point.x;
    this.y = point.y;
  }

}
