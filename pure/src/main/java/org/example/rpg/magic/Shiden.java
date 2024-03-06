package org.example.rpg.magic;

import org.example.rpg.magic.base.Magic;

public class Shiden implements Magic {

  @Override
  public String name() {
    return "紫電";
  }

  @Override
  public int attackPower() {
    return 6;
  }

  @Override
  public int costMagicPoint() {
    return 12;
  }

  @Override
  public int costTechincalPoint() {
    return 18;
  }
}
