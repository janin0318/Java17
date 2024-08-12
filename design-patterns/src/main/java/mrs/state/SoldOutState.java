package mrs.state;

/**
 * 売り切れステータス
 */
public class SoldOutState implements State {

  GumBallMachine gumBallMachine;

  public SoldOutState(GumBallMachine gumBallMachine) {
    this.gumBallMachine = gumBallMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("25セントを投入することはできません。売り切れです。");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("返金できません。まだ25セントを投入していません。");
  }

  @Override
  public void turnCrank() {
    System.out.println("ハンドルを回しましたが、ガムボールがありません。");
  }

  @Override
  public void dispense() {
    System.out.println("ガムボールが出てきません。");
  }

  @Override
  public void refill() {
    gumBallMachine.setState(gumBallMachine.getNoQuarterState());
  }
}
