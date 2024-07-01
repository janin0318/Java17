package mrs.template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Coffee extends CaffeineBeverage {

  @Override
  public void brew() {
    System.out.println("フィルターでコーヒーをドリップする");
  }

  @Override
  public void addCondiments() {
    System.out.println("砂糖とミルクを追加する");
  }

  @Override
  public boolean customerWantsCondiments() {
    return getUserInput().toLowerCase().startsWith("y");
  }

  private String getUserInput() {
    String answer = null;

    System.out.println("コーヒーに砂糖とミルクを入れますか？");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      answer = reader.readLine();
    } catch (IOException e) {
      System.out.println("回答読み込み時のI/Oエラー");
    }
    if (Objects.isNull(answer)) {
      return "no";
    }
    return answer;
  }

}
