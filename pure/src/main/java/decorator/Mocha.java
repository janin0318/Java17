package decorator;

/**
 * モカ
 * <p>
 * デコレーターなのでCondimentDecoratorを拡張している
 */
public class Mocha extends CondimentDecorator {

  /**
   * コンストラクタ
   * <p>
   * ラップされる飲み物を保持するBeverageインスタンス変数を継承しているため、ここで設定をする。
   *
   * @param beverage Beverageを継承した飲み物
   */
  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  /**
   * 説明文には飲み物だけでなく、モカをトッピングしたことも伝えるために追加で「、モカ」を追加
   *
   * @return 説明文
   */
  public String getDescription() {
    return beverage.getDescription() + "、モカ";
  }

  /**
   * 飲み物とモカのコストを追加する必要があるため、20円追加している
   *
   * @return コスト
   */
  public int cost() {
    return this.beverage.cost() + 20;
  }

}
