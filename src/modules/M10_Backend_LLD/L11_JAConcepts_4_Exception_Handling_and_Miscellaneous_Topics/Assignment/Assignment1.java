package modules.M10_Backend_LLD.L11_JAConcepts_4_Exception_Handling_and_Miscellaneous_Topics.Assignment;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Assignment1 {

  static List<Integer> getOdd(Stream<Integer> stream){
    // write code here
    return stream.filter(num -> (num & 1) == 1).collect(Collectors.toList());
  }
}
