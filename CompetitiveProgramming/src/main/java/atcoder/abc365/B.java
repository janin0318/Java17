package atcoder.abc365;

import java.util.Arrays;
import java.util.Scanner;

public class B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int[] beforeSortArr = arr.clone();

    Arrays.sort(arr);

    int target = arr[n - 2];

    for (int i = 0; i < n; i++) {
      if (beforeSortArr[i] == target) {
        System.out.println(i + 1);
        return;
      }
    }
  }

}
