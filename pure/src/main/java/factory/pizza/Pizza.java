package factory.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * ピザの基底クラス
 */
public abstract class Pizza {

  // 名前
  String name;
  // 生地
  String dough;
  // ソース
  String sauce;
  List<String> toppings = new ArrayList<>();

  /**
   * 準備
   */
  public void prepare() {
    System.out.println(name + "を下準備");
    System.out.println("生地をこねる");
    System.out.println("ソースを追加");
    System.out.println("トッピングを追加");
    for (String topping : toppings) {
      System.out.println(" " + topping);
    }
  }

  public void bake() {
    System.out.println("180度で25分間焼く");
  }

  public void cut() {
    System.out.println("ビザを扇形にカットする");
  }

  public void box() {
    System.out.println("PizzaStoreの箱にピザをいれる");
  }

  public String getName() {
    return name;
  }
}
