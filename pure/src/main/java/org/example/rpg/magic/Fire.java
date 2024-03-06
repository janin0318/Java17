package org.example.rpg.magic;

import org.example.rpg.magic.base.Magic;

public class Fire implements Magic {

  @Override
  public String name() {
    return "ファイア";
  }

  @Override
  public int attackPower() {
    return 5;
  }

  @Override
  public int costMagicPoint() {
    return 10;
  }

  @Override
  public int costTechincalPoint() {
    return 15;
  }
}
