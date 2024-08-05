package paiza;

import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;

public class C152 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();

    int[] arr = new int[d];

    StringJoiner sj = new StringJoiner(" ");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 1; i < arr.length; i++) {

      // 1日前が雨じゃなければ後続判定はしない
      if (arr[i - 1] != 2) {
        continue;
      }

      // 当日が晴れならStringJoinerに追加
      if (arr[i] == 0) {
        String day = String.valueOf(i);
        sj.add(day);
      }
    }

    if (Objects.equals(sj.toString(), "")) {
      System.out.println(-1);
      return;
    }

    System.out.println(sj);

  }

}
