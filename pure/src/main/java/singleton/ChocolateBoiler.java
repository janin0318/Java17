package singleton;

public class ChocolateBoiler {

  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public static ChocolateBoiler getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new ChocolateBoiler();
    }
    return uniqueInstance;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
    }
  }

  private boolean isEmpty() {
    return empty;
  }

  private boolean isBoiled() {
    return boiled;
  }
}
