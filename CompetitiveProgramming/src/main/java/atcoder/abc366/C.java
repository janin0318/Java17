package atcoder.abc366;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class C {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    List<String> list = new ArrayList<>();

    for (int i = 0; i <= n; i++) {
      String str = sc.nextLine();

      String[] ss = str.split(" ");

      if (Objects.equals(ss[0], "1")) {
        list.add(ss[1]);
      }

      if (Objects.equals(ss[0], "2")) {
        list.remove(ss[1]);
      }

      if (Objects.equals(ss[0], "3")) {
        List<String> result = list.stream().distinct().toList();
        System.out.println(result.size());
      }
    }
  }

}
