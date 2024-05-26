package modules.M10_Backend_LLD.L9_Java_Advanced_Concepts_1_Generics.Additional_Problems;

class Car implements Comparable<Car> {
  private int speed;
  private int power;

  public Car(int speed, int power) {
    this.speed = speed;
    this.power = power;
  }

  @Override
  public String toString() {
    return "[S=" + this.speed + ", P=" + this.power + "]";
  }

  @Override
  public int compareTo(Car obj) {
    if (this.speed < obj.speed && this.power < obj.power) {
      return -1;
    } else if (this.speed > obj.speed && this.power > obj.power) {
      return 1;
    } else {
      return 0;
    }
  }
}
