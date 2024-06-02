package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DeepCopyExample {
  int data;
  List<Integer> list;

  DeepCopyExample(int data, List<Integer> list) {
    this.data = data;
    this.list = new ArrayList<>(list); // deep copy
  }

  @Override
  public String toString() {
    return "DeepCopyExample{" +
            "data=" + data +
            ", list=" + list +
            '}';
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    DeepCopyExample deepCopyExample = new DeepCopyExample(5, list);

    list.add(7);
    System.out.println(list);
    System.out.println(deepCopyExample);
  }
}
