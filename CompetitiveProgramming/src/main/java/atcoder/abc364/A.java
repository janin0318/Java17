package atcoder.abc364;

import java.util.*;

public class A {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] ss = new String[n];

    for (int i = 0; i < n; i++) {
      ss[i] = sc.next();
    }

    boolean isFirstSweet = false;

    for (int i = 0; i < n - 1; i++) {

      // 前回に甘いものを食べている場合の処理
      if (isFirstSweet) {

        // 連続で甘いものを食べた場合は、「No」と出力して処理を終了
        if (Objects.equals(ss[i], "sweet")) {
          System.out.println("No");
          return;
        }

        // しょっぱいものを食べた場合は、フラグをfalseにして次のループに移行
        isFirstSweet = false;
        continue;
      }

      // 前回に甘いものを食べていない場合の処理
      // 甘いものを食べた場合は、フラグをtrueにする
      if (Objects.equals(ss[i], "sweet")) {
        isFirstSweet = true;
      }
    }

    System.out.println("Yes");
  }
}
