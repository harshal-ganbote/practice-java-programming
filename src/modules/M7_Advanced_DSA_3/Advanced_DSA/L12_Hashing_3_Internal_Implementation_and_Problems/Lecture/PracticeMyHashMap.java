package modules.M7_Advanced_DSA_3.Advanced_DSA.L12_Hashing_3_Internal_Implementation_and_Problems.Lecture;

public class PracticeMyHashMap {

  public static void main(String[] args) {
    MyHashMap<Integer, Integer> myHashMap = new MyHashMap<>();

    myHashMap.put(1, 10);
    myHashMap.put(2, 4);
    myHashMap.put(3, 75);
    myHashMap.put(4, 44);
    myHashMap.put(5, 4);

    System.out.println();
    System.out.println("Given Hash Map is ->");
    System.out.println(myHashMap);
    System.out.println("Get value using key ->");
    System.out.println(myHashMap.get(3));
    System.out.println("------------------");
    System.out.println("Size of hash map");
    System.out.println(myHashMap.size());
    System.out.println("-------------------");
    System.out.println("Check if key = 4 is present in hash map or not ->");
    System.out.println(myHashMap.containsKey(4));
    System.out.println("------");
    System.out.println("Check if key = 11 is present in hash map or not ->");
    System.out.println(myHashMap.containsKey(11));
    System.out.println();
  }
}
