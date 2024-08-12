package mrs.state;

public class WinnerState implements State {

  GumBallMachine gumBallMachine;

  public WinnerState(GumBallMachine gumBallMachine) {
    this.gumBallMachine = gumBallMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("25セントを投入することはできません。");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("返金できません。まだ25セントを投入していません。");
  }

  @Override
  public void turnCrank() {
    System.out.println("ハンドルを回せません。");
  }

  @Override
  public void dispense() {
    gumBallMachine.releaseBall();

    // ガムを1つ出した時点でなくなった場合は、売り切れステータスにする
    if (gumBallMachine.getCount() == 0) {
      gumBallMachine.setState(gumBallMachine.getSoldOutState());
      return;
    }

    gumBallMachine.releaseBall();
    System.out.println("当たりです！25セントで2個のガムボールがもらえます。");

    if (gumBallMachine.getCount() == 0) {
      gumBallMachine.setState(gumBallMachine.getSoldOutState());
      return;
    }

    gumBallMachine.setState(gumBallMachine.getNoQuarterState());

  }
}
