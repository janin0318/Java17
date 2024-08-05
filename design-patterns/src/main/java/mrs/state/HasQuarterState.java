package mrs.state;

public class HasQuarterState implements State {


  @Override
  public void insertQuarter() {
    System.out.println("もう一度25セントを投入することはできません。");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("25セントを返却しました。");
  }

  @Override
  public void turnCrank() {
    System.out.println("ハンドルを回しました。");
  }

  @Override
  public void dispense() {
    System.out.println("ガムボールが出せません。");
  }
}
