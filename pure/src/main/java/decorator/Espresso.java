package decorator;

/**
 * エスプレッソ
 * <p>
 * 飲み物なので、Beverageクラスを拡張する
 */
public class Espresso extends Beverage {

  /**
   * コンストラクタ
   * <p>
   * 説明文をここで設定している
   */
  public Espresso() {
    this.description = "エスプレッソ";
  }

  /**
   * 飲み物なので、エスプレッソの金額のみを返す
   *
   * @return コスト
   */
  public int cost() {
    return 199;
  }

}
