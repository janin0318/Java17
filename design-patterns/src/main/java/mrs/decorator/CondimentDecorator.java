package mrs.decorator;

/**
 * デコレーター用の抽象クラス
 * <p>
 * Beverageと交換可能にする必要があるため、Beverageクラスを拡張している
 */
public abstract class CondimentDecorator extends Beverage {

  /**
   * 各デコレータがラップするBeverage。
   * <p>
   * Beverageのスーパータイプを使ってBeverageを参照しているので、任意の飲み物をラップできる。
   */
  Beverage beverage;

  public abstract String getDescription();
}
