package org.example.rpg.character;

public class FighterPhysicalAttack1 extends PhysicalAttack {

  @Override
  public int singleAttackDamage() {
    return super.singleAttackDamage() + 20;
  }

  @Override
  public int doubleAttackDamage() {
    return super.doubleAttackDamage() + 10;
  }

}
