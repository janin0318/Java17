package paiza;

import java.util.Scanner;

public class C049 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] fs = new int[n];

    for (int i = 0; i < n; i++) {
      fs[i] = sc.nextInt();
    }

    int result = 0;

    for (int i = 0; i < n; i++) {
      int move = 0;

      // スタートは1階から始まるためここで特殊処理
      if (i == 0) {
        move = fs[i] - 1;
        result += move;
        continue;
      }

      if (fs[i] > fs[i - 1]) {
        move = fs[i] - fs[i - 1];
        result += move;
        continue;
      }

      move = fs[i - 1] - fs[i];
      result += move;
    }

    System.out.println(result);
  }

}
