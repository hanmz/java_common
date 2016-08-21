package hanmz.common.traversal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by hanmz on 2016/8/21.
 */
public class MapTraUtil {
  // 使用For-Each迭代entries
  public static void traMap1() {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
    }
  }

  //使用For-Each迭代keys和values
  public static void traMap2() {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    //iterating over keys only
    for (Integer key : map.keySet()) {
      System.out.println("Key = " + key);
    }

    //iterating over values only
    for (Integer value : map.values()) {
      System.out.println("Value = " + value);
    }
  }

  //使用Iterator迭代
  public static void traMap3() {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
    while (entries.hasNext()) {
      Map.Entry<Integer, Integer> entry = entries.next();
      System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
  }

  //lambda
  public static void traMap4() {
    Map<String, Integer> items = new HashMap<>();
    items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
  }
}
