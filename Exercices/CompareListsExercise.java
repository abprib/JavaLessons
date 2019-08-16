//Compare two lists of numbers.

import java.util.*;

public class compareListsExercise {

  static List<Integer> compareLists(List<Integer> a, List<Integer> b) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(0);
    list.add(0);
      for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i)) {
                list.set(0, list.get(0) + 1);
            } else if(a.get(i) < b.get(i)){
                list.set(1, list.get(1) + 1);
            }
        }
        return list;
    }

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>(); 

    //There is an imput section. In this case it is an Array
    int[] aArray = {1, 4, 7, 3, 5, 1, 0};
    int[] bArray = {5, 1, 7, 1, 4, 5, 7};
    for(int i = 0; i < aArray.length; i++){
      a.add(aArray[i]);
      b.add(bArray[i]);
    }

    List<Integer> result = compareLists(a, b);

    System.out.printf("Result is: %d and %d", result.get(0), result.get(1));
  }
}
