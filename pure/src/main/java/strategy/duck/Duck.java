package strategy.duck;

import strategy.duck.behavior.FlyBehavior;
import strategy.duck.behavior.QuackBehavior;

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
