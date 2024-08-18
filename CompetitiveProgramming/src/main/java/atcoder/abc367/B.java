package atcoder.abc367;

import java.util.Scanner;

public class B {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      sb.append(s.charAt(i));
    }

    while (sb.charAt(sb.length() - 1) == '0') {
      sb.deleteCharAt(sb.length() - 1);
    }

    if (sb.charAt(sb.length() - 1) == '.') {
      sb.deleteCharAt(sb.length() - 1);
    }

    System.out.println(sb);
  }

}
