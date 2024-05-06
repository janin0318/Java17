package paiza.c;

public class C146 {
  public static void main(String[] args) {
    String line = "OZHYZ38";
    String splitted[] = line.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
    for (int i = 0; i < splitted.length; i++) {
      char[] cs = splitted[i].toCharArray();
      if ('1' <= cs[0] && cs[0] <= '9') {
        System.out.print(Integer.parseInt(splitted[i]) + 1);
        continue;
      }
      for (char value : cs) {
        char c = value;
        if (c == 'Z') {
          c = 'A';
        } else {
          c++;
        }
        System.out.print(c);
      }
    }
    System.out.println();
  }
}
