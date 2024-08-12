package mrs.state;

import java.util.Random;

/**
 * 25セント投入済みステータス
 */
public class HasQuarterState implements State {

  Random random = new Random(System.currentTimeMillis());

  GumBallMachine gumBallMachine;

  public HasQuarterState(GumBallMachine gumBallMachine) {
    this.gumBallMachine = gumBallMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("もう一度25セントを投入することはできません。");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("25セントを返却しました。");
    gumBallMachine.setState(gumBallMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    System.out.println("ハンドルを回しました。");

    int winner = random.nextInt(10);

    if (winner == 0 && (gumBallMachine.getCount() > 1)) {
      gumBallMachine.setState(gumBallMachine.getWinnerState());
    } else {
      gumBallMachine.setState(gumBallMachine.getSoldState());
    }
  }

  @Override
  public void dispense() {
    System.out.println("ガムボールが出せません。");
  }
}
