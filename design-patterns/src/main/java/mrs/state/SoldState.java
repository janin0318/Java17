package mrs.state;

/**
 * 販売中ステータス
 */
public class SoldState implements State {

  GumBallMachine gumBallMachine;

  public SoldState(GumBallMachine gumBallMachine) {
    this.gumBallMachine = gumBallMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("お待ち下さい。ガムボールを出す準備をしています。");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("申し訳ありません。すでにハンドルを回しています。");
  }

  @Override
  public void turnCrank() {
    System.out.println("2回回してもガムボールをもう1つ手に入れることはできません。");
  }

  @Override
  public void dispense() {
    gumBallMachine.releaseBall();
    if (gumBallMachine.getCount() > 0) {
      gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    } else {
      System.out.println("ガムボールがなくなりました。");
      gumBallMachine.setState(gumBallMachine.getSoldOutState());
    }
  }
}
