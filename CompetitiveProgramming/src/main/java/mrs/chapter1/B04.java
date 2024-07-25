package mrs.chapter1;

import java.util.Scanner;

public class B04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String n = sc.next();

    char[] nChars = n.toCharArray();
    int j = 0;

    int nLength = nChars.length;
    int loopCount = nLength;
    int result = 0;

    for (int i = 0; i < loopCount; i++) {
      nLength--;
      int target = Integer.parseInt(String.valueOf(nChars[i]));

      if (target == 0) {
        continue;
      }

      int pow = (int) Math.pow(2, nLength);
      result += pow;
    }

    System.out.println(result);
  }

}
