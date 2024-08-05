package mrs.state;

public class NoQuarterState implements State {

  GumBallMachine gumBallMachine;

  public NoQuarterState(GumBallMachine gumBallMachine) {
    this.gumBallMachine = gumBallMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("25セントを投入しました。");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("25セントを投入していません。");
  }

  @Override
  public void turnCrank() {
    System.out.println("ハンドルを回しましたが、25セントを投入していません。");
  }

  @Override
  public void dispense() {
    System.out.println("まずお金を払う必要があります。");
  }
}
