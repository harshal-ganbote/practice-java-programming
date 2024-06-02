package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Lecture;

import java.util.Arrays;

class Test {
  public int n;
  String name;
  int arr[];

  Test(int n, String name) {
    this.n = n;
    this.name = name;
    this.arr = new int[n];
    for (int index = 0; index < n; index++) {
      arr[index] = index + 1;
    }
  }

  Test(Test obj) {
    this.n = obj.n;
    this.name = obj.name;
    this.arr = new int[this.n];
    System.arraycopy(obj.arr, 0, this.arr, 0, this.n);
  }

  @Override
  public String toString() {
    return "Test{" +
            "n=" + n +
            ", name='" + name + '\'' +
            ", arr=" + Arrays.toString(arr) +
            '}';
  }
}
