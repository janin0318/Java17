package mrs.chapter2;

import java.util.Scanner;

public class A07 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();

    int[] arr = new int[d + 1];

    for (int i = 1; i <= n; i++) {
      int start = sc.nextInt();
      int end = sc.nextInt();

      for (int j = start; j <= end; j++) {
        arr[j] = arr[j] + 1;
      }
    }

    for (int i = 1; i <= d; i++) {
      System.out.println(arr[i]);
    }
  }
}
