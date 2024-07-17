package mrs.chapter1;

import java.util.Scanner;

public class B03 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          if (arr[i] + arr[j] + arr[k] == 1000) {
            System.out.println("Yes");
            return;
          }
        }
      }
    }

    System.out.println("No");
  }
}
