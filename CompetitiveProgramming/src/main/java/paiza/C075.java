package paiza;

import java.util.Scanner;

public class C075 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] f = new int[m];

    for (int i = 0; i < m; i++) {
      f[i] = sc.nextInt();
    }

    int point = 0;

    for (int i = 0; i < m; i++) {
      int unchin = f[i];

      if (unchin <= point) {
        point = point - unchin;
        System.out.println(n + " " + point);
        continue;
      }

      int getPoint = unchin / 10;
      point = point + getPoint;
      n = n - unchin;
      System.out.println(n + " " + point);
    }
  }

}
