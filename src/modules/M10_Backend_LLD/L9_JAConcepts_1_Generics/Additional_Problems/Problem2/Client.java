package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Additional_Problems.Problem2;

import java.util.TreeSet;

class Client {
  public static Integer getJustLarger(TreeSet<Integer> treeSet, int data) {
    // write the code to return value equal to or just larger than data
    return treeSet.ceiling(data);
  }

  public static Integer getJustSmaller(TreeSet<Integer> treeSet, int data) {
    // write the code to return value equal to or just smaller than data
    return treeSet.floor(data);
  }

}
