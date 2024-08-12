package atcoder.abc366;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int q = Integer.parseInt(sc.next());

    Map<Integer, Integer> mp = new HashMap<>();

    for (int i = 0; i < q; i++) {

      int query = Integer.parseInt(sc.next());

      if (query == 1) {
        int num = Integer.parseInt(sc.next());
        mp.put(num, mp.getOrDefault(num, 0) + 1);
      }

      if (query == 2) {
        int num = Integer.parseInt(sc.next());
        mp.put(num, mp.get(num) - 1);
        if (mp.get(num) == 0) {
          mp.remove(num);
        }
      }

      if (query == 3) {
        System.out.println(mp.size());
      }
    }
  }
}
