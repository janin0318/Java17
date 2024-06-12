package adapter;

public class DuckTestDrive {

  public static void main(String[] args) {
    Duck duck = new MallardDuck();

    Turkey turkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    Turkey duckAdapter = new DuckAdapter(duck);

    System.out.println("Turkeyの出力:");
    turkey.gobble();
    turkey.fly();

    System.out.println("\nDuckの出力");
    duck.quack();
    duck.fly();

    System.out.println("\nturkeyAdapterの出力");
    turkeyAdapter.quack();
    turkeyAdapter.fly();

    System.out.println("\nduckAdapterの出力");
    duckAdapter.gobble();
    duckAdapter.fly();
  }

}
