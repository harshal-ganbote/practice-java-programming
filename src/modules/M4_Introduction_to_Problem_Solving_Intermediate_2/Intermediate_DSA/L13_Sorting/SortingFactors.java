package modules.M4_Introduction_to_Problem_Solving_Intermediate_2.Intermediate_DSA.L13_Sorting;

import java.util.Arrays;

public class SortingFactors {
  
  
  static void sortUsingFactors(Integer[] A) {
    MyFactorComparator comparator = new MyFactorComparator();

    Arrays.sort(A, comparator);
  }

  public static void main(String[] args) {
    Integer[] arr1 = {9, 3, 4, 8, 16, 37, 6, 13, 15};
    Integer[] arr2 = {1, 21, 6, 23, 10, 14, 25};

    System.out.println("""
        Q Given N array elements, sort them in increasing order of their No of factors.
        If 2 elements have same no. of factors, element with less value should come first.
        Note: No extra space allowed.""");
    System.out.println("----------------------------------------------------------------");
    System.out.println("Time Complexity -> O(N^longN)");
    System.out.println("Space Complexity -> O(1)");
    System.out.println("-----------------------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr1));
    System.out.println("Output ->");
    sortUsingFactors(arr1);
    System.out.println(Arrays.toString(arr1));
    System.out.println("------------------");
    System.out.println("Input Array ->");
    System.out.println(Arrays.toString(arr2));
    System.out.println("Output ->");
    sortUsingFactors(arr2);
    System.out.println(Arrays.toString(arr2));
    System.out.println("------------------");
  }
}
