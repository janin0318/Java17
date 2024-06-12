package decorator;

/**
 * ハウスブレンド
 * <p>
 * 飲み物なので、Beverageクラスを拡張する
 */
public class HouseBlend extends Beverage {

  /**
   * コンストラクタ
   * <p>
   * 説明文をここで設定している
   */
  public HouseBlend() {
    this.description = "ハウスブレンド";
  }

  /**
   * 飲み物なので、ハウスブレンドの金額のみを返す
   *
   * @return コスト
   */
  public int cost() {
    return 89;
  }

}
