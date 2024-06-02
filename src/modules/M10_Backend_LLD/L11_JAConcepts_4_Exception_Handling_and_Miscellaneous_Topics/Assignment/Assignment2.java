package modules.M10_Backend_LLD.L11_JAConcepts_4_Exception_Handling_and_Miscellaneous_Topics.Assignment;

import java.util.stream.Stream;

class Assignment2 {

  static int getSum(Stream<Integer> stream){
    // write code here
    return stream.reduce(0, Integer::sum);
  }

}
