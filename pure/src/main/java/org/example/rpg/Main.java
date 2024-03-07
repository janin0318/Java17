package org.example.rpg;

import org.example.rpg.character.Member;
import org.example.rpg.character.StateType;

public class Main {

  public static void main(String[] args) {
    Member janin = new Member("janin", 100, 10);
    janin.addStateType(StateType.dead);
    System.out.println(janin.getName());
    System.out.println(janin.isAlive());
  }

}
