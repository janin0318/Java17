package mrs.chapter2;

import java.util.Scanner;

public class A06 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();

    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 1; i < n; i++) {
      a[i] = a[i - 1] + a[i];
    }

    for (int i = 0; i< q; i++) {
      int start = sc.nextInt();
      int end = sc.nextInt();

      if (start == 1) {
        System.out.println(a[end - 1]);
        continue;
      }

      System.out.println(a[end - 1] - a[start - 2]);
    }
  }

}
