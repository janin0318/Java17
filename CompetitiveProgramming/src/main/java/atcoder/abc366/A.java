package atcoder.abc366;

import java.util.Scanner;

public class A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();

    int targetN = n / 2 + 1;

    if (t >= targetN || a >= targetN) {
      System.out.println("Yes");
      return;
    }

    System.out.println("No");
  }
}
