package modules.M10_Backend_LLD.L3_OOP_3_Inheritance_and_Polymorphism.Additional_Problems;

import java.util.Iterator;
import java.util.Stack;

public class Client {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);

    // Make a call to display method as per question requirements here
    display(st);
  }

  // Write the display method as per requirements of question here
  static void display(Iterable<?> st) {
    Iterator<?> itr = st.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
