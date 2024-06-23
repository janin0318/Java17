package mrs.strategy.duck;

import mrs.strategy.duck.behavior.QuackBehavior;
import mrs.strategy.duck.behavior.FlyBehavior;

public abstract class Duck {

  // interfaceを宣言することで実装を入れ替えることができる
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public abstract void display();

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public FlyBehavior getFlyBehavior() {
    return this.flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public QuackBehavior getQuackBehavior() {
    return this.quackBehavior;
  }
}
