package collection;
import java.util.stream.Collectors;

import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    //return null;
    return input.stream().map(x -> Math.pow(((x*2)+3),5)).collect(Collectors.toList());
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    //return null;
    return input.stream()
                .map(x -> x.length() > 0
                ? x.substring(0, 1).toUpperCase() + x.substring(1) + x.substring(0, 1).toUpperCase() + x.substring(1)
                : x)
                .collect(Collectors.toList());
  }

}
