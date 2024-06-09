package command.controller;

import command.command.Command;
import command.command.NoCommand;

public class RemoteController {

  private static final int ALL_CONTROLLER_SLOT = 7;

  Command[] onCommand;
  Command[] offCommand;

  public RemoteController() {
    this.onCommand = new Command[ALL_CONTROLLER_SLOT];
    this.offCommand = new Command[ALL_CONTROLLER_SLOT];

    Command noCommand = new NoCommand();
    for (int i = 0; i < ALL_CONTROLLER_SLOT; i++) {
      this.onCommand[i] = noCommand;
      this.offCommand[i] = noCommand;
    }
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    this.onCommand[slot] = onCommand;
    this.offCommand[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    this.onCommand[slot].execute();
  }

  public void offButtonWasPushed(int slot) {
    this.offCommand[slot].execute();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("\n----- リモコン -----\n");
    for (int i = 0; i < ALL_CONTROLLER_SLOT; i++) {
      builder.append(" [スロット" + i + "]" + this.onCommand[i].getClass().getName()
      + " " + this.offCommand[i].getClass().getName() + "\n");
    }
    return builder.toString();
  }

}
