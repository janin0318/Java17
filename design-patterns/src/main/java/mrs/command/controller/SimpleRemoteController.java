package mrs.command.controller;

import mrs.command.command.Command;

public class SimpleRemoteController {

  Command command;

  public void setCommand(Command command) {
    this.command = command;
  }

  public void buttonWasPressed() {
    command.execute();
  }

}
