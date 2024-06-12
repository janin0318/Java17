package decorator;

/**
 * 飲み物の基底クラス
 */
public abstract class Beverage {

  String description = "不明な飲み物";

  public String getDescription() {
    return this.description;
  }

  public abstract int cost();
}
