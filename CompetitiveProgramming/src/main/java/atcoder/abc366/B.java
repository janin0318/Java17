package atcoder.abc366;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    List<char[]> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      String s = sc.next();
      list.add(s.toCharArray());
    }
  }
}
