package org.example.rpg;

import org.example.rpg.character.FighterPhysicalAttack1;
import org.example.rpg.character.Member;
import org.example.rpg.character.StateType;

public class Main {

  public static void main(String[] args) {
    Member janin = new Member("janin", 100, 10);
    janin.addStateType(StateType.dead);
    System.out.println("Member.name : " + janin.getName());
    System.out.println("Member.isAlive : " + janin.isAlive());
    FighterPhysicalAttack1 fighterPhysicalAttack1 = new FighterPhysicalAttack1();
    System.out.println("singleAttackDamage : " + fighterPhysicalAttack1.singleAttackDamage());
    System.out.println("doubleAttackDamage : " + fighterPhysicalAttack1.doubleAttackDamage());
  }
}
