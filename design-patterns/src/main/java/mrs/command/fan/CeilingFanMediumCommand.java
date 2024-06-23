package mrs.command.fan;

import mrs.command.command.Command;

public class CeilingFanMediumCommand implements Command {

  CeilingFan ceilingFan;
  int prevSpeed;

  public CeilingFanMediumCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute() {
    prevSpeed = ceilingFan.getSpeed();
    ceilingFan.medium();
    System.out.println(ceilingFan.getLocation() + " " + ceilingFan.getSpeed());
  }

  @Override
  public void undo() {
    if (prevSpeed == CeilingFan.HIGH) {
      System.out.println(ceilingFan.getLocation() + " " + CeilingFan.HIGH);
    } else if (prevSpeed == CeilingFan.MEDIUM) {
      System.out.println(ceilingFan.getLocation() + " " + CeilingFan.MEDIUM);
    } else if (prevSpeed == CeilingFan.LOW) {
      System.out.println(ceilingFan.getLocation() + " " + CeilingFan.LOW);
    } else if (prevSpeed == CeilingFan.OFF) {
      System.out.println(ceilingFan.getLocation() + " " + CeilingFan.OFF);
    }
  }
}
