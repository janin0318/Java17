package atcoder.abc368;

import java.util.Scanner;
import java.util.StringJoiner;

public class A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] arr1 = new int[n - k];
    int[] arr2 = new int[k];

    for (int i = 0; i < n - k; i++) {
      arr1[i] = sc.nextInt();
    }

    for (int i = 0; i < k; i++) {
      arr2[i] = sc.nextInt();
    }

    StringJoiner sj = new StringJoiner(" ");

    for (int i = 0; i < k; i++) {
      sj.add(String.valueOf(arr2[i]));
    }

    for (int i = 0; i < n - k; i++) {
      sj.add(String.valueOf(arr1[i]));
    }

    System.out.println(sj);
  }

}
