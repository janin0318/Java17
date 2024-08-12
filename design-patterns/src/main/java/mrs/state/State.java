package mrs.state;

public interface State {

  void insertQuarter();

  void ejectQuarter();

  void turnCrank();

  void dispense();

  default void  refill() {
    throw new RuntimeException();
  };

}
