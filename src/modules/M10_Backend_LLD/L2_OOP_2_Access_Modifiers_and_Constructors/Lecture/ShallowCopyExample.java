package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ShallowCopyExample {
  int data;
  List<Integer> list;

  ShallowCopyExample(int data, List<Integer> list) {
    this.data = data;
    this.list = list;
  }

  @Override
  public String toString() {
    return "ShallowCopyExample{" +
            "data=" + data +
            ", list=" + list +
            '}';
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    ShallowCopyExample shallowCopyExample = new ShallowCopyExample(5, list);

    list.add(7);
    System.out.println(list);
    System.out.println(shallowCopyExample);
  }
}
