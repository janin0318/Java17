package org.example.rpg.character;

public class PhysicalAttack {

  public int singleAttackDamage() {
    return 10;
  }

  public int doubleAttackDamage() {
    return singleAttackDamage() + singleAttackDamage();
  }

}
