package command.controller;

import command.command.Command;
import command.command.NoCommand;

public class RemoteController {

  private static final int ALL_CONTROLLER_SLOT = 7;

  Command[] onCommand;
  Command[] offCommand;
  Command undoCommand;

  public RemoteController() {
    this.onCommand = new Command[ALL_CONTROLLER_SLOT];
    this.offCommand = new Command[ALL_CONTROLLER_SLOT];

    Command noCommand = new NoCommand();
    for (int i = 0; i < ALL_CONTROLLER_SLOT; i++) {
      this.onCommand[i] = noCommand;
      this.offCommand[i] = noCommand;
    }

    this.undoCommand = noCommand;
  }

  public void setCommand(int slot, Command onCommand, Command offCommand) {
    this.onCommand[slot] = onCommand;
    this.offCommand[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    this.onCommand[slot].execute();
    this.undoCommand = this.onCommand[slot];
  }

  public void offButtonWasPushed(int slot) {
    this.offCommand[slot].execute();
    this.undoCommand = this.offCommand[slot];
  }

  public void undoButtonWasPushed() {
    this.undoCommand.undo();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("\n----- リモコン -----\n");
    for (int i = 0; i < ALL_CONTROLLER_SLOT; i++) {
      builder.append(" [スロット").append(i).append("]")
          .append(this.onCommand[i].getClass().getName()).append(" ")
          .append(this.offCommand[i].getClass().getName()).append("\n");
    }
    builder.append(" [Undoスロット] ").append(this.undoCommand.getClass().getName())
        .append("\n");
    return builder.toString();
  }

}
