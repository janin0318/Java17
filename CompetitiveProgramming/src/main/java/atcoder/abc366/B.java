package atcoder.abc366;

import java.util.Scanner;

public class B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] sArr = new String[n];

    int max = 0;

    // 入力を受けながら文字列の最長を取得する
    for (int i = 0; i < n; i++) {
      sArr[i] = sc.next();
      if (sArr[i].length() > max) {
        max = sArr[i].length();
      }
    }

    // 出力結果用の入れ物
    StringBuilder[] sbArray = new StringBuilder[max];

    // 文字の数だけループを行う（文字を横から立てにするため）
    for (int i = 0; i < max; i++) {

      StringBuilder sb = new StringBuilder();

      for (int j = n - 1; j >= 0; j--) {

        if (sArr[j].length() > i) {
          sb.append(sArr[j].charAt(i));
        } else {
          sb.append('*');
        }
      }
      sbArray[i] = sb;
    }

    for (StringBuilder sb : sbArray) {

      // 最後の文字が*の場合は*を削除しなければならないので、ループで削除を行う
      while (sb.charAt(sb.length() - 1) == '*') {
        sb.deleteCharAt(sb.length() - 1);
      }
      System.out.println(sb);
    }
  }
}
