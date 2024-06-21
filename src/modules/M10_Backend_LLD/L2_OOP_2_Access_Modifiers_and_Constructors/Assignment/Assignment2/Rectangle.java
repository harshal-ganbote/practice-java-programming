package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Assignment.Assignment2;

class Rectangle {
  Point topLeft, bottomRight;

  Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
    this.topLeft = new Point(topLeftX, topLeftY);
    this.bottomRight = new Point(bottomRightX, bottomRightY);
  }

  Rectangle(Point topLeft, Point bottomRight) {
    this.topLeft = new Point(topLeft);
    this.bottomRight = new Point(bottomRight);
  }

  Rectangle(Rectangle rectangle) {
    this.topLeft = new Point(rectangle.topLeft);
    this.bottomRight = new Point(rectangle.bottomRight);
  }
}
