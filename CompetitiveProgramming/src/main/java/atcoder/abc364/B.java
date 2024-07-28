package atcoder.abc364;

import java.util.Scanner;

public class B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();

    String[] tmp1 = new String[h];

    for (int i = 0; i < h; i++) {
      tmp1[i] = sc.nextLine();
    }

    char[][] c = new char[h][w];

    for (int i = 0; i < h; i++) {
      char[] tmp2 = tmp1[i].toCharArray();
      for (int j = 0; j < w; j++) {
        c[i][j] = tmp2[j];
      }
    }

    String x = sc.next();

    char[] xs = x.toCharArray();

    for (int i = 0; i < xs.length; i++) {

    }
  }
}
