package atcoder.abc367;

import java.util.Scanner;

public class A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sakebu = sc.nextInt();
    int okiru = sc.nextInt();
    int neru = sc.nextInt();

    int[] jikan = new int[24];

    if (okiru > neru) {
      for (int i = okiru; i < 24; i++) {
        jikan[i] = 1;
      }

      for (int i = neru; i >= 0; i--) {
        jikan[i] = 1;
      }

      jikan[sakebu] = jikan[sakebu] + 1;

      for (int i = 0; i < 24; i++) {
        if (jikan[i] == 2) {
          System.out.println("No");
          return;
        }
      }
      System.out.println("Yes");
      return;
    }

    for (int i = okiru; i <= neru; i++) {
      jikan[i] = 1;
    }

    jikan[sakebu] = jikan[sakebu] + 1;

    for (int i = 0; i < 24; i++) {
      if (jikan[i] == 2) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }

}
