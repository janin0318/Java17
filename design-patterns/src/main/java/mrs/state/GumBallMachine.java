package mrs.state;

public class GumBallMachine {

  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State winnerState;

  State state;
  int count;

  public GumBallMachine(int numberGumballs) {
    this.soldOutState = new SoldOutState(this);
    this.noQuarterState = new NoQuarterState(this);
    this.hasQuarterState = new HasQuarterState(this);
    this.soldState = new SoldState(this);
    this.winnerState = new WinnerState(this);

    this.count = numberGumballs;
    if (numberGumballs > 0) {
      state = noQuarterState;
    } else {
      state = soldOutState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  public void refill(int count) {
    this.count = this.count + count;
    System.out.println("マシンにガムを補填しました。");
    state.refill();
  }

  void setState(State state) {
    this.state = state;
  }

  void releaseBall() {
    System.out.println("ガムボールがスロットから出てきます。");
    if (count != 0) {
      count = count - 1;
    }
  }

  public int getCount() {
    return this.count;
  }

  public State getSoldOutState() {
    return this.soldOutState;
  }

  public State getNoQuarterState() {
    return this.noQuarterState;
  }

  public State getHasQuarterState() {
    return this.hasQuarterState;
  }

  public State getSoldState() {
    return this.soldState;
  }

  public State getWinnerState() {
    return this.winnerState;
  }

  public String toString() {
    return "ガムの個数=" + this.count + " : " + "ステータス現在のステータス=" + this.state;
  }
}
