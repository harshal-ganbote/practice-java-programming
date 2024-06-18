package modules.M10_Backend_LLD.L1_OOP_1_Intro_to_LLD_and_OOP.Assignment.Assignment2;

class Rectangle {
  Point topLeft;
  int height;
  int width;

  int getArea() {
    return this.height * this.width;
  }

  int getPerimeter() {
    return 2 * (this.width * this.height);
  }

  Point getBottomRight() {
    Point bottomRight = new Point();

    bottomRight.x = this.topLeft.x + this.width;
    bottomRight.y = this.topLeft.y - this.height;

    return bottomRight;
  }
}
