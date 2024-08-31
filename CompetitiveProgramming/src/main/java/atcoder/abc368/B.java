package atcoder.abc368;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    Integer[] arr = new Integer[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int count = 0;

    while (true) {
      // ここで降順に並び替え
      Arrays.sort(arr, Collections.reverseOrder());
      if (arr[0] <= 0 || arr[1] <= 0) {
        break;
      }
      count++;
      arr[0] = arr[0] - 1;
      arr[1] = arr[1] - 1;
    }

    System.out.println(count);
  }

}
