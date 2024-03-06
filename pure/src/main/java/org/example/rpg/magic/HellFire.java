package org.example.rpg.magic;

import org.example.rpg.magic.base.Magic;

public class HellFire implements Magic {

  @Override
  public String name() {
    return "地獄の業火";
  }

  @Override
  public int attackPower() {
    return 7;
  }

  @Override
  public int costMagicPoint() {
    return 14;
  }

  @Override
  public int costTechincalPoint() {
    return 21;
  }
}
