package mrs.chapter2;

import java.util.Scanner;

public class B07 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    int n = sc.nextInt();

    int[] arr = new int[t];

    for (int i = 0; i < n; i++) {
      int start = sc.nextInt();
      int end = sc.nextInt();

      for (int j = start; j < end; j++) {
        arr[j] = arr[j] + 1;
      }
    }

    for (int i = 0; i < t; i++) {
      System.out.println(arr[i]);
    }

  }
}
